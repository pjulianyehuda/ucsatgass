package com.example.ucsatgass.model.response;

import com.example.ucsatgass.model.local.Event;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EventResponse {
    @SerializedName("data")
    private List<Event> results;

    public List<Event> getResults(){
        return results;
    }
}
