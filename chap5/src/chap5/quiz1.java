package chap5;

public class quiz1 {

	public static void main(String[] args) {
      int aa[]=new int[100];
      int i;
      int sum=0;
      for(i=0;i<100;i++) {
    	  aa[i]=i+1;
    	  sum=sum+aa[i];
      }
	
	System.out.println(sum);
	}

}
