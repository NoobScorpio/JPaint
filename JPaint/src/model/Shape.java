package model;

import view.interfaces.PaintCanvasBase;

import java.awt.*;

public class Shape {

    final  PaintCanvasBase paintCanvas;
    final  private TwoPoint twoPoint;
    final private Color primaryColor;
    final private Color secondaryColor;
    final private ShapeType shapeType;
    final private ShapeShadingType shadingType;

    private boolean isGroup = false;

    public Shape(PaintCanvasBase paintCanvas, TwoPoint twoPoint, Color primaryColor,
                 Color secondaryColor, ShapeType shapeType, ShapeShadingType shadingType) {
        this.paintCanvas = paintCanvas;
        this.twoPoint = twoPoint;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.shapeType = shapeType;
        this.shadingType = shadingType;
    }

    public PaintCanvasBase getPaintCanvas() {
        return paintCanvas;
    }

    public TwoPoint getTwoPoint() {
        return twoPoint;
    }

    public Color getPrimaryColor() {
        return primaryColor;
    }

    public Color getSecondaryColor() {
        return secondaryColor;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public ShapeShadingType getShadingType() {
        return shadingType;
    }

    public boolean isGroup() {
        return isGroup;
    }

    public void groupSwitcher() {
        isGroup = !isGroup;
    }
}