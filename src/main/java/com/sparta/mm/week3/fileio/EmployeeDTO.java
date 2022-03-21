package com.sparta.mm.week3.fileio;

public class EmployeeDTO {
    public String getEmpID() {
        return empID;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleInitials() {
        return middleInitials;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGander() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getDob() {
        return dob;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public String getSalary() {
        return salary;
    }

    private String empID;
    private String namePrefix;
    private String firstName;
    private String middleInitials;
    private String lastName;
    private String gender;
    private String email;
    private String dob;
    private String dateOfJoining;
    private String salary;

    public EmployeeDTO(String empID, String namePrefix, String firstName, String middleInitials, String lastName, String gander, String email, String dob, String dateOfJoining, String salary) {
        this.empID = empID;
        this.namePrefix = namePrefix;
        this.firstName = firstName;
        this.middleInitials = middleInitials;
        this.lastName = lastName;
        this.gender = gander;
        this.email = email;
        this.dob = dob;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
    }


}
