package org.beer.works.beer.order.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class OrderStatusUpdate extends BaseItem{

    private UUID orderId;
    private String customerRef;
    private String orderStatus;

    @Builder
    public OrderStatusUpdate(UUID id, Integer version, OffsetDateTime createdDate, OffsetDateTime lastModifiedDate,
                             UUID orderId, String orderStatus, String customerRef){
        super(id, version, createdDate, lastModifiedDate);
        this.orderId = orderId;
        this.customerRef = customerRef;
        this.orderStatus = orderStatus;
    }
}
