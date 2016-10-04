
public  class circle extends Shape{
	private double radius;
	
	
	public circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String computeArea(){
		String st= null; 
		double area=0.0;
		area=3.14* radius*radius;
		st = "Circle:  "+area;
		return st;
	}
}
