package decorator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @Qualifier("upperCase")
    PrinterDecorator upperCasePrinterDecorator(@Qualifier("simple") final Printer printer) {
        return new UpperCasePrinterDecorator(printer);
    }

    @Bean
    @Qualifier("asterisk")
    PrinterDecorator asterisksPrinterDecorator(@Qualifier("simple") final Printer printer) {
        return new AsterisksPrinterDecorator(printer);
    }

    @Bean
    @Qualifier("upperCaseAndAsterisk")
    PrinterDecorator upperCaseAndAsterisksPrinterDecorator(@Qualifier("upperCase") final Printer printer) {
        return new AsterisksPrinterDecorator(printer);
    }
}
