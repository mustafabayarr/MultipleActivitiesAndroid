package com.mustafabayar.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        userName = "";
    }
    public void changeActivity(View view){
        userName = editText.getText().toString(); // kullanıcının girdiği ismi alıyoruz.

        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
        intent.putExtra("userInput",userName);
        startActivity(intent);
    }
}