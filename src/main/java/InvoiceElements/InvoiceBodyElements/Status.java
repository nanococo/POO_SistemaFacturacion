package InvoiceElements.InvoiceBodyElements;

import java.awt.*;

public enum Status {
    ERROR(Color.RED),
    PENDING(Color.YELLOW),
    CLOSED(Color.GREEN),
    CANCELLED(Color.BLUE);

    private final Color color;

    Status(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
