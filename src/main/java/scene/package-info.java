/**
 * The scene package consists of classes needed to actually generate spirographs. The other packages all provide
 * smaller classes which can be used by the scene.Canvas object to do the actual drawing. This package also defines the
 * Scene Element class, which serves as the parent abstract class for any object which must be placed in the scenegraph.
 * A scene.Canvas object acts as the root of the scenegraph, and uses behaviors defined in the sceneElement abstract class
 * to manage the locations and rotations of all pieces. Additionally, pens and colors are defined here, as well as any
 * functionality which can aid spirograph designers in exporting their creations.
 */
package scene;