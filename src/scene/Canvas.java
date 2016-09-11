package scene;

import java.util.List;

/**
 * The canvas object represents a peice of paper in the SuperSpirograph setup. This paper can be drawn on with Pens.
 */
public class Canvas extends SceneElement {

    /**
     * Constucts a canvas.
     * Note that the canvas acts as the root scene element.
     */
    public Canvas(){}

    /**
     * Adds a drawn spiral to the canvas
     * @param spiral a spiral drawn from another source.
     */
    public void addSpiral(Spiral spiral){}

    private List<Spiral> spirals;
}
