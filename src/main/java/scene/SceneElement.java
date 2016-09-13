package scene;

import java.util.List;

/**
 * Defines the operations necessary to place the item on a scenegraph.
 * The scenegraph itself starts with the root scene element and further elements.
 * The scenegraph allows points to rotate attached to a shape, and allows relative coordinate systems to aid in
 * Spirograph generationn.
 */
public abstract class SceneElement {
    private List<SceneElement> children;
    private SceneElement parent;
    private float x, y;
    public void addChildElement(SceneElement elem){}
    public void setParent(SceneElement elem){}

    /**
     * Moves the current scene element relative to its parent. Effects all children elements.
     * @param x amount to move in x direction
     * @param y amount to move in y direction
     */
    public void translate(float x, float y){}

    /**
     * Rotates the current scene element relative to its parent, effects all children elements in the graph.
     * @param radians amount to rotate by (counter clockwise)
     */
    public void rotate(float radians){}

    /**
     * Scales the current scene element relative to it's parent, effects all children.
     * @param xScale amount to scale in the x dimension
     * @param yScale amount to scale in the y dimension
     */
    public void scale(float xScale, float yScale){}

    /**
     * Scales the current scene element relative to it's parent, effects all children.
     * @param s the amount to scale the whole element in both dimensions
     */
    public void scale(float s){}

    /**
     *
     * @return the x and y coordinates relative to the while scene graph
     */
    public Point getGlobalCoordinate(){return null;}
}
