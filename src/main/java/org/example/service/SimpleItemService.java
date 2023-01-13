package org.example.service;

import org.example.entity.Item;

import java.util.LinkedList;
import java.util.List;

public class SimpleItemService implements ItemService {
    private List<Item> items;

    public SimpleItemService() {
        this.items = new LinkedList<>();
    }

    @Override
    public List<Item> getAll() {
        return items;
    }

    @Override
    public void saveItem(Item item) {
        items.add(item);
    }
}