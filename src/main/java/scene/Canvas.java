package scene;

import Piece.GearedObject;
import Piece.Wheel;
import geometry.GeometryPoint;

import java.awt.*;
import java.util.List;

/**
 * The canvas object represents a peice of paper in the SuperSpirograph setup. This paper can be drawn on with Pens.
 */
public class Canvas extends SceneElement {

    /**
     * Constructs a canvas.
     * Note that the canvas acts as the root scene element.
     * @param background the default color of this canvas. All pixels start this color.
     * @param length the length of the canvas. Units are the same as for Geometry.
     * @param width the width of the canvas. Units are the same as for Geometry.
     */
    public Canvas(float length, float width, Color background){}

    /**
     * Draws a spiral on the canvas.
     * @param rotationPiece the peice which will be rotated to create a spiral.
     * @param ImmobilePiece the peice which will be placed on the canvas to define the spiral.
     *                      Note, the Immobile peice must be a child scene element to the canvas.
     * @param initialRotation the initial rotation in radians of the rotationPeice. Use this to do phase offsets.
     * @param pen the pen properties to use in the spiral
     * @param penHole the location on the rotation peice where the pen should be placed.
     */
    public void draw(Wheel rotationPiece, GearedObject ImmobilePiece, Pen pen, GeometryPoint penHole, float initialRotation){}

    /**
     * Exports the current SuperSpirograph to an image file
     * @param fileName the path to export the spirograph
     * @param format the file format to export the spirograph
     */
    public void export(String fileName, Format format){}

    /**
     * Clears the canvas, returning all color values to Canvas.Backgroundcolor
     */
    public void clear(){}
}
