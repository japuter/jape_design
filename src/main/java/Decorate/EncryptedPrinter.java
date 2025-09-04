
package Decorate;


class EncryptedPrinter extends PrinterDecorator {
    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    // Simple Caesar cipher encryption (shift by 3)
    private String encrypt(String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            encrypted.append((char)(c + 3));
        }
        return encrypted.toString();
    }

    @Override
    public void print(String message) {
        String encryptedMessage = encrypt(message);
        super.print(encryptedMessage);
    }
}
