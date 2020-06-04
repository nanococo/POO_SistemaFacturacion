package InvoiceElements;

import InvoiceElements.InvoiceBodyElements.InvoiceLine;

import java.util.ArrayList;

public class InvoiceBody {
    private ArrayList<InvoiceLine> invoiceLines = new ArrayList<InvoiceLine>();

    public void addLine(InvoiceLine invoiceLine){
        invoiceLines.add(invoiceLine);
    }

    public double getTotal(){
        return 0;
    }
}
