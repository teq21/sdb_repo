package uni_ex21;

import java.util.Scanner;

public class uni_ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s =new Scanner(System.in);
int a;

System.out.printf("정수를 입력하세요:");
a=s.nextInt();

if( a%2==0 ){
	System.out.printf("짝수를 입력했군요..\n");
} else {
	System.out.printf("홀수를 입력했군요..\n");
}
	}

}
