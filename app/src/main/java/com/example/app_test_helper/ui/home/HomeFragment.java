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

import com.example.app_test_helper.databinding.FragmentHomeBinding;
import com.google.android.material.snackbar.Snackbar;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

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
//                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
//                HomeFragment homeFragment = new HomeFragment();
//                //main_layout에 homeFragment로 transaction 한다.
//                transaction.replace(R.id.main_layout, homeFragment);
//                //꼭 commit을 해줘야 바뀐다.
//                transaction.commit();
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