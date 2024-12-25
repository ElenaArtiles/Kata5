package software.ulpgc;

import software.ulpgc.control.RandomUsersLoaderCommand;
import software.ulpgc.model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new RandomUsersLoaderCommand().execute();
        for (User user : users) {
            System.out.println(user.getName() + " from " + user.getNationality() + ", email: " + user.getEmail());
        }
    }
}
