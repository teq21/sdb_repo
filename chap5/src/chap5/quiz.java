package chap5;

public class quiz {

	public static void main(String[] args) {
		//1부터 100까지의 합

		int aa[]=new int[90];
		
		
		for(int i=0;i<90;i++) {
			aa[i]=i+11;
			
		}
		int sum=0;
		int i=0;
		while(i<90) {
			System.out.println("num["+i+"]:"+aa[i]);
			sum=sum+aa[i];
		i++;}
		
		System.out.println(sum);
	}
    
}
