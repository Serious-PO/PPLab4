package MainPackage;

public class Сircle {
	public float  radius;
	public Сircle(float radius)
	{
		if(radius>=0)
		{
			radius=this.radius;
		}
		{
			System.out.println("Радиус должен быть больше 0!");
			this.radius=0;
		}
	}
	public Сircle(){
		this.radius=0;
	}
	public void getPerimeter(){
		double perimeter;
		if(radius==0)
			System.out.println("Радиус задан неправильно!");
		else{
			perimeter=2*3.14*radius;
			System.out.println("Длина окружности =" + perimeter);
		}
			
	}
	public void getArea(){
		double area;
		double p;
		if(radius==0)
			System.out.println("Радиус задан неправильно!");
		else{
			area=3.14*radius*radius;
			System.out.println("Площадь круга равна =" + area);
		}
	}

}
