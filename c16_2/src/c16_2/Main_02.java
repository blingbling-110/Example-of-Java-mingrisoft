package c16_2;

import java.lang.reflect.Field;

public class Main_02 {
	public static void main(String[] args) {
		Example_02 example = new Example_02();
		Class<? extends Example_02> exampleC = example.getClass();
		//������г�Ա����
		Field[] declaredFields = exampleC.getDeclaredFields();
		for(Field d: declaredFields) {
			//��ó�Ա��������
			System.out.println("����Ϊ��" + d.getName());
			Class fieldType = d.getType();		//��ó�Ա��������
			System.out.println("����Ϊ��" + fieldType);
			boolean isTurn = true;
			while(isTurn) {
				//����ó�Ա�����ķ���Ȩ��Ϊprivate�����׳��쳣�������������
				try {
					isTurn = false;
					//��ó�Ա����ֵ
					System.out.println("�޸�ǰ��ֵΪ��" + d.get(example));
					//�жϳ�Ա�����������Ƿ�Ϊint��
					if(fieldType.equals(int.class)) {
						System.out.println("���÷���setInt()�޸ĳ�Ա������ֵ");
						d.setInt(example, 168);		//Ϊint�ͳ�Ա������ֵ
						//�жϳ�Ա�����������Ƿ�Ϊfloat��
					}else if(fieldType.equals(float.class)) {
						System.out.println("���÷���setFloat()�޸ĳ�Ա������ֵ");
						d.setFloat(example, 99.9F);
						//�жϳ�Ա�����������Ƿ�Ϊboolean��
					}else if(fieldType.equals(boolean.class)) {
						System.out.println("���÷���setBoolean()�޸ĳ�Ա������ֵ");
						d.setBoolean(example, true);
					}else {
						System.out.println("���÷���set()�޸ĳ�Ա������ֵ");
						//����Ϊ�������͵ĳ�Ա������ֵ
						d.set(example, "MWQ");
					}
					//��ó�Ա����ֵ
					System.out.println("�޸ĺ��ֵΪ��" + d.get(example));
				}catch (Exception e) {
					System.out.println("�����ó�Ա����ֵʱ�׳��쳣��"
							 + "����ִ��setAccessible()������");
					d.setAccessible(true);		//����Ϊ�������
					isTurn = true;
				}
			}
			System.out.println();
		}
	}
}
