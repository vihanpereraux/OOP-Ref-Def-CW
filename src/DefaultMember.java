public class DefaultMember
{
    private String name ;
    private int age ;
    private String address ;
    private int mobileNumber ;
    private Date date ;

    DefaultMember() {}

    public DefaultMember(String name, int age, String address, int mobileNumber, Date date) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.date = date ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DefaultMember{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", mobileNumber=" + mobileNumber +
                '}';
    }

}
