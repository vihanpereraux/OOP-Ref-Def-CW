public class StudentMember extends DefaultMember {

private String schoolName ;


    public StudentMember (String name, int age, String address, int mobileNumber, Date date, String schoolName){
        super(name, age, address, mobileNumber, date);
        this.schoolName = schoolName ;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return " Students [" +
                "School Name : '" + schoolName + '\'' + " " + "Name : '" + super.getName() + '\'' + " Age : '" + super.getAge() + '\'' + " Address : '" + super.getAddress() + '\'' + " Number : '" + super.getMobileNumber() +
                "  Enrolled Date : '" + super.getDate() +'\'' +
                ']';
    }
}
