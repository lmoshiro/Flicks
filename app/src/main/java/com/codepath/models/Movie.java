package com.codepath.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
public class Movie {

    // values from api
     String title;
     String overview;
     String posterPath;
     String backdropPath;
     Double voteAverage;
     Integer id;

    // initialize from JSON
    public Movie(JSONObject object) throws JSONException {
        title = object.getString("title");
        overview = object.getString("overview");
        posterPath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");
        voteAverage = object.getDouble("vote_average");
        id = object.getInt("id");
    }
    public Movie() {

    }


    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }
    public Double getVoteAverage() {
        return voteAverage;
    }
    public Integer getId() {
        return id;
    }
}

