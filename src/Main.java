public class Main {
    public static void main(String[] args) {
        Staff Staff = new Staff(
                "Anne",
                "Ananwune",
                "agbo@gmail.com",
                15,
                1234,
                "female",
                5
        );
        System.out.println(Staff.getFirstName());
        Staff.resign();
        Staff.leave();
        Staff.leave("sick");


        Applicant Applicant1 = new Applicant("Ada",
                "Agbo",
                "anne@gmail.com",
                23,
                253463,
                "female"

        );
        CEO CEO = new CEO(
                "Oge",
                "Agbo",
                "anne@gmail.com",
                23,
                253463,
                "female",
                10
        );
        CEO.resign();


        Manager Manager = new Manager(
                "Oge",
                "Agbo",
                "anne@gmail.com",
                23,
                253463,
                "female",
                10
        );
        Manager.resign();

        Accountant Accountant = new Accountant(
                "Oge",
                "Agbo",
                "anne@gmail.com",
                23,
                253463,
                "female",
                10
        );
        Accountant.resign();
        CEO.paySalary();
        CEO.hire(Applicant1);
    }


}