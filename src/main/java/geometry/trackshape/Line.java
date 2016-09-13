package geometry.trackshape;

/**
 * Defines the shape of a straight segment of piece.track.
 * A line can be of any length and is of predetermined thickness.
 * A line automatically has one male/female connection point placed at the ends.
 */
public class Line extends TrackGeometry{
    /**
     * Constructs geometry for a new straight piece.track segment. Each RackGeometry has a male end and female end.
     * @param length the length of the piece.track
     */
    public Line(float length){}
    public float getLength(){return 0;}
}
