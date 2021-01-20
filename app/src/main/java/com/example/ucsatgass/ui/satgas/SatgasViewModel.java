//package com.example.ucsatgas.ui.satgas;
//
//import androidx.lifecycle.LiveData;
//import androidx.lifecycle.ViewModel;
//
//import com.example.ucsatgas.model.local.Movie;
//import com.example.ucsatgas.repository.SatgasRepository;
//
//import java.util.List;
//
//public class SatgasViewModel extends ViewModel {
//    private SatgasRepository repository;
//
//    public SatgasViewModel() {
//        repository = SatgasRepository.getInstance();
//    }
//
//    public LiveData<List<Movie>> getMovie() {
//        return repository.getMovieCollection();
//    }
//}
