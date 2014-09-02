package com.orm.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.OrmDao;
import com.orm.dto.AreaDto;
import com.orm.dto.BuildingDto;
import com.orm.dto.StoreDto;
import com.orm.utils.DateUtil;

public class AreaMyBatisTest {
	private SqlSessionFactory sqlSessionFactory = null;
	private ApplicationContext ctx = null;
	@Before
	public void setUp() throws Exception {
		//sqlSessionFactory = MyBatisUtils.getSqlsessionfactory();
		
		//使用spring来管理mybatis的SqlSessionFactory
		ctx = new ClassPathXmlApplicationContext("classpath:spring/beans.xml");
		sqlSessionFactory = (SqlSessionFactory) ctx.getBean("sqlSessionFactory");
	}

	@Test
	public void getAreaDtoTest() {
		int id = 1;
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			OrmDao ormDao = session.getMapper(OrmDao.class);
			AreaDto areaDto = ormDao.getAreaDto(id);
			System.out.println(areaDto.getArea_name());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Test
	public void getAreaDto1Test() {
		int id = 1;
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			// selectOne中的第一个参数表示在mapper中定义的select语句的id
			AreaDto areaDto = (AreaDto) session.selectOne("getAreaDto", id);
			System.out.println(areaDto.getArea_name());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Test
	public void getBuildingDtoTest() {
		int id = 1;
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			// selectOne中的第一个参数表示在mapper中定义的select语句的id
			BuildingDto buildingDto = (BuildingDto) session.selectOne("getBuildingDto", id);
			System.out.println(buildingDto.getBuildname());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Test
	public void getAreaDtosTest() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			OrmDao ormDao = session.getMapper(OrmDao.class);
			List<AreaDto> list = ormDao.getAreaDtos();
			System.out.println(list.size());
			for (AreaDto areaDto : list) {
				System.out.println(areaDto.getArea_name());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Test
	public void getAreaDtos1Test() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			List<AreaDto> list = session.selectList("getAreaDtos");
			System.out.println(list.size());
			for (AreaDto areaDto : list) {
				System.out.println(areaDto.getArea_name());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Test
	public void getStoreDtosByMapTest() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			Map<String, Object> param = new HashMap<String, Object>();
			param.put("build_id", 1);
			param.put("floor_id", 2);
			param.put("area_id", 2);
			List<StoreDto> list = session.selectList("getStoreDtosByMap", param);
			System.out.println(list.size());
			for (StoreDto storeDto : list) {
				System.out.println(storeDto.getStorename());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Test
	public void getStoreDtosByBeanTest() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			StoreDto param = new StoreDto();
			param.setBuild_Id(1);
			param.setFloor_Id(2);
			param.setArea_Id(2);
			List<StoreDto> list = session.selectList("getStoreDtosByBean", param);
			System.out.println(list.size());
			for (StoreDto storeDto : list) {
				System.out.println(storeDto.getStorename());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	@Test
	public void getdetailstoreTest() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			List<StoreDto> list = session.selectList("getdetailstore");
			System.out.println(list.size());
			for (StoreDto storeDto : list) {
				System.out.println(storeDto.getStorename()+","+storeDto.getBuildingDto().getBuildname());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	@Test
	public void getCountStoreTest() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			//OrmDao ormDao = session.getMapper(OrmDao.class);
			//int count = ormDao.getCountStore();
			int count = session.selectOne("getCountStore");
			System.out.println("count = "+count);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	@Test
	public void saveBuildByBeanTest() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			BuildingDto buildingDto = new BuildingDto();
			buildingDto.setBuildname("楼号");
			buildingDto.setDetail("描述");
			buildingDto.setInsertTime(DateUtil.getCurTimestampToSecond());
			buildingDto.setUpdateTime(DateUtil.getCurTimestampToSecond());
			int result = session.insert("saveBuildByBean", buildingDto);
			session.commit();//更新操作需要手工提交session
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	@Test
	public void saveBuildByBeanTest1() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			BuildingDto buildingDto = new BuildingDto();
			buildingDto.setBuildname("楼号");
			buildingDto.setDetail("描述");
			buildingDto.setInsertTime(DateUtil.getCurTimestampToSecond());
			buildingDto.setUpdateTime(DateUtil.getCurTimestampToSecond());
			//int result = session.insert("saveBuildByBean", buildingDto);
			OrmDao ormDao = session.getMapper(OrmDao.class);
			ormDao.saveBuildByBean(buildingDto);
			session.commit();//更新操作需要手工提交session
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	@Test
	public void saveBuildByMapTest() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			Map<String,Object>param = new HashMap<String, Object>();
			param.put("buildname", "新楼号");
			param.put("detail", "描述");
			param.put("inserttime", DateUtil.getCurTimestampToSecond());
			param.put("updatetime", DateUtil.getCurTimestampToSecond());
			int result = session.insert("saveBuildByMap", param);
			session.commit();//更新操作需要手工提交session
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	@Test
	public void deleteBuildByIdTest() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			//int result = session.delete("deleteBuildById", 9);
			OrmDao ormDao = session.getMapper(OrmDao.class);
			ormDao.deleteBuildById(11);
			session.commit();//更新操作需要手工提交session
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	@Test
	public void updateBuildByIdTest() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			BuildingDto buildingDto = new BuildingDto();
			buildingDto.setBuildid(12);
			buildingDto.setBuildname("修改的楼号");
			buildingDto.setDetail("描述");
			buildingDto.setUpdateTime(DateUtil.getCurTimestampToSecond());
			int result = session.update("updateBuildById", buildingDto);
			session.commit();//更新操作需要手工提交session
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
