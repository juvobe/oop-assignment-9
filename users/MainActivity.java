package com.example.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editFirstName;
    private EditText editLastName;
    private EditText editEmail;
    private String degreeProgram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void addUser(View view){

        editFirstName = findViewById(R.id.editFirstName);
        editLastName = findViewById(R.id.editLastName);
        editEmail = findViewById(R.id.editEmail);

        RadioGroup rgDegreeProgram = findViewById(R.id.rgDegreeProgram);

        switch(rgDegreeProgram.getCheckedRadioButtonId()){
            case R.id.rbTite:
                degreeProgram = "Tietotekniikka";
                break;
            case R.id.rbTuta:
                degreeProgram = "Tuotantotalous";
                break;
            case R.id.rbLate:
                degreeProgram = "Laskennallinen tekniikka";
                break;
            case R.id.rbSate:
                degreeProgram = "Sähkötekniikka";
                break;
        }
        String firstName = editFirstName.getText().toString();
        String lastName = editLastName.getText().toString();
        String email = editEmail.getText().toString();
        userStorage.getInstance().addUser(new User(firstName, lastName, email, degreeProgram));
    }

    public void switchToUserList(View view){
        Intent intent = new Intent(this, UserListActivity.class);
        startActivity(intent);
        userStorage.getInstance().listUsers();
    }
}