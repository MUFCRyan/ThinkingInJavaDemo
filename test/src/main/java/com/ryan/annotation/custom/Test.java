package com.ryan.annotation.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by MUFCRyan on 2017/5/15.
 * Book Page621 Chapter 20.1.1 定义注解
 * 标记注解：没有元素的注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {}
