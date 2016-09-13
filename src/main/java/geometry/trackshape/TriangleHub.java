package geometry.trackshape;

/**
 * Defines the geometry of a triangle hub segment of piece.track.
 * A hub is always triangular and has three female connection points at the corners to allow other track segments to attach.
 * The specific edge size of the hub is variable though, as is the radius of the curves on each side.
 */
public class TriangleHub extends TrackGeometry {
    /**
     * This constructs a hub section of piece.track. This hub has three female connections at each corner.
     * @param triangleSize is the size of the triangle.
     * @param radius is the radius of the curved sides of the triangle hub.
     */
    public TriangleHub(float triangleSize, float radius){}
    public float getTriangleSize(){return 0;}
    public float getRadius(){return 0;}
}
