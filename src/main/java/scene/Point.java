package scene;

import scene.SceneElement;

/**
 * Wraps an X and Y value. Used in the canvas to draw pixels, used in geometry (extended by GeometryPoint) to represent
 * places on a shape.
 */
public class Point extends SceneElement {
    float x;
    float y;

    public Point(float x, float y){}

}
