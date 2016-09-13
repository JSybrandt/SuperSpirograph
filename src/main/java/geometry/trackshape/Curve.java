package geometry.trackshape;

/**
 * A curved section of piece.track is described by this class.
 * The curve can be of any radius or length (assuming that the curve does not overlap itself)
 * and a male and female connection point is automatically placed at each end.
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
