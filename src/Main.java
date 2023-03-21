public class Main {

    public static void main(String[] args){
        //Animal
        Animal myAnimal = new Animal("hops", 5, true, "bunny");
        System.out.println(myAnimal.getName());
        System.out.println(myAnimal.getAge());
        System.out.println(myAnimal.getBreed());
        System.out.println(myAnimal.isVaccinated());
        myAnimal.adopt();
        myAnimal.feed();
        myAnimal.giveWater();

        //Dog
        Dog myDog = new Dog("fluffy", 10, false, "poodle", false, "Woooof");
        System.out.println(myDog.getName());
        System.out.println(myDog.getAge());
        System.out.println(myDog.getBreed());
        System.out.println(myDog.isVaccinated());
        myDog.adopt();
        myDog.feed();
        myDog.giveWater();
        System.out.println(myDog.getHasBeenWalked());
        myDog.walk();
        System.out.println(myDog.getHasBeenWalked());
        System.out.println(myDog.getBarkSound());
        myDog.scratchBack();

        //Cat
        Cat myCat = new Cat("Carol", 6, true, "orange", false, true);
        System.out.println(myCat.getName());
        System.out.println(myCat.getAge());
        System.out.println(myCat.getBreed());
        System.out.println(myCat.isVaccinated());
        myCat.adopt();
        myCat.feed();
        myCat.giveWater();
        System.out.println(myCat.getHasPlayedWith());
        myCat.play();
        System.out.println(myCat.getHasPlayedWith());
        System.out.println(myCat.doesLikeLaser());
        myCat.meow();
    }
}
