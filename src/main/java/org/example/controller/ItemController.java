package org.example.controller;

import org.example.entity.Item;
import org.example.service.ItemService;
import org.example.service.SimpleItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    private ItemService itemService;
    @Autowired
    public ItemController() {
        this.itemService = new SimpleItemService();
    }
    @RequestMapping(path = "/items")
    public List<Item> getItems() {
        return itemService.getAll();
    }

    @RequestMapping(path = "/item", method = RequestMethod.POST)
    public void saveItem() {
        itemService.saveItem(null);
    }
}
