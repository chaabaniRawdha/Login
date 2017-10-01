package DSI;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
private String login;
private String pass;

public Connexion(String login, String pass) {
	
	this.login = login;
	this.pass = pass;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
	

//charger driver
/*
Connection cn;
Statement st;
public Statement seConnecter()
{
	Class.forName("com.mysql.jdbc.Driver");
	cn=DriverManager.getConnection("jdbc:mysql//localhost:3306/personne");
	st=cn.createStatement(),"root","");
	return st;
	
	
}
*/
	
	
}
