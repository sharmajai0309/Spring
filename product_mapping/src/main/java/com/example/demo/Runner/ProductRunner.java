package com.example.demo.Runner;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.example.demo.dao.IproductRepository;

import com.example.demo.entity.Product;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private IproductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Product p = new Product();
		p.setPid(10);
		p.setPcode("pen");
		p.setColors(Arrays.asList("re","de","sd"));
		
		Set<String> set = new LinkedHashSet<>();
		set.add("M1");
		set.add("M2");
		set.add("M3");
		
		p.setModels(set);
		
		Map<String,String> map = new LinkedHashMap<>();
		map.put("M1","Good");
		map.put("M2","Better");
		map.put("M3","Very Good");
		
		p.setDetails(map);
		repo.save(p);
	}

}
