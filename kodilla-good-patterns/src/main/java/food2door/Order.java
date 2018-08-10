package food2door;

public class Order {
    private String order;

    public Order(String order) {
        this.order = order;
    }

    public void orderDto(Order order, User user, NewFoodManufacturer newFoodManufacturer, String productName) {
        if(newFoodManufacturer.getNewManufacturerProductsList().contains(productName)) {
            System.out.println("Dear " + user.getName() + " " + user.getSurname() + ", " + order.getOrder() + " (" + newFoodManufacturer.getCompanyName() + ", " + productName + ") is processing!");
        } else {
            System.out.println("Dear " + user.getName() + " " + user.getSurname() + ", " + productName + " is not available in " + newFoodManufacturer.getCompanyName() + "!");
        }
    }

    public String getOrder() {
        return order;
    }
}
