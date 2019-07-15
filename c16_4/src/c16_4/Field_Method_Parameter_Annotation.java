package c16_4;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({ FIELD, METHOD, PARAMETER })
public @interface Field_Method_Parameter_Annotation {
	String describle();						//����һ��û��Ĭ��ֵ��String�ͳ�Ա
	Class type() default void.class;		//����һ������Ĭ��ֵ��Class�ͳ�Ա
}
