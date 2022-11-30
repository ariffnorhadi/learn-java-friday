public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Programmer developer = new Programmer();
        developer.testing();
    }
}

class Employee {
    int salary = 4000;
}

class Programmer extends Employee {
    public void testing(){
        System.out.println("hello");
    }

    public void testing_one(){
        int number = 500;
        int total = number + 400;
        System.out.println("total: "+ total);
    }
}