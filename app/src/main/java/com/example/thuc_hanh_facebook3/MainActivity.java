package com.example.thuc_hanh_facebook3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ed1;
    private RadioButton bt1;
    private  RadioButton bt2;
    private  RadioButton bt3;
    private Button btn1 ,btn2;
    private TextView txt3;
    String them = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.ed1);
        bt1 = (RadioButton) findViewById(R.id.bt1);
        bt2 = (RadioButton) findViewById(R.id.bt2);
        bt3 = (RadioButton)  findViewById(R.id.bt3);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button)  findViewById(R.id.btn2);
        txt3 = (TextView) findViewById(R.id.txt3);
        btn1.setEnabled(false);
        //event change
        ed1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(ed1.length() > 0)
                {
                    btn1.setEnabled(true);
                }
                else if(ed1.length() == 0)
                {
                    btn1.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        //send data

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bt1.isChecked())
                {
                    String getdata = bt1.getText().toString();
                    them = getdata;
                    Toast.makeText(MainActivity.this, ""+getdata, Toast.LENGTH_SHORT).show();
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bt2.isChecked())
                {
                    String getdata = bt2.getText().toString();
                    them = getdata;
                    Toast.makeText(MainActivity.this, ""+getdata, Toast.LENGTH_SHORT).show();
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bt1.isChecked())
                {
                    String getdata = bt3.getText().toString();
                    them = getdata;
                    Toast.makeText(MainActivity.this, ""+getdata, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String temp = ed1.getText().toString();
                    txt3.setText(temp + "+" + them);
                    Toast.makeText(MainActivity.this, "Gửi thành công", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    txt3.setText("Bà con chọn đuê chọn đuê");
                    ed1.setText("");
                    bt1.setChecked(false);
                    bt2.setChecked(false);
                    bt3.setChecked(false);
                    Toast.makeText(MainActivity.this, "Đặt lại thành công", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
