package InvoiceElements.InvoiceHeaderElements;

import java.awt.*;

public enum Client {
    WHOLESALER(Color.YELLOW),
    DISTRIBUTOR(Color.GREEN),
    RETAILER(Color.RED);

    private final Color color;

    Client(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
