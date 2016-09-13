package scene;

import java.awt.*;

/**
 * The pen defines the color and thickness of the line which will draw the scene. Used with wheels and penpoints on a
 * canvas to generate spirographs of different colors and line shapes.
 */
public class Pen {

    /**
     * Constructs a pen of the given color, thickness, and tip shape.
     * @param color is a java.awt color representation
     * @param thickness is the width of the pen brush in
     * @param tip is the shape of the pen brush
     */
    public Pen(Color color, float thickness, PenTip tip){
    }

    /**
     * Draws a single mark from the pen at the specified point. The shape and size of this mark is determined by Pen.tip
     * and Pen.thickness. This method calls Canvas.setPixel multiple times to draw.
     * @param point the location relative to the center of the canvas to draw a point.
     * @param canvas the canvas object which will be drawn on.
     */
    public void draw(Point point, Canvas canvas){}
}
