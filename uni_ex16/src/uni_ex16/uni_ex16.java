package uni_ex16;

public class uni_ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=99;

System.out.printf("AND연산 : %s \n",(a>=100)&&(a<=200));  // 괄호안 관계연산자  f && t 가나오므로 F 
System.out.printf("or연산 : %s \n",(a>=100)||(a<=200));   //  F  OR T  T
System.out.printf("AND연산 : %s \n",!(a<=200));           // F
	}

}
