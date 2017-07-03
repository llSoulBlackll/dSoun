package com.soulblack.dsoun.login;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.soulblack.dsoun.R;
import com.soulblack.dsoun.activities.MainActivity;

public class LoginActivity extends AppCompatActivity {

    Button loginButton, registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = (Button)findViewById(R.id.btnLogin);
        registerButton = (Button)findViewById(R.id.btnRegister);

        loginButton.setOnClickListener(loginClick);
        registerButton.setOnClickListener(registerClick);
    }

    View.OnClickListener loginClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Snackbar.make(v, "Login Succesful", Snackbar.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(), MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
            finish();
            //FLAGS CLEAR THE BACKSTACK
        }
    };

    View.OnClickListener registerClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Registering...", Toast.LENGTH_SHORT).show();
            try {
                Snackbar.make(v, "Registered!", Snackbar.LENGTH_SHORT).show();
                Thread.sleep(1500);
                startActivity(new Intent(LoginActivity.this, MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
                finish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
}
