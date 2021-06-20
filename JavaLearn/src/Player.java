public class Player {

    // fields
    public String name;
    public int health;
    public String weapon;

    // methods
    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
        }
    }
}
