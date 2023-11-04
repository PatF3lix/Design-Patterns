public interface AnimalInterface {

    void Speak();
}

class Duck implements AnimalInterface {

    @Override
    public void Speak() {
        System.out.println("Duck says Quack-quack");
    }
}

class Tiger implements AnimalInterface {

    @Override
    public void Speak() {
        System.out.println("Tiger says Grrrrrr");
    }
}
