public class Program {
    public static final VerticalParabola verticaParabola = new VerticalParabola(5,1,-1);

    public static final Line line = new Line(0,3,0);

    public static final Circle circle = new Circle(-6,4,2);

    public static SimpleColor getColor(double x, double y){
        if (line.isPointAboveLine(x,y)&&(!circle.IsPointInCircle(x,y))){
            return SimpleColor.YELLOW;
        }
        else if (line.isPointAboveLine(x,y)&& circle.IsPointInCircle(x,y)){
            return SimpleColor.WHITE;
        }
        else if (!line.isPointAboveLine(x,y)&& circle.IsPointInCircle(x,y)){
            return SimpleColor.ORANGE;
        }
        else if (!line.isPointAboveLine(x,y)&& !circle.IsPointInCircle(x,y)
                && verticaParabola.IsPointAboveParabolaY(x,y)){
            return SimpleColor.WHITE;
        }
        else if (!line.isPointAboveLine(x,y)&& !circle.IsPointInCircle(x,y)
                && !verticaParabola.IsPointAboveParabolaY(x,y)){
            return SimpleColor.GREEN;
        }
        return SimpleColor.BLACK;

    }

}
