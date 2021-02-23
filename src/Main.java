import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Main extends Application {
	double xdim = 1300;
	double ydim = 900;
	public void start(Stage Stage) {
			BorderPane bP = new BorderPane();
			Canvas c = new Canvas(xdim, ydim);
		
			GraphicsContext gc = c.getGraphicsContext2D();
			draw(gc);
			bP.setCenter(c);
			
			Scene sc = new Scene(bP);
			Stage.setTitle("Exercise 2");
			Stage.setScene(sc);
			Stage.show();
		}
	public static void main(String[] args) {
		launch(args);
	}
	private void draw(GraphicsContext gc) 
	{
		Canvas c = gc.getCanvas();

		double scale = Math.min(xdim, ydim);

		MyOval oval1 = new MyOval(xdim / 2, ydim / 2, scale / 1.25, scale / 1.8, 0, 0, 0, 0);
		oval1.setColor(MyColor.color2.getColor());
		oval1.draw(gc);

		MyOval oval2 = new MyOval(xdim / 2, ydim / 2, scale / 1.75, scale / 2.55, 0, 0, 0, 0);
		oval2.setColor(MyColor.color4.getColor());
		oval2.draw(gc);

		MyOval oval3 = new MyOval(xdim / 2, ydim / 2, scale / 2.5, scale / 3.65, 0, 0, 0, 0);
		oval3.setColor(MyColor.color6.getColor());
		oval3.draw(gc);

		MyLine line1 = new MyLine(0, 0, 0, 0, xdim, ydim, 0, 0, 1, 1.0);
		line1.draw(gc);

	}
}
		
	
