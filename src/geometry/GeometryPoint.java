package geometry;

import scene.Point;

/**
 * Created by jsybran on 9/7/16.
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
