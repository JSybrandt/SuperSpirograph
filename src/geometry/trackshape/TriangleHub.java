package geometry.trackshape;

/**
 * Defines the geometry of a triangle hub segment of Piece.track.
 */
public class TriangleHub extends TrackGeometry {
    /**
     * This constructs a hub section of Piece.track. This hub has three female connections at each corner.
     * @param triangleSize is the size of the triangle.
     * @param radius is the radius of the curved sides of the triangle hub.
     */
    public TriangleHub(float triangleSize, float radius){}
    public float getTriangleSize(){return 0;}
    public float getRadius(){return 0;}
}
