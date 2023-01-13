package org.example.service;

import org.example.entity.Item;
import org.example.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Service
public class SimpleItemService implements ItemService {
    private final ItemRepository itemRepository;

    @Autowired
    public SimpleItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> getAll() {
        Iterable<Item> itemIterator = this.itemRepository.findAll();
        Iterator<Item> iterator = itemIterator.iterator();
        List<Item> items = new LinkedList<>();
        while (iterator.hasNext()) {
            items.add(iterator.next());
        }
        return items;
    }

    @Override
    public void saveItem(Item item) {
        System.out.println(item);
        this.itemRepository.save(item);
    }

    @Override
    public Item findItemByName(String name) {
        return this.itemRepository.findByName(name);
    }
}