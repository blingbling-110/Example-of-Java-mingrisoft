package c14_4;

import java.util.*;

public class UpdateStu {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("01", "李同学");
		map.put("02", "魏同学");
		Set<String> set = map.keySet();				//构建Map集合中所有key对象的集合
		Iterator<String> it = set.iterator();
		System.out.println("key集合中的元素：");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Collection<String> coll = map.values();		//构建Map集合中所有values值的集合
		it = coll.iterator();
		System.out.println("values集合中的元素：");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
