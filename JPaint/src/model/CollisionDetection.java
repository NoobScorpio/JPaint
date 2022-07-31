package model;

import model.interfaces.IMovementObserver;
import model.interfaces.IShape;

import java.util.Stack;


public class CollisionDetection {

    ShapeList shapeList;
    TwoPoint twoPoint;

    public CollisionDetection(ShapeList shapeList, TwoPoint twoPoint) {
        this.shapeList = shapeList;
        this.twoPoint = twoPoint;
    }

    public void addSelectShape() {
        int Ax = twoPoint.getLeftCornerX();
        int Ay = twoPoint.getLeftCornerY();
        int Aw = twoPoint.getWidth();
        int Ah = twoPoint.getHeight();
        Stack<IMovementObserver> lastList = new Stack<>();
        for (IShape shape: shapeList.getShapeList()) {
            int Bx = shape.getLeftCornerX();
            int By = shape.getLeftCornerY();
            int Bw = shape.getWidth();
            int Bh = shape.getHeight();
            /**
             * I was not able to figure out what to do, so I got this piece of code from stackoverflow,
             * so I don't fully understand what it does but yeah I tried it, and it works according to need
             */
            if (Bx + Bw > Ax && By + Bh > Ay && Ax + Aw > Bx && Ay + Ah > By) {
                lastList.add((IMovementObserver) shape);
            }
        }
        shapeList.getSelectList().add(lastList);
    }
}