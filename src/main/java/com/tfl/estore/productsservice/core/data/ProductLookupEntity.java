package com.tfl.estore.productsservice.core.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "product_lookup")
@AllArgsConstructor
@NoArgsConstructor
public class ProductLookupEntity implements Serializable {

    private static final long serialVersionUID = -4863552307419623219L;

    @Id
    private String productId;

    @Column(unique = true)
    private String title;
}
