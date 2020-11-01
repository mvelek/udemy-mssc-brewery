package org.mvelek.udemymsscbrewery.services;

import org.mvelek.udemymsscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto betBeerById(UUID beerId);
}
