package com.example.rr.retrofittest.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jay-Ar Gabriel on 6/5/2017.
 */

public class Result {
    @SerializedName("repos")
    private List<Repo> repos = new ArrayList<Repo>();

    public List<Repo> getRepos() {
        return repos;
    }

    public void setRepos(List<Repo> repos) {
        this.repos = repos;
    }
}
