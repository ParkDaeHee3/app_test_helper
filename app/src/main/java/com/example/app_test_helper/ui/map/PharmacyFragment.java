package com.example.app_test_helper.ui.map;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_test_helper.databinding.FragmentHistoryBinding;
import com.example.app_test_helper.databinding.FragmentPharmacyBinding;
import com.example.app_test_helper.ui.history.HistoryViewModel;

public class PharmacyFragment extends Fragment {

    private FragmentPharmacyBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentPharmacyBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

