//bhavin Shuseevan 
//cosc1200
//assignment 4 - products
//essentially its to keep inventory of stuff that can expire and other stuff in the store 
import java.util.ArrayList;
import java.util.Scanner;

// product class
class product {
    private String sku, name, notes;
    private double cost, price;
    private int qty, need;

    // constructors
    public product() {
        this.sku = "00000000";
        this.name = "default";
        this.cost = 0.0;
        this.price = 0.0;
        this.qty = 0;
        this.need = 0;
        this.notes = "none";
    }

    public product(String sku, String name, double cost, double price, int qty, int need, String notes) {
        this.sku = sku;
        this.name = name;
        this.cost = cost;
        this.price = price;
        this.qty = qty;
        this.need = need;
        this.notes = notes;
    }

    // setters
    public void set_sku(String sku) { this.sku = sku; }
    public void set_name(String name) { this.name = name; }
    public void set_cost(double cost) { this.cost = cost; }
    public void set_price(double price) { this.price = price; }
    public void set_qty(int qty) { this.qty = qty; }
    public void set_need(int need) { this.need = need; }
    public void set_notes(String notes) { this.notes = notes; }

    // getters
    public String get_sku() { return sku; }
    public String get_name() { return name; }
    public double get_cost() { return cost; }
    public double get_price() { return price; }
    public int get_qty() { return qty; }
    public int get_need() { return need; }
    public String get_notes() { return notes; }

    // display
    public String to_string() {
        return "sku: " + sku + "\nname: " + name + "\ncost: $" + cost +
               "\nprice: $" + price + "\nqty: " + qty + "\nneeded: " + need +
               "\nnotes: " + notes;
    }
}

// perishable product class
class perish_product extends product {
    private String exp_date;

    public perish_product(String sku, String name, double cost, double price, int qty, int need, String notes, String exp_date) {
        super(sku, name, cost, price, qty, need, notes);
        this.exp_date = exp_date;
    }

    public void set_exp(String exp_date) { this.exp_date = exp_date; }
    public String get_exp() { return exp_date; }

    @Override
    public String to_string() {
        return super.to_string() + "\nexp date: " + exp_date;
    }
}

// main program
public class store {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<product> items = new ArrayList<>();
        int choice;

        // menu loop
        do {
            System.out.println("\n1. create product\n2. create perishable product\n3. edit product by sku");
            System.out.println("4. delete product by sku\n5. display product by sku\n6. display all products\n7. exit");
            System.out.print("choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // clear buffer

            switch (choice) {
                case 1 -> create_product(scan, items);
                case 2 -> create_perish(scan, items);
                case 3 -> edit_product(scan, items);
                case 4 -> delete_product(scan, items);
                case 5 -> display_product(scan, items);
                case 6 -> display_all(items);
                case 7 -> System.out.println("exiting...");
                default -> System.out.println("invalid choice");
            }
        } while (choice != 7);
    }

    // create a regular product
    static void create_product(Scanner scan, ArrayList<product> items) {
        System.out.print("sku: "); String sku = scan.nextLine();
        System.out.print("name: "); String name = scan.nextLine();
        System.out.print("cost: "); double cost = scan.nextDouble();
        System.out.print("price: "); double price = scan.nextDouble();
        System.out.print("qty: "); int qty = scan.nextInt();
        System.out.print("needed: "); int need = scan.nextInt();
        scan.nextLine(); // clear buffer
        System.out.print("notes: "); String notes = scan.nextLine();

        items.add(new product(sku, name, cost, price, qty, need, notes));
    }

    // create a perishable product
    static void create_perish(Scanner scan, ArrayList<product> items) {
        System.out.print("sku: "); String sku = scan.nextLine();
        System.out.print("name: "); String name = scan.nextLine();
        System.out.print("cost: "); double cost = scan.nextDouble();
        System.out.print("price: "); double price = scan.nextDouble();
        System.out.print("qty: "); int qty = scan.nextInt();
        System.out.print("needed: "); int need = scan.nextInt();
        scan.nextLine(); // clear buffer
        System.out.print("notes: "); String notes = scan.nextLine();
        System.out.print("exp date: "); String exp_date = scan.nextLine();

        items.add(new perish_product(sku, name, cost, price, qty, need, notes, exp_date));
    }

    // edit a product
    static void edit_product(Scanner scan, ArrayList<product> items) {
        System.out.print("enter sku to edit: ");
        String sku = scan.nextLine();

        for (product p : items) {
            if (p.get_sku().equals(sku)) {
                System.out.print("new name: ");
                p.set_name(scan.nextLine());
                return;
            }
        }
        System.out.println("product not found");
    }

    // delete a product
    static void delete_product(Scanner scan, ArrayList<product> items) {
        System.out.print("enter sku to delete: ");
        String sku = scan.nextLine();

        items.removeIf(p -> p.get_sku().equals(sku));
    }

    // display a single product
    static void display_product(Scanner scan, ArrayList<product> items) {
        System.out.print("enter sku to display: ");
        String sku = scan.nextLine();

        for (product p : items) {
            if (p.get_sku().equals(sku)) {
                System.out.println(p.to_string());
                return;
            }
        }
        System.out.println("product not found");
    }

    // display all products
    static void display_all(ArrayList<product> items) {
        for (product p : items) {
            System.out.println(p.to_string());
            System.out.println("---");
        }
    }
}
