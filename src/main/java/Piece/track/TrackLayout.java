package Piece.track;

import Piece.GearedObject;

/**
 * This class managed a specific sequence of Piece.track segments.
 * Tracks are added male end first.
 * The Track Layout object can also generate spirals.
 */
public class TrackLayout extends GearedObject {

    public TrackLayout() {
        super(null);
    }

    /**
     * Add a Piece.track segment to the layout. The old segement must have an open female end.
     * @param newSegement the segment to be added. Must have a male end
     * @param oldSegment the segment with an open female end
     */
    void connect(Track newSegement, Track oldSegment){}

}
