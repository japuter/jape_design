package Decorate;


public class PrinterDemo {
    public static void main(String[] args) {
        // Basic printer
        Printer printer1 = new BasicPrinter();
        printer1.print("Hello World!");  
        // Output: Hello World!

        // Decorated printer: XML + Encrypted
        Printer printer2 = new EncryptedPrinter(new XMLPrinter(new BasicPrinter()));
        printer2.print("Hello World!");
        // Output: Encrypted version of <message>Hello World!</message>
    }
}