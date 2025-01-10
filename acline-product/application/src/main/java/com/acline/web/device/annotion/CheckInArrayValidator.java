package com.acline.web.device.annotion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

/**
 * @author Aaron Chen
 * @date：2024/8/6
 * @Description:TODO
 * @Version 1.0
 */
@Component
public class CheckInArrayValidator implements ConstraintValidator<CheckValueInArrayLimit, Object> {

    protected static final Logger logger = LoggerFactory.getLogger(CheckInArrayValidator.class);
    private int[] allowedValues;
    private String message;

    @Override
    public void initialize(CheckValueInArrayLimit constraintAnnotation) {
        logger.info("value:{},context:{}",allowedValues);
        allowedValues = constraintAnnotation.values();
//        message= constraintAnnotation.message();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
//       try {
           logger.info("value:{},context:{}", allowedValues);
           if (value == null) {
               return false;
           }
           return Arrays.asList(allowedValues).contains(((Integer) value).intValue());
//       }catch (Exception e){
//           throw new RuntimeException(message);
//       }

    }
}