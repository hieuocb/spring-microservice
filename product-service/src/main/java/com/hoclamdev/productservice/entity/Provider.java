package com.hoclamdev.productservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "provider")
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "provider_id")
    private Long providerId;

    @NonNull
    private String name;
    private String address;
    private String phone;
    private String email;
    private Boolean isDelete;

    @OneToMany(mappedBy = "provider")
    private Set<Product> products;
}
