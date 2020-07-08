public class Over60Member extends DefaultMember {

    private String profession ;

    public Over60Member(String name, int age, String address, int mobileNumber, Date date, String profession){
        super(name, age,address,mobileNumber,date);
        this.profession = profession ;
    }

    public String getProfession(){
        return profession ;
    }

    public void setProfession(String profession){
        this.profession = profession ;
    }

    @Override
    public String toString() {
        return " Students [" +
                "School Name : '" + profession + '\'' + " " + "Name : '" + super.getName() + '\'' + " Age : '" + super.getAge() + '\'' + " Address : '" + super.getAddress() + '\'' + " Number : '" + super.getMobileNumber() + '\'' +
                ']';
    }
}
