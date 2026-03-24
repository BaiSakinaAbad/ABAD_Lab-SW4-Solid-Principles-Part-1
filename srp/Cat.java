public class Cat implements PetHabit{
    @Override
    public String makeSound(){
        return "Meow...";
    }

    @Override
    public String eat(){
        return "Licking Milk...";
    }
}