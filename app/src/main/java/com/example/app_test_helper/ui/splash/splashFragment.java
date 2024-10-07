package com.example.app_test_helper.ui.splash;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.app_test_helper.R;
import com.example.app_test_helper.ui.bottom_nav.bottom_navFragment;

public class splashFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // fragment_splash_screen.xml 레이아웃을 설정
        return inflater.inflate(R.layout.fragment_splash_screen, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // 3초 후에 BottomNavFragment로 이동
        new Handler().postDelayed(() -> {
            getParentFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new bottom_navFragment())
                    .commit();
        }, 3000); // 3000 밀리초 = 3초
    }

    @Override
    public void onStart() {
        super.onStart();
        // Fragment의 뒤로가기 버튼 동작을 비활성화
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                // 아무 작업도 하지 않음
            }
        });
    }
}
