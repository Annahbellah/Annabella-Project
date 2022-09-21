public class CEO extends Staff {

    public CEO(String firstName, String lastName, String email, int age, int contact, String gender, int id) {
        super(firstName, lastName, email, age, contact, gender, id);
    }

    @Override
    public void resign() {
        System.out.println("CEO " + getLastName()  + " will resign in 90 days");
    }

    @Override
    public void leave() {
        System.out.println("CEO " + getLastName()  + " will resign in 90 days");
    }

    public void paySalary() {
        System.out.println("CEO directs accountant to pay salary");
    }
    public void hire(Applicant applicant){
        System.out.println("CEO hires applicant " + applicant.getFirstName() + "for the " + "cleaning position");
    }

}
