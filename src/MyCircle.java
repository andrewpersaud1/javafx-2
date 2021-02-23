import javafx.scene.canvas.GraphicsContext;

public class MyCircle extends MyOval
{
	private double radius;
	public MyCircle()
	{
		super();
		radius = 1;
	}
	public MyCircle(double x,double y,double w, double h, double r, int red,int green,int blue,double opacity)
	{
		super(x,y,w,h,red,green,blue,opacity);
		radius = r;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double getPerimeter()
	{
		return (2*Math.PI*radius);
	}
	public double getArea()
	{
		return(Math.PI*Math.pow(radius,2));
	}
	public String toString()
	{
		return "Radius is " +radius+ "Perimeter is " +this.getPerimeter()+ "Area is " +this.getArea();
	}
	public void draw(GraphicsContext gc)
	{
		gc.setStroke(this.getColor());
		gc.strokeOval(this.getX(),this.getY(),radius*2,radius*2);
		gc.setFill(this.getColor());
		gc.fillOval(this.getX(),this.getY(),radius*2,radius*2);
	}

	@Override
	public double getMyArea() {
		return getArea();
	}

	public MyRectangle getMyBoundingRectangle(){
		return new MyRectangle(this.getX(), this.getY(), radius * 2, radius * 2, 0, 0, 1, 1);
	}
}
