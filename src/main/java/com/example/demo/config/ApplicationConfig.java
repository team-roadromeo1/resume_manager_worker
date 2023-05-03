package com.example.demo.config;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

//@Configuration
//@EnableMongoRepositories(basePackages = "com.example.demo.repository")
public class ApplicationConfig extends AbstractMongoClientConfiguration {

	@Autowired
	Environment env;

	@Override
	protected String getDatabaseName() {
		
		return env.getProperty("mongodb.database");
	}

	@Override
	public MongoClient mongoClient() {

		ConnectionString connectionString = new ConnectionString(
				env.getProperty("mongodb.connection.string"));
	
		MongoClientSettings settings = MongoClientSettings.builder().applyConnectionString(connectionString).build();
		
		MongoClient mongoClient = MongoClients.create(settings);
		
		return mongoClient;
			
	}
	
	@Override
	protected java.util.Collection<String> getMappingBasePackages(){
		return Collections.singleton("com.example.demo");
	}
	

}
