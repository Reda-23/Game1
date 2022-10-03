package gameio;

public class Player implements Shooting{

    private String name;
    private String weapon;
    private int health;




    public Player(String name, String weapon, int health){
            this.name = name;
            this.weapon = weapon;
            if(health < 0 || health >100){
                    this.health = 100;
            }else {
                this.health = health;
            }
    }


    public void damageByGun1(String weapon){
        System.out.println(  getName() +" Got shot by " + weapon);
       this.health -= 30;

        if(this.health <= 0){
                this.health = 0;
            System.out.println("You're Dead");
        }else {  System.out.println(  "You're  health is " + health);}
    }

    public void damageByGun2(String weapon){
        System.out.println(  getName()+" Got shot by " + weapon);
        this.health -= 50;

        if(this.health <= 0){
            this.health = 0;
            System.out.println("You're Dead");
        }else {  System.out.println( "  You're health is " + health);}
    }

    public void heal(){
        System.out.println("Using the healing Skill");
        if(this.health < 100){
               this.health = 100;
        }
        System.out.println("You're healed you're new health Is "+health);
    }


    @Override
    public String printPlayer() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", health=" + health +
                '}';

    }


    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }
}
