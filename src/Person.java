public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age >= 0 && age <=100 ){
        this.age = age;
        }
        else this.age =0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        if (getAge() > 12 && getAge() <20){
            System.out.println("This is a Teen Age: " + getAge());
            return true;
        }
        else {
            System.out.println("This is not a Teen Age: " + getAge());
            return false;

        }

    }
    public String getFullName(){
        if (getFirstName().isEmpty() && getLastName().isEmpty()){
            //System.out.println("Both Fist Name and Last Name are empty");
            return getFirstName();
        }
        else if (getFirstName().isEmpty()){
            System.out.println("The full Name is " +getLastName());
            return getLastName();
        }
        else if (getLastName().isEmpty()){
            System.out.println("The full Name is " +getFirstName());
            return getFirstName();
        }
        else {
            System.out.println("Full name is " + getFirstName() + " " + getLastName());
            return (getFirstName() + " " + getLastName());
        }
    }

}
