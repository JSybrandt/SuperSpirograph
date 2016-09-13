package geometry.wheelshape;

import geometry.Geometry;
import geometry.GeometryPoint;

import java.util.List;

/**
 * This class defines common behavior for wheel shapes.
 * All of the specific wheel shapes have been given their own Geometry class. This is to allow each shape to have its own logic
 * for dedtermining perimeter and area as well as determine the number and placement of their penPoints, represented as
 * a collection of GeometryPoints. These pen points are all automatically added by children classes and determined by
 * the size of each shape.
 */
public abstract class WheelGeometry extends Geometry {
    /**
     * Handles the location of penPoints on a wheel's shape. Transformations on the wheel's scale and rotation in
     * the scene graph will also adjust the location of these pen points.
     * @param penPoints list of location within the shape where a pen can be placed. These points are added automatically
     *                  by each child class of Wheel Geometry.
     */
    public WheelGeometry(List<GeometryPoint> penPoints){}
    protected List<GeometryPoint> penPoints;
    public float getRadius(){return 0;}
    public List<GeometryPoint> getPenPoints() {return penPoints;}


}
