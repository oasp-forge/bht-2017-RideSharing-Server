package io.oasp.logistic.ridesharing.requestmanagement.logic.api.to;


import io.oasp.logistic.ridesharing.requestmanagement.common.api.Request;
import io.oasp.module.basic.common.api.to.AbstractEto;

import java.util.Date;

public class RequestEto extends AbstractEto implements Request {

    private long userId;

    private String fromLocation;

    private String toLocation;

    private Date earliestDepartureTime;

    private Date latestDepartureTime;

    private int numberOfPlaces;

    private String luggageSpace;

    private long RSOfferIdMapped;

    /**
     * The constructor.
     */
    public RequestEto() {
        super();
    }

    @Override
    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    @Override
    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    @Override
    public void setEarliestDepartureTime(Date earliestDepartureTime) {
        this.earliestDepartureTime = earliestDepartureTime;
    }

    @Override
    public void setLatestDepartureTime(Date latestDepartureTime) {
        this.latestDepartureTime = latestDepartureTime;
    }

    @Override
    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    @Override
    public void setLuggageSpace(String luggageSpace) {
        this.luggageSpace = luggageSpace;
    }

    @Override
    public void setRSOfferIdMapped(long RSOfferIdMapped) {
        this.RSOfferIdMapped = RSOfferIdMapped;
    }

    @Override
    public long getUserId() {
        return this.userId;
    }

    @Override
    public String getFromLocation() {
        return this.fromLocation;
    }

    @Override
    public String getToLocation() {
        return this.toLocation;
    }

    @Override
    public Date getEarliestDepartureTime() {
        return this.earliestDepartureTime;
    }

    @Override
    public Date getLatestDepartureTime() {
        return this.latestDepartureTime;
    }

    @Override
    public int getNumberOfPlaces() {
        return this.numberOfPlaces;
    }

    @Override
    public String getLuggageSpace() {
        return this.luggageSpace;
    }

    @Override
    public long getRSOfferIdMapped() {
        return this.RSOfferIdMapped;
    }
}