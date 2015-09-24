package com.example;

public class GymOrganization {
    public static void main(String[] args)
    {
        String gym1, gym2, gym3;
        int generated;
        int[] players = {6, 6, 6};
        String[] type = {"place holder", "waiting", "why"};

        while (players[1] == 6 || players[2] == 6 || players[0] == 6 )
        {
            generated = (int) (Math.random()*3);
            if(players[0] == 6)
            {
                players[0] = generated;
            }
            if(players[1] == 6 && generated != players[0])
            {
                players[1] = generated;
            }
            if(players[2] == 6 && generated != players[0] && generated != players[1] )
            {
                players[2] = generated;
            }
        }
        System.out.println(players[0] + " " + players[1] + " " + players[2]);

        for(int i = 0; i < 3; i++)
        {
            generated = (int) (Math.random()*18);

            if(generated == 0) {
                type[players[i]] = "normal";
            }
            else if(generated == 1)
            {
                type[players[i]] = "fire";
            }
            else if(generated == 2)
            {
                type[players[i]] = "fighting";
            }
            else if(generated == 3)
            {
                type[players[i]] = "water";
            }
            else if(generated == 4)
            {
                type[players[i]] = "flying";
            }
            else if(generated == 5)
            {
                type[players[i]] = "grass";
            }
            else if(generated == 6)
            {
                type[players[i]] = "poison";
            }
            else if(generated == 7)
            {
                type[players[i]] = "electric";
            }
            else if(generated == 8)
            {
                type[players[i]] = "ground";
            }
            else if(generated == 9)
            {
                type[players[i]] = "psychic";
            }
            else if(generated == 10)
            {
                type[players[i]] = "rock";
            }
            else if(generated == 11)
            {
                type[players[i]] = "ice";
            }
            else if(generated == 12)
            {
                type[players[i]] = "bug";
            }
            else if(generated == 13)
            {
                type[players[i]] = "dragon";
            }
            else if(generated == 14)
            {
                type[players[i]] = "ghost";
            }
            else if(generated == 15)
            {
                type[players[i]] = "dark";
            }
            else if(generated == 16)
            {
                type[players[i]] = "steel";
            }
            else if(generated == 17)
            {
                type[players[i]] = "fairy";
            }

            if((type[i] == type[0] && 0 != i) || (type[i] == type[1] && 1 != i) || (type[i] == type[2] && 2 != i))
            {
                i--;
            }



        }
        players[0]++;
        players[1]++;
        players[2]++;

        System.out.println("Player " + players[0] + " is the " +  type[0] + " type gym");
        System.out.println("Player " + players[1] + " is the " +  type[1] + " type gym");
        System.out.println("Player " + players[2] + " is the " +  type[2] + " type gym\n");

        System.out.println("Player " + players[0] + " will face Player " + players[1]);
        System.out.println("Player " + players[0] + " will face Player " + players[2]);
        System.out.println("Player " + players[1] + " will face Player " + players[2]);



    }
}
