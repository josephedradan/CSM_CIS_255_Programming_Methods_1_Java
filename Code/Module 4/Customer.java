import java.util.ArrayList;

public class Customer {
    private static int numberOfCustomers = 0;

    private String name;
    private char initial;
    private ArrayList<Order> orderList;

    public static void main (String args[]){
        Order pizza = new Order("Pizza", 29.99);
        Order hotDog = new Order("Hot Dog", 3.50);
        Order rareBacon = new Order("Rare Bacon", 10000);


        Customer bob = new Customer("Bob",'B');
        bob.toString();
        System.out.println(bob + "\n");

//        bob.orderList.add(pizza);
//        bob.orderList.add(hotDog);
        bob.addOrder(pizza);
        bob.addOrder(hotDog);

        System.out.println();
        System.out.println(bob.getMoneyOwed() + "\n");

        bob.addOrder(rareBacon);
        bob.addOrder(pizza);

        System.out.println();
        System.out.println("Number of Customers " + Customer.getAmountofCustomers());

        Customer john = new Customer("John",'J');
        System.out.println("Number of Customers " + Customer.getAmountofCustomers());



    }

    // CONSTRUCTOR CHAINING BUT WRONG THING TO DO
//    public Customer(String name) {
//        this(name, null);
//    }
//    public Customer(String name, Order item){
//        this.name = name;
//        orderList = new ArrayList<Order>();
//        orderList.add(item);
//    }

    // NO CONSTRUCTOR CHAINING
//    public Customer(String name) {
//        this.name = name;
//        orderList = new ArrayList<Order>();
//    }
//    public Customer(String name, char initial) {
//        this.name = name;
//        this.initial = initial;
//        orderList = new ArrayList<Order>();
//    }

    // CONSTRUCTOR CHAINING
    public Customer(String name) {
        this(name, '\u0000');
    }
    public Customer(String name, char initial) {
        this.name = name;
        this.initial = initial;
        orderList = new ArrayList<Order>();
        numberOfCustomers++;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setInitial(char initial) {
        this.initial = initial;
    }

    // No setOrderList(ArrayList<Order> orderList) because you add to the orderList not replace it

    public String getName() {
        return name;
    }

    public char getInitial() {
        return initial;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    // I don't think money should be a double.
    public double getMoneyOwed(){
        double moneyOwed = 0;
        for(int i = 0; i < orderList.size(); i++){
            moneyOwed += orderList.get(i).getTotal();
        }
        return moneyOwed;

//        return orderList.stream()
//                .mapToDouble(e->e.getTotal())
//                .sum();

    }
    public void addOrder(Order item){
        if(getMoneyOwed()<1000){
            this.orderList.add(item);
            System.out.printf("Added order %s (%s).\n"
                    ,item.getOrderID()
                    ,item.getTotal());
        } else{
            System.out.printf("Customer %s Owes $%s, it exceeds limit of $1000. Cannot add additional order %s.\n"
                    ,name
                    ,getMoneyOwed()
                    ,item.getOrderID());
        }
    }

    @Override
    public String toString() {
        return String.format("Customer name: %s\nNumber of Orders: %d",
                name,
                orderList.size());
    }

    public static int getAmountofCustomers(){
        return numberOfCustomers;
    }
}