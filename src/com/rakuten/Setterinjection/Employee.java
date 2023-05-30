package com.rakuten.Setterinjection;

public class Employee {
	private int id;
	private String name;
	private String design;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public void displayemployee() {
		System.out.println("Id\t\t|Name\t\tdesign");
		System.out.println(this.id+"|"+this.name+"|"+this.design);
	

}
}