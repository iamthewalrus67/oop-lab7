package db;

public class DataBase extends БазаДаних{
    private БазаДаних dataBase;

    public DataBase() {
        this.dataBase = new БазаДаних();
    }

    public DataBase (БазаДаних dataBase) {
        this.dataBase = dataBase;
    }

    public String getUserData() {
        return dataBase.отриматиДаніКористувача();
    }

    public String getStatisticData() {
        return dataBase.отриматиСтатистичніДані();
    }
}
