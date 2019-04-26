package com.example.syyx2.worldcup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_main = findViewById(R.id.tv_homePage);

        TextView tv_topScorer = findViewById(R.id.tv_topScorer);
        tv_topScorer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Activity_main.this,Activity_topScorer.class);
                startActivity(intent);
            }
        });

        TextView tv_team = findViewById(R.id.tv_team);
        tv_team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Activity_main.this,Activity_team.class);
                startActivity(intent);
            }
        });

        TextView tv_news1 = findViewById(R.id.tv_news01Detail);
        tv_news1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Activity_main.this,Activity_news.class);
                startActivity(intent);
            }
        });


    }
}
