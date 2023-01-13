package org.example.controller;

import org.example.entity.Item;
import org.example.service.ItemService;
import org.example.service.SimpleItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    private final ItemService itemService;
    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    @RequestMapping(path = "/items", method = RequestMethod.GET)
    public List<Item> getItems() {
        return itemService.getAll();
    }

    @RequestMapping(path = "/item", method = RequestMethod.POST)
    public void saveItem(@RequestBody Item item) {
        itemService.saveItem(item);
    }

    @RequestMapping(path = "/item", method = RequestMethod.GET)
    public void getItem(@RequestBody String name) {
        itemService.findItemByName(name);
    }
}
