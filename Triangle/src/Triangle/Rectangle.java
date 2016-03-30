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
			perimeter=side1+side2+side3;
			System.out.println("Периметр треугольника =" + perimeter);
		}
			
	}
	public void getArea(){
		double area;
		double p;
		if(side1==0 || side2==0 || side3==0)
			System.out.println("Невозможно вычислить площадь треугольника!");
		else{
			p=(side1+side2+side3)/2;
			area=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
			System.out.println("Площадь треугольника равна =" + area);
		}
	}
}
