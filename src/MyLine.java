import javafx.scene.canvas.GraphicsContext;

public class MyLine extends MyShape 
{
	private double x1;
	private double x2;
	private double y1;
	private double y2;
	
	public MyLine()
	{
		super (0,0,0,0,1,1.0);
		x2 = 0;
		y2 = 0;
	}
	public MyLine (double x,double y,double x1,double y1,double x2,double y2,int red,int green,int blue,double opacity)
	{
		super(x,y,red,green,blue,opacity);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public double getX1()
	{
		return x1;
	}
	public double getY1()
	{
		return y1;
	}
	public double getX2()
	{
		return x2;
	}
	public double getY2()
	{
		return y2;
	}
	public void setX1(double x1)
	{
		this.x1 = x1;
	}
	public void setY1(double y1)
	{
		this.y1 = y1;
	}
	public void setX2(double x2)
	{
		this.x2 = x2;
	}
	public void setY2(double y2)
	{
		this.y2 = y2;
	}
	public String getLength()
	{
		double L = Math.sqrt(Math.pow(x2-this.getX(),2)+Math.pow(y2-this.getY(),2));
		String length = Double.toString(L);
		return length;
	}
	public String get_xAngle()
	{
		double A = Math.toDegrees(Math.atan(y2-this.getY())/(x2-this.getX()));
		String angle = Double.toString(A);
		return angle;
	}
	public String toString()
	{
		return "Length is " +getLength()+ "Angle with x-axis is " +get_xAngle()+ "degrees";
	}
	public void draw(GraphicsContext gc)
	{
		gc.setStroke(this.getColor());
		gc.strokeLine(this.getX(),this.getY(),x2,y2);
	}
	public MyRectangle getMyBoundingBox()
{
	MyRectangle r = new MyRectangle(this.getX(),this.getY(),Math.abs(x2-x1),Math.abs(y2-y1),0,0,1,1.0);
	r.setColor(this.getColor());
	return r; 
}
	@Override
	public double getMyArea() {
		return 0;
	}

	public MyRectangle getMyBoundingRectangle(){
		return new MyRectangle(x1, y1, y2 - y1, x2 - x1, 0, 0, 255, 1);
	}
	
}
