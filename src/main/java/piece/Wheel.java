package piece;

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

    /**
     * Moves the current piece one timestamp forward when simulating spirograph generation.
     * @param other is the peice being rotated around. The wheel will move around the provided piece in a manner determined
     *              by their two gear ratios.
     */
    public void rotateStep(GearedObject other){}
}
