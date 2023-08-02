package com.salesList.db

import com.salesList.model.ShoppingItem
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ShoppingItemRepository : MongoRepository<ShoppingItem, String>
