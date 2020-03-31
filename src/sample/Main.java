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

public class Main extends Application {
    public int lengter1 = 10;
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
        TextArea texveld1 = new TextArea();
        TextArea textveld2 = new TextArea();
        TextArea uitkomst = new TextArea();
        Font ComSan = new Font("Comic Sans MS",40);

        //TextArea's
        texveld1.setPrefRowCount(4);
        texveld1.setPrefColumnCount(5);
        textveld2.setPrefRowCount(4);
        textveld2.setPrefColumnCount(5);
        uitkomst.setPrefRowCount(4);
        uitkomst.setPrefColumnCount(10);
        uitkomst.setFont(ComSan);
        textveld2.relocate(100,0);

        //Buttons
        keer.setMinSize(30,10);
        plus.setMinSize(30,10);
        min.setMinSize(30,10);
        keer.relocate(30,90);
        plus.relocate(60,90);
        min.relocate(90,90);
        uitkomst.relocate(0,120);
        keer.setOnAction(ActionEvent -> {
            int Getal1 = Integer.parseInt(texveld1.getText());
            int Getal2 = Integer.parseInt(textveld2.getText());
                    uitkomst.setText(Getal1*Getal2+"");
                });
        min.setOnAction(ActionEvent -> {
            int Getal1 = Integer.parseInt(texveld1.getText());
            int Getal2 = Integer.parseInt(textveld2.getText());
            uitkomst.setText(Getal1-Getal2+"");
        });
        plus.setOnAction(ActionEvent -> {
            int Getal1 = Integer.parseInt(texveld1.getText());
            int Getal2 = Integer.parseInt(textveld2.getText());
            uitkomst.setText((Getal1+Getal2)+"");
        });

        Pane root = new Pane();
        root.getChildren().addAll(texveld1,textveld2,keer,plus,min,uitkomst);

        final int PANE_WIDTH = 400;
        final int PANE_HEIGHT = 200;
        root.setMinSize(PANE_WIDTH,PANE_HEIGHT);

        return root;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
