package com.mderouet.graphql.controller.restaurant;

import com.mderouet.graphql.model.restaurant.Restaurant;
import com.mderouet.graphql.model.waiter.Waiter;
import com.mderouet.graphql.service.restaurant.GetRestaurantInteractor;
import com.mderouet.graphql.service.restaurant.GetRestaurantsInteractor;
import com.mderouet.graphql.service.waiter.GetWaitersInteractor;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class RestaurantController {

    private final GetRestaurantsInteractor getRestaurantsInteractor;
    private final GetRestaurantInteractor getRestaurantInteractor;
    private final GetWaitersInteractor getWaitersInteractor;

    @QueryMapping
    public Restaurant restaurantById(@Argument Integer id) {
        return getRestaurantInteractor.execute(id);
    }

    @QueryMapping
    public List<Restaurant> restaurants() {
        return getRestaurantsInteractor.execute();
    }

    @SchemaMapping(typeName = "Restaurant", field = "waiters")
    public List<Waiter> waiters(Restaurant restaurant){
        return getWaitersInteractor.execute(restaurant);
    }
}

