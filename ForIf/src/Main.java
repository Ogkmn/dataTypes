public class Main {

    public static void main(String[] args) {

        // Zoo & person assigment;
        Person p1 = new Person("Onur",1);
        Person p2 = new Person("Tim",10);
        Person p3 = new Person("Ruslan",30);

        Zoo zoo  = new Zoo();
        int price1 = zoo.calculatePrice(p1);
        int price2 = zoo.calculatePrice(p2);
        int price3 = zoo.calculatePrice(p3);

        StringBuilder sb  = new StringBuilder("Your ticket price is ").append(price1).append(" euro ");
        StringBuilder sb2  = new StringBuilder("Your ticket price is ").append(price2).append(" euro ");
        StringBuilder sb3  = new StringBuilder("Your ticket price is ").append(price3).append(" euro ");

        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb3);

        // Arrays/Loops
        int[] numbers = new int[]{1,2,3,4,5};
        for(int i:numbers){
            System.out.println(i);
        }

        for(int i = 0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        // Exception: ArrayOutOfBoundsException
        /*for(int i = 0; i<numbers.length;i++){
            System.out.println(numbers[i+1]);
        }*/

        printPyramid(5);
    }

    public static void printPyramid(int size) {
        for(int i = 0; i<size;i++){
            for(int j = 0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}