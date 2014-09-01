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
	/*
	 * 1)JoinPoint
	 * java.lang.Object[] getArgs()：获取连接点方法运行时的入参列表； 
	 * Signature getSignature() ：获取连接点的方法签名对象；
	 * java.lang.Object getTarget() ：获取连接点所在的目标对象；
	 * java.lang.Object getThis() ：获取代理对象本身；
	 * 2)ProceedingJoinPoint
	 * ProceedingJoinPoint继承JoinPoint子接口，它新增了两个用于执行连接点方法的方法：
	 * java.lang.Object proceed() throws java.lang.Throwable：通过反射执行目标对象的连接点处的方法；
	 * java.lang.Object proceed(java.lang.Object[] args) throws java.lang.Throwable：通过反射执行目标对象连接点处的方法，不过使用新的入参替换原来的入参。 
	 * */
	@Before("execution(* com.orm.dao.impl.*.*(..))")
	public void before() {
		System.out.println("操作之前的检查。");
	}
	@After("execution(* com.orm.dao.impl.*.*(..))")
	public void after() {
		System.out.println("操作之后的记录。");
	}
}
