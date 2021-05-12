package com.jayant.lean.service;

import com.jayant.lean.data.entity.Item;
import com.jayant.lean.data.entity.dto.ItemDto;
import com.jayant.lean.data.repository.ItemRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
  @Autowired
  private ItemRepository itemRepository;

  @Autowired
  private ModelMapper modelMapper;

  /**
   * Get list of all items.
   *
   * @return Optional list of items of type {@link ItemDto}
   */
  public Optional<List<ItemDto>> getAllItems() {
    final List<Item> itemList = new ArrayList<>();
    itemRepository.findAll().forEach(itemList::add);
    return Optional.of(itemList.stream().map(this::convertToDto).collect(Collectors.toList()));
  }

  /**
   * Add an item.
   *
   * @param item to be added.
   * @return Optional item of type {@link ItemDto}
   */
  public Optional<ItemDto> addItem(ItemDto item) {
    return Optional.ofNullable(convertToDto(itemRepository.save(convertToEntity(item))));
  }

  private ItemDto convertToDto(Item item) {
    return modelMapper.map(item, ItemDto.class);
  }

  private Item convertToEntity(ItemDto itemDto) {
    return modelMapper.map(itemDto, Item.class);
  }
}
