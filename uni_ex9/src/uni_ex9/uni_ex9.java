package uni_ex9;

public class uni_ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=100,b=200;  //정수 변수 a,b 선언
float result;   // 실수변수 result 선언

result =a/b;  // 변수 result에 a/b 를 대입 (0.5를 예상)

System.out.printf("%f \n",result);
	}

}     /* 결과 값이 0이 나오는 이유는 a/b 나온결과를  result에 넣으라는건데    10행에서  
               정수 a/b를 먼저하니 정수값 0 이나올거고 따라서 실수형 변수 result는 0.0이 나오는것 
               자바는 오른쪽 먼저 한후 왼쪽에 대입한다는 느낌을 갖자*/  
