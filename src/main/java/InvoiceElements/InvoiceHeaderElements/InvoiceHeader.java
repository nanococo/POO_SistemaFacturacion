package InvoiceElements.InvoiceHeaderElements;

import java.util.Random;

public class InvoiceHeader {
    private final String clientName;
    private final int clientId;
    private final Client clientType;

    public InvoiceHeader(String clientName, Client clientType){
        this.clientName = clientName;
        this.clientType = clientType;
        this.clientId = new Random().nextInt();
    }


    public String getClientName() {
        return clientName;
    }

    public int getClientId() {
        return clientId;
    }

    public Client getClientType() {
        return clientType;
    }
}
