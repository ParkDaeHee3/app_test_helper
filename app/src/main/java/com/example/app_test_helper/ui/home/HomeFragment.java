package com.example.app_test_helper.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_test_helper.R;
import com.example.app_test_helper.databinding.FragmentHomeBinding;
import com.google.android.material.snackbar.Snackbar;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.textHome;
        final Button button1 = binding.button1;
        final Button button2 = binding.button2;
        final Button button3 = binding.button3;
        final Button button4 = binding.button4;
        final Button button5 = binding.button5;
        final Button button6 = binding.button6;
        final Button button7 = binding.button7;
        final Button button8 = binding.button8;
        final Button button9 = binding.button9;
        final Button button10 = binding.button10;
        final Button btnmap = binding.btnmap;


        // button1에 리스너 설정
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction().addToBackStack(null);

                HeadacheFragment headacheFragment = new HeadacheFragment();
                //main_layout에 homeFragment로 transaction 한다.
                transaction.replace(R.id.fragment_home, headacheFragment);
                //꼭 commit을 해줘야 바뀐다.
                transaction.commit();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction().addToBackStack(null);

                StomachacheFragment stomachacheFragment = new StomachacheFragment();
                transaction.replace(R.id.fragment_home, stomachacheFragment);
                transaction.commit();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction().addToBackStack(null);

                FeverFragment feverFragment = new FeverFragment();
                transaction.replace(R.id.fragment_home, feverFragment);
                transaction.commit();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction().addToBackStack(null);

                AcheFragment acheFragment = new AcheFragment();
                transaction.replace(R.id.fragment_home, acheFragment);
                transaction.commit();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction().addToBackStack(null);

                TirednessFragment tirednessFragment = new TirednessFragment();
                transaction.replace(R.id.fragment_home, tirednessFragment);
                transaction.commit();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction().addToBackStack(null);

                ToothacheFragment toothacheFragment = new ToothacheFragment();
                transaction.replace(R.id.fragment_home, toothacheFragment);
                transaction.commit();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction().addToBackStack(null);

                DizzinessFragment dizzinessFragment = new DizzinessFragment();
                transaction.replace(R.id.fragment_home, dizzinessFragment);
                transaction.commit();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction().addToBackStack(null);

                FluFragment fluFragment = new FluFragment();
                transaction.replace(R.id.fragment_home, fluFragment);
                transaction.commit();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction().addToBackStack(null);

                StitchFragment stitchFragment = new StitchFragment();
                transaction.replace(R.id.fragment_home, stitchFragment);
                transaction.commit();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction().addToBackStack(null);

                EtcFragment etcFragment = new EtcFragment();
                transaction.replace(R.id.fragment_home, etcFragment);
                transaction.commit();
            }
        });

        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction().addToBackStack(null);

                MapFragment headacheFragment = new MapFragment();
                transaction.replace(R.id.fragment_home, headacheFragment);
                transaction.commit();
            }
        });

        //homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}