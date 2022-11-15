package com.example.mobiledev;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
EditText n1;
EditText n2;
EditText n3;
EditText n4;
AlertDialog.Builder builder;
Button register, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.editText1);
        n2 = findViewById(R.id.editText2);
        n3 = findViewById(R.id.editText3);
        n4 = findViewById(R.id.editText4);
        register = findViewById(R.id.button1);
        cancel = findViewById(R.id.button2);
        builder = new AlertDialog.Builder(this);

        register.setOnClickListener(v -> CreateAlertDialog());

    }
        private void CreateAlertDialog(){

            Button[] buttons=new Button[]{register, cancel};
            for (Button b: buttons) {
                 String no1 = n1.getText().toString();
                 String no2 = n2.getText().toString();
                 String no3 = n3.getText().toString();
                 String no4 = n4.getText().toString();
                if(b.equals(register) ) {
                    builder.setTitle("Registration Form")
                            .setMessage(no1 + no2 + no3 + no4)
                            .setPositiveButton("Ok", (dialog, which) -> finish())
                            .show();
                    return;
                    }
                }
            }
        }
