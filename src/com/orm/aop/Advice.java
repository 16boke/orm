package com.orm.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component("advice")
public class Advice {
/*
execution(modifiers-pattern? ret-type-pattern declaring-type-pattern? name-pattern(param-pattern) throws-pattern?)  
modifiers-pattern：方法的操作权限
ret-type-pattern：返回值
declaring-type-pattern：方法所在的包
name-pattern：方法名
parm-pattern：参数名
throws-pattern：异常
其中，除ret-type-pattern和name-pattern之外，其他都是可选的。
上例中，execution(* com.spring.service.*.*(..))表示com.spring.service包下，
返回值为任意类型；方法名任意；参数不作限制的所有方法。
*/
	@Before("execution(* com.orm.dao.impl.*.*(..))")
	public void before() {
		System.out.println("操作之前的检查。");
	}
	@After("execution(* com.orm.dao.impl.*.*(..))")
	public void after() {
		System.out.println("操作之后的记录。");
	}
}
