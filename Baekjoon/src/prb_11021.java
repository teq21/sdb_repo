import java.util.Scanner;

public class prb_11021 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		
           int i,j;
           i=s.nextInt();
           for(j=1;j<=i;j++)
           {
        	   a=s.nextInt();
       		b=s.nextInt();
       	     
       		System.out.println("Case #"+j+":"+" "+(a+b));
           }
	}

}
