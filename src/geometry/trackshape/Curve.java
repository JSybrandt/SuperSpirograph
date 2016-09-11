package geometry.trackshape;

/**
 * A curved section of Piece.track is described by this class.
 */
public class Curve extends TrackGeometry {
    /**
     * Defines a curve with a specific radius and length. A male end is placed at one side,
     * and a female end is placed on the other.
     * @param radius is how tight the curve is. Must be positive.
     * @param length is how long the curve is. Must greater than zero and less than 2*Pi*radius
     */
    public Curve(float radius, float length){}
    public float getRadius(){return 0;}
    public float getLength(){return 0;}
}
