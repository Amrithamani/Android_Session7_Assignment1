package com.amritha.acadgild.android_session7_assignment1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import static java.net.URLEncoder.*;

public class MainActivity extends AppCompatActivity {

    EditText edit_SearchInput;
    Button buttonGoogle;
    String input = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonGoogle = findViewById(R.id.buttonGoogle);

        buttonGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edit_SearchInput = (EditText) findViewById(R.id.enterText);

                input = edit_SearchInput.getText().toString();

                Intent iGoogle = new Intent(Intent.ACTION_VIEW);

                iGoogle.setData(Uri.parse("https://www.google.co.in/#q=" + input));

                startActivity(iGoogle);
            }
        });
    }

}
