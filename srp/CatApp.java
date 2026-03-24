public class CatApp {
    public static void main(String[] args) {
        
        Pet newPet = new Pet("Blackie" , "Saki");
        Cat catHabit = new Cat();

        System.out.println("\n Cat Name: " + newPet.getPetName());
        System.out.println("Owner: " + newPet.getOwner());
        System.out.println("Sound: " + catHabit.makeSound());
        System.out.println("Eating: " + catHabit.eat());
    }
}