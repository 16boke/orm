package com.orm.test;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.orm.dao.OrmDao;
import com.orm.dto.AreaDto;
/**
 * 采用SpringJunit4单元测试框架
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/beans.xml")
public class AreaSpringTest {
	@Autowired
	private OrmDao jdbcTemplateOrmDao;
	@Test
	public void getAreaDtosTest(){
		List<AreaDto> list = this.jdbcTemplateOrmDao.getAreaDtos();
		for(AreaDto areaDto : list){
			System.out.println(areaDto.getArea_name());
		}
		System.out.println(list.size());
	}
}
