package com.Abhi.WatchlistApp.Service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.Abhi.WatchlistApp.Entity.Validation.Rating;

public class RatingAnnotationLogic implements ConstraintValidator<Rating, Double>{

	@Override
	public boolean isValid(Double value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value >= 0 && value <= 10;
	}

}
