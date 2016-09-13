package piece;


import geometry.Geometry;
import scene.SceneElement;

/**
 * This class defines all of the properties shared by any element with gears.
 * Geared objects are the overarching abstract class defining the functionality of any item with gears.
 * These classes all rely on geometry objects to inform them about the perimeter and shape of their piece.
 * This class, in turn, defines the gear count and placement.
 */
public abstract class GearedObject {

    /**
     * Constructs a geared object from the given shape. Sets the number of gears from the perimeter of the shape.
     * @param shape the shape of the geared object. Determines number of gears.
     */
    public GearedObject(Geometry shape){}

    /**
     * Creates a linking between the current peice and the parameter.
     * If A.connectTo(B) is called, then B will rotate around A when drawn on a canvas.
     * @param peice the piece to rotate around this piece.
     */
    public void connectTo(GearedObject peice){}

    /**
     * Returns the inner geometery of the Geared Object
     * @return returns the encapsulated scene element. Used to define layouts on the canvas.
     */
    public SceneElement getSceneElement(){return null;}

    /**
     * @param other the other geared object used to determine the gear ratio.
     * @return the relative counts of each geared object. this / other
     */
    public float getGearRatio(GearedObject other){return 0;}

    /**
     *
     * @return the number of gears on the piece.
     */
    public int getGearCount(){return 0;}

}
