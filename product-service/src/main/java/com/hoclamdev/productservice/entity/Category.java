package com.hoclamdev.productservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CategoryId;

    @NonNull
    private String name;
    private String description;
    private String ImageId;
    private Boolean isDelete;

    @OneToMany(mappedBy = "category")
    private Set<Product> products;
}
