package edu.tomerbu.mockitodemos;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class BusinessServiceImplTest {
    @Test
    void testFindTheGreatestFromAllData() {

        DataService mock = Mockito.mock(DataService.class);
        Mockito.when(mock.retrieveAllData()).thenReturn(new int[]{1, 20, 30});

        BusinessServiceImpl someBusiness =
                new BusinessServiceImpl(mock);

        int largest = someBusiness.findTheGreatestFromAllData();
        assertEquals(30, largest);
    }

    @Test
    void testFindTheGreatestFromAllDataWithNoValues() {

        DataService mock = Mockito.mock(DataService.class);
        Mockito.when(mock.retrieveAllData()).thenReturn(new int[]{});
        //mock.retrieveAllData() => {1, 20, 30}

        BusinessServiceImpl someBusiness =
                new BusinessServiceImpl(mock);

        int largest = someBusiness.findTheGreatestFromAllData();
        assertEquals(0, largest);
    }

    @Test
    void testFindTheGreatestFromAllDataWithZeroValues() {

        DataService mock = Mockito.mock(DataService.class);
        Mockito.when(mock.retrieveAllData()).thenReturn(new int[]{0, 0, 0});
        //mock.retrieveAllData() => {1, 20, 30}

        BusinessServiceImpl someBusiness =
                new BusinessServiceImpl(mock);

        int largest = someBusiness.findTheGreatestFromAllData();
        assertEquals(0, largest);
    }
}

