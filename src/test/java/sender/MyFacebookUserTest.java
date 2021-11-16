package sender;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {
    MyFacebookUser myFacebookUser;
    FacebookUser facebookUser;

    @BeforeEach
    void setUp() {
        facebookUser = new FacebookUser("hello@hello.com", "Ukraine", new Date());
        myFacebookUser = new MyFacebookUser(facebookUser);
    }

    @Test
    void getCountry() {
        assertEquals(facebookUser.getCountry(), myFacebookUser.getCountry());
    }

    @Test
    void getLastActiveTime() {
        assertEquals(facebookUser.getLastActiveTime(), myFacebookUser.getLastActiveTime());
    }

    @Test
    void getEmail() {
        assertEquals(facebookUser.getUserMail(), myFacebookUser.getEmail());
    }
}