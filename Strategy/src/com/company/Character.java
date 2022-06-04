package com.company;

public interface Character {
    int id;
    String name;
    int Health;
    int Attack;
    int Armour;

    default void setName(String name) {
        this.name = name;
    }

    default String getName() {
        return name;
    }

   default void setId(int id) {
        this.id = id;
    }

     default int getId() {
        return id;
    }

    default void setHealth(int health) {
        this.Health=health;
    }
     default void setArmour(int armour) {
        this.Armour=armour;
    }


     default void setAttack(int attack) {
        this.Attack=attack;
    }


     default int getHealth() {
        return this.Health;
    }
     default int getArmour(){
        return  this.Armour;
    }


    default int getAttack() {
        return this.Attack;
    }
    default void attack(Character enemy){
        enemy.setHealth(enemy.getHealth()- (this.Attack-enemy.getArmour() ));}
     default void archer_piercingShot(Character enemy){
        enemy.setHealth(enemy.getHealth()- this.Attack);}
   default void horseman_charge(Character enemy){
            enemy.setHealth(enemy.getHealth()-this.Attack*2);
        }
    default void spearman_fortify (){
        this.Armour+=2;
    }
    }


