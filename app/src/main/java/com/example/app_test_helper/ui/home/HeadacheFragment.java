package com.example.app_test_helper.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.app_test_helper.R;
import com.example.app_test_helper.databinding.FragmentHeadacheBinding;
import com.example.app_test_helper.ui.map.PharmacyFragment;

public class HeadacheFragment extends Fragment {

    private FragmentHeadacheBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHeadacheBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Hbutton1을 LinearLayout으로 참조
        LinearLayout bnt1 = binding.Hbutton1;

        // 클릭 이벤트 설정
        bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 프래그먼트 전환
                FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null);

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
