package com.Abhi.WatchlistApp.Entity.Validation;



import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.Abhi.WatchlistApp.Service.PriorityAnnotationLogic;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = PriorityAnnotationLogic.class)
public @interface Priority {
	String message() default "Please enter L, M, H only";
	Class<?>[]groups() default {};
	Class<? extends Payload>[] payload() default{};
}
