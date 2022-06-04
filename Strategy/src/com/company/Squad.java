package com.company;

import java.util.ArrayList;

public class Squad
{
    ArrayList<Character> archers=new ArrayList<>();
    ArrayList<Character> spearmen=new ArrayList<>();
    ArrayList<Character> horsemen=new ArrayList<>();

    public void addArcher(archer_ch newArcher,String name){
        archers.add(newArcher.add(name));
    }
    public void addSpearman(spearman_ch newSpearman,String name){
        spearmen.add(newSpearman.add(name));
    }
    public void addHorseman(horseman_ch newHorseman,String name){
        horsemen.add(newHorseman.add(name));
    }

    public int totalStrength(){
        int total =0;
        for(int i=0;i<archers.size();i++){
            total+=archers.get(i).getAttack();
        }
        for(int i=0;i<spearmen.size();i++){
            total+=spearmen.get(i).getAttack();
        }
        for(int i=0;i<horsemen.size();i++){
            total+=horsemen.get(i).getAttack();
        }
        return total;
    }
    public void all_Archers(){
        for(int i=0;i<archers.size();i++){
        System.out.println(archers.get(i).getId()+" "+archers.get(i).getName()+" "+archers.get(i).getAttack()+" "+
                archers.get(i).getHealth()+" "+archers.get(i).getArmour());
    }}
        public void all_Spearmans(){
            for(int i=0;i<spearmen.size();i++){
                System.out.println(spearmen.get(i).getId()+" "+spearmen.get(i).getName()+" "+spearmen.get(i).getAttack()
                        +" "+ spearmen.get(i).getHealth()+" "+spearmen.get(i).getArmour());
            }
}
    public void all_Horsemans(){
        for(int i=0;i<horsemen.size();i++){
            System.out.println(horsemen.get(i).getId()+" "+horsemen.get(i).getName()+" "+horsemen.get(i).getAttack()+" "+
                    horsemen.get(i).getHealth()+" "+horsemen.get(i).getArmour());
        }
    }}
