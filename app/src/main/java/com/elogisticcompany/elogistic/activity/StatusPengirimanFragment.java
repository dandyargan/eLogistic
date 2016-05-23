package com.elogisticcompany.elogistic.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.elogisticcompany.elogistic.R;

/**
 * Created by dandx on 23/05/2016.
 */
public class StatusPengirimanFragment extends Fragment {

    public StatusPengirimanFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_status_pengiriman, container, false);
    }

}
