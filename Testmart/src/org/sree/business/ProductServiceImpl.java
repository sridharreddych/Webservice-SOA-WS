package org.sree.business;

import java.util.ArrayList;
import java.util.List;

import org.sree.model.Product;

public class ProductServiceImpl {

	
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public ProductServiceImpl(){
		
		bookList.add("Bhagavad Gita");
		bookList.add("Mahabharat");
		bookList.add("Success Stories");
		
		musicList.add("Raaga ");
		musicList.add("Vinuta ");
		musicList.add("Charita ");
		
		movieList.add("Okkadu");
		movieList.add("Sree charitham");
		movieList.add("Tholi prema");
	}
	
	public List<String> getProductCategories() {
	List<String> categories = new ArrayList<>();
	categories.add("Books") ;
	categories.add("Music") ; 
	categories.add("Movies") ;
	return categories;
 }
	
	public List<String> getProducts(String category){
		
		switch(category.toLowerCase()){
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
		}
	
	public boolean addProduct(String category, String product){
	
		switch(category.toLowerCase()){
		case "books":
			bookList.add(product);
			break;
		case "music":
		    musicList.add(product);
		    break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}
		return true;
		}

	public List<Product> getProductsv2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("java sree books","1234",999.99));
		productList.add(new Product("java Anchor books","1234",999.99));
		return productList;
	}
	
	}
