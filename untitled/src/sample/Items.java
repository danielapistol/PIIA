package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class Items {

    private Canvas canvass;
    private boolean selected;
    private Shape shape;

    public Items(Canvas c){
        canvass = c;
        shape = null;
        selected = false;
    }

    public void select(){
        selected = true;
    }


}
