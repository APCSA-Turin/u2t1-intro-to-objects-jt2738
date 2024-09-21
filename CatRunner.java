public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat( "daisy", 8, 10.56);
        cat1.introduce();
        cat1.printCatInfo();
        System.out.println();
        // creates second cat object
        Cat cat2 = new Cat("bill", 4, 12.00);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
