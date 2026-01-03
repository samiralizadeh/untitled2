public class Shelter implements AdoptionService {

    @Override
    public void adopt(Pet pet) {
        System.out.println("Shelter adopted pet: " + pet.name);
    }
}
