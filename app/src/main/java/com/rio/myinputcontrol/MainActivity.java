package com.rio.myinputcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    EditText emailEditText;
    EditText passwordEditText;
    RadioGroup genderRadioGrop;
    RadioButton genderradioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailEditText = findViewById(R.id.email_ET);
        passwordEditText =findViewById(R.id.password_ET);
        genderRadioGrop = findViewById(R.id.gender_RG);
        genderradioButton = findViewById(R.id.male_RB);
    }

    public void submit(View view) {
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        int selectedRadioButtonID = genderRadioGrop.getCheckedRadioButtonId();
        RadioButton selectRadioButtom = findViewById(selectedRadioButtonID);
        String gender = selectRadioButtom.getText().toString();

        StringBuffer selectedCourses = new StringBuffer().append(" Courses: ");

        if (((CheckBox) findViewById(R.id.web_CB)).isChecked()) {
            selectedCourses.append(" Web Programming");
        }
        if (((CheckBox) findViewById(R.id.mobile_CB)).isChecked()) {
            selectedCourses.append(" Mobile Programming");
        }
        Toast.makeText(this, " Email : " + email + " Password : " + password + " Gender : " + gender + " Courses: " + selectedCourses,  Toast.LENGTH_SHORT).show();
    }
}