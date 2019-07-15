package c16_4;

import java.lang.annotation.*;
import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) {
		Record record = new Record();
		Class<? extends Record> recordC = record.getClass();
		
		//������й��췽��
		Constructor[] declaredConstructors = recordC.getDeclaredConstructors();
		for(Constructor c: declaredConstructors) {
			//�鿴�Ƿ����ָ�����͵�ע��
			if(c.isAnnotationPresent(Constructor_Annotation.class)) {
				//���ָ�����͵�ע��
				Constructor_Annotation ca = (Constructor_Annotation) c.getAnnotation(
						Constructor_Annotation.class);
				System.out.println(ca.value());		//���ע����Ϣ
			}
			//��ò�����ע��
			Annotation[][] parameterAnnotations = c.getParameterAnnotations();
			for(int i = 0; i < parameterAnnotations.length; i++) {
				//���ָ������ע�͵ĳ���
				int length = parameterAnnotations[i].length;
				if(length == 0) {
					System.out.println("    δ���Annotation�Ĳ���");
				}else {
					for(int j = 0; j < length; j++) {
						//��ò�����ע��
						Field_Method_Parameter_Annotation pa = 
								(Field_Method_Parameter_Annotation) 
								parameterAnnotations[i][j];
						System.out.print("    " + pa.describle());		//��ò�������
						System.out.println("    " + pa.type());			//��ò�������
					}
				}
			}
			System.out.println();
		}
		
		//��������ֶ�
		Field[] declaredFields = recordC.getDeclaredFields();
		for(Field f: declaredFields) {
			//�鿴�Ƿ����ָ�����͵�ע��
			if(f.isAnnotationPresent(Field_Method_Parameter_Annotation.class)) {
				//���ָ�����͵�ע��
				Field_Method_Parameter_Annotation fa = 
						f.getAnnotation(Field_Method_Parameter_Annotation.class);
				System.out.print("    " + fa.describle());			//����ֶε�����
				System.out.println("    " + fa.type());				//����ֶε�����
			}
		}
		
		//������з���
		Method[] methods = recordC.getDeclaredMethods();
		for(Method m: methods) {
			//�鿴�Ƿ����ָ�����͵�ע��
			if(m.isAnnotationPresent(Field_Method_Parameter_Annotation.class)) {
				//���ָ�����͵�ע��
				Field_Method_Parameter_Annotation ma = m.getAnnotation(
						Field_Method_Parameter_Annotation.class);
				System.out.println("    " + ma.describle());		//��÷���������
				System.out.println("    " + ma.type());				//��÷����ķ���ֵ����
			}
			Annotation[][] parameterAnnotations = 
					m.getParameterAnnotations();					//��ò�����ע��
			for(int i = 0; i < parameterAnnotations.length; i++) {
				int length = parameterAnnotations[i].length;		//���ָ������ע�͵ĳ���
				if(length == 0) {
					System.out.println("    δ���Annotation�Ĳ���");
				}else {
					for(int j = 0; j < length; j++) {
						//���ָ�����͵�ע��
						Field_Method_Parameter_Annotation pa = 
								(Field_Method_Parameter_Annotation)
								parameterAnnotations[i][j];
						System.out.print("    " + pa.describle());		//��ò���������
						System.out.println("    " + pa.type());			//��ò���������
					}
				}
			}
			System.out.println();
		}
	}

}
