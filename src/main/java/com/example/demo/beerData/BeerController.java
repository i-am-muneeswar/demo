package com.example.demo.beerData;

import com.example.demo.beerObjects.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BeerController {

    @PostMapping("/filter")
    public List<BeerObject> filterBeers(@RequestBody List<BeerObject> beers) {
        return beers.stream()
                .filter(beer -> beer.getRating().getAverage() > 4.5)
                .collect(Collectors.toList());
    }

    @PostMapping("/sort")
    public List<BeerObject> sortBeers(@RequestBody List<BeerObject> beers) {
        return beers.stream()
                .sorted(Comparator.comparing(beer -> Double.parseDouble(beer.getPrice().replace("$", ""))))
                .collect(Collectors.toList());
    }

    @PostMapping("/filterAndSort")
    public List<BeerObject> filterAndSortBeers(@RequestBody List<BeerObject> beers) {
        return beers.stream()
                .filter(beer -> beer.getRating().getAverage() > 4.5)
                .sorted(Comparator.comparing(beer -> Double.parseDouble(beer.getPrice().replace("$", ""))))
                .collect(Collectors.toList());
    }
}
