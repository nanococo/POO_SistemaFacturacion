package InvoiceElements.InvoiceBodyElements;

public class InvoiceLine {
    private LineType lineType;
    private String itemName;
    private String description;
    private String account;
    private Status status;
    private double iva;

    public InvoiceLine(LineType lineType, String itemName, String description, String account, Status status){
        this.lineType = lineType;
        this.itemName = itemName;
        this.description = description;
        this.account = account;
        this.status = status;
        this.iva = lineType.getTax();
    }

    public LineType getLineType() {
        return lineType;
    }

    public void setLineType(LineType lineType) {
        this.lineType = lineType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
}
