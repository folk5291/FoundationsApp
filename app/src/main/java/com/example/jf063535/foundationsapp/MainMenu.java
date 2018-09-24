package com.example.jf063535.foundationsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainMenu extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCurrentBudgetActivity();
            }
        });

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPreviousBudgetActivity();
            }
        });
    }

        private void openCurrentBudgetActivity() {
            Intent intent = new Intent(this, CurrentBudgetActivity.class);
            startActivity(intent);
        }

        private void openPreviousBudgetActivity() {
            Intent intent1 = new Intent(this, PreviousBudgetActivity.class);
            startActivity(intent1);
        }
    }
