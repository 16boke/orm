package com.orm.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.OrmDao;
import com.orm.dto.AreaDto;

public class AreaTest{
	private ApplicationContext ctx = null;
	@Autowired
	private OrmDao jdbcTemplateOrmDao = null;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("classpath:spring/beans.xml");
		jdbcTemplateOrmDao = (OrmDao) ctx.getBean("jdbcTemplateOrmDao");
	}
	@Test
	public void getAreaDtosTest(){
		List<AreaDto> list = this.jdbcTemplateOrmDao.getAreaDtos();
		for(AreaDto areaDto : list){
			System.out.println(areaDto.getArea_name());
		}
	}
	@Test
	public void getAreaDtosTest1(){
		List<AreaDto> list = this.jdbcTemplateOrmDao.getAreaDtos1();
		for(AreaDto areaDto : list){
			System.out.println(areaDto.getArea_name());
		}
		System.out.println(list.size());
	}
	@Test
	public void getBuildsTest(){
		Map<String, Object> builds = this.jdbcTemplateOrmDao.getBuilds();
		Iterator<String> keys = builds.keySet().iterator();
		String key = "";
		while(keys.hasNext()){
			key = keys.next();
			System.out.println("key = "+key+",value = "+builds.get(key));
		}
	}
	@Test
	public void getFloorsTest(){
		Map<String, Object> floors = this.jdbcTemplateOrmDao.getFloors("1");
		System.out.println(floors);
		Set<Entry<String, Object>> floorSet = floors.entrySet();
		for(Entry floor : floorSet){
			System.out.println(floor.getKey()+","+floor.getValue());
		}
	}
	@Test
	public void getAreasTest(){
		Map<String, Object> areas = this.jdbcTemplateOrmDao.getAreas("1","1");
		System.out.println(areas);
		Set<Entry<String, Object>> areaSet = areas.entrySet();
		for(Entry area : areaSet){
			System.out.println(area.getKey()+","+area.getValue());
		}
	}
	@Test
	public void getCountStoreTest(){
		System.out.println(this.jdbcTemplateOrmDao.getCountStore());
	}
}
