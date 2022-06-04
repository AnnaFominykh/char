package com.company;

import java.util.ArrayList;

public class horseman_ch implements Character{
    ArrayList<Character> horsemen=new ArrayList<>();
    int id=1;
        int Health=20;
        int Attack=5;
        int Armour=1;


        public int ID()
    {int ID=0;
        int C_ID;
        C_ID=id;
        id+=1;
        ID+=C_ID;

        return ID;
    }

    public Character add(String name) {

        Character horseman = new Character();
        horseman.setId(ID());
        horseman.setName(name);
        horseman.setAttack(Attack);
        horseman.setArmour(Armour);
        horseman.setHealth(Health);
        horsemen.add(horseman);
        return horseman;
    }




    }

