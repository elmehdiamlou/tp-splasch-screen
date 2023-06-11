package com.example.tp_splasch_screen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class InfosActivity extends AppCompatActivity {
    TextView username;
    TextView password;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Compte");
        setContentView(R.layout.activity_infos);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        back = findViewById(R.id.back);
        Bundle b = getIntent().getExtras();
        String usr = b.getString("username");
        String pswd = b.getString("password");
        username.setText(usr);
        password.setText(pswd);
        back.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

    }
}