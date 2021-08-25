package edu.tomerbu.mockitodemos;

public class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{10, 20, 30, 9, 0, -1};
    }
}