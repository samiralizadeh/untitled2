public class Adopter implements AdoptionService {

    @Override
    public void adopt(Pet pet) {
        System.out.println("Adopter adopted pet: " + pet.name);
    }
}
