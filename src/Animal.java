public class Animal {

    //Instance Variables
    private String name;
    private int age;
    private boolean vaccinated;

    private String breed;

    //getter methods

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean isVaccinated(){
        return vaccinated;
    }

    public String getBreed(){
        return breed;
    }

    //Constructor

    public Animal(String name, int age, boolean vaccinated, String breed){
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.breed = breed;
    }

    //Methods

    public void adopt(){
        System.out.println("Thanks for adopting me!");
    }

    public void feed(){
        System.out.println("Thanks for feeding me!");
    }

    public void giveWater(){
        System.out.println("Thanks for giving me water");
    }
}
