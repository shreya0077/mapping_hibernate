package com.stumapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.*;
@Entity
public class employee {
	
	
	@Id
	private int empId;
	private String empName;
	private String empLoaction;
	@OneToMany
	@JoinColumn(name="empId")
	private List<projects> project;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpLoaction() {
		return empLoaction;
	}
	public void setEmpLoaction(String empLoaction) {
		this.empLoaction = empLoaction;
	}
	public List<projects> getProject() {
		return project;
	}
	public void setProject(List<projects> project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", empLoaction=" + empLoaction + ", project="
				+ project + "]";
	}
	
	

}
