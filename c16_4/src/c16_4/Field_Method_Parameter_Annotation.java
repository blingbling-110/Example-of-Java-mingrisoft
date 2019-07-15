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
	String describle();						//定义一个没有默认值的String型成员
	Class type() default void.class;		//定义一个具有默认值的Class型成员
}
