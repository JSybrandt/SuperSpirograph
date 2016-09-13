package geometry;

import scene.Point;

/**
 * A GeometryPoint facilitates many interaction points in a spirograph. For example, the location a pen might be placed
 * on a wheel, or the location two segments of track are connected can both be represented by GeometryPoints.
 * Because the GeometryPoint inherits from SceneElement, they can be added to the overall scene graph by their encapsulating
 * geometry classes. This allows them to scale, translate, and rotate along with their parent shape.
 * This behavior facilitates spirograph generation.
 */
public class GeometryPoint extends Point {
    /**
     * Relative location of point on greater geometry. 0,0 is the center of the piece.
     * @param x is the horizontal coordinate relative to the center.
     * @param y is the vertical coordinate relative to the center.
     */
    public GeometryPoint(float x, float y){
        super(x,y);
    }

    /**
     * Relative location of point on greater geometry. 0,0 is the center.
     * @param angle is the angular component of the polar coordinate
     * @param magnitude is the value component of the polar coordinate
     * @param isPolar is a flag parameter, must be supplied to distinguish between the two default params
     */
    public GeometryPoint(float angle, float magnitude, boolean isPolar){
        super(0,0);
    }

}
