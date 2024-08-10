package org.beer.works.beer.order.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;

import java.sql.Timestamp;
import java.sql.Types;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Customer extends BaseEntity{

    private String customerName;

    @JdbcTypeCode(Types.VARCHAR)
    @Column(length = 36, columnDefinition = "varchar(36)")
    private UUID apiKey;

    @OneToMany(mappedBy = "customer")
    private Set<BeerOrder> beerOrders;

    @Builder
    public Customer(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate,
                    String customerName, UUID apiKey, Set<BeerOrder> beerOrders){
        super(id, version, createdDate, lastModifiedDate);
        this.customerName = customerName;
        this.apiKey = apiKey;
        this.beerOrders = beerOrders;
    }
}
