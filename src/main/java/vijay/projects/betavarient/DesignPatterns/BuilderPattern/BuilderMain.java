package vijay.projects.betavarient.DesignPatterns.BuilderPattern;

import java.math.BigDecimal;

public class BuilderMain {

    public static void main(String[] args) {
        Product product = Product.builder()
                .withId(1)
                .withName("P!")
                .withPrice(BigDecimal.valueOf(12234))
                .withColor(Product.Color.RED)
                .build();

        System.out.println(product.toString());
    }
}
