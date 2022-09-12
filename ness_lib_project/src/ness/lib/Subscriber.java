package ness.lib;

public class Subscriber {
    String firstName;
    String lastName;
    SubscriberAddress address;
    String email;
    int age;

    public Subscriber(String firstName, String lastName, SubscriberAddress address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.age = 0;
    }

    public Subscriber(String firstName, String lastName, SubscriberAddress address, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SubscriberAddress getAddress() {
        return address;
    }

    public void setAddress(SubscriberAddress address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isUnderage() {
        return age < 18;
    }
}
