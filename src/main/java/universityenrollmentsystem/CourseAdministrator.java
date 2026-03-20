package universityenrollmentsystem;

public class CourseAdministrator extends Person {
    private String adminRole;
    private int yearsOfExperience;

    public CourseAdministrator (String name, String surname, String adminRole){
        super(name, surname);
        this.adminRole = adminRole;
        yearsOfExperience = 0;
    }

    public void setAdminrole (String adminrole){
        this.adminRole = adminrole;
    }
    public void setyearsOfExperieince (int yearsofexperience){
        this.yearsOfExperience = yearsofexperience;
    }

    public String getAdminRole(){
        return adminRole;
    }
    public int getYearsOfExperience(){
        return yearsOfExperience;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "Course - admin role: " + adminRole +
                "\n Years of experience: " + yearsOfExperience;
    }

}
