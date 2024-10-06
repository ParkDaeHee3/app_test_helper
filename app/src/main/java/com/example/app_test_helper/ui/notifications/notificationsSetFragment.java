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

// 알림 설정 화면을 위한 Fragment 클래스
public class notificationsSetFragment extends Fragment {

    // 뷰 바인딩 객체
    private FragmentNotificationsSetBinding binding;

    // Fragment 뷰 생성
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // ViewModel 초기화
        notificationsSetViewModel notificationsSetViewModel = new ViewModelProvider(this).get(notificationsSetViewModel.class);

        // 뷰 바인딩 설정
        binding = FragmentNotificationsSetBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // 알림 설정 화면에서 필요한 추가 동작 구현 (예: 설정 데이터 표시)

        return root;
    }

    // 뷰 해제 시 바인딩 객체 정리
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
