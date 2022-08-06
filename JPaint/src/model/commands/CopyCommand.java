package model.commands;

public class CopyCommand implements ICommand {

    ShapeList shapeList;
    Stack<IShape> myClipboard;

    public CopyCommand(ShapeList shapeList) {
        this.shapeList = shapeList;
    }

    public void run() {
        if (shapeList.getSelectList().isEmpty()) {
            return;
        }
        myClipboard = shapeList.getClipboard();
        for (IShape shape : shapeList.getSelectList().lastElement()) {
            myClipboard.add(shape);
        }
        CommandHistory.add(this);
    }

    @Override
    public void undo() {
        myClipboard.clear();
    }

    @Override
    public void redo() {
        for (IShape shape : shapeList.getSelectList().lastElement()) {
            myClipboard.add(shape);
        }
    }
}