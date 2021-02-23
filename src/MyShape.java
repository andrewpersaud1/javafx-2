import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class MyShape implements MyShapeInterface
{
	private double x,y;
	private Color c;
	protected double[] points;

	public MyShape()
	{
		x = 0; y = 0;
		c = new Color(0,0,1,1.0);
				
	}
	public MyShape(double x,double y,int red,int green,int blue,double opacity)
	{
		this.x = x;
		this.y = y;
		c = Color.rgb(red,green,blue,opacity);
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public Color getColor()
	{
		return c;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public void setY(double y)
	{
		this.y = y;
	}
	public void setColor(int red,int green,int blue,double opacity)
	{
		c = Color.rgb(red, green, blue, opacity);
	}
	public void setColor(Color c)
	{
		this.c = c;
	}
	public String toString()
	{
		return "x value is " +x+ "y value is " +y;
	}
	public void draw(GraphicsContext gc)
	{
		gc.setStroke(this.getColor());
		gc.stroke();
	}
	@Override
	public double[] getPoints() 
	{
		double[] points = new double[] {this.x, this.y};
		return points;
	}
	@Override
	public void setPoints(double[] points) 
	{
		this.points = points;
	}
	@Override
	public void moveTo(double x, double y) 
	{
		this.x = this.x + x;
		this.y = this.y + y;
	}
	@Override
	public double distanceTo(double x, double y) 
	{
		return Math.sqrt(Math.pow(x-this.getX(), 2)+Math.pow(y-this.getY(), 2));
	}
	@Override
	public MyRectangle getMyBoundingBox() 
	{
		MyRectangle r = this.getMyBoundingBox();
		return r;
	}
	@Override
	public boolean doOverlap(MyShape shape) 
	{
		boolean Overlapping = true;
		MyRectangle r1 = this.getMyBoundingBox();
		MyRectangle r2 = shape.getMyBoundingBox();
		if(((r2.getX()+r2.getH())>(r1.getX()+r2.getW()))||((r1.getX()+r1.getH())>(r2.getX()+r2.getW()))||
				((r2.getY()+r2.getH()>(r1.getY()+r1.getW()))||((r1.getY()+r1.getH()>(r2.getY()+r2.getW())))))
		{
			return Overlapping = false;
		}
		else 
		return Overlapping;
	}


}













