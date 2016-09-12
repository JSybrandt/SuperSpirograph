package geometry.ringshape;

import geometry.Geometry;
import geometry.wheelshape.WheelGeometry;

/**
 * Common parent for all ring shapes.
 * Note: The RingGeometry object defines the outer shape, while the innershape value defines the inner track.
 */
public class RingGeometry extends Geometry{

    private static final float DEFAULT_THICKNESS = 1;

    /**
     * Constructs a RingGeometry object, making a point to also build the inner shape. In the scenegraph, the Ring
     * Gometry object is the parent of both the outer and inner ring
     * @param innerShape is the shape of the inside of the ring, should fit inside the outer shape
     * @param outerShape is the shape of the outside of the ring, should be larger than the inner shape.
     */
    public RingGeometry(WheelGeometry outerShape, WheelGeometry innerShape){
        addChildElement(outerShape);
        addChildElement(innerShape);
    }



}
