package MainPackage;

public class �ircle {
	public float  radius;
	public �ircle(float radius)
	{
		if(radius>=0)
		{
			radius=this.radius;
		}
		{
			System.out.println("������ ������ ���� ������ 0!");
			this.radius=0;
		}
	}
	public �ircle(){
		this.radius=0;
	}
	public void getPerimeter(){
		double perimeter;
		if(radius==0)
			System.out.println("������ ����� �����������!");
		else{
			perimeter=2*3.14*radius;
			System.out.println("����� ���������� =" + perimeter);
		}
			
	}
	public void getArea(){
		double area;
		double p;
		if(radius==0)
			System.out.println("������ ����� �����������!");
		else{
			area=3.14*radius*radius;
			System.out.println("������� ����� ����� =" + area);
		}
	}

}
