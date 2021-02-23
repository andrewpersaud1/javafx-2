import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public interface MyShapeInterface {
    double getX();
    double getY();
    Color getColor();
    void setX(double x);
    void setY(double y);
    void setColor(int red,int green,int blue,double opacity);
    void setColor(Color c);
    String toString();
    void draw(GraphicsContext gc);
    double[] getPoints();
    void setPoints(double[] points);
    void moveTo(double x, double y);
    double distanceTo(double x, double y);
    MyRectangle getMyBoundingBox();
    boolean doOverlap(MyShape shape);
    MyRectangle getMyBoundingRectangle();
    double getMyArea();
}




