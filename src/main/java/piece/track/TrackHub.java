package piece.track;

import geometry.trackshape.TriangleHub;

/**
 * Defines a track hub consisting of three female ports.
 * This class uses geometry.trackshape.TriangleHub to specify the shape of a hub, while this class adds information
 * pertaining to the gear layout and track movement.
 */

public class TrackHub extends Track {

    /**
     * Constructs a triangular track hub with three female ports.
     * @param shape the shape specification for this hub.
     */
    public TrackHub(TriangleHub shape){
       super(null);
    }
}
