package com.boot.services;

import com.boot.model.City;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.repositories.CityRepository;

@Service
public class DataService {

	public Map<String, String[]> names() {
		String[] names= {"Anitha","Harry","Johny","Uthra","Dhivya","Umaiza","Varshaa"};
		String[] names2= {"Shan","paul","Johan"};
		Map<String,String[]> map = new HashMap<String,String[]>();
		map.put("team1",names);
		map.put("team2",names2);
		return map;
	}
	
	@Autowired
	CityRepository cityrepo;
	
	public List<City> getCity(){
		return (List<City>) cityrepo.findAll();
		
	}
	public List<City> getCity(String countrycode){
		return (List<City>) cityrepo.getCityByCountrycode(countrycode);
	}
	public List<City> getCities(String pattern){
		return cityrepo.getCities("%"+pattern.toLowerCase()+"%");
	}
}
