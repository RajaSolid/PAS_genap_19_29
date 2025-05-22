package com.example.pas_genap_19_29;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {

    @GET("search_all_teams.php")
    Call<TeamsResponse> getTeams(@Query("l") String leagueName);
}
