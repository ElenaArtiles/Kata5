package software.ulpgc.control;

import software.ulpgc.control.pojo.RandomUser;
import software.ulpgc.model.User;

public class RandomUserAdapter implements UserAdapter<RandomUser>{
    @Override
    public User from(RandomUser object) {
        User user = new User()
                .setName(object.getName().title() + " " +object.getName().first() + " " + object.getName().last())
                .setEmail(object.getEmail())
                .setGender(User.Gender.valueOf(object.getGender()))
                .setNationality(object.getLocation().country());
        return user;
    }
}
