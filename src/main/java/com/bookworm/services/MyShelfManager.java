package com.bookworm.services;

import java.util.List;
import java.util.Optional;

import com.bookworm.entities.MyShelf;

public interface MyShelfManager {

	Optional<MyShelf> getById(Long shelfId);

    public List<MyShelf> getByCustomerId(long id);
    
   public MyShelf addToShelf(MyShelf shelf);
}
