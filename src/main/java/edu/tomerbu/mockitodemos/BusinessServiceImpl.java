package edu.tomerbu.mockitodemos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.OptionalInt;

@Component
public class BusinessServiceImpl {

    private final DataService dataService;

    @Autowired
    public BusinessServiceImpl(DataService dataService) {
        this.dataService = dataService;
    }

    int findTheGreatestFromAllData() {
        OptionalInt max = Arrays.stream(dataService.retrieveAllData()).max();
        return max.orElseGet(() -> 0);
    }
}


