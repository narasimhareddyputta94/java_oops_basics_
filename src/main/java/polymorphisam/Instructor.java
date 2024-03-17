package polymorphisam;

public class Instructor extends User{

    public String Department;
    public String Course;
    String instructorName;
    String instructorEmail;
    String instructorPhone;
    String instructorAddress;
    String instructorDepartment;
    String instructorSpecialization;
    String instructorExperience;
    String instructorQualification;
    String instructorDesignation;
    String instructorSalary;

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    
    public String getInstructorName() {
        return instructorName;
    }
    
    public void setInstructorEmail(String instructorEmail) {
        this.instructorEmail = instructorEmail;
    }
    
    public String getInstructorEmail() {
        return instructorEmail;
    }
    
    public void setInstructorPhone(String instructorPhone) {
        this.instructorPhone = instructorPhone;
    }
    
    public String getInstructorPhone() {
        return instructorPhone;
    }
    
    public void setInstructorAddress(String instructorAddress) {
        this.instructorAddress = instructorAddress;
    }
    
    public String getInstructorAddress() {
        return instructorAddress;
    }
    
    public void setInstructorDepartment(String instructorDepartment) {
        this.instructorDepartment = instructorDepartment;
    }
    
    public String getInstructorDepartment() {
        return instructorDepartment;
    }
    
    public void setInstructorSpecialization(String instructorSpecialization) {
        this.instructorSpecialization = instructorSpecialization;
    }

    Instructor(String Username, String Password) {
        super(Username, Password);

    }

    public String getInstructorSpecialization() {
        return instructorSpecialization;
    }

    public void setInstructorExperience(String instructorExperience) {
        this.instructorExperience = instructorExperience;
    }

    public String getInstructorExperience() {
        return instructorExperience;
    }

    public void setInstructorQualification(String instructorQualification) {
        this.instructorQualification = instructorQualification;
    }

    public String getInstructorQualification() {
        return instructorQualification;
    }

    public void setInstructorDesignation(String instructorDesignation) {
        this.instructorDesignation = instructorDesignation;
    }

    public String getInstructorDesignation() {
        return instructorDesignation;
    }



}
