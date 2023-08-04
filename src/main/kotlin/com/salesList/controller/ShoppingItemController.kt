package com.salesList.controller

import com.salesList.db.model.ShoppingItemDto
import com.salesList.service.ShoppingItemService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/item")
class ShoppingItemController(private val shoppingItemService: ShoppingItemService) {
    @GetMapping
    fun getAllShoppingListItems(): List<ShoppingItemDto> {
        return shoppingItemService.getAllShoppingListItems()
    }

    @GetMapping("/{id}")
    fun getShoppingListItem(@PathVariable id: Long): ShoppingItemDto? {
        return shoppingItemService.getShoppingListItem(id)
    }

    @PostMapping
    fun getShoppingListItem(@RequestBody item: ShoppingItemDto): ShoppingItemDto {
        return shoppingItemService.addShoppingListItem(item)
    }
}
