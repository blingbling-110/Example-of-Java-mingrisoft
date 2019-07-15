package c16_4;

import java.lang.annotation.*;
import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) {
		Record record = new Record();
		Class<? extends Record> recordC = record.getClass();
		
		//获得所有构造方法
		Constructor[] declaredConstructors = recordC.getDeclaredConstructors();
		for(Constructor c: declaredConstructors) {
			//查看是否具有指定类型的注释
			if(c.isAnnotationPresent(Constructor_Annotation.class)) {
				//获得指定类型的注释
				Constructor_Annotation ca = (Constructor_Annotation) c.getAnnotation(
						Constructor_Annotation.class);
				System.out.println(ca.value());		//获得注释信息
			}
			//获得参数的注释
			Annotation[][] parameterAnnotations = c.getParameterAnnotations();
			for(int i = 0; i < parameterAnnotations.length; i++) {
				//获得指定参数注释的长度
				int length = parameterAnnotations[i].length;
				if(length == 0) {
					System.out.println("    未添加Annotation的参数");
				}else {
					for(int j = 0; j < length; j++) {
						//获得参数的注释
						Field_Method_Parameter_Annotation pa = 
								(Field_Method_Parameter_Annotation) 
								parameterAnnotations[i][j];
						System.out.print("    " + pa.describle());		//获得参数描述
						System.out.println("    " + pa.type());			//获得参数类型
					}
				}
			}
			System.out.println();
		}
		
		//获得所有字段
		Field[] declaredFields = recordC.getDeclaredFields();
		for(Field f: declaredFields) {
			//查看是否具有指定类型的注释
			if(f.isAnnotationPresent(Field_Method_Parameter_Annotation.class)) {
				//获得指定类型的注释
				Field_Method_Parameter_Annotation fa = 
						f.getAnnotation(Field_Method_Parameter_Annotation.class);
				System.out.print("    " + fa.describle());			//获得字段的描述
				System.out.println("    " + fa.type());				//获得字段的类型
			}
		}
		
		//获得所有方法
		Method[] methods = recordC.getDeclaredMethods();
		for(Method m: methods) {
			//查看是否具有指定类型的注释
			if(m.isAnnotationPresent(Field_Method_Parameter_Annotation.class)) {
				//获得指定类型的注释
				Field_Method_Parameter_Annotation ma = m.getAnnotation(
						Field_Method_Parameter_Annotation.class);
				System.out.println("    " + ma.describle());		//获得方法的描述
				System.out.println("    " + ma.type());				//获得方法的返回值类型
			}
			Annotation[][] parameterAnnotations = 
					m.getParameterAnnotations();					//获得参数的注释
			for(int i = 0; i < parameterAnnotations.length; i++) {
				int length = parameterAnnotations[i].length;		//获得指定参数注释的长度
				if(length == 0) {
					System.out.println("    未添加Annotation的参数");
				}else {
					for(int j = 0; j < length; j++) {
						//获得指定类型的注释
						Field_Method_Parameter_Annotation pa = 
								(Field_Method_Parameter_Annotation)
								parameterAnnotations[i][j];
						System.out.print("    " + pa.describle());		//获得参数的描述
						System.out.println("    " + pa.type());			//获得参数的类型
					}
				}
			}
			System.out.println();
		}
	}

}
