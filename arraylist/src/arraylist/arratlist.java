package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arratlist {

	public static void main(String[] args) {
		
		List<String> rlist=new ArrayList<>();

		rlist.add("������");
		rlist.add("�ɴ뺸");
		rlist.add("������");
		rlist.add("������");
		
		
		System.out.println("�迭�� ũ��"+rlist.size());
		
		for(int i=0;i<rlist.size(); i++) {
			System.out.println("["+i+"]��° �迭 ������:"+rlist.get(i));
		}
		
		Iterator<String> it=rlist.iterator();
		while(it.hasNext()) {
			String name=(String) it.next();
			
			System.out.println("�̸�:"+name);
		}
	}

}
