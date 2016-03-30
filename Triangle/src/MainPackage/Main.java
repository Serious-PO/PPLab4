package MainPackage;

public class Main {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle(1,2,0.5);
		Triangle t3 = new Triangle(3,3,3);
		System.out.println("t1");
		t1.getArea();
		t1.getPerimeter();
		System.out.println("t2");
		t2.getArea();
		t2.getPerimeter();
		System.out.println("t3");
		t3.getArea();
		t3.getPerimeter();
	}

}
