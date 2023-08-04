package com.salesList.service

import com.salesList.db.ShoppingItemRepository
import com.salesList.db.model.ShoppingItemDto
import org.springframework.stereotype.Service

@Service
class ShoppingItemService(private val repository: ShoppingItemRepository) {
    fun addShoppingListItem(newItem: ShoppingItemDto): ShoppingItemDto {
        return repository.save(newItem)
    }

    fun getShoppingListItem(id: Long): ShoppingItemDto {
        return repository.findById(id).get()
    }

    fun getAllShoppingListItems(): List<ShoppingItemDto> {
        return repository.findAll()
    }
}
