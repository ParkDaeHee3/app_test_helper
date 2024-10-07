package com.example.app_test_helper.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.example.app_test_helper.MainActivity;
import com.example.app_test_helper.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_splash_screen);

        // 3초 후 MainActivity로 전환
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // SplashActivity를 종료하여 뒤로 가기 시 다시 나타나지 않도록 설정
        }, 3000);
    }
}
