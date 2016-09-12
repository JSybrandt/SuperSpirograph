package Piece;

import geometry.rackshape.RackGeometry;

/**
 * The rack object uses a RackGeometry object and defines the gear count and rotation logic for a rack.
 */
public class Rack extends GearedObject {
    public Rack(RackGeometry shape){
        super(shape);
    }
}
