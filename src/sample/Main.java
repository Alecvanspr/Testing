package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.*;
import org.w3c.dom.Text;

import javax.swing.text.html.ImageView;
import java.awt.event.ActionEvent;
import java.security.spec.ECField;

import static javafx.scene.input.KeyCode.ENTER;

public class Main extends Application {
    public int lengter1 = 10;
    public int Getal1;
    public int Getal2;
    public TextArea texveld1 = new TextArea("0");
    public TextArea textveld2 = new TextArea("0");
    public TextArea uitkomst = new TextArea("Het antwoord is : ");

    public interface basisText{
        String Line = "Het antwoord is : ";
    }

    @Override
    public void start(Stage stage1) { //throws Exception
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Pane root = createRootPane();

        //dit is voor de naam en de activatie ervan
        Scene scene1 = new Scene(root);
        stage1.setScene(scene1);
        stage1.setTitle("bruh");
        stage1.show();

    }

    private Pane createRootPane() {
        Button keer = new Button("*");
        Button plus = new Button("+");
        Button min = new Button("-");
        Button divide = new Button("/");
        Button square = new Button("10²");
        Font ComSan = new Font("Comic Sans MS", 20);

        //TextArea's
        texveld1.setPrefRowCount(4);
        texveld1.setPrefColumnCount(9);
        textveld2.setPrefRowCount(4);
        textveld2.setPrefColumnCount(9);
        uitkomst.setPrefRowCount(4);
        uitkomst.setPrefColumnCount(10);
        uitkomst.setFont(ComSan);
        textveld2.relocate(130, 0);
        uitkomst.relocate(0, 120);

        //Buttons
        keer.setMinSize(30, 10);
        plus.setMinSize(30, 10);
        min.setMinSize(30, 10);
        divide.setMinSize(30,10);
        square.setMinSize(30,10);
        keer.relocate(0, 90);
        plus.relocate(40, 90);
        min.relocate(80, 90);
        divide.relocate(120,90);
        square.relocate(160,90);


        //these are the results
        keer.setOnAction(ActionEvent -> {
            uitkomst.setText("Het antwoord is : " + (getGetal1() * getGetal2() + ""));
        });

        min.setOnAction(ActionEvent -> {
            uitkomst.setText("Het antwoord is : " + (getGetal1() - getGetal2() + ""));
        });

        plus.setOnAction(ActionEvent -> {
            uitkomst.setText("Het antwoord is : " + (getGetal1() + getGetal2() + ""));
        });


        divide.setOnAction(ActionEvent -> {
            double berekening = ((double)getGetal1() / (double)getGetal2());
            String text = "";
            if(berekening%1==0) {
                text =String.format("Het antwoord is : %.0f",berekening, "");
            } else{
                text =String.format("Het antwoord is : %.3f",berekening, "");
            }
            uitkomst.setText(text);
        });

        square.setOnAction(ActionEvent -> {
            int berekening = 0;
            for(int i=0; i<getGetal2();i++) {
                berekening = berekening+getGetal1()*getGetal1();
            }
            uitkomst.setText("Het antwoord is : " + ( berekening+ ""));
        });

        //this is for the Pane
        Pane root = new Pane();
        root.getChildren().addAll(texveld1, textveld2, keer, plus, min,divide,square, uitkomst);

        final int PANE_WIDTH = 275;
        final int PANE_HEIGHT = 200;
        root.setMinSize(PANE_WIDTH, PANE_HEIGHT);

        return root;
    }
    public int getGetal1(){
        return Getal1 = Integer.parseInt(texveld1.getText());
    }
    public int getGetal2(){
        return Getal2 = Integer.parseInt(textveld2.getText());
    }
    public static void main(String[] args) {
        launch(args);
    }
}
