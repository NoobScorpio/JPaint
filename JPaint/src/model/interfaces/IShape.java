package model.interfaces;

import model.Shape;
import model.TwoPoint;

public interface IShape {
    void draw();

    void clear();

    void update(TwoPoint twoPoint);

    Shape getShape();
}