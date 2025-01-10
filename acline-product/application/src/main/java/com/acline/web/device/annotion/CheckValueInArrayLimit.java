package com.acline.web.device.annotion;

import java.lang.annotation.*;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @author Aaron Chen
 * @date：2024/8/6
 * @Description:TODO
 * @Version 1.0
 */
@Documented
@Constraint(validatedBy = CheckInArrayValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckValueInArrayLimit {
    int[] values();
    String message() default "edwdeswqdwd";
}