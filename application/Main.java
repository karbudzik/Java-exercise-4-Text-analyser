package application;

public class Main {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
            Application application = new Application(args[i]);
            application.run();
        }
    }
}
