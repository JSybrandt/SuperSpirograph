package geometry.wheelshape;

import geometry.Geometry;
import geometry.GeometryPoint;

import java.util.List;

/**
 * This class defines common behavior for wheel shapes.
 */
abstract class WheelGeometry extends Geometry {
    /**
     * Handles the location of penPoints on a wheel's shape. Transformations on the wheel's scale and roation in
     * the scene graph will also adjust the location of these pen points.
     * @param penPoints list of location within the shape where a pen can be placed
     */
    public WheelGeometry(List<GeometryPoint> penPoints){}
    protected List<GeometryPoint> penPoints;
    public float getRadius(){return 0;}
    public List<GeometryPoint> getPenPoints() {return penPoints;}


}
