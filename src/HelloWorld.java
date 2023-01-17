public class HelloWorld {
    private String greeting = "Hello, World!";

    public HelloWorld(String greeting) {
        this.greeting = greeting;
    }
    public void greet() {
        System.out.println(greeting);
    }

    public static void main (String args[]) {
        HelloWorld helloworld = new HelloWorld ("Hi，Java!");
        helloworld.greet () ;
        HelloWorld helloworld2 = new HelloWorld ("Good job!");
        helloworld2.greet () ;
    }
}