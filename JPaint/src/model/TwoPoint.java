package model;


public class TwoPoint {
    private final Point startPoint;
    private final Point endPoint;

    public TwoPoint(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public Point getMinXY() {
        int mouseStartX = Math.min(this.startPoint.getX(), this.endPoint.getX());
        int mouseStartY = Math.min(this.startPoint.getY(), this.endPoint.getY());

        return new Point(mouseStartX, mouseStartY);
    }

    public Point getMaxXY() {
        int mouseEndX = Math.max(this.startPoint.getX(), this.endPoint.getX());
        int mouseEndY = Math.max(this.startPoint.getY(), this.endPoint.getY());

        return new Point(mouseEndX, mouseEndY);
    }
    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public int getLeftCornerX() {
        return Math.min(startPoint.getX(), endPoint.getX());
    }

    public int getLeftCornerY() {
        return Math.min(startPoint.getY(), endPoint.getY());
    }

    public int getWidth() {
        return Math.abs(startPoint.getX() - endPoint.getX());
    }

    public int getHeight() {
        return Math.abs(startPoint.getY() - endPoint.getY());
    }

    public TwoPoint switchPoint() {
        return new TwoPoint(endPoint, startPoint);
    }
}