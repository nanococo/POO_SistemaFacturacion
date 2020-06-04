import InvoiceElements.InvoiceBody;
import InvoiceElements.InvoiceHeaderElements.Client;
import InvoiceElements.InvoiceHeaderElements.InvoiceHeader;

public class MainInvoice {
    public InvoiceHeader invoiceHeader;
    public InvoiceBody invoiceBody;

    public MainInvoice(String clientName, Client clientType) {
        this.invoiceHeader = new InvoiceHeader(clientName, clientType);
        this.invoiceBody = new InvoiceBody();
    }
}
