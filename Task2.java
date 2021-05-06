import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
                                          //Please read line 47 before running the problem as i got a problem which i googled it and i cant solve :(

public class Task2 extends Application {
    @Override
    public void start(Stage myStage) {

        myStage.setTitle("Fat Percentage Calculator ");
        GridPane rootNode = new GridPane();
        rootNode.setPadding(new Insets(15));
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 300, 400);

        rootNode.add(new Label("Number of Calories:"), 0, 0);
        TextField Caloriesfromfat  = new TextField();
        rootNode.add(Caloriesfromfat , 1, 0);
      
        
        rootNode.add(new Label("Fat grams in a food :"), 0, 1);
        TextField totalcalories = new TextField();
        rootNode.add(totalcalories, 1, 1);
        
        rootNode.add(new Label("Fat Percentage :"), 0, 4);
        Button aButton = new Button("Calculate");
        rootNode.add(aButton, 1,4);
        GridPane.setHalignment(aButton, HPos.LEFT);
        TextField result = new TextField();
        result.setEditable(false);
        rootNode.add(result, 1, 5);
    
        
        

        aButton.setOnAction(e -> {  //I CANT SOLVE THIS I CANT OUTPUT THE RESULT IF THE RESULT EQUIALS 0.36 IT ONLY SHOW ME NUMBER ZERO AND I TRIED TO MAKE IT DOUBLE IT GIVES ME ERROR I TRIED ..
           Integer value1= Integer.valueOf(Caloriesfromfat.getText());
            Integer value2 = Integer.valueOf(totalcalories .getText());
         Integer Percentageofcaloriesfromfat  = value2*9/ value1*100;
                       result.setText(Percentageofcaloriesfromfat .toString());
         
         
         
             //double resultV = ( v); //give me error
           //result.setText(Percentageofcaloriesfromfat.toString()); //also

            
 
       
        });
        
        
        myStage.setScene(myScene);
        myStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}