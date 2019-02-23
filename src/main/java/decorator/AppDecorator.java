package decorator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppDecorator implements CommandLineRunner {

    @Autowired
    @Qualifier("simple")
    private Printer simplePrinter;

    @Autowired
    @Qualifier("upperCaseAndAsterisk")
    private Printer upperCaseAnsAsteriskPrinter;

    public static void main(String[] args) {
        SpringApplication.run(AppDecorator.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        simplePrinter.print("hello");

        upperCaseAnsAsteriskPrinter.print("hello");
    }
}
