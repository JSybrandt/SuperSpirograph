package geometry.wheelshape;

import geometry.GeometryPoint;

import java.util.List;

/**
 *  A diamond shaped geared wheel.
 */
public class Diamond extends WheelGeometry {

    /**
     * Creates a diamond
     * @param length the length of a side of the dimond
     * @param angle the smallest angle in the diamond. Must be between 0 and Pi
     */
    public Diamond(float length, float angle) {
        super(null);
    }
}
