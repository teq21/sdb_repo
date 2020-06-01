package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arratlist {

	public static void main(String[] args) {
		
		List<String> rlist=new ArrayList<>();

		rlist.add("이협건");
		rlist.add("심대보");
		rlist.add("이협건");
		rlist.add("이협건");
		
		
		System.out.println("배열의 크기"+rlist.size());
		
		for(int i=0;i<rlist.size(); i++) {
			System.out.println("["+i+"]번째 배열 기억공간:"+rlist.get(i));
		}
		
		Iterator<String> it=rlist.iterator();
		while(it.hasNext()) {
			String name=(String) it.next();
			
			System.out.println("이름:"+name);
		}
	}

}
