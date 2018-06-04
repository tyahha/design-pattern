public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("now name is " + p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println("now name is " + p.getPrinterName());
        p.print("Hello, world");
    }
}
