package org.beer.works.beer.order.services;

import org.beer.works.beer.order.web.model.BeerOrderDto;
import org.beer.works.beer.order.web.model.BeerOrderPagedList;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface BeerOrderService {

    BeerOrderPagedList listOrders(UUID customerId, Pageable pageable);
    BeerOrderDto placeOrder(UUID customerId, BeerOrderDto beerOrderDto);
    BeerOrderDto getOrderById(UUID customerId, UUID orderId);
    void pickupOrder(UUID customerId, UUID orderId);
}
