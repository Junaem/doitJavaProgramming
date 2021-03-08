package snakegame_clone;

import java.awt.Color;
import java.awt.Dimension;//차원?왜?
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;//이거랑 밑에 스윙.이미지아이콘 차이는?
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;//키 입력받고
import java.awt.event.KeyEvent;//키로 이벤트를 일으키는건가? 입력받으면 변수로 저장되는데 굳이 '키'이벤트인 이유는?
import javax.swing.ImageIcon;//그냥 이미지파일 불러오긴가
import javax.swing.JPanel;//JPanel, JFrame을 찾아봐야할듯
import javax.swing.Timer;//이게 시간에 따라 게임이 움직이게 하는건가

public class Board extends JPanel implements ActionListener {
	//JPanel과 상속, 액션리스너 인터페이스 적용. Snake클래스는 JFrame을 상속함.
	private final int B_WIDTH = 300;
	private final int B_HEIGHT = 300;
	private final int DOT_SIZE = 10;
	private final int ALL_DOTS = 900;//30*30해서 900인건 알겠는데 이 숫자 바꾸면 에러나나?
	private final int RAND_POS = 29;//rand pos 둘중 하나도, 29의 의미도 모르겠음
	private final int DELAY = 140;//게임 속도의 딜레인가?
	
	private final int x[] = new int[ALL_DOTS];
	private final int y[] = new int[ALL_DOTS];
	
	private int dots;
	private int apple_x;
	private int apple_y;
	
	private boolean leftDirection = false;
	private boolean rightDirection = true;
	private boolean upDirection = false;
	private boolean downDirection = false;//스네이크가 각 방향을 보고있는건듯?처음에는 오른쪽 보는걸로 설정
	private boolean inGame = true;//이해불가
	
	private Timer timer;//timer는 int,char 처럼 원래 있는거. 이걸로 시간에 따라 움직이는듯-위의 delay하고 관계는?
	private Image ball;//image도 원래 있는것 같은데 어디서 이미지를 가져오는지는 모름.
	private Image apple;
	private Image head;//뱀머리인 것 같은데 왜 바디는 없을까
	
	public Board() {
		initBoard();
		//Snake에서도 init쓰던데, init은 언제쓰는건지 아직 모름
		//Snake의 init에 board()가 있는데, private initBoard를 퍼블릭으로 변환인듯
	}
	
	private void initBoard() {
		
		addKeyListener(new TAdapter());//키리스너는 위에서 임포트한것.
		setBackground(Color.black);
		setFocusable(true);//focusable이란?
		
		setPreferredSize(new Dimension(B_WIDTH,B_HEIGHT));
		//디멘션은 두 int를 잡아서 2차원공간을 만드는것같음. int 변수 하나 더 추가해본결과 에러나는 걸로 보아 3차원은 따로 있는듯?
		loadImages();
		initGame();//두개 다 에러뜸. 나중에 구현하는것 같은데 위에거는 아까 선언한 모든 이미지를 로드하는듯	
	}
	
	private void loadImages() {
		ImageIcon iid = new ImageIcon("src/resources/dot.png");
		ball = iid.getImage();
		ImageIcon iia = new ImageIcon("src/resources/apple.png");
		apple = iia.getImage();
		ImageIcon iih = new ImageIcon("src/resources/head.png");
		head = iih.getImage();
	}//예상이 맞기는 맞네. 지정한 경로에 png파일이 없으면 어떻게 되는가도 궁금
	
	private void initGame() {
		dots = 3;//3으로 선언하는걸로 봐서 몸 길이인듯
		
		for(int z=0; z<dots; z++) {//x,y는 all dots로 만든 int 수열이었음
			x[z]=50 -z*10;
			y[z]=50;
		}//dots는 몸길이가 이닌것같고, x는 50~20, y는 50. 조금더 봐야할듯
		locateApple();//아직 구현x. 
		timer = new Timer(DELAY, this);
		//timer와 DELAY의 뜻은 딜레이(120)마다 한 틱이 지나간단 것으로 추정. 뒤의 this는 이 판이 120마다 움직인다는거인듯
		timer.start();
	}//이 함수는 게임시작전에 3,2,1 카운트하는 함수인듯. dots는 그냥 시작 신호를 점으로 보여주는거고.x랑 y는 각 점의 위치인듯?
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);//원래 그래픽을 그리는 함수를 오버라이드해서 그대로 쓰는듯
		doDrawing(g);//원래 메서드에 추가된것. 아직 구현x
	}
	
	private void doDrawing(Graphics g) {//그래픽을 변수로 넣었을때
		if(inGame) {//게임중(inGame이 true)면
			g.drawImage(apple, apple_x, apple_y, this);//apple,_x_y를 그린다??
			for(int z = 0; z<dots;z++) {
				//0,1,2 중에 0일때는 머리를 그리고, 그 뒤에는 ball을 그린다? ball이 몸통이고 머리를 따라가는거인듯. 뒤에 몸은 이미지상 다 ball로 처리하는거니까.근데 몸이 머리를 따라가는건 아직 구현안한거겠지?
				if(z==0) {
					g.drawImage(head, x[z],y[z], this);
				}else {
					g.drawImage(ball, x[z],y[z], this);
				}
			}
			Toolkit.getDefaultToolkit().sync();//그래픽 상황을 싱크로나이즈한다는데, 현재 상황에 맞게 그래픽을 업데이트 하는 함수인듯.
		}else {
			gameOver(g);//뭔 함수인지는 알겠음. inGame이 false가 되면 바로 게임오버라는 건데, 이 메서드는 doDrawing 딱봐도 그림그리는건데 왜 게임이 끝나는지 궁금.
		}
	}
	private void gameOver(Graphics g) {//게임오버도 그래픽을 건드리는 메서드였음. 확실한건 아닌데 게임이란게 결국 그래픽을 만드는거니까 다 그래픽을 매개로 하는 메서드인건가?awt랑 swing도 다 이미지관련 api고. 공부해봐야함.
		String msg = "Game Over";
		Font small = new Font("Helvetica", Font.BOLD, 14);
		FontMetrics metr = getFontMetrics(small);//위에 import했던 것들.
		
		g.setColor(Color.white);//게임을 끝내는 메서드라기 보다는 게임이 끝났을때 게임오버를 띄우는 메서드인듯.
		g.setFont(small);
		g.drawString(msg, (B_WIDTH - metr.stringWidth(msg))/2, B_HEIGHT/2);
	}//말그래도 Str을 드로우하는건데, 보드넓이-Str넓이의 절반, 보드높이의 절반. 이건 왜 이렇게 했을까? 그냥 저정도가 보기 좋나? 구현해보고 확인해야할 부분.
	
	private void checkApple() {//이름은 체크애플이지만 실질적으로는 사과 먹었을때 실행되는 메서드.
		if((x[0]==apple_x)&&(y[0]==apple_y)) {
			dots++;
			locateApple();//곧 구현할듯. 랜덤변수 가져오는거 기대됨.
		}
	}//식을 이렇게 true만 적으면 false까지 하는것보다 실제처리속도가 빠른지 궁금.
	
	private void move()	{
		for(int z = dots; z>0; z--) {
			x[z] = x[(z-1)];//이 메서드가 몸통이 머리를 따라가는 부분
			y[z] = y[(z-1)];//z=dots-1,0보다 크거나 같게가 아닌 이유는, 0은 head기 때문에 따로 지정하는것.
		}
		if(leftDirection) {
			x[0] -= DOT_SIZE;
		}//else는 안써도 자동구현인건가? 기초지식이 너무 부족하다...
		if(rightDirection) {
			x[0] += DOT_SIZE;//dot_size라는건 처음에 선언한 1칸.
		}
		if(upDirection) {
			y[0] -= DOT_SIZE;
		}//left가 -인건 알겠는데 왜 up이 -일까? 도저히 이해x.
		if(downDirection) {
			y[0] += DOT_SIZE;
		}
	}
	private void checkCollision() {//collision==충돌. 즉 충돌체크 메서드
		for(int z=dots;z>0;z--) {//머리+몸의 개수만큼 -해가며 실행
			if((z>4)&&(x[0]==x[z])&&(y[0]==y[z])) {
			//어차피 dots가 3보다 작으면 부딛힐 일이 없는데 처음 조건은 왜 있는지 이해불가. 뒤의 조건은 몸이 머리와 겹칠(충돌)할때 겜오버 조건.
				//###################나중에 처음조건 빼고 실행해볼것.
				inGame = false;
			}
		}
		if(y[0]>=B_HEIGHT) {
			inGame = false;//머리가 맵 높이(윗벽)을 넘으면 겜오버
		}
		if(y[0]<0) {
			inGame = false;//아랫벽을 뜻하는 것 같음. 벽식이 4개인데 왜 안합치는지 이해불가.
		}
		if(x[0]>=B_WIDTH) {
			inGame=false;
		}
		if(x[0]<0) {
			inGame=false;
		}//##################이것도 식 합쳐서 진행해볼것
		if(!inGame) {
			timer.stop();
		}//게임이 끝날시 타이머 멈춤.
	}
//갑자기 든 의문: 머리(x[0],y[0])의 값에 따라 보드 위의 위치가 정해지는건 알겠는데. 무슨 식에 의해 그것이 구현되고 그림으로 표현하는가? 아까 디멘션만들어놓으면 자동으로 그렇게 되는가? 아직 구현이 안된건가?
	private void locateApple() {
		int r = (int)(Math.random()*RAND_POS);//RAND_POS는 29.random메서드는 0~1의 double을 랜덤하게 구현.즉 여기 *29하고 int로 변환
		//29인 이유는 30은 벽이기때문, int로 변환했을때 0의 값이 나와도 위의 collision을 보면 0은 플레이가능. 즉 플레이가능범위는 0=<값=<29의 int. 총 30개.
		apple_x =((r*DOT_SIZE));//그런데 실제로 dotsize가 10이니 거기에 10을 곱함. 즉 0~290까지의 10의 배수라고 봐야함. 근데 왜 1이 아니라 10을 쓰는건지, 이 숫자가 실제 우리가 보는 픽셀갯수인지 등이 궁금.
		r = (int)(Math.random()*RAND_POS);//위에서 r은 int형임을 선언했으므로 또 선언하면 에러가 남.(같은 변수이름으로 2개의 인스턴스라서?)
		apple_y =((r*DOT_SIZE));
	}
}
