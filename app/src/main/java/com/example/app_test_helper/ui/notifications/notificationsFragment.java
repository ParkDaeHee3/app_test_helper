package com.example.app_test_helper.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.app_test_helper.R;
import com.example.app_test_helper.databinding.FragmentNotificationsListBinding;

// 알림 화면을 위한 Fragment 클래스
public class notificationsFragment extends Fragment {

    // 뷰 바인딩 객체
    private FragmentNotificationsListBinding binding;

    // Fragment 뷰 생성
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // ViewModel 초기화
        notificationsViewModel notificationsViewModel = new ViewModelProvider(requireActivity()).get(notificationsViewModel.class);

        // 뷰 바인딩 설정
        binding = FragmentNotificationsListBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // 여기서 클릭 리스너를 추가합니다.
        binding.floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 화면 전환을 위한 Navigation
                Navigation.findNavController(view).navigate(R.id.action_notificationsFragment_to_notificationsSetFragment);
            }
        });

        return root;
    }

    // 뷰 해제 시 바인딩 객체 정리
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
