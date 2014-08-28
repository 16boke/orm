package com.orm.dao;

import java.util.List;
import java.util.Map;

import com.orm.dto.AreaDto;
import com.orm.dto.BuildingDto;
import com.orm.dto.FloorDto;
import com.orm.dto.StoreDto;

public interface OrmDao {
	public List<AreaDto> getAreaDtos();

	public List<AreaDto> getAreaDtos1();

	public Map<String, Object> getBuilds();

	public Map<String, Object> getFloors(String build);

	public Map<String, Object> getAreas(String build, String floor);

	public List<StoreDto> getStoreDtos(int build_id, int floor_id, int area_id);

	public List<BuildingDto> getBuildingDto();

	public List<FloorDto> getFloorDtos(int buildid);

	public List<AreaDto> getAreaDto(int buildid, int floorid);

	public AreaDto getAreaDto(int id);

	public BuildingDto getBuildingDto(int buildId);

	public FloorDto getFloorDto(int floorId);

	public List<StoreDto> getAllStores();

	public String storeName(int storeId);

	public StoreDto getStoreById(int storeId);

	public int getCountStore();

	public void saveBuild(BuildingDto buildingDto);
	
	public void saveBuildByBean(BuildingDto buildingDto);

	public void deleteBuildById(int buildid);

	public void updateBuildById(BuildingDto buildingDto);
	
	public List<StoreDto> getdetailstore();
}
