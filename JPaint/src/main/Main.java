package main;

import controller.IJPaintController;
import controller.JPaintController;
import controller.MouseListener;
import model.ShapeColor;
import model.ShapeList;
import model.ShapeType;
import model.persistence.ApplicationState;
import view.gui.Gui;
import view.gui.GuiWindow;
import view.gui.PaintCanvas;
import view.interfaces.IGuiWindow;
import view.interfaces.PaintCanvasBase;
import view.interfaces.IUiModule;

public class Main {
    public static void main(String[] args){
        PaintCanvasBase paintCanvas = new PaintCanvas();
        IGuiWindow guiWindow = new GuiWindow(paintCanvas);
        IUiModule uiModule = new Gui(guiWindow);
        ApplicationState appState = new ApplicationState(uiModule);
        ShapeList shapeList = new ShapeList();
        IJPaintController controller = new JPaintController(uiModule, appState,shapeList);

        MouseListener mouseListener=new MouseListener(paintCanvas,appState,shapeList);
        paintCanvas.addMouseListener(mouseListener);
        controller.setup();
    }
}
