package uni_ex12;

public class uni_ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=2, b=3,c=4;
		int result1,mok,namugi;
		float result2;
		
		result1=a+b-c;
		System.out.printf("%d+%d-%d=%d \n",a,b,c,result1);
		
		result1=a+b*c;
		System.out.printf("%d+%d*%d=%d \n",a,b,c,result1);
		
		result2=a*b/(float)c;
		System.out.printf("%d*%d/%d=%f /n",a,b,c,result2);
		
		mok=c/b;
		System.out.printf("%d/%d�� ���� %d \n",c,b,mok);
		
		namugi=c%b;
		System.out.printf("%d/%d�� �������� %d \n",c,b,namugi);
		

}
}