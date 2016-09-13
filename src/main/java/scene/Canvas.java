package scene;

import piece.GearedObject;
import piece.Wheel;
import geometry.GeometryPoint;

import java.awt.*;

/**
 * The canvas object represents a piece of paper in the SuperSpirograph setup. This paper can be drawn on with Pens.
 * Canvases act as the root scene element for spirograph designers, and therefor are the only scene element that can know
 * the entire layout. They use this information to draw spirograph by simulating the rotation of a wheel on some immobile piece.
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
     * @param rotationPiece the piece which will be rotated to create a spiral.
     * @param immobilePiece the piece which will be placed on the canvas to define the spiral.
     *                      Note, the Immobile piece must be a child scene element to the canvas.
     * @param initialRotation the initial rotation in radians of the rotationPiece. Use this to do phase offsets.
     * @param pen the pen properties to use in the spiral
     * @param penHole the location on the rotation piece where the pen should be placed. This must be a child of rotationPiece
     *                in the scene graph.
     */
    public void draw(Wheel rotationPiece, GearedObject immobilePiece, Pen pen, GeometryPoint penHole, float initialRotation){
        rotationPiece.getSceneElement().rotate(initialRotation);
        rotationPiece.rotateStep(immobilePiece);

    }

    /**
     * Draws a single pixel at the specified point. Used by pens to draw shapes.
     * @param point the location relative to the center of the canvas to draw a point.
     * @param color the java.awt color to set this pixel to.
     */
    public void setPixel(Point point, Color color){}

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
