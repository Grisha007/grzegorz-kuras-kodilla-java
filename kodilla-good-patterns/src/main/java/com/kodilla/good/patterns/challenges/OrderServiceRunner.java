package com.kodilla.good.patterns.challenges;

public class OrderServiceRunner {
    public static void main(String[] args) {
        ItemOrderServiceImp order1 = new ItemOrderServiceImp();
        order1.orderItem();

        SendingMessageServiceImp message1 = new SendingMessageServiceImp();
        message1.sendingMessage();

        OrderDto orderDto = new OrderDto();
        orderDto.addOrderToList();

        ProductOrderService orderService = new ProductOrderService();
        orderService.process(orderDto);
    }
}
