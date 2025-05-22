package com.example.pas_genap_19_29;

import com.google.gson.annotations.SerializedName;

public class Teams {
    @SerializedName("strTeam")
    private String name;

    @SerializedName("strStadium")
    private String stadium;

    @SerializedName("strBadge")
    private String badgeUrl;

    @SerializedName("strSport")
    private String sportname;

    @SerializedName("strSportDescription")
    private String sportdesc;

    @SerializedName("strSportThumb")
    private String sportUrl;

    public String getName() { return name; }
    public String getStadium() { return stadium; }
    public String getBadgeUrl() { return badgeUrl; }

    public String getSportname() { return sportname; }
    public String getSportdesc() { return sportdesc; }
    public String getSportUrl() { return sportUrl; }
}
