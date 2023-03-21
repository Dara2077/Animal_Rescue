
public class Dog extends Animal{

    private boolean hasBeenWalked;
    private String barkSound;

    public Dog(String name, int age, boolean vaccinated, String breed, boolean hasBeenWalked, String barkSound){
        super(name, age, vaccinated, breed);
        this.hasBeenWalked = hasBeenWalked;
        this.barkSound = barkSound;
    }

    //Methods

    public void walk(){
        System.out.println("Thanks for walking me");
        hasBeenWalked = true;
    }

    public void scratchBack(){
        System.out.println("Thanks for scratching my back");
    }

    //Getter

    public boolean getHasBeenWalked(){
        return hasBeenWalked;
    }

    public String getBarkSound(){
        return barkSound;
    }
}
