package Piece.track;

import Piece.GearedObject;
import geometry.Geometry;

/**
 * The Piece.track class defines individual Piece.track elements and how they connect.
 */
public abstract class Track extends GearedObject {


    /**
     * Constructs a geared object from the given shape. Sets the number of gears from the perimeter of the shape.
     *
     * @param shape the shape of the geared object. Determines number of gears.
     */
    public Track(Geometry shape) {
        super(shape);
    }
}
