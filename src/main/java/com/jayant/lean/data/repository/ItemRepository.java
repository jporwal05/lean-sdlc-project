package com.jayant.lean.data.repository;

import com.jayant.lean.data.entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>,
    RevisionRepository<Item, Long, Integer> {
}
