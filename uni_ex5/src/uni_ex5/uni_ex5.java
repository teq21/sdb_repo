package uni_ex5;

public class uni_ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.printf("%d\n",123);
System.out.printf("%5d\n",123);//5자리 확보후 오른쪽정렬후 출력
System.out.printf("%05d\n",123);//오른쪽 정렬후 빈칸은 0으로

System.out.printf("%f\n",123.45);
System.out.printf("%7.1f\n",123.45);//7자리 확보후 첫번째 자리에서 반올림
System.out.printf("%7.3f\n",123.45);//소수점 아래 셋째 자리까지 출력 오른쪽 빈칸은 0으로채움

System.out.printf("%s\n","hi~java");//자릿수만큼 출력
System.out.printf("%10s\n","hi~java");// 열자리 확보후 오른쪽 정렬 출력
	}

}
