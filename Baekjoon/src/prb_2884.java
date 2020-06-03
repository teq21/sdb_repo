import java.util.Scanner;

public class prb_2884 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int a,b;
		a=s.nextInt();
		b=s.nextInt();
		
		if(45<=b&b<=59) {
			System.out.println(a+" "+(b-45));
		}
		else if(a==0)
		{System.out.println(23+" "+(b+15) );}
		
		else
		{System.out.println((a-1)+" "+(b+15) );}

	}
	}

