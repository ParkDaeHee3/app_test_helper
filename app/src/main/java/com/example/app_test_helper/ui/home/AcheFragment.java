package com.example.app_test_helper.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.app_test_helper.R;
import com.example.app_test_helper.databinding.FragmentAcheBinding;
import com.example.app_test_helper.databinding.FragmentHeadacheBinding;

public class AcheFragment extends Fragment {

    private FragmentAcheBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentAcheBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button Abutton1 = binding.Abutton1;
        Button Abutton2 = binding.Abutton2;
        Button Abutton3 = binding.Abutton3;
        Button Abutton4 = binding.Abutton4;
        Button Abutton5 = binding.Abutton5;
        Button Abutton6 = binding.Abutton6;
        Button Abutton7 = binding.Abutton7;
        Button Abutton8 = binding.Abutton8;
        Button Abutton0 = binding.Abutton0;

        Abutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "약A 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Abutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "약B 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Abutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "약C 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Abutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "약D 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Abutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "약E 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Abutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "약F 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Abutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "약G 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Abutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "약H 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Abutton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "약J 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
