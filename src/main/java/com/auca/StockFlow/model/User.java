package com.auca.StockFlow.model;

import com.auca.StockFlow.model.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private String passwordHash;
    private Role role;
    private String ShopName;
    private DateTime createdAt;

}
