package week3.day3A;

public class BasePage {
	
	// Common methods for interacting with web elements
    public void findElement(String element) {
        System.out.println("Finding element: " + element);
    }

    public void clickElement(String element) {
        System.out.println("Clicking element: " + element);
    }

    public void enterText(String element, String text) {
        System.out.println("Entering text '" + text + "' into element: " + element);
    }

    // Method to be overridden in the subclass
    public void performCommonTasks() {
        System.out.println("Performing common tasks in BasePage");
    }

	public static void main(String[] args) {



	}

}
