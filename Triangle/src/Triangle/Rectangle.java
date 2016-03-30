package Triangle;

public class Rectangle implements Geometry {

	private double side1;
	private double side2;
	public Rectangle(double side1, double side2){
		if (side1<=0 || side2<=0)
		{
			System.out.println("Прямоугольник не существует!");
			this.side1=0;
			this.side2=0;

		}
		else {
			this.side1=side1;
			this.side2=side2;
		}
	}
	public Rectangle(){
		side1=0;
		side2=0;
	}
	public void getPerimeter(){
		double perimeter;
		if(side1==0 || side2==0)
			System.out.println("Прямоугольник задан неправильно!");
		else{
			perimeter=2*(side1+side2);
			System.out.println("Периметр прямоугольника =" + perimeter);
		}
			
	}
	public void getArea(){
		double area;
		if(side1==0 || side2==0)
			System.out.println("Невозможно вычислить площадь треугольника!");
		else{
			area = side1*side2;
			System.out.println("Площадь прямоугольника равна =" + area);
		}
	}
}
