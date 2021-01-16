package com.example.moviesapp.ui.profile;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.moviesapp.R;
import com.example.moviesapp.model.local.TvShow;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ProfileFragment extends Fragment {
    TextView account_nama, account_email;
    Button button_logout;

}