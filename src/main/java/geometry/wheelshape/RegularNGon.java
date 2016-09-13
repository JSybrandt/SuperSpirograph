package geometry.wheelshape;

import geometry.Geometry;

/**
 * This class defines any shape which has n sides and n angles, where each angle is of the same value.
 * This class is a very heavy lifter in the wheelshape family as any square, triangle, hexagon or other component can be
 * specified with this geometry class. These shapes are used by both the RingGeometry class as well as the piece.wheel class
 */
public class RegularNGon extends WheelGeometry {

    /**
     * Constructs a N-gon
     * @param sideLength the length of an individual side of the shape. Must be positive
     * @param numSides the number of sides of the shape. Must be greater than 2.
     */
    public RegularNGon(float sideLength, int numSides){
        super(null);
    }
}
