package model.commands;

import model.MovementAlert;
import model.ShapeList;
import model.interfaces.ICommand;

public class PasteCommand implements ICommand {

    ShapeList shapeList;
    PasteShape pasteShape;
    MovementAlert movementAlert;
    public PasteCommand(ShapeList shapeList) {
        this.shapeList = shapeList;
    }

    public void run() {
        pasteShape = new PasteShape(shapeList);
        pasteShape.execute();
        movementAlert = new MovementAlert();
        movementAlert.updateCurrentObserver(shapeList);
        CommandHistory.add(this);
    }
    @Override
    public void undo() {
        pasteShape.undoPaste();
        shapeList.getShapeList().forEach(shape -> shape.draw());
        movementAlert.updateCurrentObserver(shapeList);
    }

    @Override
    public void redo() {
        pasteShape.redoPaste();
        shapeList.getShapeList().forEach(shape -> shape.draw());
        movementAlert.updateCurrentObserver(shapeList);
    }
}