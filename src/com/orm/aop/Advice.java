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
	modifiers-pattern�������Ĳ���Ȩ��
	ret-type-pattern������ֵ
	declaring-type-pattern���������ڵİ�
	name-pattern��������
	parm-pattern��������
	throws-pattern���쳣
	���У���ret-type-pattern��name-pattern֮�⣬�������ǿ�ѡ�ġ�
	�����У�execution(* com.spring.service.*.*(..))��ʾcom.spring.service���£�
	����ֵΪ�������ͣ����������⣻�����������Ƶ����з�����
	*/
	/*
	 * 1)JoinPoint
	 * java.lang.Object[] getArgs()����ȡ���ӵ㷽������ʱ������б� 
	 * Signature getSignature() ����ȡ���ӵ�ķ���ǩ������
	 * java.lang.Object getTarget() ����ȡ���ӵ����ڵ�Ŀ�����
	 * java.lang.Object getThis() ����ȡ���������
	 * 2)ProceedingJoinPoint
	 * ProceedingJoinPoint�̳�JoinPoint�ӽӿڣ�����������������ִ�����ӵ㷽���ķ�����
	 * java.lang.Object proceed() throws java.lang.Throwable��ͨ������ִ��Ŀ���������ӵ㴦�ķ�����
	 * java.lang.Object proceed(java.lang.Object[] args) throws java.lang.Throwable��ͨ������ִ��Ŀ��������ӵ㴦�ķ���������ʹ���µ�����滻ԭ������Ρ� 
	 * */
	@Before("execution(* com.orm.dao.impl.*.*(..))")
	public void before() {
		System.out.println("����֮ǰ�ļ�顣");
	}
	@After("execution(* com.orm.dao.impl.*.*(..))")
	public void after() {
		System.out.println("����֮��ļ�¼��");
	}
}
