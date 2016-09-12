package Piece;


import geometry.Geometry;

/**
 * This class defines all of the properties shared by any element with gears.
 */
public abstract class GearedObject {

    /**
     * Constructs a geared object from the given shape. Sets the number of gears from the perimeter of the shape.
     * @param shape the shape of the geared object. Determines number of gears.
     */
    public GearedObject(Geometry shape){}

}
