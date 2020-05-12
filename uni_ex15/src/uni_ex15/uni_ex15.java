package uni_ex15;

public class uni_ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100,b=200;
System.out.printf("%d==%d는 %s 이다  \n",a,b,a==b); //f
System.out.printf("%d!=%d는 %s 이다  \n",a,b,a!=b); //t
System.out.printf("%d>%d는 %s 이다  \n",a,b,a>b);   // f
System.out.printf("%d<%d는 %s 이다  \n",a,b,a<b);   //t
System.out.printf("%d>=%d는 %s 이다  \n",a,b,a>b);  //f
System.out.printf("%d<=%d는 %s 이다  \n",a,b,a<=b);  //t

System.out.printf("%d=%d는 %s 이다  \n",a,b,b=a);   // b=a a의 오른쪽값 100을 왼쪽에 대입   
	}

}
