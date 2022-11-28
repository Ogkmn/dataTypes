public class Zoo {


    public int calculatePrice(Person person) {
        if(person.getAge() < 5) return 0;
        int price  = (person.getAge()<12) ? 5 : 12;
        return price;
    }
}
