package com.orm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.orm.dao.OrmDao;
import com.orm.dto.AreaDto;

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private OrmDao jdbcTemplateOrmDao;
	private ApplicationContext applicationContext;

	public TestServlet() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		jdbcTemplateOrmDao = (OrmDao) applicationContext.getBean("jdbcTemplateOrmDao");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("jdbcTemplateOrmDao = " + getJdbcTemplateOrmDao());
		// 设置post请求参数的编码
		request.setCharacterEncoding("UTF-8");
		// 设置输出编码
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String type = request.getParameter("type");
		if (type != null && type.equals("add")) {// 保存
			List<AreaDto> list = this.getJdbcTemplateOrmDao().getAreaDtos();
			for (AreaDto areaDto : list) {
				System.out.println(areaDto.getArea_name());
			}
		}
		out.write("1");
		out.flush();
		out.close();
	}

	public OrmDao getJdbcTemplateOrmDao() {
		return jdbcTemplateOrmDao;
	}

	public void setJdbcTemplateOrmDao(OrmDao jdbcTemplateOrmDao) {
		this.jdbcTemplateOrmDao = jdbcTemplateOrmDao;
	}
}
