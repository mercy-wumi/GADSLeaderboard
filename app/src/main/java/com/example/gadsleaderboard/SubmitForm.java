
package com.example.gadsleaderboard;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputLayout;

public class SubmitForm extends AppCompatActivity {
    TextInputLayout firstname;
    TextInputLayout lastname;
    TextInputLayout email;
    TextInputLayout link;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_form);
        //getActionBar().setDisplayHomeAsUpEnabled(true);

        firstname = findViewById(R.id.first_name);
        lastname = findViewById(R.id.last_name);
        email = findViewById(R.id.email_address);
        link = findViewById(R.id.git_link);
        submit = findViewById(R.id.submit_button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstname.setVisibility(View.GONE);
                lastname.setVisibility(View.GONE);
                email.setVisibility(View.GONE);
                link.setVisibility(View.GONE);

                // added alertdialog

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SubmitForm.this);
                alertDialogBuilder.setMessage("Are you sure?");
                alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(SubmitForm.this, "you are getting there", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

    }
}