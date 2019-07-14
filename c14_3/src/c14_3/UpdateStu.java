package c14_3;

import java.util.*;

//������ʵ��Comparable�ӿ�
public class UpdateStu implements Comparable<Object>{
	long id;
	String name;
	
	public UpdateStu(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		UpdateStu stu1 = new UpdateStu(01011, "��ͬѧ");
		UpdateStu stu2 = new UpdateStu(01021, "��ͬѧ");
		UpdateStu stu3 = new UpdateStu(01051, "��ͬѧ");
		UpdateStu stu4 = new UpdateStu(01012, "��ͬѧ");
		TreeSet<UpdateStu> stuTreeSet = new TreeSet<UpdateStu>();
		stuTreeSet.add(stu1);
		stuTreeSet.add(stu2);
		stuTreeSet.add(stu3);
		stuTreeSet.add(stu4);
		Iterator<UpdateStu> stuIterator = stuTreeSet.iterator();
		Iterator<UpdateStu> stuIterator2 = stuTreeSet.headSet(stu2).iterator();
		Iterator<UpdateStu> stuIterator3 = stuTreeSet.subSet(stu2, stu3).iterator();
		System.out.println("Set�����е�����Ԫ�أ�");
		while(stuIterator.hasNext()) {
			UpdateStu stu = stuIterator.next();
			System.out.println(stu.getId() + " " + stu.getName());
		}
		System.out.println("��ȡǰ�沿�ֵļ��ϣ�");
		while(stuIterator2.hasNext()) {
			UpdateStu stu = stuIterator2.next();
			System.out.println(stu.getId() + " " + stu.getName());
		}
		System.out.println("��ȡ�м䲿�ֵļ��ϣ�");
		while(stuIterator3.hasNext()) {
			UpdateStu stu = stuIterator3.next();
			System.out.println(stu.getId() + " " + stu.getName());
		}
		
	}

	@Override
	public int compareTo(Object o) {
		UpdateStu u = (UpdateStu)o;
		int r = id > u.id ? 1 : (id < u.id ? -1 : 0);
		return r;
	}

}
