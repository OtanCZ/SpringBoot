package org.example.service;

import org.example.entity.Item;

import java.util.List;

public interface ItemService {
    List<Item> getAll();
    void saveItem(Item item);

    Item findItemByName(String name);
}
