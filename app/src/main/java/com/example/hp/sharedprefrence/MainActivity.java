package com.example.hp.sharedprefrence;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          editText=(EditText)findViewById(R.id.e);
          textView=(TextView)findViewById(R.id.t);

    }




    ///Save///
    public void b1click(View view) {

        SharedPreferences shrd=getSharedPreferences("savefile", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=shrd.edit();

        editor.putString("name",editText.getText().toString());

        editor.apply();

    }


    ///Load///
    public void b2click(View view) {
        SharedPreferences shrd=getSharedPreferences("savefile", Context.MODE_PRIVATE);
        String name=shrd.getString("name","ON_DATA");
        textView.setText(name);
    }


}
