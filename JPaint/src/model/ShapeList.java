package model;

import model.interfaces.IShape;

import java.util.Stack;

public class ShapeList {

    final private Stack<IShape> shapeList = new Stack<>();
    final private Stack<IShape> undoRedoShapeList = new Stack<>();
    final private Stack<Stack<IShape>> selectList = new Stack<>();
    final private Stack<Stack<IShape>> undoRedoSelectList = new Stack<>();
    final private Stack<TwoPoint> movementList = new Stack<>();
    final private Stack<TwoPoint> undoRedoMovementList = new Stack<>();
    final private Stack<IShape> clipboard = new Stack<>();
    final private Stack<Integer> pasteList = new Stack<>();
    final private Stack<Stack<IShape>> undoRedoPasteItem = new Stack<>();
    final private Stack<Stack<IShape>> undoRedoDeleteList = new Stack<>();
    final private Stack<Stack<IShape>> groupList = new Stack<>();
    final private Stack<Stack<IShape>> undoRedoGroupList = new Stack<>();

    public void addShape(IShape iShape) {
        shapeList.add(iShape);
        iShape.draw();
    }

    public void redraw() {
        shapeList.lastElement().clear();
        for (IShape shape : shapeList) {
            shape.draw();
        }
    }

    public Stack<IShape> getShapeList() {
        return shapeList;
    }

    public Stack<IShape> getUndoRedoShapeList() {
        return undoRedoShapeList;
    }

    public Stack<Stack<IShape>> getSelectList() {
        return selectList;
    }

    public Stack<Stack<IShape>> getUndoRedoSelectList() {
        return undoRedoSelectList;
    }

    public Stack<TwoPoint> getMovementList() {
        return movementList;
    }

    public Stack<TwoPoint> getUndoRedoMovementList() {
        return undoRedoMovementList;
    }

    public Stack<IShape> getClipboard() {
        return clipboard;
    }

    public Stack<Integer> getPasteList() {
        return pasteList;
    }

    public Stack<Stack<IShape>> getUndoRedoPasteItem() {
        return undoRedoPasteItem;
    }

    public Stack<Stack<IShape>> getUndoRedoDeleteList() {
        return undoRedoDeleteList;
    }

    public Stack<Stack<IShape>> getGroupList() {
        return groupList;
    }

    public Stack<Stack<IShape>> getUndoRedoGroupList() {
        return undoRedoGroupList;
    }
}