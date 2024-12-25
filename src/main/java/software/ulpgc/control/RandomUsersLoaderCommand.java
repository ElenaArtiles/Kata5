package software.ulpgc.control;

import software.ulpgc.model.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RandomUsersLoaderCommand {
    public List<User> execute() {
        List<User> users = new ArrayList<>();
        UserProvider provider = new RandomUserProvider();
        try {
            for(int i=0; i<10; i++) users.add(provider.newUser());
            return users;
        } catch (IOException e) {
            return users;
        }
    }
}
