package vijay.projects.betavarient.LambdaAndStreams.Lambda;

public class Main {
    public static void main(String[] args) {
//        Using implementation
        Greetings greetings = new HelloGreeting();
        greetings.sayHello();

//        Using override
        Greetings overrideGreeting = new Greetings() {
            @Override
            public void sayHello() {
                System.out.println("Hello World !! using Override");
            }
        };

        overrideGreeting.sayHello();

//        Using lambda

        Greetings lambdaGreeting = () -> {
            System.out.println("Hello World !!! using lambda");
        };
        lambdaGreeting.sayHello();
    }
}
