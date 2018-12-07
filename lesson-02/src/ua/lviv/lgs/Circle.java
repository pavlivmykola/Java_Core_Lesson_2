package ua.lviv.lgs;

public class Circle {
	
	private float radius;
	private float diameter;
	
	Circle(){
		radius=5.0f;
		diameter=10.0f;
	}
	
	Circle(float radius, float diameter){
		this.radius=radius;
		this.diameter=diameter;
	}
	
	public void square() {
		System.out.println("Площа кола = "+3.14*diameter*diameter/4);
	}

	public void lenth() {
		System.out.println("Довжина кола = "+2*3.14*radius);
	}
}
