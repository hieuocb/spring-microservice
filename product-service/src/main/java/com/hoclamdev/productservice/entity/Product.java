package com.hoclamdev.productservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @NonNull
    private String name;
    @NonNull
    private Long price;
    private String description;
    private boolean isDelete = false;

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;

    @ManyToOne
    @JoinColumn(name = "image_id")
    private Image image;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
