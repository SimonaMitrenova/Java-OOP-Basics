package com.company.footballTeamGenerator.models;

import java.util.HashMap;

public class Team {
    private String name;
    private HashMap<String, Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public double getRating(){
        if (players.size() == 0){
            return 0;
        }

        double rating = 0.0;
        for (Player player : players.values()) {
            rating += player.getSkillLevel();
        }

        return rating / players.size();
    }

    public void addPlayer(Player player){
        this.players.put(player.getName(), player);
    }

    public void removePlayer(String player){
        if (!players.containsKey(player)){
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.", player, this.name));
        }
        players.remove(player);
    }

    private void setName(String name) {
        if (name == null || name.trim().length() == 0){
            throw new IllegalArgumentException("A name should not be empty. ");
        }
        this.name = name;
    }
}
