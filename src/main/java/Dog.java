public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Ruff");
    }

    @Override
    public boolean eat(String food) {
        return false;
    }

    @Override
    public void mood() {
        System.out.println("løvre");
    }
}
