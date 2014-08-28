package com.orm.dto;

import java.sql.Timestamp;

public class StoreDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String storename;
	private String storenameen;
	private String storeno;
	private Integer build_Id;
	private Integer floor_Id;
	private Integer area_Id;
	private Integer type_Id;
	private Integer point_Id;
	private String storeowner;
	private String area;
	private String remark;
	private String status;
	private String sortno;
	private Timestamp inserttime;
	private Timestamp updatetime;
	private Integer operateid;
	private BuildingDto buildingDto;
	private FloorDto floorDto;
	private AreaDto areaDto;

	public StoreDto() {
	}

	public StoreDto(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStorename() {
		return this.storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public String getStorenameen() {
		return this.storenameen;
	}

	public void setStorenameen(String storenameen) {
		this.storenameen = storenameen;
	}

	public String getStoreno() {
		return this.storeno;
	}

	public void setStoreno(String storeno) {
		this.storeno = storeno;
	}

	public Integer getBuild_Id() {
		return this.build_Id;
	}

	public void setBuild_Id(Integer build_Id) {
		this.build_Id = build_Id;
	}

	public Integer getFloor_Id() {
		return this.floor_Id;
	}

	public void setFloor_Id(Integer floor_Id) {
		this.floor_Id = floor_Id;
	}

	public Integer getArea_Id() {
		return this.area_Id;
	}

	public void setArea_Id(Integer area_Id) {
		this.area_Id = area_Id;
	}

	public Integer getType_Id() {
		return this.type_Id;
	}

	public void setType_Id(Integer type_Id) {
		this.type_Id = type_Id;
	}

	public Integer getPoint_Id() {
		return this.point_Id;
	}

	public void setPoint_Id(Integer point_Id) {
		this.point_Id = point_Id;
	}

	public String getStoreowner() {
		return this.storeowner;
	}

	public void setStoreowner(String storeowner) {
		this.storeowner = storeowner;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSortno() {
		return this.sortno;
	}

	public void setSortno(String sortno) {
		this.sortno = sortno;
	}

	public Timestamp getInserttime() {
		return this.inserttime;
	}

	public void setInserttime(Timestamp inserttime) {
		this.inserttime = inserttime;
	}

	public Timestamp getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getOperateid() {
		return this.operateid;
	}

	public void setOperateid(Integer operateid) {
		this.operateid = operateid;
	}

	public BuildingDto getBuildingDto() {
		return buildingDto;
	}

	public void setBuildingDto(BuildingDto buildingDto) {
		this.buildingDto = buildingDto;
	}

	public FloorDto getFloorDto() {
		return floorDto;
	}

	public void setFloorDto(FloorDto floorDto) {
		this.floorDto = floorDto;
	}

	public AreaDto getAreaDto() {
		return areaDto;
	}

	public void setAreaDto(AreaDto areaDto) {
		this.areaDto = areaDto;
	}

}