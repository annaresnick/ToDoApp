package com.example.aresnick.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText editText;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String text = getIntent().getStringExtra("text");
        position = getIntent().getIntExtra("position" , 0);
        editText = (EditText) findViewById(R.id.editText);
        editText.setText(text);
    }

    public void onSaveItem(View view) {
        String newString;
        newString = editText.getText().toString();
        Intent data = new Intent();
        data.putExtra("text", newString);
        data.putExtra("position", position);
        setResult(RESULT_OK, data);
        finish();
    }
}
