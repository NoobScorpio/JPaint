package model;

import model.interfaces.IShape;

import java.util.Stack;

public class OutlineDecorator {

    protected OutlineDrawer outlineDrawer;

    public void draw(Stack<IShape> groupList) {
        outlineDrawer = new OutlineDrawer();
        outlineDrawer.draw(groupList);
    }

}