package com.salesList.db

import com.salesList.db.model.ShoppingItemDto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ShoppingItemRepository : JpaRepository<ShoppingItemDto, Long>
