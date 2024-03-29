package model;

import model.interfaces.IShape;

import java.util.Stack;


public class MovementAlert {

    private Stack<IShape> observers;
    final private ShapeList shapeList;

    public MovementAlert(ShapeList shapeList) {
        this.shapeList = shapeList;
    }

    public void addObserver(TwoPoint twoPoint) {
        CollisionDetection collisionDetection = new CollisionDetection(shapeList, twoPoint);
        collisionDetection.addSelectShape();
    }

    public void addMovement(TwoPoint twoPoint) {
        shapeList.getMovementList().add(twoPoint);
        observers = shapeList.getSelectList().lastElement();
        notifyAllObservers(twoPoint);
    }

    public void undoMove() {
        if (shapeList.getMovementList().isEmpty()) {
            return;
        }
        TwoPoint twoPoint = shapeList.getMovementList().lastElement().switchPoint();
        shapeList.getUndoRedoMovementList().add(shapeList.getMovementList().pop());
        observers = shapeList.getSelectList().lastElement();
        notifyAllObservers(twoPoint);
    }

    public void redoMove() {
        if (shapeList.getUndoRedoMovementList().isEmpty()) {
            return;
        }
        TwoPoint twoPoint = shapeList.getUndoRedoMovementList().lastElement();
        shapeList.getMovementList().add(shapeList.getUndoRedoMovementList().pop());
        observers = shapeList.getSelectList().lastElement();
        notifyAllObservers(twoPoint);
    }

    private void notifyAllObservers(TwoPoint twoPoint) {
        observers.forEach(observer -> observer.update(twoPoint));
        updateCurrentObserver();
    }

    public void updateCurrentObserver() {
        shapeList.redraw();
        if (shapeList.getSelectList().isEmpty()) return;
        OutlineDecorator outline = new OutlineDecorator();

        outline.draw(shapeList.getSelectList().lastElement());
    }

}