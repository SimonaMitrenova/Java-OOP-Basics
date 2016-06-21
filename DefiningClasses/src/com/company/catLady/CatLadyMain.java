package com.company.catLady;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CatLadyMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Cat> cats = new HashMap<>();
        while (true){
            String command = reader.readLine();
            if (command.equals("End")){
                break;
            }
            String[] params = command.split("\\s+");
            String breed = params[0];
            String name = params[1];
            String n = params[2];
            switch (breed){
                case "Siamese":
                    Siamese siamese = new Siamese(name, n);
                    cats.put(name, siamese);
                    break;

                case "Cymric":
                    Cymric cymric = new Cymric(name, n);
                    cats.put(name, cymric);
                    break;

                case "StreetExtraordinaire":
                    StreetExtraordinaire streetExtraordinaire = new StreetExtraordinaire(name, n);
                    cats.put(name, streetExtraordinaire);
                    break;
            }
        }

        String searchedCat = reader.readLine();
        System.out.println(cats.get(searchedCat));
    }
}
