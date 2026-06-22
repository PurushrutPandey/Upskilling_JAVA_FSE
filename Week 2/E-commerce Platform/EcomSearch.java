public class EcomSearch {

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Book", "Education")
        };

        int searchId = 104;

        Product result1 =
                SearchAlgorithms.linearSearch(products, searchId);

        System.out.println("Linear Search Result:");
        System.out.println(result1);

        Product result2 =
                SearchAlgorithms.binarySearch(products, searchId);

        System.out.println("\nBinary Search Result:");
        System.out.println(result2);
    }
}