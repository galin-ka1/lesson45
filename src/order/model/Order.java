package order.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Order {
    private String dish;
    private double price;
    private LocalDateTime time;

    public Order(String dish, double price, LocalDateTime time) {
        this.dish = dish;
        this.price = price;
        this.time = time;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Order order)) return false;
        return Double.compare(price, order.price) == 0 && Objects.equals(dish, order.dish) && Objects.equals(time, order.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dish, price, time);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Order{");
        sb.append("dish='").append(dish).append('\'');
        sb.append(", price=").append(price);
        sb.append(", time=").append(time);
        sb.append('}');
        return sb.toString();
    }
}
