package decorator;

import org.springframework.stereotype.Service;

@Service("simple")
public class SimplePrinter implements Printer {

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
}
