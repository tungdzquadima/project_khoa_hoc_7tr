package com.laptrinhjavaweb.bean;

import java.util.ArrayList;
import java.util.List;

public class AssignmentBuildingBean {
	private Long buildingId;
	private List<Long> staffIds=new ArrayList<>();
	public Long getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(Long buildingId) {
		this.buildingId = buildingId;
	}
	public List<Long> getStaffIds() {
		return staffIds;
	}
	public void setStaffIds(List<Long> staffIds) {
		this.staffIds = staffIds;
	}
	
}
