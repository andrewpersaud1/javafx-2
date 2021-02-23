import javafx.scene.canvas.GraphicsContext;

public class MyPolygon extends MyShape
{
	private int N;
	private double side;
	private double radius;
	private double[] xPoints;
	private double[] yPoints;
	public MyPolygon()
	{
		super(0,0,0,0,1,1.0);
		N = 0;
		radius = 1;
		side = 0;
	}
	public MyPolygon(double x,double y,int N,double side,double radius,int red,int green,int blue,double opacity)
	{
		super(x,y,red,green,blue,opacity);
		this.N = N;
		this.radius = radius;
		this.side = side;
	}
	public MyPolygon(double x,double y,int N,double side,double radius)
	{
		super(x,y,0,0,1,1.0);
		this.N = N;
		this.radius = radius;
		this.side = side;
	}
	public void setPoints(double[] xPoints,double[] yPoints)
	{
		this.xPoints = xPoints;
		this.yPoints = yPoints;
	}
	public double findRadius()
	{
		this.radius = Math.abs(side/(2*Math.sin(180/N)));
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double findSide()
	{
		this.side = Math.abs(2*Math.sin(180/N)*radius);
		return side;
	}
	public void setSide(double side)
	{
		this.side = side;
	}
	public void setN(int N)
	{
		this.N = N;
	}
	
	public double[] getXPoints()
	{
		return xPoints;
	}
	public double[] getYPoints()
	{
		return yPoints;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getSide()
	{
		return side;
	}
	public double getN()
	{
		return N;
	}
	public double getPerimeter()
	{
		return side*N;
	}
	public double getArea()
	{
		return ((side*side*N)/(4*Math.tan(180/N)));
	}
	public double getAngle()
	{
		double angle = (N-2)*180;
		return angle;
	}
	public String toString()
	{
		return "Side is " +side+ "Angle is " +this.getAngle()+ "Perimeter is " +this.getPerimeter()+ "Area is " +this.getArea();
	}
	public void draw(GraphicsContext gc)
	{
		gc.setStroke(this.getColor());
		gc.strokePolygon(xPoints, yPoints, N);
		gc.setFill(this.getColor());
		gc.fillPolygon(xPoints, yPoints, N);
	}	
	public MyRectangle getMyBoundingRectangle()
	{
		MyRectangle r = new MyRectangle(this.getX(),this.getY(),radius*2,radius*2,0,0,1,1.0);
		r.setColor(this.getColor());
		return r;
	}

	@Override
	public double getMyArea() {
		return 0;
	}
}
