package txst;

import txst.Circle;

public class AreaTest {
	public static void main(String[] args) {
		Shape[] fs=new Shape[3];
		fs[0]=new Circle("圆形",4.0);
		fs[1]=new Rectangle("长方形",10.0,5.0);
		fs[2]=new Square("正方形",5);
	    for(Shape f:fs) {
	    	System.out.println(f.getName()+"的面积为"+f.getArea());
	    	System.out.println(f.getName()+"的周长为"+f.getCircumference());
	    }
}
}
class Shape {
	public String name;
	Shape(){
		
	}
	public Shape(String mz) {
		name=mz;
	}
	 public double getCircumference() {
		   return 0;
	 }
	public String getName() {
		return name;
	}
	public double getArea() {
		return 0.0;
	}
	
}
class  Rectangle extends Shape{
	private double width;
	private double height;
	public Rectangle(String shapeName,double width,double heigh) {
		super(shapeName);
		this.width=width;
		this.height=heigh;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return width*height;
	}
	public double getCircumference() {
		return width*2.0+height*2.0;
	}
}
class Circle extends Shape{
	private double PI=3.14;
	private double rad;
   public Circle(String shapeName,double r) {
	   super(shapeName);
	   rad=r;
   }
   public double getArea() {
	   return PI*rad*rad;
   }
   public double getCircumference() {
	   return 2*PI*rad;
   }
}  
class Square extends Rectangle{
	public Square(String shapeName,double a) {
		super(shapeName, a,a);
	}
	public double getArea() {
		return super.getWidth()*super.getHeight();
	}
	public double getCircumference() {
		return 4*super.getWidth();
	}
}