package com.phoenix.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// target is meta annotation
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface CopyrightInfo {
	
	String author();

	double version() default 1.0;

	String copyright() default "STL";
}
