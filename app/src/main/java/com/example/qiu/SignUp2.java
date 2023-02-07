package com.example.qiu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.chaos.view.PinView;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp2 extends AppCompatActivity {
   PinView pinView;
   AppCompatButton  button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);
        pinView = findViewById(R.id.pin_view);
        button = findViewById(R.id.proceedBtn);

        pinView.requestFocus();
        InputMethodManager inputMethodManager=(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED,InputMethodManager.HIDE_IMPLICIT_ONLY);


        pinView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.toString().length()==4) {
                    Toast toast = new Toast(getApplicationContext());
                    ImageView view = new ImageView(getApplicationContext());

                    // set image resource to be shown
                    view.setImageResource(R.drawable.ticks);

                    // setting view to toast
                    toast.setView(view);

                    // showing toast
                    toast.show();
                    Toast.makeText(getApplicationContext(), "OPT verified", Toast.LENGTH_SHORT).show();

                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUp2.this, SignUp3.class));
            }
        });
    }

}