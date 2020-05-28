package chap5;

import java.util.Scanner;

public class arretyforwhile {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
 int[]aa=new int[4];
 int hap=0,i;
 
for(i=0;i<3;i++) {
	System.out.println((i+1)+"번쨰숫자를 입력하세요");
	aa[i]=s.nextInt();
	
	}
hap=aa[0]+aa[1]+aa[2]+aa[3];

System.out.println("합계"+hap);

}
}
