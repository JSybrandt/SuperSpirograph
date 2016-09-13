package piece;

import geometry.ringshape.RingGeometry;

/**
 * A ring object to contain gear and rotation information.
 * Rings use ring geometry objects to define their shape. The
 */
public class Ring extends GearedObject {

    /**
     * Constructs a geared ring from the given shape. Sets the number of gears from the perimeter of the shape.
     *
     * @param shape the shape of the geared object. Determines number of gears.
     */
    public Ring(RingGeometry shape) {
        super(shape);
    }
}
