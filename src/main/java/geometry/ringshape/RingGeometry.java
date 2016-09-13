package geometry.ringshape;

import geometry.Geometry;
import geometry.wheelshape.WheelGeometry;

/**
 * Common parent for all ring shapes.
 * Note: The RingGeometry object defines the outer shape, while the innershape value defines the inner track.
 * Different types of rings can be specified by using different geometry.wheelshape.WheelGeometry objects.
 * For example, a round ring can be build with two wheelshape.Circle objects, while a rounded square or triangle can be
 * constructed with two wheelshape.RegularNGon objects.
 *
 * This class will also use Geometry.isHollow to specify that the inner shape should have gears on the inside of the
 * shape. both shapes are added to the RingGeometry SceneObject hierarchy. This means that the RingGeometry object
 * mostly just acts as a convenience layer to allow spirograph designers to position both inner and outer circles simultaneously.
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
