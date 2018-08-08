package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private ItemOrder itemOrder;
    private SendingMessageService messageService;

    public ProductOrderService(ItemOrder itemOrder, SendingMessageService messageService) {
        this.itemOrder = itemOrder;
        this.messageService = messageService;
    }
}
