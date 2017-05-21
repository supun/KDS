package com.kds.ru;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@PropertySource({ "classpath:application.properties" })
@EntityScan("com.kds.ru")
public class KdsApplication
{

	public static void main( String[] args )
	{
		SpringApplication.run( KdsApplication.class, args );
	}

	/*
	 * @RequestMapping("/resource") public Map<String, Object> home() { Map<String, Object> model = new HashMap<String, Object>(); model.put( "id",
	 * UUID.randomUUID().toString() ); model.put( "content", "KDS" ); return model; }
	 */

	@RequestMapping("/resource")
	public Map<String, Object> sample()
	{
		Map<String, Object> model = new HashMap<String, Object>();
		Map<String, Object> dataModel = new HashMap<String, Object>();
		dataModel.put( "helloText", UUID.randomUUID().toString() );
		model.put( "data", dataModel );
		return model;
	}
}
