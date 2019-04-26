package com.example.syyx2.worldcup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Activity_team extends AppCompatActivity {

    private List<Team> teamList = new ArrayList<>();

    public String t_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        TextView tv_main = findViewById(R.id.tv_homePage);
        tv_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_team.this, Activity_main.class);
                startActivity(intent);
            }
        });

        TextView tv_topScorer = findViewById(R.id.tv_topScorer);
        tv_topScorer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_team.this, Activity_topScorer.class);
                startActivity(intent);
            }
        });

        TextView tv_team = findViewById(R.id.tv_team);

        initTeams();

        for(int i = 0; i < teamList.size(); i++) {
//            LinearLayout ll_team = new LinearLayout(this);
//            ll_team.setOrientation(LinearLayout.HORIZONTAL);
//            ll_team.setBackgroundColor(0xFF00FFFF);
//            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
//            ll_team.setLayoutParams(params);


            TextView tv_teamNum = findViewById(R.id.tv_team_item_teamNo);
            tv_teamNum.setText(""+ (i + 1));

            ImageView iv_team_item = findViewById(R.id.iv_team_item_teamIcon);
            int imageId = teamList.get(i).getTeamIconId();
            iv_team_item.setImageResource(imageId);

            TextView tv_teamName = findViewById(R.id.tv_team_item_teamName);
            tv_teamName.setText(teamList.get(i).getName());

            LayoutInflater inflater = LayoutInflater.from(this);
            LinearLayout ll_team = findViewById(R.id.ll_team);
            LinearLayout ll_team_item = inflater.inflate(R.layout.item_activity_team, null).findViewById(R.id.ll_team_item);
            ll_team.addView(ll_team_item);




        }







//        inflater = LayoutInflater.from(this);
//        ll_team = findViewById(R.id.ll_team);
//        ll_team_item = inflater.inflate(R.layout.item_activity_team, null).findViewById(R.id.ll_team_item);
//        ll_team_item.setBackgroundColor(0xFFAAAAAA);
//
//
//        tv_teamNum = findViewById(R.id.tv_team_item_teamNo);
//        tv_teamNum.setText(""+ (0 + 1));
//
//        iv_team_item = findViewById(R.id.iv_team_item_teamIcon);
//        imageId = teamList.get(0).getTeamIconId();
//        iv_team_item.setImageResource(imageId);
//
//        tv_teamName = findViewById(R.id.tv_team_item_teamName);
//        tv_teamName.setText(teamList.get(0).getName());
//
//        ll_team.addView(ll_team_item);




    }

    private void initTeams() {
        Team France = new Team("France", R.drawable.team_france);
        France.setTeamData(7,6,1,0,0,0);
        teamList.add(France);
        Team Croatia = new Team("Croatia", R.drawable.team_croatia);
        Croatia.setTeamData(7,6,0,1,0,0);
        teamList.add(Croatia);
        Team Belgium = new Team("Belgium", R.drawable.team_belgium);
        Belgium.setTeamData(7,6,0,1,0,0);
        teamList.add(Belgium);
    }
}
