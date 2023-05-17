package Lesson8;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String city = "Санкт-петербург";

        try {
            DBHandler dbHandler = new DBHandler();
            dbHandler.addWeatherCity(city);
            dbHandler.selectAllWeather();
            System.out.println("----------");
            dbHandler.selectWeatherDate("2021-12-25");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}