import javafx.scene.canvas.GraphicsContext;

public class MyOval extends MyShape
{
	private MyRectangle r;
	
	public MyOval()
	{
		r = new MyRectangle(0,0,0,0,0,0,1,1.0);
	}
	public MyOval(double x, double y, double w, double h, int red, int green, int blue, double opacity)
	{
		r = new MyRectangle(x,y,w,h,red,green,blue,opacity);
	}
	public double getPerimeter()
	{
		double a = r.getH() / 2;
		double b = r.getW() / 2;
		return Math.PI * (a + b) * (1 + (3 * (Math.pow((a - b)/(a + b), 2))))/(10 + Math.pow(4 - 3 * (Math.pow((a - b)/(a + b), 2)), 0.5));
	}
	public double getArea()
	{
		return r.getArea();
	}
	public String toString()
	{
		return "x-axis is " +r.getW()+ "y-axis is " +r.getH()+ "Perimeter is " + this.getPerimeter()+ "Area is " +this.getArea();
	}
	public void draw(GraphicsContext gc)
	{
		gc.setStroke(this.getColor());
		gc.strokeOval(r.getX() - r.getW() / 2, r.getY() - r.getH() / 2, r.getW(), r.getH());
		gc.setFill(this.getColor());
		gc.fillRect(r.getX() - r.getW() / 2, r.getY() - r.getH() / 2, r.getW(), r.getH());
		gc.setFill(this.getColor().invert());
		gc.fillOval(r.getX() - r.getW() / 2, r.getY() - r.getH() / 2, r.getW(), r.getH());
	}
	public MyRectangle getMyBoundingBox()
	{
		return r;
	}

	@Override
	public double getMyArea() {
		return getArea();
	}
	public MyRectangle getMyBoundingRectangle(){
		return new MyRectangle(this.getX(), this.getY(), r.getW(), r.getH(), 0, 0, 1, 1);
	}
}

