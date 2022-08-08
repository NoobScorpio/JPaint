package model.interfaces;

import model.TwoPoint;

public interface IMovementObserver {
    void update(TwoPoint twoPoint);
    void clear();
    void draw();
}