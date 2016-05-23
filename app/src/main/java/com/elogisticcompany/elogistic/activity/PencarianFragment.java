package com.elogisticcompany.elogistic.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.elogisticcompany.elogistic.HasilPencarianActivity;
import com.elogisticcompany.elogistic.R;

/**
 * Created by dandx on 23/05/2016.
 */
public class PencarianFragment extends Fragment implements OnClickListener {

    public PencarianFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_pencarian, container, false);
        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Button buttonCariSpace = (Button) getActivity().findViewById(
                R.id.buttonCariSpace);
        buttonCariSpace.setOnClickListener((OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), HasilPencarianActivity.class);
        startActivity(intent);
    }

}
