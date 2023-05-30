package com.rakuten.Setterinjection;

import java.util.Iterator;
import java.util.List;

public class Department {
	private int deptid;
	private String deptname;
	private List<String> lst;
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public List<String> getLst() {
		return lst;
	}
	public void setLst(List<String> lst) {
		this.lst = lst;
	}
	void displayRecords() {
		System.out.println(this.deptid+"\t\t"+this.deptname);
		Iterator<String>itr = lst.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
	
	}	

	}
}
