package edu.tomerbu.mockitodemos;

import org.springframework.stereotype.Component;

@Component
class ProdDataService implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int[]{-10, -2, -3};
    }
}