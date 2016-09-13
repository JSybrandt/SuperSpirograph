package geometry.trackshape;

import geometry.Geometry;
import geometry.GeometryPoint;

import java.util.List;

/**
 * This class defines the locations of male and female connections on piece.track shapes.
 * The two types of track geometry, Curve and Line, are used by objects in the piece.track package to specify
 * the geometric size and position of different track segments.
 * All track pieces have some number of male and female connection points, represented as two different collections of
 * Geometry points here to show their spacial layout. Of course, a track is constructed by assembling track pieces connected
 * male to female.
 */
abstract class TrackGeometry extends Geometry {
    protected List<GeometryPoint> maleConnections, femaleConnections;
    public List<GeometryPoint> getMaleConnections(){return maleConnections;}
    public List<GeometryPoint> getFemaleConnections(){return femaleConnections;}
    protected void setMaleConnections(List<GeometryPoint> gPoints){}
    protected void setFemaleConnections(List<GeometryPoint> gPoints){}
    private static final float TRACK_WIDTH = 1;
    public static float getTrackWidth(){return TRACK_WIDTH;}
    public static final float DEFAULT_RADIUS = 5;
}
