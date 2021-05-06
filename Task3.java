import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage; 
package task3;


public class Task3 extends Application {
Boolean isFocusedOnC1 = false;
    Boolean isFocusedOnC2 = false;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        double width = 400;
        double height = 400;
        double radius = 15;

        Circle c1 = new Circle(40, 40, radius, Color.TRANSPARENT); //The 1st circle 
        c1.setStroke(Color.BLACK);
        Text txt1 = new Text(c1.getCenterX(), c1.getCenterY(), "1");
        
         txt1.xProperty().bind(c1.centerXProperty());
        txt1.yProperty().bind(c1.centerYProperty());

        Circle c2 = new Circle(120, 150, radius, Color.TRANSPARENT); //The 2nd Circle
        c2.setStroke(Color.BLACK);
        Text txt2 = new Text(c2.getCenterX(), c2.getCenterY(), "2");
        txt2.xProperty().bind(c2.centerXProperty());
        txt2.yProperty().bind(c2.centerYProperty());

        Text txtPoint = new Text();
        Line line = new Line();
        updateLine(line, c1, c2, txtPoint);

        c1.setOnMouseDragged(e-> { // drage of circle 1
            double x = e.getX();
            double y = e.getY();
            c1.setCenterX(x);
            c1.setCenterY(y);
            updateLine(line, c1, c2, txtPoint);

        });

        c2.setOnMouseDragged(e-> { //drage of circle 2
            double x = e.getX();
            double y = e.getY();
            c2.setCenterX(x);
            c2.setCenterY(y);
            updateLine(line, c1, c2, txtPoint);

        });

        pane.getChildren().addAll(txt1, txt2, c1, c2, line, txtPoint);
        primaryStage.setTitle(" Two movable vertices and their distances");
        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.show();
    }

    /** Connect two circles centered at (x1, y1) and (x2, y2) */
    private void updateLine(Line line, Circle c1, Circle c2, Text txtPoint) {

        double x1 = c1.getCenterX();
        double y1 = c1.getCenterY();
        double x2 = c2.getCenterX();
        double y2 = c2.getCenterY();
        double radius = c1.getRadius();

        double d = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        int x11 = (int) (x1 - radius * (x1 - x2) / d);
        int y11 = (int) (y1 - radius * (y1 - y2) / d);
        int x21 = (int) (x2 + radius * (x1 - x2) / d);
        int y21 = (int) (y2 + radius * (y1 - y2) / d);

        line.setStartX(x11);
        line.setStartY(y11);
        line.setEndX(x21);
        line.setEndY(y21);
       txtPoint.setText(String.format("%.2f", PaneCollection.distance(line))); //inhirted from pane collection class
       MyPoint p = PaneCollection.getCenterPoint(line); //inherted from point class
        txtPoint.setX(p.x);
        txtPoint.setY(p.y);
    }
    public static void main(String[] args) {
  Application.launch(args);
    }
    
}
