public class Manager extends Staff{


    public Manager(String firstName, String lastName, String email, int age, int contact, String gender, int id) {
        super(firstName, lastName, email, age, contact, gender, id);
    }

    @Override
    public void resign() {
        System.out.println("Manager " + getLastName()  + " will resign in 90 days");
    }

    @Override
    public void leave() {
        System.out.println("Manager " + getLastName()  + " will apply for 90 days leave");
    }
}
