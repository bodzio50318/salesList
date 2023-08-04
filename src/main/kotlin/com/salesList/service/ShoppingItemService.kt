package com.salesList.service

import com.salesList.db.ShoppingItemRepository
import com.salesList.db.model.ShoppingItem
import org.springframework.stereotype.Service

@Service
class ShoppingItemService(private val repository: ShoppingItemRepository) {
    fun addShoppingListItem(newItem: ShoppingItem): ShoppingItem {
        return repository.save(newItem)
    }

    fun getShoppingListItem(id: Long): ShoppingItem {
        return repository.findById(id).get()
    }

    fun getAllShoppingListItems(): List<ShoppingItem> {
        return repository.findAll()
    }
}
