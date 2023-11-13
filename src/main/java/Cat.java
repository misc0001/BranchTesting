public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public boolean eat(String food) {
        return true;
    }
}
