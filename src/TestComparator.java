import java.util.Arrays;
import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args) {
        Customer[] customers = new Customer[6];
        customers[0] = new Customer(8,"John");
        customers[1] = new Customer(7,"Mike");
        customers[2] = new Customer(9,"Bill");
        customers[3] = new Customer(6,"Maria");
        customers[4] = new Customer(15,"Yoel");
        customers[5] = new Customer(10,"Leo");

        Arrays.sort(customers, new CustomerAgeComparator<>());

        System.out.println("------Sort by Age-----");
        for (Customer s: customers){
            System.out.println(s);
        }

        System.out.println("-----Sort by Name-----");
        Arrays.sort(customers, new CustomerNameComparator<>());

        for (Customer s: customers){
            System.out.println(s);
        }
    }
}
