package com.inani.vijay.dummy;

import org.fluttercode.datafactory.impl.DataFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class DataService {
    private static final DataFactory DATA_FACTORY = new DataFactory();
    private Object userIds;

    private static <T> List<T> createItems(int numberOfItems, Supplier<T> itemProvider) {
        List<T> items = new ArrayList<>();
        for (int i = 0; i < numberOfItems; i++) {
            items.add(itemProvider.get());
        }
        return items;
    }

    private static <V, T> List<T> createItems(int numberOfItems, V argValues, Function<V, T> itemProvider) {
        List<T> items = new ArrayList<>();
        for (int i = 0; i < numberOfItems; i++) {
            items.add(itemProvider.apply(argValues));
        }
        return items;
    }

    public List<String> getAllUserNames() {
        return createItems(10, DATA_FACTORY::getName);
    }

    public List<String> getAllUserIds() {
        return createItems(10, 3, DATA_FACTORY::getNumberText);
    }
}
