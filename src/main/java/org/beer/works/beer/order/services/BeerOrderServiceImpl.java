package org.beer.works.beer.order.services;

import lombok.extern.slf4j.Slf4j;
import org.beer.works.beer.order.repositories.BeerOrderRepository;
import org.beer.works.beer.order.repositories.CustomerRepository;
import org.beer.works.beer.order.web.mapper.BeerOrderMapper;
import org.beer.works.beer.order.web.model.BeerOrderDto;
import org.beer.works.beer.order.web.model.BeerOrderPagedList;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerOrderServiceImpl implements BeerOrderService{

    private final BeerOrderRepository beerOrderRepository;
    private final CustomerRepository customerRepository;
    //private final BeerOrderMapper beerOrderMapper;
    private final ApplicationEventPublisher publisher;

    public BeerOrderServiceImpl(BeerOrderRepository beerOrderRepository, CustomerRepository customerRepository,
                                ApplicationEventPublisher publisher) {
        this.beerOrderRepository = beerOrderRepository;
        this.customerRepository = customerRepository;
        //this.beerOrderMapper = beerOrderMapper;
        this.publisher = publisher;
    }

    @Override
    public BeerOrderPagedList listOrders(UUID customerId, Pageable pageable) {
        return null;
    }

    @Override
    public BeerOrderDto placeOrder(UUID customerId, BeerOrderDto beerOrderDto) {
        return null;
    }

    @Override
    public BeerOrderDto getOrderById(UUID customerId, UUID orderId) {
        return null;
    }

    @Override
    public void pickupOrder(UUID customerId, UUID orderId) {

    }
}
