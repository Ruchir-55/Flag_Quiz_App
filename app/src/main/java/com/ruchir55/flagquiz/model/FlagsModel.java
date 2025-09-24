package com.ruchir55.flagquiz.model;

public class FlagsModel {

    public int flagId;
    public String countryName;
    public String flagName;

    public FlagsModel(int flagId, String countryName, String flagName) {
        this.countryName = countryName;
        this.flagId = flagId;
        this.flagName = flagName;
    }

    public int getFlagId() {
        return flagId;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getFlagName() {
        return flagName;
    }
}
