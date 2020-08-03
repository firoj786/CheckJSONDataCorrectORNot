package com.nt.sensen;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Firoj Khan
 * @since 2020-08-03
 */

public class ResponseDTO{
	

    /**
     * The application whose response this ml server is returning.
     */
    String application;
    /**
     * The event id for which the response is returned
     */
    int eventID;
    /**
     * The type of the event for which the response is returned
     */
    String type;
    /**
     * Color type of the request for which the response is returned
     */
    String colorType;
    /**
     * Zone Identifier returned by the ml server for the zone.
     */
    String zoneID;

    /**
     * Path to the matched image
     */
    String matchBackgroundImagePath;

    /**
     * Matching score for zone
     */
    String matchScore;

    /**
     * The side of zone. Values can be even | odd
     */
    String zoneSide;

    /**
     * Gps coordinates of the sign event
     */
    List<Double> referenceImageGPS;

    /**
     * A list of matched results
     */
    List<MatchResult> matchResult;

    /**
     * A list of matched background context paths
     */
    List<String> matchBackgroundContextPaths;

    /**
     * A list of macthed zone context paths
     */
    List<MatchZoneContextPaths> matchZoneContextPaths;

    public String getZoneSide() {
        return zoneSide;
    }

    public void setZoneSide(String zoneSide) {
        this.zoneSide = zoneSide;
    }

    public List<MatchResult> getMatchResult() {
        return matchResult;
    }

    public void setMatchResult(List<MatchResult> matchResult) {
        this.matchResult = matchResult;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColorType() {
        return colorType;
    }

    public void setColorType(String colorType) {
        this.colorType = colorType;
    }

    public String getZoneID() {
        return zoneID;
    }

    public void setZoneID(String zoneID) {
        this.zoneID = zoneID;
    }

    public String getMatchBackgroundImagePath() {
        return matchBackgroundImagePath;
    }

    public void setMatchBackgroundImagePath(String matchBackgroundImagePath) {
        this.matchBackgroundImagePath = matchBackgroundImagePath;
    }

    public String getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(String matchScore) {
        this.matchScore = matchScore;
    }

    public List<Double> getReferenceImageGPS() {
        return referenceImageGPS;
    }

    public void setReferenceImageGPS(List<Double> referenceImageGPS) {
        this.referenceImageGPS = referenceImageGPS;
    }

    public List<String> getMatchBackgroundContextPaths() {
        return matchBackgroundContextPaths;
    }

    public void setMatchBackgroundContextPaths(List<String> matchBackgroundContextPaths) {
        this.matchBackgroundContextPaths = matchBackgroundContextPaths;
    }

    public List<MatchZoneContextPaths> getMatchZoneContextPaths() {
        return matchZoneContextPaths;
    }

    public void setMatchZoneContextPaths(List<MatchZoneContextPaths> matchZoneContextPaths) {
        this.matchZoneContextPaths = matchZoneContextPaths;
    }

}
