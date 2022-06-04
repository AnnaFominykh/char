package com.company;

import java.util.ArrayList;

public class archer_ch implements Character{
    ArrayList<Character> archers=new ArrayList<>();
    int id=1;
    int Health=8;
    int Attack=4;
    int Armour=0;


    public int ID()
    {int ID=0;
        int C_ID;
        C_ID=id;
        id+=1;
        ID+=C_ID;

        return ID;
    }

    public Character add(String name) {

        Character archer = new Character();
        archer.setId(ID());
        archer.setName(name);
        archer.setAttack(Attack);
        archer.setArmour(Armour);
        archer.setHealth(Health);
        archers.add(archer);
return archer;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void setHealth(int health) {

    }

    @Override
    public void setArmour(int armour) {

    }

    @Override
    public void setAttack(int attack) {

    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public int getArmour() {
        return 0;
    }

    @Override
    public int getAttack() {
        return 0;
    }

    public void attack(Character enemy){
        enemy.setHealth(enemy.getHealth()- (this.Attack-enemy.getArmour() ));}

    @Override
    public void archer_piercingShot(Character enemy) {

    }

    @Override
    public void horseman_charge(Character enemy) {

    }

    @Override
    public void spearman_fortify() {

    }


}
