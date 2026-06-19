public class singletontest {
    public static void main(String[] args) {
        logger logger1 = logger.getInstance();
        logger1.log("First log message");
        logger logger2 = logger.getInstance();
        logger2.log("Second log message");
        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Multiple Logger instances exist.");
        }
        System.out.println("Logger1 HashCode: " + logger1.hashCode());
        System.out.println("Logger2 HashCode: " + logger2.hashCode());
    }
}