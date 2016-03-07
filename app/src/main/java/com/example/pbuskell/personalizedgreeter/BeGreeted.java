package com.example.pbuskell.personalizedgreeter;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class BeGreeted extends AppCompatActivity {

    String strUsersName = "";

    Button btnGreetMe;
    EditText edtxtNameField;
    EditText edtxtMiddleNameField;
    EditText edtxtLastNameField;
    TextView txtvwGreetingSpace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_greeted);

        btnGreetMe = (Button) findViewById(R.id.btnGreetMe);
        edtxtNameField = (EditText) findViewById(R.id.edtxtNameField);
        edtxtMiddleNameField = (EditText) findViewById(R.id.edtxtMiddleNameField);
        edtxtLastNameField = (EditText) findViewById(R.id.edtxtLastNameField);
        txtvwGreetingSpace = (TextView) findViewById(R.id.txtvwGreetingSpace);
    }

    public void greetTheUser(View vw)
    {
        Resources res = getResources();

        strUsersName = edtxtNameField.getText().toString();
        strUsersName = strUsersName+ " " + edtxtMiddleNameField.getText().toString();
        strUsersName = strUsersName + " " + edtxtLastNameField.getText().toString();

        txtvwGreetingSpace.setText(String.format(res.getString(R.string.strGreeting), strUsersName));
    }
}
