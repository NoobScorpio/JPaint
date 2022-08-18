
package model.commands;

public class UndoCommand {

    public void undo(){
        CommandHistory.undo();
    }
}
