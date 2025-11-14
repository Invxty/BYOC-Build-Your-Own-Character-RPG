
class Player {
    static int hp = 100; 
}


class MonsterClass {
    String name;
    int atk;
    int hp;
    int def;
    int sp;

    
    MonsterClass(String name, int atk, int hp, int def, int sp) {
        this.name = name;
        this.atk = atk;
        this.hp = hp;
        this.def = def;
        this.sp = sp;
    }

    
    public void attack() {
        System.out.println(this.name + " attacks for " + this.atk + " damage!");
        Player.hp -= this.atk;
        System.out.println("Player HP is now: " + Player.hp);
    }
}


class Boss extends MonsterClass { 
    int phases;
    String ability; 
  
    Boss(String name, int atk, int hp, int def, int sp, int phases, String ability) {
        
        super(name, atk, hp, def, sp); 
        this.phases = phases;
        this.ability = ability;
    }

    
    public void abilityUse() {
        System.out.println(this.name + " uses a special ability!");
        System.out.println(this.name + this.ability);
    }
}


public class Main {
    public static void main(String[] args) {
        
        Boss Boarking = new Boss("Boar king", 50, 1000, 20, 10, 0," is now charing a heavy attack for 2 rounds!");
        MonsterClass slime = new MonsterClass("Slime", 25, 500, 10, 5);
        
        Boarking.attack(); //sample boss attack
        Boarking.abilityUse(); //sample ability use, not sure pa pano 'to iimplement

        slime.attack(); //Common enemy attack
    }
}