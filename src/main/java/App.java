/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello Java world .";
    }

    private void welcome() {
		// TODO Auto-generated method stub
    	System.out.println("Welcome :  Axelor");
	}
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        new App().welcome();
    }
}
