public class Main {
    public static void main(String[] argv){
        Hamburger hamburger = new Hamburger("Basic","Sausage", 3.56,"White");
        // double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("tomato", 0.27);
        System.out.println(" total price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        healthyBurger.itemizeHamburger();
    }
}
