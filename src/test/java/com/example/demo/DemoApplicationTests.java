package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
    void testAddItemToOrder() {
        Order order = new Order();
        Item item = new Item("Book", 15.0);
        order.addItem(item);

        assertEquals(1, order.getItems().size(), "Order should have 1 item");
        assertEquals(item, order.getItems().get(0), "Added item should be in order");
    }

}
