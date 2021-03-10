import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int n = Integer.parseInt(num);
        
        
        for(int i=0;i<n;i++){
            String a = sc.nextLine();
            int pls=0;
            int pnt=0;
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)=='O'){
                    pls++;
                    pnt+=pls;
                }else
                    pls=0;
            }
            System.out.println(pnt);
        }
    }
}