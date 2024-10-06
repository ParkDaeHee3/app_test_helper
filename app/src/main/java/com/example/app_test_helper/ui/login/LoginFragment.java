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

import com.example.app_test_helper.R;

public class LoginFragment extends Fragment {

    EditText username;
    EditText password;
    Button loginButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the fragment's layout (replace 'R.layout.fragment_login' with your actual layout)
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

        return view; // Return the created view for the fragment
    }
}

