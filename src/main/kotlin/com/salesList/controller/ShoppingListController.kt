package com.salesList.controller

import com.salesList.model.ShoppingItem
import com.salesList.service.ShoppingListService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/shopping-list")
class ShoppingListController(private val shoppingListService: ShoppingListService) {

    // Sample in-memory list to store shopping list items for demonstration purposes
    private val shoppingList = mutableListOf(
        ShoppingItem(1, "Milk", 1, "liter"),
        ShoppingItem(2, "Eggs", 12, "pieces", true),
        ShoppingItem(3, "test", 12, "pieces", true),
    )

    @GetMapping("/{id}")
    fun getShoppingListItem(@PathVariable id: Long): ShoppingItem? {
        return shoppingList.find { it.id == id }
    }

    @GetMapping
    fun getAllShoppingListItems(): List<ShoppingItem> {
        return shoppingList
    }

    @PostMapping
    fun addShoppingListItem(@RequestBody newItem: ShoppingItem): ShoppingItem {
        return shoppingListService.addShoppingListItem(newItem)
    }

    @PutMapping("/{id}")
    fun updateShoppingListItem(@PathVariable id: Long, @RequestBody updatedItem: ShoppingItem): ShoppingItem? {
        val existingItem = shoppingList.find { it.id == id }
        if (existingItem != null) {
            val updatedItemWithId = updatedItem.copy(id = id)
            shoppingList.remove(existingItem)
            shoppingList.add(updatedItemWithId)
            return updatedItemWithId
        }
        return null
    }

    @DeleteMapping("/{id}")
    fun deleteShoppingListItem(@PathVariable id: Long): Boolean {
        val itemToDelete = shoppingList.find { it.id == id }
        if (itemToDelete != null) {
            shoppingList.remove(itemToDelete)
            return true
        }
        return false
    }
}
