package com.company;

public class Test {
    boolean chek;

    public void attack_test(Character a, Character enemy)

        {a.attack(enemy);
        if(enemy.getHealth()- (a.getAttack()-enemy.getArmour())==enemy.getHealth()- a.getAttack())
        {chek=true;}
        else {chek=false;}
        System.out.println(chek);
    }

   public  void piesingshot_test(Character a, Character enemy)
    {a.archer_piercingShot(enemy);
        if (enemy.getHealth() == enemy.getHealth()- a.getAttack()){chek=true;}
        else {chek=false;}
        System.out.println(chek);
    }
    public void charge_test(Character a, Character enemy){
        a.horseman_charge(enemy);
if(enemy.getHealth()==enemy.getHealth()-a.getAttack()*2){chek=true;}
else {chek=false;}
        System.out.println(chek);
}
public void fortify_test(Character a)
{a.spearman_fortify();
if (a.getArmour() == a.getArmour() + 2){chek=true;}
else {chek=false;}
    System.out.println(chek);
}

}
