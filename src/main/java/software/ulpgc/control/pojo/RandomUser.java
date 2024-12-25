package software.ulpgc.control.pojo;

public class RandomUser {
    private String gender;
    private Name name;
    private String email;
    private Location location;

    public String getGender() {
        return gender;
    }

    public Name getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Location getLocation() {
        return location;
    }

    public record Name(String title, String first, String last){}
    public record Location(String city, String state, String country){}
}
