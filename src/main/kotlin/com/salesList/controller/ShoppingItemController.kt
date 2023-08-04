package com.salesList.controller

import com.salesList.db.model.ShoppingItem
import com.salesList.service.ShoppingItemService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/item")
class ShoppingItemController(private val shoppingItemService: ShoppingItemService) {
    @GetMapping
    fun getAllShoppingListItems(): List<ShoppingItem> {
        return shoppingItemService.getAllShoppingListItems()
    }

    @GetMapping("/{id}")
    fun getShoppingListItem(@PathVariable id: Long): ShoppingItem? {
        return shoppingItemService.getShoppingListItem(id)
    }

    @PostMapping
    fun getShoppingListItem(@RequestBody item: ShoppingItem): ShoppingItem {
        return shoppingItemService.addShoppingListItem(item)
    }
}
