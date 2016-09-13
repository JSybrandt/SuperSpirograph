package geometry.rackshape;

import geometry.Geometry;

/**
 * Defines the shape of a straight rack.
 * A rack is of a fixed width and a variable length.
 * These are used with piece.Rack to determine the spacial properties of a piece.Rack object on a scene.Canvas.
 */
public class RackGeometry extends Geometry{
    /**
     * Constructs geometry for a new straight rack
     * @param length the length of the rack
     */
    public RackGeometry(float length){}
    public float getLength(){return 0;}
}
