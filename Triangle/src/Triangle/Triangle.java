package Triangle;

public class Triangle {
	private double side1;
	private double side2;
	private double side3;
	public Triangle(double side1, double side2,double side3){
		if (side1+side2<side3 || side2+side3<side1 || side1+side3<side2 || side1<=0 || side2<=0 || side3<=0)
		{
			System.out.println("�N�u�r���x�}���w�~�� �����x�t�p���� �����u���s���|���~�y�{");
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
	public void getPerimeter(){
		double perimeter;
		if(side1==0 || side2==0 || side3==0)
			System.out.println("�N�u�r���x�}���w�~�� �r�����y���|�y���� ���u���y�}�u���� �t�p�~�~���s�� �����u���s���|���~�y�{�p");
		else{
			perimeter=side1+side2+side3;
			System.out.println("�P�u���y�}�u���� = " + perimeter);
		}
			
	}
	public void getArea(){
		double area;
		double p;
		if(side1==0 || side2==0 || side3==0)
			System.out.println("�N�u�r���x�}���w�~�� �r�����y���|�y���� ���|�����p�t�� �t�p�~�~���s�� �����u���s���|���~�y�{�p");
		else{
			p=(side1+side2+side3)/2;
			area=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
			System.out.println("�P�|�����p�t�� = " + area);
		}
	}
}
	

