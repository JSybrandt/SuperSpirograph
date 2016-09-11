package Piece.track;

import Piece.Spiralable;
import pen.Pen;
import scene.Spiral;
import Piece.Wheel;

/**
 * This class managed a specific sequence of Piece.track segments.
 * Tracks are added male end first.
 * The Track Layout object can also generate spirals.
 */
public class TrackLayout implements Spiralable {

    public TrackLayout() {
    }

    /**
     * Add a Piece.track segment to the layout. The old segement must have an open female end.
     * @param newSegement the segment to be added. Must have a male end
     * @param oldSegment the segment with an open female end
     */
    void addTrack(Track newSegement, Track oldSegment){}

    @Override
    public Spiral generate(Wheel wheel, WheelHole hole, Pen pen) {
        return null;
    }
}
