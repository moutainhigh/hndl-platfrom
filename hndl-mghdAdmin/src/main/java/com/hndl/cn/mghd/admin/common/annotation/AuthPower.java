package com.hndl.cn.mghd.admin.common.annotation;

import java.lang.annotation.*;

/**
 * @author 赵俊凯
 * @Description 校验权限注解
 * @Date 2019/6/24 16:20
 * @Created by 湖南达联
 */
@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthPower {

    boolean isLikeAuth() default true;

}
