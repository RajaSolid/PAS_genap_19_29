package com.example.pas_genap_19_29;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TeamsResponse {

    @SerializedName("teams")
    private List<Teams> teams;

    public List<Teams> getTeams() {
        return teams;
    }
}
