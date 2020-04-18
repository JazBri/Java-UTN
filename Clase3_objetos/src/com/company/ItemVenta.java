package com.company;

import java.util.UUID;

public class ItemVenta {
        private UUID id = UUID.randomUUID();
        private String name;
        private String description;
        private float unitaryPrice;

    public ItemVenta() {
    }

    public ItemVenta(String name, String description, float unitaryPrice) {
        this.name = name;
        this.description = description;
        this.unitaryPrice = unitaryPrice;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getUnitaryPrice() {
        return unitaryPrice;
    }

    public void setUnitaryPrice(float unitaryPrice) {
        this.unitaryPrice = unitaryPrice;
    }

    @Override
    public String toString() {
        return "ItemVenta{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unitaryPrice='" + unitaryPrice + '\'' +
                '}';
    }
}
