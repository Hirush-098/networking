package com.hirushnetworking.orderservices.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoryResponse {
    private String skuCode;
    private Boolean isInStock;

    public boolean isInStock() {
        return this.isInStock;
    }
}
