package com.jayant.lean.web;

import com.jayant.lean.data.entity.dto.ItemDto;
import com.jayant.lean.service.ItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("item")
public class ItemController {
  @Autowired
  private ItemService itemService;

  /**
   * Get the list of all items.
   *
   * @return list of items.
   */
  public List<ItemDto> getAllItems() {
    return itemService.getAllItems().orElseThrow(() -> new ResponseStatusException(
        HttpStatus.NO_CONTENT));
  }

  /**
   * Add an item.
   *
   * <p>This method adds the supplied item.</p>
   *
   * @param item the item to be added.
   * @return the added item.
   */
  @PostMapping("/add")
  public ItemDto addItem(@RequestBody ItemDto item) {
    return itemService.addItem(item)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR));
  }
}
