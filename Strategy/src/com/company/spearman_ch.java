package com.company;

import java.util.ArrayList;

public class spearman_ch implements Character{
    ArrayList<Character> spearmen=new ArrayList<>();
    int id=1;
    int Health=14;
    int Attack=2;
    int Armour=2;

    public int ID()
    {int ID=0;
        int C_ID;
        C_ID=id;
        id+=1;
        ID+=C_ID;

        return ID;
    }

    public Character add(String name) {

        Character spearman = new Character();
        spearman.setId(ID());
        spearman.setName(name);
        spearman.setAttack(Attack);
        spearman.setArmour(Armour);
        spearman.setHealth(Health);
        spearmen.add(spearman);
        return spearman;
    }

    public void fortify (){
        this.Armour+=2;

    }
    public void attack(Character enemy){
        enemy.setHealth(enemy.getHealth()- (this.Attack-enemy.getArmour() ));}
}

