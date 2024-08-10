package org.beer.works.beer.order.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.*;

import java.sql.Timestamp;
import java.sql.Types;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue
    @JdbcTypeCode(Types.VARCHAR)
    @Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false)
    private UUID id;

    @Version
    private Long version;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdDate;

    @UpdateTimestamp
    private Timestamp lastModifiedDate;

    public BaseEntity(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate){
        this.id = id;
        this.version = version;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
    }

    public boolean isNew(){
        return this.id == null;
    }
}
