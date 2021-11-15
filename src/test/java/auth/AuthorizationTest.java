package auth;

import db.DataBase;
import db.БазаДаних;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {
    Authorization authorization;
    DataBase dataBase;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dataBase = new DataBase(new БазаДаних());
        authorization = new Authorization(new Авторизація());
    }


    @Test
    void authorize() {
        assertTrue(authorization.authorize(dataBase));
    }
}