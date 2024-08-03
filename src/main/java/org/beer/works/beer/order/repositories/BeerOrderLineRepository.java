package org.beer.works.beer.order.repositories;

import org.beer.works.beer.order.domain.BeerOrderLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID>, CrudRepository<BeerOrderLine, UUID> {
}
