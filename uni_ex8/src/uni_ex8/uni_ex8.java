package uni_ex8;

public class uni_ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c,d;

a=100+100;
b=a+100;
c=a+b-100;
d=a+b+c;

System.out.printf("a,b,c,d의값==>%d ,%d, %d,%d \n",a,b,c,d);

a=b=c=d=100;
System.out.printf("a,b,c,d의 값==>%d ,%d, %d, %d, \n",a,b,c,d);

a=100;
a=a+200;                       // 자바는 오른쪽의것이 왼쪽에 대입되는 느낌을 생각하자 
System.out.printf("a의 값 ==>%d \n",a);
	}

}
