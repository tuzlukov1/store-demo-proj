package pro.sky.storedemoproj.store.service.order;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class OrderServiceImpl implements OrderService{

    private final List<Integer> cart = new ArrayList<>();

    @Override
    public void add(int id) {
        cart.add(id);
    }

    @Override
    public List<Integer> get() {
       return cart;
    }
}
