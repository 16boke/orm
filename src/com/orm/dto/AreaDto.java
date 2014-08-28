package com.orm.dto;

import java.sql.Timestamp;

public class AreaDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer areaid;
	private String area_name;
	private String area_detail;
	private Integer floor_id;
	private Integer build_id;
	private String region_name;
	private String sortno;
	private Timestamp insert_time;
	private Timestamp update_time;
	private Integer operate_id;

	public AreaDto() {
	}

	public AreaDto(Integer areaid) {
		this.areaid = areaid;
	}

	public Integer getAreaid() {
		return areaid;
	}

	public void setAreaid(Integer areaid) {
		this.areaid = areaid;
	}

	public String getArea_name() {
		return area_name;
	}

	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}

	public String getArea_detail() {
		return area_detail;
	}

	public void setArea_detail(String area_detail) {
		this.area_detail = area_detail;
	}

	public Integer getFloor_id() {
		return floor_id;
	}

	public void setFloor_id(Integer floor_id) {
		this.floor_id = floor_id;
	}

	public Integer getBuild_id() {
		return build_id;
	}

	public void setBuild_id(Integer build_id) {
		this.build_id = build_id;
	}

	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}

	public String getSortno() {
		return sortno;
	}

	public void setSortno(String sortno) {
		this.sortno = sortno;
	}

	public Timestamp getInsert_time() {
		return insert_time;
	}

	public void setInsert_time(Timestamp insert_time) {
		this.insert_time = insert_time;
	}

	public Timestamp getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}

	public Integer getOperate_id() {
		return operate_id;
	}

	public void setOperate_id(Integer operate_id) {
		this.operate_id = operate_id;
	}

}