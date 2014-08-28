package com.orm.utils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	private static final SqlSessionFactory sqlSessionFactory;
	static{
		String resource = "mybatis/mybatis.xml";
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	}
	public static SqlSessionFactory getSqlsessionfactory() {
		return sqlSessionFactory;
	}
	public static void main(String[] args) {
		System.out.println(MyBatisUtils.getSqlsessionfactory());
	}
}
