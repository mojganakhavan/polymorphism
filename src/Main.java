/*test */
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double h=2.0;
		double b=3.0;
		double r=4.0;
		
		Triangle triangle = new Triangle(h,b);
		circle cr = new circle(r);
		System.out.println("triangle: "+triangle.computeArea());
		System.out.println("Circle: "+cr.computeArea());
		
		
	}

}
