package sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {

    MyTwitterUser myTwitterUser;
    TwitterUser twitterUser;

    @BeforeEach
    void setUp() {
        twitterUser = new TwitterUser("hello@hello.com", "Ukraine", new Date());
        myTwitterUser = new MyTwitterUser(twitterUser);
    }

    @Test
    void getCountry() {
        assertEquals(twitterUser.getCountry(), myTwitterUser.getCountry());
    }

    @Test
    void getLastActiveTime() {
        assertEquals(twitterUser.getLastActiveTime(), myTwitterUser.getLastActiveTime());
    }

    @Test
    void getEmail() {
        assertEquals(twitterUser.getUserMail(), myTwitterUser.getEmail());
    }
}