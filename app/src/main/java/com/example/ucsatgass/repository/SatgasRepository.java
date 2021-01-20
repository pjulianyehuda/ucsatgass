//package com.example.ucsatgas.repository;
//
//import android.util.Log;
//
//import androidx.lifecycle.MutableLiveData;
//
//import com.example.ucsatgas.model.local.Movie;
//import com.example.ucsatgas.model.response.SatgasResponse;
//import com.example.ucsatgas.network.RetrofitService;
//import com.example.ucsatgas.util.Constants;
//
//import java.util.List;
//
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//
//public class SatgasRepository {
//    private static SatgasRepository satgasRepository;
//    private final RetrofitService apiService;
//    private static final String TAG = "MovieRepository";
//
//    private SatgasRepository() {
//        apiService = RetrofitService.getInstance();
//    }
//
//    public static SatgasRepository getInstance() {
//        if (satgasRepository == null) {
//            satgasRepository = new SatgasRepository();
//        }
//        return satgasRepository;
//    }
//
//    public MutableLiveData<List<Movie>> getMovieCollection() {
//        MutableLiveData<List<Movie>> listMovie = new MutableLiveData<>();
//
//        apiService.getMovies().enqueue(new Callback<SatgasResponse>() {
//            @Override
//            public void onResponse(Call<SatgasResponse> call, Response<SatgasResponse> response) {
//                Log.d(TAG, "onResponse: " + response.code());
//                if (response.isSuccessful()) {
//                    if (response.body() != null) {
//                        Log.d(TAG, "onResponse: " + response.body().getResults().size());
//                        listMovie.postValue(response.body().getResults());
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Call<SatgasResponse> call, Throwable t) {
//                Log.d(TAG, "onFailure: " + t.getMessage());
//            }
//        });
//
//        return listMovie;
//    }
//
//    public MutableLiveData<List<Genre>> getGenres(int id) {
//        MutableLiveData<List<Genre>> listGenres = new MutableLiveData<>();
//
//        apiService.getGenres(Constants.Type.MOVIES, id).enqueue(new Callback<GenreResponse>() {
//            @Override
//            public void onResponse(Call<GenreResponse> call, Response<GenreResponse> response) {
//                Log.d(TAG, "onResponse: " + response.code());
//                if (response.isSuccessful()) {
//                    if (response.body() != null) {
//                        Log.d(TAG, "onResponse: " + response.body().getGenres().size());
//                        listGenres.postValue(response.body().getGenres());
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Call<GenreResponse> call, Throwable t) {
//                Log.d(TAG, "onFailure: " + t.getMessage());
//            }
//        });
//
//        return listGenres;
//    }
//
//    public MutableLiveData<List<Cast>> getCasts(int id) {
//        MutableLiveData<List<Cast>> listCasts = new MutableLiveData<>();
//
//        apiService.getCasts(Constants.Type.MOVIES, id).enqueue(new Callback<CastResponse>() {
//            @Override
//            public void onResponse(Call<CastResponse> call, Response<CastResponse> response) {
//                Log.d(TAG, "onResponse: " + response.code());
//                if (response.isSuccessful()) {
//                    if (response.body() != null) {
//                        Log.d(TAG, "onResponse: " + response.body().getCast().size());
//                        listCasts.postValue(response.body().getCast());
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Call<CastResponse> call, Throwable t) {
//                Log.d(TAG, "onFailure: " + t.getMessage());
//            }
//        });
//
//        return listCasts;
//    }
//}
