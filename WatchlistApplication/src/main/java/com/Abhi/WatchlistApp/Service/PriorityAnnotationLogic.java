package com.Abhi.WatchlistApp.Service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.Abhi.WatchlistApp.Entity.Validation.Priority;

public class PriorityAnnotationLogic implements ConstraintValidator<Priority, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value.trim().length()==1&& "LMH".contains(value.trim());
	}
		
}
