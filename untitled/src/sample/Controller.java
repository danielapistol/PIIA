package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.awt.event.ActionEvent;


public class Controller {
    ToggleGroup group = new ToggleGroup();

    @FXML
    private RadioButton btnSelect;
    @FXML
    private RadioButton btnEllipse;
    @FXML
    private RadioButton btnRectnagle;
    @FXML
    private RadioButton btnLine;
    @FXML
    private Button btnDelete;
    @FXML
    private Button btnClone;
    @FXML
    private ColorPicker btnColor;
    @FXML
            private SplitPane splitPane;


    public void radioSelect(ActionEvent event){

        if(btnLine.isSelected()){
            // gc.setLineWidth(5);
        }
        else
        if(btnRectnagle.isSelected()){

        }
        else if(btnEllipse.isSelected()){

        }
    }

    public void addLine(ActionEvent event){

    }

    @FXML
    private void initialize(){
        Canvas can = new Canvas(300,300);
        GraphicsContext gc = can.getGraphicsContext2D();
        //drawShapes(gc);
        btnLine.setOnMouseClicked(event -> {
            gc.setLineWidth(5);
        });

        btnEllipse.setOnMouseClicked(event -> {
            Ellipse ellipse = new Ellipse();

        });

        btnRectnagle.setOnMouseClicked(event -> {

        });



    }
}
