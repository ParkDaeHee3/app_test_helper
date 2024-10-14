package com.example.app_test_helper.ui.signup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.app_test_helper.R;

public class SignupFragment extends Fragment {

    EditText signup_email;
    EditText signup_password;
    EditText signup_confirm;
    Button signup_button;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // fragment_signup.xml 레이아웃을 inflate 합니다
        View view = inflater.inflate(R.layout.fragment_signup, container, false);

        // UI 요소 연결
        signup_email = view.findViewById(R.id.signup_email);
        signup_password = view.findViewById(R.id.signup_password);
        signup_confirm = view.findViewById(R.id.signup_confirm);
        signup_button  = view.findViewById(R.id.signup_button);

        // 회원가입 버튼 클릭 시 동작 처리
        signup_button.setOnClickListener(v -> {
            String inputSignup_email = signup_email.getText().toString();
            String inputSingup_password = signup_password.getText().toString();
            String inputConfirm = signup_confirm.getText().toString();

            // 간단한 검증
            if (inputSignup_email.isEmpty() || inputSingup_password.isEmpty() || inputConfirm.isEmpty()) {
                Toast.makeText(getActivity(), "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                // 회원가입 로직 추가 (서버로 데이터 전송 등)
                Toast.makeText(getActivity(), "Signup successful!", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
