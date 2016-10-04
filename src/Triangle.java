//test
public class Triangle extends Shape {

	private double base;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	private double heigth;
	


	public Triangle(double base, double heigth) {
		super();
		this.base = base;
		this.heigth = heigth;
	}
	
	public String computeArea(){
		String st= null; 
		double area=0.0;
		area=heigth*base;
		st = "triangle: "+area;
		//return st;                  funkar oxå
		return ("triangle: "+area);
	}
	
	}
