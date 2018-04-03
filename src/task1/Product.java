package task1;

/**
 * Created by sergey.kliepikov on 4/3/18.
 */
public class Product implements Entity<Long> {

    private final long id;
    private final String name;
    private final String description;
    private final long price;

    public Product(long id, String name, String description, long price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public Long getID() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
