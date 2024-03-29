package com.demo.tool.utils;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import org.hibernate.validator.HibernateValidator;

import com.demo.tool.exception.CheckException;

/**
 * @author huangjian
 * @version 1.0
 * @Description 参数校验工具类
 * @date 2018/3/29
 */
public class ValidationUtils {

    /**
     * 使用hibernate的注解来进行验证
     */
    private static Validator validator = Validation
            .byProvider(HibernateValidator.class).configure().failFast(true).buildValidatorFactory().getValidator();

    /**
     * 功能描述: <br>
     * 〈注解验证参数〉
     *
     * @param obj
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    public static <T> void validate(T obj) {
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(obj);
        // 抛出检验异常
        if (constraintViolations.size() > 0) {
            throw new CheckException(String.format("参数校验失败:%s", constraintViolations.iterator().next().getMessage()));
        }
    }

	/*
	 * public static void main(String[] args) { User user = new User();
	 * user.setTime(new Date()); user.setMobile("15818171755");
	 * user.setPassword("7777"); user.setUserName("12"); validate(user); }
	 */
}
