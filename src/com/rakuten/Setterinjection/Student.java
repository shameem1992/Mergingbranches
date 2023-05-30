package com.rakuten.Setterinjection;

public class Student {
	private int id;
	private String name;
	private Adress a;
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
	public Adress getA() {
		return a;
	}
	public void setA(Adress a) {
		this.a = a;
	}
	public void studentdetails() {
		System.out.println("Id\t\t|Name\t\tcity\t\tState\t\tCountry");
			System.out.println(this.id+"\t\t"+this.name+"\t\t"+this.a.city+"\t\t"+this.a.state+"\t\t"+this.a.country);
			
		}

}
