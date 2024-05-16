package com.acline.core.poi;

import java.lang.annotation.*;

/**
 * @author Aaron Chen
 * @date：2024/5/6
 * @Description:TODO
 * @Version 1.0
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface UserPoi {
     String value() default "";
}
