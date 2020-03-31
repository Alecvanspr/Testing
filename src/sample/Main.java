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

        // ff testen tochhh

    }

    private Pane createRootPane() {
        Button keer = new Button("*");
        Button plus = new Button("+");
        Button min = new Button("-");
        TextArea texveld1 = new TextArea();
        TextArea textveld2 = new TextArea();
        TextArea uitkomst = new TextArea();

        texveld1.setPrefRowCount(5);
        texveld1.setPrefColumnCount(5);
        textveld2.setPrefRowCount(5);
        textveld2.setPrefColumnCount(5);
        textveld2.relocate(130,0);
        keer.setScaleX(1);keer.setScaleY(1);
        plus.setScaleX(1);plus.setScaleY(1);
        min.setScaleX(1);min.setScaleY(1);
        keer.relocate(100,0);
        plus.relocate(100,30);
        min.relocate(100,60);
        uitkomst.relocate(300,30);

        textveld2.onInputMethodTextChangedProperty();

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
