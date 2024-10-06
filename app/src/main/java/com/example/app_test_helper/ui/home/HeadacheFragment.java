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
import com.example.app_test_helper.databinding.FragmentHeadacheBinding;
import com.example.app_test_helper.ui.map.PharmacyFragment;
import com.example.app_test_helper.ui.map.mapFragment;

public class HeadacheFragment extends Fragment {

    private FragmentHeadacheBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHeadacheBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button bnt1 = binding.Hbutton1;

        bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction().addToBackStack(null);

                PharmacyFragment pharmacyFragment = new PharmacyFragment();
                transaction.replace(R.id.fragment_home, pharmacyFragment);
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
