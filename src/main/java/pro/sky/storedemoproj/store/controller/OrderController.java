package pro.sky.storedemoproj.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.storedemoproj.store.service.order.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "/add")
    public void allToCart(@RequestParam("id") int id) {
        orderService.add(id);
    }

    @GetMapping(path = "/get")
    public List<Integer> getCart() {
        return orderService.get();
    }
}
