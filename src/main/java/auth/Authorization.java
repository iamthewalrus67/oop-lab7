package auth;

import db.DataBase;

public class Authorization extends Авторизація{
    private Авторизація authorization;

    public Authorization () {
        this.authorization = new Авторизація();
    }

    public Authorization (Авторизація authorization) {
        this.authorization = authorization;
    }

    public boolean authorize(DataBase dataBase) {
        dataBase.getUserData();
        return true;
    }
}
