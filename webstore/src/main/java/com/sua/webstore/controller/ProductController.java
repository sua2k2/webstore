package com.sua.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sua.webstore.domain.repository.ProductRepository;
import com.sua.webstore.service.ProductService;

@Controller
@RequestMapping("/market")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductService productService;

	@RequestMapping("/products")
	public String list(Model model) {
		/*
		 * Product iphone = new Product("P1234", "아이폰 6s", new BigDecimal(50_0000));
		 * iphone.setDescription("애플 아이폰 6s 스마트폰 " + "디스플레이 규격: 4.00-inch 640x1136, " +
		 * "후방 카메라: 8-megapixel"); iphone.setCategory("Smartphone");
		 * iphone.setManufacturer("Apple"); iphone.setUnitsInStock(1000);
		 * model.addAttribute("product", iphone); // 모델에 추가 return "products"; // 뷰 이름
		 * 반환
		 */
//		model.addAttribute("products", productRepository.getAllProducts());
		model.addAttribute("products", productService.getAllProducts());
		return "products";
	}
	
	@RequestMapping("/products/laptop")
	public String laptop(Model model) {
		model.addAttribute("products", productService.getAllProducts("laptop"));
		return "products";
	}
	
	@RequestMapping("/update/stock")
	public String updateStock(Model model) {
		productService.updateAllStock();
		return "redirect:/market/products"; // 값을 전달하고 값을 잃어버림
//		return "forward:/products"; // 값을 전달하고 전달값을 가지고 있음
	}

	@RequestMapping("/products/{category}")
	public String getProductsByCategory(Model model, @PathVariable("category") String productCategory) {
		// @PathVariable String category) {
		model.addAttribute("products", productService.getProductsByCategory(productCategory));
		// productService.getProductsByCategory(category));
		return "products";
	}

}
