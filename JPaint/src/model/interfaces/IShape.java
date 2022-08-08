package model.interfaces;

import model.Shape;
import model.TwoPoint;

import java.awt.*;

public interface IShape {
    void draw();

    void clear();

    void update(TwoPoint twoPoint);

    void repaint(Graphics g);

    Shape getShape();
}