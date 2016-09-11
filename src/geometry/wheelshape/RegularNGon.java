package geometry.wheelshape;

import geometry.Geometry;

/**
 * This class defines any shape which has n sides and n angles, where each angle is of the same value.
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
