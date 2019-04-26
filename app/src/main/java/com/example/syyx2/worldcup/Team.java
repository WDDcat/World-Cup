package com.example.syyx2.worldcup;

public class Team {
    private String team_name;
    private int team_icon_id;
    private int num_of_match;
    private int num_of_win;
    private int num_of_tie;
    private int num_of_lose;
    private int score_loss_ratio;
    private int bonus;


    public Team(String name, int id){
        this.team_name = name;
        this.team_icon_id = id;
    }

    public void setTeamData(int match, int win, int tie, int lose, int ratio, int b){
        num_of_match = match;
        num_of_win = win;
        num_of_tie = tie;
        num_of_lose = lose;
        score_loss_ratio = ratio;
        bonus = b;
    }

    public String getName(){
        return team_name;
    }

    public int getTeamIconId(){
        return team_icon_id;
    }

    public int getNum_of_match(){return num_of_match;}

    public int getNum_of_win(){return num_of_win;}

    public int getNum_of_tie(){return num_of_tie;}

    public int getNum_of_lose(){return num_of_lose;}

    public int getRatio(){return score_loss_ratio;}

    public int getBonus(){return bonus;}




}
