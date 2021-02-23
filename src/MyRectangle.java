import javafx.scene.canvas.GraphicsContext;

public class MyRectangle extends MyShape
{
	private double w;
	private double h;
	private double Perimeter;
	private double Area;
	
	public MyRectangle()
	{
		super(0,0,0,0,1,1.0);
		w=0;
		h=0;
	}
	public MyRectangle(double x, double y, double w, double h, int red, int green, int blue, double opacity)
	{
		super(x,y,red,green,blue,opacity);
		this.w = w;
		this.h = h;
	}
	public double getW()
	{
		return w;
	}
	public double getH()
	{
		return h;
	}
	public void setW(double w)
	{
		this.w = w;
	}
	public void SetH(double h)
	{
		this.h = h;
	}
	public double getPerimeter()
	{
		return ((2*h)+(2*w));
	}
	public double getArea()
	{
		return h * w;
	}
	public String toString()
	{
		return "Width is " +w+ "Height is " +h+ "Perimeter is " +this.getPerimeter()+ "Area is" +this.getArea();
	}
	public void draw (GraphicsContext gc)
	{
		gc.setStroke(this.getColor());
		gc.strokeRect(this.getX(), this.getY(), w, h);
		gc.setFill(this.getColor());
		gc.fillRect(this.getX(), this.getY(), w, h);
	}
	public MyRectangle getMyBoundingRectangle()
	{
		return this;
	}

	@Override
	public double getMyArea() {
		return 0;
	}
}
