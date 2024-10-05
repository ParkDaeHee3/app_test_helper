package com.example.app_test_helper.ui.map;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_test_helper.R;
import com.example.app_test_helper.databinding.FragmentHistoryBinding;
import com.example.app_test_helper.databinding.FragmentPharmacyBinding;
import com.example.app_test_helper.ui.history.HistoryViewModel;
import com.example.app_test_helper.ui.home.FeverFragment;

public class PharmacyFragment extends Fragment {

    private FragmentPharmacyBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentPharmacyBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button bnt1 = binding.Fbutton1;

        bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction().addToBackStack(null);

                mapFragment mapFragment = new mapFragment();
                transaction.replace(R.id.fragment_pharmacy, mapFragment);
                transaction.commit();
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

