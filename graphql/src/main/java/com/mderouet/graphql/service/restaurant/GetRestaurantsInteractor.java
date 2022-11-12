package com.mderouet.graphql.service.restaurant;

import com.mderouet.graphql.model.restaurant.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetRestaurantsInteractor {
    public List<Restaurant> execute() {
        return List.of(
                new Restaurant(1, "La muse gueule", "Rue de la Muse 2", "1205", "Genève", "Switzerland"),
                new Restaurant(2, "Macdonald", "Rdpt de Plainpalais 1", "1205", "Genève", "Switzerland"),
                new Restaurant(3, "Coop", "Rue de Carouge 12", "1205", "Genève", "Switzerland"),
                new Restaurant(4, "Burrito", "Rue Kitty-Ponse 3", "1205", "Genève", "Switzerland"),
                new Restaurant(5, "Inglewood", "Bd du Pont-d'Arve 44", "1205", "Genève", "Switzerland"),
                new Restaurant(6, "Italian Pub", "Bd Carl-Vogt 20", "1205", "Genève", "Switzerland")
        );
    }
}
