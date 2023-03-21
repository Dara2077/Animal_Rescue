public class Cat extends Animal{

    //Instance variable
    private boolean hasPlayedWith;
    private boolean likesLaser;

    //Constructor
    public Cat(String name, int age, boolean vaccinated, String breed, boolean hasPlayedWith, boolean likesLaser){
        super(name, age, vaccinated, breed);
        this.hasPlayedWith = hasPlayedWith;
        this.likesLaser = likesLaser;
    }

    //Method

    public void play(){
        System.out.println("Thanks for playing with me!");
        hasPlayedWith = true;
    }

    public void meow(){
        System.out.println("MEOOWWW");
    }

    //Getter

    public boolean getHasPlayedWith(){
        return hasPlayedWith;
    }

    public boolean doesLikeLaser(){
        return likesLaser;
    }
}
