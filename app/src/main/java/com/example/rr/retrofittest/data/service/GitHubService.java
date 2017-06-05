package com.example.rr.retrofittest.data.service;

import com.example.rr.retrofittest.data.model.Repo;
import com.example.rr.retrofittest.data.model.Result;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Jay-Ar Gabriel on 6/5/2017.
 */

public interface GitHubService {
    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);
}
