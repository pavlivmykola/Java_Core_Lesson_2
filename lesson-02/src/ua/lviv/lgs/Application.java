package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle();
		
		Rectangle rec2 = new Rectangle(17, 21);
		
		System.out.println("Площа прямокутника 1 = "+rec1.square());
		
		System.out.println("Площа прямокутника 2 = "+rec2.square());

		System.out.println("Периметр прямокутника 1 = "+rec1.perimeter());
		
		System.out.println("Периметр прямокутника 2 = "+rec2.perimeter());
		
		Circle cir1 = new Circle();
		
		Circle cir2 = new Circle(25.7f,51.4f);
		
		cir1.lenth();
		
		cir1.square();
		
		cir2.lenth();
		
		cir2.square();

	}

}
