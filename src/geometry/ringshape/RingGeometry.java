package geometry.ringshape;

import geometry.Geometry;

/**
 * Common parent for all ring shapes.
 * Note: The RingGeometry object defines the outer shape, while the innershape value defines the inner track.
 */
abstract class RingGeometry extends Geometry{
    protected Geometry innerShape;

    private static final float THICKNESS = 1;

    /**
     * Constructs a RingGeometry object, making a point to also build the inner shape
     */
    public RingGeometry(){
        addChildElement(innerShape);
        innerShape.scale((getRadius() - THICKNESS) / getRadius());
    }



}
