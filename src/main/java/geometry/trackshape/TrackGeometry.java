package geometry.trackshape;

import geometry.GeometryPoint;

import java.util.List;

/**
 * This class defines the locations of male and female connections on Piece.track shapes.
 */
abstract class TrackGeometry {
    protected List<GeometryPoint> maleConnections, femaleConnections;
    public List<GeometryPoint> getMaleConnections(){return maleConnections;}
    public List<GeometryPoint> getFemaleConnections(){return femaleConnections;}
    protected void setMaleConnections(List<GeometryPoint> gPoints){}
    protected void setFemaleConnections(List<GeometryPoint> gPoints){}
    private static final float TRACK_WIDTH = 1;
    public static float getTrackWidth(){return TRACK_WIDTH;}
    public static final float DEFAULT_RADIUS = 5;
}
