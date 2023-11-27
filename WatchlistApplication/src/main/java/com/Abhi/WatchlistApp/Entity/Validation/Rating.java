package com.Abhi.WatchlistApp.Entity.Validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.Abhi.WatchlistApp.Service.RatingAnnotationLogic;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = RatingAnnotationLogic.class)
public @interface Rating {
	
	String message() default "Please enter rating between 5 to 10 only";
	Class<?>[]groups() default {};
	Class<? extends Payload>[] payload() default{};
}
