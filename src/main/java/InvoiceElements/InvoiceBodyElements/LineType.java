package InvoiceElements.InvoiceBodyElements;

public enum LineType {
    ITEM(0.15),
    SERVICE(0.0);

    private final double tax;

    LineType(double tax){
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }
}
