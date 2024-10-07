package com.example.app_test_helper.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.app_test_helper.R;
import com.example.app_test_helper.databinding.FragmentNotificationsListBinding;

import java.util.ArrayList;

public class notificationsFragment extends Fragment {

    private FragmentNotificationsListBinding binding;
    private ArrayAdapter<String> adapter;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        notificationsSetViewModel notificationsViewModel = new ViewModelProvider(requireActivity()).get(notificationsSetViewModel.class);
        binding = FragmentNotificationsListBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ListView listView = binding.notificationslist;
        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, new ArrayList<>());
        listView.setAdapter(adapter);

        // LiveData 관찰하여 ListView 업데이트
        notificationsViewModel.getNotificationsList().observe(getViewLifecycleOwner(), notifications -> {
            adapter.clear();
            adapter.addAll(notifications);
            adapter.notifyDataSetChanged();
        });

        // 항목 롱 클릭 리스너 설정
        listView.setOnItemLongClickListener((parent, view, position, id) -> {
            String itemToRemove = adapter.getItem(position);
            if (itemToRemove != null) {
                notificationsViewModel.removeNotification(itemToRemove);
                Toast.makeText(getContext(), "항목이 삭제되었습니다.", Toast.LENGTH_SHORT).show();
            }
            return true;
        });

        binding.floatingActionButton.setOnClickListener(view ->
                Navigation.findNavController(view).navigate(R.id.action_notificationsFragment_to_notificationsSetFragment)
        );

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
