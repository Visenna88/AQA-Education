package mypackage;

public class testClassMethod {

    public static void main(String[] args) {
        int x = 4;
        int y = 4;

        String name = "Oksana";
        showSomeToPerson(name, x, y);

    }

    static void getMultiple (int x, int y){
        int multiple1;
        multiple1 = x*y;
        System.out.println("Multiple is: "+ multiple1);
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name + "! I am your try");
    }

    static void showSomeToPerson (String name, int x, int y) {
        System.out.println("Start");
        sayHello(name);
        getMultiple(x, y);
        System.out.println("End");
    }
}
