package com.premierleague.premier_zone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class PremierZoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PremierZoneApplication.class, args);
		String url = "jdbc:mysql://127.0.0.1:3306/premier_league";
		String user = "root";
		String password = "parola";

		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Conexiune reușită!");
			connection.close();
		} catch (SQLException e) {
			System.out.println("Eroare la conectare: " + e.getMessage());
		}
	}

}
