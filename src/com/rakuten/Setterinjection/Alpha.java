package com.rakuten.Setterinjection;

public class Alpha {
	Beta b;
	public Alpha() {
		System.out.println("yor have created an object of Alpha");
		
	}
	
	public Beta getBeta() {
		return b;
	}

	public void setBeta(Beta b) {
		this.b = b;
	}

	void print() {
	System.out.println("hello Aplha");
	}
	void displayDetails() {
		print();
		b.print();
	}

}


