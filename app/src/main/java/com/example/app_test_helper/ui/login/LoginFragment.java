package com.example.app_test_helper.ui.login;

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
import androidx.fragment.app.FragmentTransaction;

import com.example.app_test_helper.R;
import com.example.app_test_helper.databinding.FragmentLoginBinding;
import com.example.app_test_helper.ui.signup.SignupFragment;



public class LoginFragment extends Fragment {

    private FragmentLoginBinding binding; // login_signup_button 기능

    EditText username;
    EditText password;
    Button loginButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the fragment's layout (replace 'R.layout.fragment_login' with your actual layout)

        binding = FragmentLoginBinding.inflate(inflater, container, false); // login_signup_button 기능
        View root = binding.getRoot();   // login_signup_button 기능

        View view = inflater.inflate(R.layout.fragment_login, container, false);

        // Find views inside the fragment layout
        username = view.findViewById(R.id.username);
        password = view.findViewById(R.id.password);
        loginButton = view.findViewById(R.id.loginButton);

        // Set up login button click listener
        loginButton.setOnClickListener(v -> {
            String inputUsername = username.getText().toString();
            String inputPassword = password.getText().toString();

            if (inputUsername.equals("user") && inputPassword.equals("1234")) {
                Toast.makeText(getActivity(), "Login Successful!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getActivity(), "Login Failed!", Toast.LENGTH_SHORT).show();
            }
        });

        // login page에 있는 signup button 기능
       Button loginSignupButton = binding.loginSignupButton;
        loginSignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             FragmentTransaction transaction = getActivity().getSupportFragmentManager()
                     .beginTransaction().addToBackStack(null);

              SignupFragment signupFragment = new SignupFragment();
             //main_layout에 homeFragment로 transaction 한다.
             transaction.replace(R.id.fragment_container, signupFragment);
             //꼭 commit을 해줘야 바뀐다.
             transaction.commit();
                       }
                   });

       return view; // Return the created view for the fragment

    }



}

