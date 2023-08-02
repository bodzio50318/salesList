package com.salesList.db

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients

@Configuration
class MongoConfig(@Value("\${spring.data.mongodb.uri}") private val connectionString: String) :
    AbstractMongoClientConfiguration() {

    override fun getDatabaseName(): String {
        // Extract the database name from the connection string
        return "shopping-list-db"
    }

    override fun mongoClient(): MongoClient {
        return MongoClients.create(connectionString)
    }
}
