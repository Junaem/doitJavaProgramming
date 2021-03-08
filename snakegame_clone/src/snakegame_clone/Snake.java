package snakegame_clone;/*21.03.07 첫 토이프로젝트 스네이크 게임 클론코딩
내용은 깃허브 janbodonar랑 velog 블로그 참조
https://github.com/janbodnar/Java-Snake-Game/blob/master/src/com/zetcode/Snake.java
https://velog.io/@ljs0429777/Move-Practice2
*/
import java.awt.EventQueue;//awt는 GUI 관련 기능이라고함
import javax.swing.JFrame;//swing도 비슷한데 조금 더 많은 기능 지원하는듯

public class Snake extends JFrame {
	public Snake() {
		initUI();
	}
	
	private void initUI() {
		add(new Board());
		
		setResizable(False);//크기 고정인가?
		pack();
		
		setTitle("snake");
		setLocationRelativeTo(null);//위치를 null로 두는데 아직이해불가
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫기 버튼으로 끄는것 같은데 snake클래스에 구현한거 보면 아닐지도
	}
	
	public static void main(String[] args) {//메인실행
		EventQueue.invokeLater(() -> {
			//->이거 그냥 있는게 아니고 없으면 에러남. 위의 식 자체가 이해불가. 괄호 두개를 겹치는데 왜 앞에 먼저()로 닫아버리고 내용을 쓰는지도 이해해야함
			JFrame ex = new Snake();
			//스네이크를 생성해서 ex로 둠
		});
	}
}//일단 따라쳐봤는데 이해 안 되는 부분이 너무많다. 다음 클래스도 만들어보고 그래도 이해 안되는 부분은 검색해보자

