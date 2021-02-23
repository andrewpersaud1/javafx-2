
import javafx.scene.paint.Color;

public enum MyColor 
{
	color1(200, 20, 10, 1.0), color2(127, 0, 191, 1.0),
	color3(0,197,163,1.0), color4(80,70,50,1.0),
	color5(200,240,30,1.0), color6(172,80,70,1.0);
	private Color c;
	MyColor()
	{
		c = Color.rgb(0,0,1,1.0);
	}
	MyColor(int red, int green, int blue, double opacity)
	{
		c = Color.rgb(red,green,blue,opacity);
	}
	Color getColor()
	{
		return c;
	}
	void setColor(int red, int green, int blue, double opacity)
	{
		c = Color.rgb(red,green,blue,opacity);
	}
	
}
