package com.example.ucsatgass.model.response;

import com.example.ucsatgass.model.local.Satgas;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SatgasResponse {
    @SerializedName("total_pages")
    private int totalPages;

    @SerializedName("results")
    private List<Satgas> results;

    @SerializedName("total_results")
    private int totalResults;

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<Satgas> getResults() {
        return results;
    }

    public void setResults(List<Satgas> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
}
