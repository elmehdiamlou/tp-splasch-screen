package com.example.tp_splasch_screen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Compte");
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        login.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("username", username.getText().toString());
            bundle.putString("password", password.getText().toString());
            Intent i = new Intent(this, InfosActivity.class);
            i.putExtras(bundle);
            startActivity(i);
        });

    }
}