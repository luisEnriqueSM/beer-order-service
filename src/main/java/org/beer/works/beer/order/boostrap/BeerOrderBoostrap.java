package org.beer.works.beer.order.boostrap;

import lombok.RequiredArgsConstructor;
import org.beer.works.beer.order.domain.Customer;
import org.beer.works.beer.order.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;

import java.util.UUID;

@RequiredArgsConstructor
public class BeerOrderBoostrap implements CommandLineRunner {

    public static final String TASTING_ROOM = "Tasting Room";
    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";

    private final CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        loadCustomerData();
    }

    private void loadCustomerData() {
        if(customerRepository.count() == 0){
            customerRepository.save(Customer.builder()
                    .customerName(TASTING_ROOM)
                    .apiKey(UUID.randomUUID())
                    .build());
        }
    }
}
