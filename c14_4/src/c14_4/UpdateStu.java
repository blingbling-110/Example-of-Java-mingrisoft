package c14_4;

import java.util.*;

public class UpdateStu {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("01", "��ͬѧ");
		map.put("02", "κͬѧ");
		Set<String> set = map.keySet();				//����Map����������key����ļ���
		Iterator<String> it = set.iterator();
		System.out.println("key�����е�Ԫ�أ�");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Collection<String> coll = map.values();		//����Map����������valuesֵ�ļ���
		it = coll.iterator();
		System.out.println("values�����е�Ԫ�أ�");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
