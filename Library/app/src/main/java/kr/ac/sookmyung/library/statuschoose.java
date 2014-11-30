package kr.ac.sookmyung.library;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class statuschoose extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statuschoose);

        Button button1 = (Button) findViewById(R.id.btn_librarian);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), login_librarian.class);
                startActivity(intent);
            }


        });

        Button button2 = (Button) findViewById(R.id.btn_student);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), login_student.class);
                startActivity(intent);
            }


        });


    }




}
