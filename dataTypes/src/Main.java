public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int number = 8;
        int number2 = 20;
        int result = number * number2;
        System.out.println(result);

        String name = "Onur";
        String age = "24";
        System.out.println("Hi, I am " + name + ", and I am " + age + ".");
        //System.out.printf("Hi, I am %s, and I am %s.",name,age);

        boolean test =false;
        System.out.println(test);
        test  = !test;
        System.out.println(test);

        System.out.println(multiply(5,6));
        System.out.println(multiply(8,20));
        System.out.println(multiply(156,300));

        Person p = new Person("onur", 24);
        p.printInstruction();

        Door d = new Door(1,1,false);
        d.openDoor();
        d.closingDoor();
        d.printOpen();
    }

    public static int multiply(int number1, int number2){
        return number1*number2;
    }


}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printInstruction(){
        System.out.printf("Hi, I am %s, and I am %s years old.\n",this.name,this.age);
    }
}

class Door{
    private double weight;
    private double height;
    private boolean open;

    public Door(int weight, int height, boolean open) {
        this.weight = weight;
        this.height = height;
        this.open = open;
    }

    public void openDoor(){
        this.open = true;
        System.out.println("Opening door.");
    }

    public void closingDoor(){
        this.open = false;
        System.out.println("Closing door.");
    }

    public void printOpen(){
        System.out.printf("The door is open: %b",this.open);
    }

    public double calculateSurface(){
        return this.weight * this.height;
    }


}