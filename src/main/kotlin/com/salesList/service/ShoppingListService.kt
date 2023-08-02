package com.salesList.service

import com.salesList.db.ShoppingItemRepository
import com.salesList.model.ShoppingItem
import org.springframework.stereotype.Service

@Service
class ShoppingListService(private val repository: ShoppingItemRepository) {
    fun addShoppingListItem(newItem: ShoppingItem): ShoppingItem {
        return repository.insert(newItem)
    }
}
