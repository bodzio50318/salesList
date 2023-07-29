package com.salesList.model

data class ShoppingItem(
        val id: Long,
        val name: String,
        val quantity: Int,
        val unit: String,
        val isChecked: Boolean = false
)
