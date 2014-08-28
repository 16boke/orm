package com.orm.dto;

import java.sql.Timestamp;

public class BuildingDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer buildid;
	private String buildname;
	private String detail;
	private String sortno;
	private Timestamp insertTime;
	private Timestamp updateTime;
	private Integer operateId;

	public BuildingDto() {
	}

	public BuildingDto(Integer buildid,String buildname) {
		this.buildid = buildid;
		this.buildname = buildname;
	}

	public BuildingDto(Integer buildid, String buildname, String detail, String sortno, Timestamp insertTime,
			Timestamp updateTime, Integer operateId) {
		this.buildid = buildid;
		this.buildname = buildname;
		this.detail = detail;
		this.sortno = sortno;
		this.insertTime = insertTime;
		this.updateTime = updateTime;
		this.operateId = operateId;
	}

	public Integer getBuildid() {
		return this.buildid;
	}

	public void setBuildid(Integer buildid) {
		this.buildid = buildid;
	}

	public String getBuildname() {
		return this.buildname;
	}

	public void setBuildname(String buildname) {
		this.buildname = buildname;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
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

}