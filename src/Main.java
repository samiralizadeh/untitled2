public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Pet("Buddy");
        Pet pet2 = new Pet("Luna");

        AdoptionService a1 = new Shelter();
        AdoptionService a2 = new Adopter();

        a1.adopt(pet1)
        a2.adopt(pet2);
    }
}
