package recipe;

import java.util.Objects;

public class Product {
    private final String title;
    private final float price;           //цена


    public Product(String title, float price) {
        if (title == null || title.isBlank() || price < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью.");
        }
        this.title = title;
        this.price = price;

    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {

        return title + ", цена=" + price+"р. "+"штук";
    }
}
