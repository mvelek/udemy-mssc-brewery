package org.mvelek.udemymsscbrewery.services;

import org.mvelek.udemymsscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
