package com.example.syyx2.worldcup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity_topScorer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_scorer);

        TextView tv_main = findViewById(R.id.tv_homePage);
        tv_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Activity_topScorer.this,Activity_main.class);
                startActivity(intent);
            }
        });

        TextView tv_topScorer = findViewById(R.id.tv_topScorer);

        TextView tv_team = findViewById(R.id.tv_team);
        tv_team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Activity_topScorer.this,Activity_team.class);
                startActivity(intent);
            }
        });
    }
}
