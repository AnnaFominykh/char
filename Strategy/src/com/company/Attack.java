package com.company;

public class Attack {
    public void attack(int a ) {

        Character spearman1 = new Character();
        spearman_ch spearman_ch = new spearman_ch();
        Character archer1=new Character();
        spearman_ch.attack(archer1);
        spearman1.setAttack(a);
        System.out.println(spearman1.getAttack());
    }
}
