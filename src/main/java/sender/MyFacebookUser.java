package sender;

import facebook.FacebookUser;

import java.util.Date;

public class MyFacebookUser implements User {
    private FacebookUser user;

    public MyFacebookUser(FacebookUser facebookUser) {
        this.user = facebookUser;
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public Date getLastActiveTime() {
        return user.getLastActiveTime();
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }
}
