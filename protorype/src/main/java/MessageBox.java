import framework.Product;

public class MessageBox implements Product {
    private char decoChar;
    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    private void printDecoLine(int lineWidth) {
        for (int i = 0; i < lineWidth; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
    }

    @Override
    public void use(String s) {
        int width = s.getBytes().length + 4;
        printDecoLine(width);
        System.out.println(decoChar + " " + s + " " + decoChar);
        printDecoLine(width);
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}
