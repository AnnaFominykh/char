package com.company;

public interface Character {
    private int id;
    private String name;
    private int Health;
    private int Attack;
    private int Armour;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setHealth(int health) {
        this.Health=health;
    }
    public void setArmour(int armour) {
        this.Armour=armour;
    }


    public void setAttack(int attack) {
        this.Attack=attack;
    }


    public int getHealth() {
        return this.Health;
    }
    public int getArmour(){
        return  this.Armour;
    }


    public int getAttack() {
        return this.Attack;
    }
    public void attack(Character enemy){
        enemy.setHealth(enemy.getHealth()- (this.Attack-enemy.getArmour() ));}
    public void archer_piercingShot(Character enemy){
        enemy.setHealth(enemy.getHealth()- this.Attack);}
    public void horseman_charge(Character enemy){
            enemy.setHealth(enemy.getHealth()-this.Attack*2);
        }
    public void spearman_fortify (){
        this.Armour+=2;
    }
    }


