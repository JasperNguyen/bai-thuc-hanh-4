
package bai4.entities;


public class Person {
    public Person(String name, Integer birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    public Person() {
        this.name = "";
        this.birthday = 0;
    }

    @Override
    public String toString() {
        return String.format(
                "Name: %s;"
                        + "\nBirthday: %s",
                name, birthday);
    }
    
    private String name;
    private Integer birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }
}
