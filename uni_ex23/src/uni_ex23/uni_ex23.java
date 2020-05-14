package uni_ex23;

import java.util.Scanner;

public class uni_ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s =new Scanner(System.in);
int a;

System.out.printf("점수를 입력하세요:");
a=s.nextInt();

if(a>=90)      
	System.out.printf("A");
else
	if(a>=80)
	System.out.printf("B");
else
	if(a>=70)
		System.out.printf("c");
	else
if(a>=60)
	System.out.printf("D");

System.out.printf("학점입니다");
}

}
