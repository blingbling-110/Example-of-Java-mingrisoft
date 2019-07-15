package c14_5;

import java.util.*;

public class MapText {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		Emp emp1 = new Emp("351", "����");
		Emp emp2 = new Emp("512", "����");
		Emp emp3 = new Emp("853", "��һ");
		Emp emp4 = new Emp("125", "����");
		Emp emp5 = new Emp("341", "����");
		
		map.put(emp4.getId(), emp4.getName());
		map.put(emp5.getId(), emp5.getName());
		map.put(emp1.getId(), emp1.getName());
		map.put(emp2.getId(), emp2.getName());
		map.put(emp3.getId(), emp3.getName());
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		System.out.println("HashMap��ʵ�ֵ�Map���ϣ�����");
		while(it.hasNext()) {
			String id = (String)it.next();
			String name = (String)map.get(id);
			System.out.println(id + " " + name);
		}
		
		TreeMap<String, String> treemap = new TreeMap<String, String>();
		treemap.putAll(map);		//��TreeMap������Ӷ���
		Iterator<String> iter = treemap.keySet().iterator();
		System.out.println("TreeMap��ʵ�ֵ�Map���ϣ�����������");
		while(iter.hasNext()) {
			String id = (String)iter.next();
			String name = (String)treemap.get(id);
			System.out.println(id + " " + name);
		}
	}

}
