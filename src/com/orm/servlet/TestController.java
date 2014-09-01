package com.orm.servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.orm.dao.OrmDao;
import com.orm.dto.AreaDto;

@Controller
public class TestController {
	@Autowired
	private OrmDao jdbcTemplateOrmDao;
	@ResponseBody
	@RequestMapping("/add.do")
	public String add(HttpServletRequest request) {
		System.out.println("jdbcTemplateOrmDao = " + jdbcTemplateOrmDao);
		List<AreaDto> list = this.jdbcTemplateOrmDao.getAreaDtos();
		for (AreaDto areaDto : list) {
			System.out.println(areaDto.getArea_name());
		}
		return "1";
	}
}
