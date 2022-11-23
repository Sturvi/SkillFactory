public abstract class Monster {
    //Fix this class
    private String name;
    private int force;
    private int hp = 15;
    private boolean destroyed = false;

    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    protected int getForce() {
        return force;
    }

    public void attack(Monster monster) {
        monster.hp -= force;
    }

    protected boolean damage(int dhp) {
        hp -= dhp;
        destroyed = hp <= 0 ? true : false;
        return destroyed;
    }

    public boolean isDestroyed(){
        return destroyed;
    }

}
