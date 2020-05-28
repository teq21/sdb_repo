package chap5;

public class quiz2 {

	public static void main(String[] args) {
		int aa[] = new int[100];

		int i = 0;
		int sum = 0;
		while (i < 100) {
			aa[i] = i + 1;
			
			i++;
		}
		int hap;
		for(hap=0;hap<100;hap++) {
			sum=sum+aa[hap];
		}
		System.out.println(sum);
	}

}
