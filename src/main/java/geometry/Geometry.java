package geometry;

import scene.SceneElement;

/**
 * An abstract class used to house all generalized geometry logic.
 * Geometry classes define the shapes, rotations, and spacial orientations of components found in  the piece package.
 * These classes are supplemented by those in the piece package to allow for spirograph generation.
 * Geometry may be solid or hollow. A hollow shape has a border but no center, these are used to define RingGeometry.
 */
public abstract class Geometry extends SceneElement {

    /**
     * Constructs a typical geometric object wherein the inside is solid.
     */
    public Geometry(){}

    /**
     * Constructs a geometric object wherein the inside of the shape is hollow.
     * This constructor is primarily used to define the inner shape of rings.
     * @param isHollow if true, the shape will be hollow and gears will be defined on the inside rather than outside.
     */
    public Geometry(boolean isHollow){}

    /**
     *
     * @return the perimeter of the shape
     */
    public float getPerimeter(){return 0;}

    /**
     *
     * @return the area of the shape
     */
    public float getArea(){return 0;}

    /**
     *
     * @return the radius of a bounding circle around the shape
     */
    public float getRadius(){return 0;}

    /**
     *
     * @return the width of a bounding rectangle around the shape
     */
    public float getWidth(){return 0;}

    /**
     *
     * @return the height of a bounding rectangle around the shape
     */
    public float getHeight(){return 0;}

    private boolean isHollow;

    /**
     *
     * @param h true if the center of the shape should be geared
     */
    public void setHollow(boolean h){isHollow = h;}

    /**
     *
     * @return true if the center of the shape should be geared
     */
    public boolean isHollow() {return isHollow;}

}
