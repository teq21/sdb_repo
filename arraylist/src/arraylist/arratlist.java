package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arratlist {

	public static void main(String[] args) {
		
		List<String> rl=new ArrayList<>();
		
		rl.add("��ü����");
		rl.add("�յ�");
		rl.add("����");dd
		
		int a=1;
		Iterator<String> it = rl.iterator();
		while(it.hasNext()) {
		String s=it.next();
		if(a==1)
		{System.out.println("<"+s+">");
		}
		else {
			System.out.println(s);
		}
		a++;
		}
	}
}


