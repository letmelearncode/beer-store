package com.practice.beerstore.service;

import com.practice.beerstore.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerById(UUID beerId);
}
