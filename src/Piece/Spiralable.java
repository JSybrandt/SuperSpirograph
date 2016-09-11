package Piece;

import geometry.GeometryPoint;
import pen.Pen;
import scene.Spiral;

/**
 * Any class which can generate a spiral object must implement this class.
 */
public interface Spiralable {

    /**
     * The generate function creates a spiral by moving the provided wheel around the current object.
     *
     * @param wheel is the wheel object which will move around to generate the spiral.
     * @param hole  is the wheel's hole which the pen will be placed
     * @param pen   is the pen properties which will generate the spiral
     * @return a spiral object which can be written to a canvas object
     */
    Spiral generate(Wheel wheel, GeometryPoint hole, Pen pen);
}
