package chapter4_2021;

public class StarTreeEx {

	public static void main(String[] args) {
		
		int num = 9;
		for (int i=0;i<num;i++){
		  for (int j=0; j<num;j++)
		  {
		     if (i<=num/2)// ���� ����
		     {
		        if (i+j<=num/2-1)// ���� �� �������
		           System.out.print(" ");
		        else if (j-i>=num/2+1) // ������ �� �������
		        	System.out.print(" ");
		        else
		           System.out.print("*");// *���
		     }
		     else if (i>num/2) //�Ʒ��� ����
		     {
		        if (i-j>=num/2+1) //���� �� ����
		        	System.out.print(" ");
		        else if (i+j>=num/2*3+1)//������ �� ����
		        	System.out.print(" ");
		        else
		        	System.out.print("*"); // *���
		     }
		  }
		  System.out.println();//�ٹٲ�
		}

	}

}
