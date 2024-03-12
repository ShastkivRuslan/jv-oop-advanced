package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private double figureTopSide;
    private double figureBottomSide;
    private double figureHeight;

    @Override
    public double getArea() {
        return ((figureBottomSide + figureTopSide) / 2) * figureHeight;
    }

    @Override
    public void draw() {
        System.out.format("Figure: IsoscelesTrapezoid, area: %.1f sq. units,"
                        + "bottom side: %.1f sq. units, top side: %.1f sq. units,"
                        + "height: %.1f sq. units, color: %s \n",
                getArea(),figureBottomSide,figureTopSide, figureHeight, getColor());
    }

    public void setFigureTopSide(double figureTopSide) {
        this.figureTopSide = figureTopSide;
    }

    public void setFigureBottomSide(double figureBottomSide) {
        this.figureBottomSide = figureBottomSide;
    }

    public void setFigureHeight(double figureHeight) {
        this.figureHeight = figureHeight;
    }
}
