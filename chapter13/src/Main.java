import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        long a = sc.nextLong();
       calc(a);
    }
    
    
    
    
    public static void calc(long n) {
    	long rsl =0;
    	long line=0;
    	for(long i=1;;) {
    		if(rsl+i>=n) {
    			break;
    		}
    		rsl+= i;
    		line = i+1;
    		i++;
    	}
		long lNum = line-(n-rsl);
		long mNum = line-lNum;
    	if(line%2==0) 
    		System.out.println(lNum+"/"+mNum);
    	else
    		System.out.println(mNum+"/"+lNum);
    }
}
