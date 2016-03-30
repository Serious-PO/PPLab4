package MainPackage;

public class Triangle implements Geometry {
	private double side1;
	private double side2;
	private double side3;
	public Triangle(double side1, double side2,double side3){
		if (side1+side2<side3 || side2+side3<side1 || side1+side3<side2 || side1<=0 || side2<=0 || side3<=0)
		{
			System.out.println("Треугольник не существует!");
			this.side1=0;
			this.side2=0;
			this.side3=0;
		}
		else {
			this.side1=side1;
			this.side2=side2;
			this.side3=side3;
		}
	}
	public Triangle(){
		side1=0;
		side2=0;
		side3=0;
	}
	public void getPerimeter(){
		double perimeter;
		if(side1==0 || side2==0 || side3==0)
			System.out.println("Треугольник задан неправильно!");
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
	

