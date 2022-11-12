package com.mderouet.graphql.service.restaurant;

import com.mderouet.graphql.model.restaurant.Restaurant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetRestaurantInteractor {

    private final GetRestaurantsInteractor getRestaurantsInteractor;
    public Restaurant execute(Integer id) {
        return getRestaurantsInteractor.execute().stream().filter(r -> r.id().equals(id)).findFirst().orElse(null);
    }
}
