package org.beer.works.beer.order.services.beer;

import org.beer.works.beer.order.web.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

public interface BeerService {

    Optional<BeerDto> getBeerById(UUID uuid);
    Optional<BeerDto> getBeerByUpc(String upc);
}
