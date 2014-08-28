package com.orm.dto;

import java.sql.Timestamp;

public class FloorDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer floorid;
	private String floorname;
	private Integer floor;
	private String detail;
	private Integer buildId;
	private String sortno;
	private Timestamp insertTime;
	private Timestamp updateTime;
	private Integer operateId;

	public FloorDto() {
	}

	public FloorDto(Integer floorid) {
		this.floorid = floorid;
	}

	public Integer getFloorid() {
		return this.floorid;
	}

	public void setFloorid(Integer floorid) {
		this.floorid = floorid;
	}

	public String getFloorname() {
		return this.floorname;
	}

	public void setFloorname(String floorname) {
		this.floorname = floorname;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Integer getBuildId() {
		return this.buildId;
	}

	public void setBuildId(Integer buildId) {
		this.buildId = buildId;
	}

	public String getSortno() {
		return this.sortno;
	}

	public void setSortno(String sortno) {
		this.sortno = sortno;
	}

	public Timestamp getInsertTime() {
		return this.insertTime;
	}

	public void setInsertTime(Timestamp insertTime) {
		this.insertTime = insertTime;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getOperateId() {
		return this.operateId;
	}

	public void setOperateId(Integer operateId) {
		this.operateId = operateId;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

}