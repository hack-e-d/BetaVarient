package vijay.projects.betavarient.DesignPatterns.BuilderPattern;

import java.math.BigDecimal;

public class Product {

    enum Color {
        RED,
        BLUE,
        GREEN,
        YELLOW
    };
    private int id;
    private String name;
    private Color color;
    private BigDecimal price;

    public static class Builder {
        private Product product = new Product();

        public Builder withId(int id) {
            product.id = id;
            return this;
        }

        public Builder withName(String name) {
            product.name = name;
            return this;
        }

        public Builder withPrice(BigDecimal price) {
            product.price = price;
            return this;
        }

        public Builder withColor(Product.Color color) {
            product.color = color;
            return this;
        }

        public Product build() {
            return this.product;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
