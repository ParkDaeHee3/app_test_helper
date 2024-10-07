package com.example.app_test_helper.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.app_test_helper.databinding.FragmentNotificationsSetBinding;

public class notificationsSetFragment extends Fragment {

    private FragmentNotificationsSetBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        notificationsSetViewModel notificationsSetViewModel = new ViewModelProvider(requireActivity()).get(notificationsSetViewModel.class);
        binding = FragmentNotificationsSetBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btnset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = binding.editText.getText().toString();
                int hour = binding.timepicker.getHour();
                int minute = binding.timepicker.getMinute();

                String time = String.format("%02d:%02d", hour, minute);
                String notification = text + " - " + time;

                notificationsSetViewModel.addNotification(notification);

                Navigation.findNavController(view).navigateUp();
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

