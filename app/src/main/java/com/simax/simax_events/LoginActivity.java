package com.simax.simax_events;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class LoginActivity extends AppCompatActivity {

    Button login, register;
    LinearLayout facebook, google;
    private EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.login);
        register = (Button) findViewById(R.id.register);

        facebook = (LinearLayout) findViewById(R.id.facebook);
        google = (LinearLayout) findViewById(R.id.google);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);

        password.addTextChangedListener(mTextEditorWatcher);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
            }
        });

    }
    private final TextWatcher mTextEditorWatcher = new TextWatcher() {

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {

            if (s.length() >= 4){
                login.setTextColor(Color.parseColor("#F44336"));
            }else  {
                login.setTextColor(Color.parseColor("#000000"));
            }

        }

        public void afterTextChanged(Editable s) {
        }
    };

}
