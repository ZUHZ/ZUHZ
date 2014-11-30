package kr.ac.sookmyung.library;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class login_student extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_student);

        Button button1 = (Button) findViewById(R.id.btn_stu_login);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), main_student.class);
                startActivity(intent);
            }


        });

        Button button2 = (Button) findViewById(R.id.btn_stu_join);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), account_student.class);
                startActivity(intent);
            }


        });

    }
}


