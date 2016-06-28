package com.company.footballTeamGenerator;

import com.company.footballTeamGenerator.models.Player;
import com.company.footballTeamGenerator.models.Team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    private static HashMap<String, Team> teams;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         teams = new HashMap<>();

        while (true){
            String[] input = reader.readLine().split(";");
            if (input[0].equals("END")){
                break;
            }
            try{
                switch (input[0]){
                    case "Team":
                        tryCreateTeam(input);
                        break;

                    case "Add":
                        tryAddPlayer(input);
                        break;

                    case "Remove":
                        tryRemovePlayer(input);
                        break;

                    case "Rating":
                        tryGetRating(input);
                        break;
                }
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void tryGetRating(String[] input) {
        String teamName = input[1];
        if (!teams.containsKey(teamName)){
            throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
        }
        Team team = teams.get(teamName);
        double rating = team.getRating();
        System.out.println(String.format("%s - %.0f", teamName, rating));
    }

    private static void tryRemovePlayer(String[] input) {
        String teamName = input[1];
        if (!teams.containsKey(teamName)){
            throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
        }
        String playerName = input[2];
        Team team = teams.get(teamName);
        team.removePlayer(playerName);
    }

    private static void tryAddPlayer(String[] input) {
        String teamName = input[1];
        if (!teams.containsKey(teamName)){
            throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
        }
        String playerName = input[2];
        int endurance = Integer.valueOf(input[3]);
        int sprint = Integer.valueOf(input[4]);
        int dribble = Integer.valueOf(input[5]);
        int passing = Integer.valueOf(input[6]);
        int shooting = Integer.valueOf(input[7]);
        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
        Team team = teams.get(teamName);
        team.addPlayer(player);
    }

    private static void tryCreateTeam(String[] input) {
        String name = input[1];
        Team team = new Team(name);
        teams.put(name, team);
    }
}
