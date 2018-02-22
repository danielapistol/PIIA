package sample;

import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.shape.Shape;

public class Line extends Items {
    private Shape shape;
    public Line(Canvas c, Point2D p){
        super(c);
        shape = new javafx.scene.shape.Line(p.getX(),p.getY(),p.getX(),p.getY());
    }


}
