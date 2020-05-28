package chap5;

public class quiz {

	public static void main(String[] args) {
		//1부터 100까지의 합

		int aa[]=new int[100];
		
		
		for(int i=0;i<100;i++) {
			aa[i]=i+1;
			
		}
		int sum=0;
		int hap=0;
		while(hap<100) {
			sum=sum+aa[hap];
		hap++;}
		System.out.println(sum);
	}
    
}
