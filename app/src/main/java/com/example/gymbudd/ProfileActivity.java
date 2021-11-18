package com.example.gymbudd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    private TextView genderTextView, nameTextView, ageTextView;
    private TextView emailTextView;
    private ImageView userImageView, emailImageView;



    private String email,password;

    TextView myTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        genderTextView = findViewById(R.id.Gender_textview);
        nameTextView = findViewById(R.id.name_textview);
        ageTextView = findViewById(R.id.age_textview);
        emailTextView = findViewById(R.id.email_textview);
        userImageView = findViewById(R.id.user_imageview);
        emailImageView = findViewById(R.id.email_imageview);


    }
}