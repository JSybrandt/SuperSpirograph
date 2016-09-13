/**
 * Geometry defines shapes used by classes in the piece package. These shapes are all also descendants of scene.SceneElement.
 * This means that Geometry can be added the the overall scenegraph, allowing for smart translations and rotations.
 * Many geometric shapes will also define GeometryPoints within them. These points, also part of the scenegraph, are used for connections
 * or pen placements on a shape. All of these properties work together to generate spirographs.
 */
package geometry;