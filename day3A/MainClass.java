package week3.day3A;

public class MainClass {

	public static void main(String[] args) {


		// Create an object of the BasePage class
        BasePage basePage = new BasePage();

        // Call methods from the BasePage class
        basePage.findElement("username");
        basePage.clickElement("loginButton");
        basePage.enterText("passwordField", "secretpassword");
        basePage.performCommonTasks();  // Calls the BasePage version of performCommonTasks

        // Create an object of the LoginPage class
        LoginPage loginPage = new LoginPage();

        // Call methods from the LoginPage class
        loginPage.findElement("username");
        loginPage.clickElement("loginButton");
        loginPage.enterText("passwordField", "secretpassword");
        loginPage.performCommonTasks();

	}

}
