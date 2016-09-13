package piece.track;

import piece.GearedObject;

/**
 * This class managed a specific sequence of piece.track segments.
 * Tracks are added male end first to the first available female end on the existing segment.
 * TrackCaps are automatically added to any existing female connection which has not been specified in the track layout.
 * This aids Spirograph Designers in quickly creating complex tracks.
 */
public class TrackLayout extends GearedObject {

    public TrackLayout() {
        super(null);
    }

    /**
     * Add a piece.track segment to the layout. The old segement must have an open female end.
     * @param newSegement the segment to be added. Must have a male end
     * @param oldSegment the segment with an open female end
     */
    void connect(Track newSegement, Track oldSegment){}

}
