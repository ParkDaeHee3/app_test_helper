package com.example.app_test_helper.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.app_test_helper.MainActivity;
import com.example.app_test_helper.R;

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

        // 3초 후에 MainActivity로 이동
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(getActivity(), MainActivity.class);
            startActivity(intent);

            // 트랜지션 애니메이션 추가 (페이드 인/아웃)
            getActivity().overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

            // 프래그먼트에서는 finish() 대신 액티비티를 종료하는 코드를 사용
            getActivity().finish();
        }, 3000); // 3000 밀리초 = 3초
    }
}
