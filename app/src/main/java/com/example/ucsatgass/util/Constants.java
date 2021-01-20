package com.example.ucsatgass.util;

import androidx.annotation.StringDef;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

public class Constants {


    public static final String BASE_URL = "http://192.168.1.6/ucsatgas_uas/public/api/";

    @Retention(SOURCE)
    @StringDef
    public @interface BaseSetting {
        String BASE_URL = "http://192.168.1.6/ucsatgas_uas/public/api/";
        String API_KEY = "";
        String BASE_IMAGE_URL = "";
        String LANGUAGE = "en-US";
    }

    @Retention(SOURCE)
    @StringDef
    public @interface Type {
        String SATGAS = "satgas";
        String PROFILE = "profile";
    }
}
