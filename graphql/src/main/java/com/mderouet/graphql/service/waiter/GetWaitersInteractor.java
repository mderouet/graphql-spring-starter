package com.mderouet.graphql.service.waiter;

import com.mderouet.graphql.model.restaurant.Restaurant;
import com.mderouet.graphql.model.waiter.Waiter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetWaitersInteractor {
    public List<Waiter> execute() {
        return List.of(
                new Waiter(1, "John", "Doe"),
                new Waiter(2, "Alfred", "Dupont"),
                new Waiter(3, "Jones", "Keepup")
        );
    }

    public List<Waiter> execute(Restaurant restaurant) {
        return List.of(
                new Waiter(1, "John", "Doe"),
                new Waiter(2, "Alfred", "Dupont"),
                new Waiter(3, "Jones", "Keepup")
        );
    }
}
