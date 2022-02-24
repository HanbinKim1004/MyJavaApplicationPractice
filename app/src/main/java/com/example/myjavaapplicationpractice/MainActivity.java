package com.example.myjavaapplicationpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText TextInputEditText_Email, TextInputEditText_password; // alt + enter로 임포트
    RelativeLayout RelativeLayout_login, RelativeLayout_login_with_Facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // onCreate를 통해서 호출을 시작한다. main과 유사하다.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // setContentView 내부에 작성한 코드를 실행할 수 있다. & activity_main과 매칭되어서 사용된다.

        TextInputEditText_Email = findViewById(R.id.TextInputEditText_Email);
        TextInputEditText_password = findViewById(R.id.TextInputEditText_password);
        RelativeLayout_login = findViewById(R.id.RelativeLayout_login);
        RelativeLayout_login_with_Facebook = findViewById(R.id.RelativeLayout_login_with_Facebook);

        /*
        1. 값을 가져온다.
        2. 출력을 감지한다.
        3. 1번 값을 다음 액티비티로 넘긴다.
         */

        RelativeLayout_login.setClickable(true);
        RelativeLayout_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = TextInputEditText_Email.getText().toString();
                String password = TextInputEditText_password.getText().toString();

                Intent intent = new Intent(MainActivity.this, LogInResult.class);
                intent.putExtra("email", email);
                intent.putExtra("password", password);
                startActivity(intent);

            }

        });




    }


}