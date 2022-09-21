public class Staff extends personnel {
    private int id;


    public Staff(String firstName, String lastName, String email, int age, int contact, String gender, int id) {
        super(firstName, lastName, email, age, contact, gender);
        this.id = id;
    }

    public void resign(){
        System.out.println("Staff " + " with id:" + id + " will resign in 30 days");
    }
    public void leave(){
        System.out.println("Staff " + " with id: " + id + " will apply for annual leave");
    }
    public void leave(String reason){
        System.out.println("Staff " + " with id: " + id + " will apply for " + reason +" leave");
    }
}
