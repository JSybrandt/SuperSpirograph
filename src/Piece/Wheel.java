package Piece;

import geometry.Geometry;
import geometry.wheelshape.WheelGeometry;

/**
 * Creates a geared wheel which can rotate along other geared objects
 */
public class Wheel extends GearedObject {
    /**
     * Constructs a geared object from the given shape. Sets the number of gears from the perimeter of the shape.
     *
     * @param shape the shape of the geared object. Determines number of gears.
     */
    public Wheel(WheelGeometry shape) {
        super(shape);
    }
}
