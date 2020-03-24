package application;

public class Main {
    public static void main(String[] args){
        if (args.length == 0) {
            View.print("You need to give the name of the file!");
        } else {
            for (int i = 0; i < args.length; i++) {
                Application application = new Application(args[i]);
                application.run();
            }
        }
    }
}
