package vijay.projects.betavarient.DataStructures.PriorityQueue;

import java.util.Comparator;

public class CustomerOrder implements Comparator<CustomerOrder> {

    private int orderId;
    private int customerId;
    private float amount;
    private int productCount;

    public CustomerOrder() {}

    public CustomerOrder(int orderId, int customerId, float amount, int productCount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.amount = amount;
        this.productCount = productCount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", amount=" + amount +
                ", productCount=" + productCount +
                '}';
    }


    @Override
    public int compare(CustomerOrder o1, CustomerOrder o2) {
        return o1.getProductCount() >= o2.getProductCount() ? 1 : -1;
    }
}
