package decorator;

public class AsterisksPrinterDecorator extends PrinterDecorator {

    public AsterisksPrinterDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String msg) {
        msg = "*** " + msg + " ***";
        this.printer.print(msg);
    }
}
