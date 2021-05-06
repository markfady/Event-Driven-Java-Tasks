import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
//The Program allows the user to get free currency convertor onyly  typing the amount wanted to be converted and the current currently rate for each currency 
public class Task1 extends Application {
    @Override
    public void start(Stage myStage) {

        myStage.setTitle("Convertor");
        GridPane rootNode = new GridPane();
        rootNode.setPadding(new Insets(15));
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 500, 400);

        rootNode.add(new Label("Egyptian Pound:"), 0, 0);
        TextField firstValue = new TextField();
        rootNode.add(firstValue, 1, 0);
        rootNode.add(new Label("US Dollar today's value :"), 0, 1);
        TextField secondValue = new TextField();
        rootNode.add(secondValue, 1, 1);
        rootNode.add(new Label("Euros today's value:"), 0, 2);
        TextField Thirdvalue = new TextField();
        rootNode.add(Thirdvalue, 1, 2);
        
        rootNode.add(new Label("Riyal today's value:"), 0, 3);
        TextField FourthValue = new TextField();
        rootNode.add(FourthValue, 1, 3);
        
        
        rootNode.add(new Label("The 3 outputs are :"), 0, 4);
        Button aButton = new Button("Calculate Egyptian pound and Dollar today's  value");
        rootNode.add(aButton, 1,4);
        GridPane.setHalignment(aButton, HPos.LEFT);
        TextField result = new TextField();
        result.setEditable(false);
        rootNode.add(result, 1, 5); //Result field of Egyptian pound * Dollar
        
         Button aButton1 = new Button("Calculate Egyptian pound and euros today's  value");
        rootNode.add(aButton1, 1,6);
        GridPane.setHalignment(aButton1, HPos.LEFT);
      TextField result1 = new TextField();
       result.setEditable(false);
       rootNode.add(result1, 1, 7); //Result field of Egyptian pound * Euros
       
        Button aButton2 = new Button("Calculate Egyptian pound and Ryal today's  value"); //Making of button2
        rootNode.add(aButton2, 1,8);
        GridPane.setHalignment(aButton2, HPos.LEFT);
      TextField result2 = new TextField(); //Result field of Egyptian pound * Ryal
      result.setEditable(false);
     rootNode.add(result2, 1, 9);
 

        aButton.setOnAction(e -> {  //button 1 which calculate amout of egyptian pound* with Dollar todays amout
            Integer value1 = Integer.valueOf(firstValue.getText());
            Integer value2 = Integer.valueOf(secondValue.getText());
            Integer r = value1 * value2;
            //Integer x = value1 * value4;
            result.setText(r.toString());
           // result.setText(x.toString());
           
        });
        
        aButton1.setOnAction(e -> { //button 2 which calculate amout of egyptian pound* with Euros todays amout
   Integer value1 = Integer.valueOf(firstValue.getText());
   Integer value3 = Integer.valueOf(Thirdvalue.getText());
     Integer z = value1 * value3;
       result1.setText(z.toString());
        });
         
          aButton2.setOnAction(e -> { //button 2 which calculate amout of egyptian pound* with Ryal todays amout
   Integer value1 = Integer.valueOf(firstValue.getText());
   Integer value4 = Integer.valueOf(FourthValue.getText());
     Integer x= value1 * value4;
       result2.setText(x.toString());
        });
        
        
        
        myStage.setScene(myScene);
        myStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}