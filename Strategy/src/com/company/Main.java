package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Test test=new Test();
        archer_ch ar = new archer_ch();
        horseman_ch hr = new horseman_ch();
        spearman_ch sp = new spearman_ch();
       Squad squad= new Squad();
        Attack attack=new Attack();
        attack.attack(10);
        squad.addSpearman(new spearman_ch(),"spearmen1");
        squad.addArcher(new archer_ch(),"archer1");
        squad.addHorseman(new horseman_ch(),"horseman1");
test.attack_test(squad.spearmen.get(0),squad.archers.get(0));
test.piesingshot_test(squad.archers.get(0),squad.horsemen.get(0));
test.charge_test(squad.horsemen.get(0),squad.spearmen.get(0));
test.fortify_test(squad.spearmen.get(0));
    }
}
