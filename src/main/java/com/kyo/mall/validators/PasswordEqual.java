package com.kyo.mall.validators;


import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface PasswordEqual {
    int min() default 4;
    int max() default 6;

    String message() default "password are not equal";
    //校验类标准方法
    Class<?> [] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
