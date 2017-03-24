package com.example.android.takehomeassignment08_emmal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference studentName = database.getReference("Student Name");
    private DatabaseReference skillRef = database.getReference("Phonics Skill");

    private TextView name;
    private TextView skill;
    private TextView level;
    private CheckBox mastery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.title);
        skill = (TextView) findViewById(R.id.skill);
        level = (TextView) findViewById(R.id.grade);
        mastery = (CheckBox) findViewById(R.id.mastery);
    }

    // onClick
    public void set(View view)
    {

        studentName.setValue(name.getText().toString());

    }

    public void add(View view)
    {
        String n =skill.getText().toString();
        int p=Integer.parseInt(level.getText().toString());
        boolean s=((CheckBox) findViewById(R.id.mastery)).isChecked();
        skillRef.push().setValue(new Phonics(n,p,s));
    }
}
