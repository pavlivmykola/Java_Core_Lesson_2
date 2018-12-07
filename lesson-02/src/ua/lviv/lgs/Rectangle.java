package ua.lviv.lgs;

public class Rectangle {
	private int lenth;
	private int width;
	
	Rectangle (){
		this.lenth=10;
		this.width=10;
	}
	
	Rectangle (int lenth, int width){
		this.lenth=lenth;
		this.width=width;
	}
	
	public int square() {
		return lenth*width;
	}
	
	public int perimeter() {
		return (lenth+width)*2;
	}
}
