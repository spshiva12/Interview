package com.ojas.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ojas.pojo.Product;

@Controller
public class ProductController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/")
	public String readData() {
		return "home.jsp";

	}

	@RequestMapping("/create")
	public String sdfg() {

		return "create.jsp";
	}

	@RequestMapping("/insert")
	public String displayData(@ModelAttribute Product product) {
		int insert = jdbcTemplate.update("INSERT INTO product (pid, pname) VALUES (?, ?)", product.getPid(),
				product.getPname());
		if (insert != 0)
			System.out.println("Added");
		else
			System.out.println("not added.");

		return "home.jsp";
	}

	@RequestMapping("/update")
	public String dsb() {
		return "update.jsp";
	}

	@RequestMapping("/viewProd")
	public String fsffsf() {
		return "viewProd.jsp";
	}

	@RequestMapping("/viewProduct")
	public String hdbjsdb(@ModelAttribute Product product, Model model) {

		Product p = jdbcTemplate.queryForObject("SELECT * FROM product WHERE pid = ? ", new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub

				Product pr = new Product();
				pr.setPid(rs.getInt(1));
				pr.setPname(rs.getString(2));

				return pr;
			}

		}, product.getPid());
		model.addAttribute("product", p);

		return "viewProd.jsp";
	}

	@RequestMapping("/delete")
	public String dfdgsdgsb() {
		return "delete.jsp";
	}

	@RequestMapping("/updateData")
	public String update(@ModelAttribute Product product) {
		int update = jdbcTemplate.update("UPDATE product SET pname = ? WHERE pid = ?", product.getPname(),
				product.getPid());
		System.out.println(update);
		if (update != 0)
			System.out.println("Updated");
		else
			System.out.println("failed");
		return "home.jsp";
	}

	@RequestMapping("/allproducts")
	public String viewAllProducts(Model model) {
		// Retrieving list of products and adding to model to display in web page
//		System.out.println("sdhkcf");
//		Product p = jdbcTemplate.queryForObject("SELECT * FROM product WHERE pid = ? ", new RowMapper() {
//
//			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// TODO Auto-generated method stub
//
//				Product pr = new Product();
//				pr.setPid(rs.getInt(1));
//				pr.setPname(rs.getString(2));
//
//				return pr;
//			}
//
//		}, 55);
//
//		System.out.println(p);
		List<Product> list = jdbcTemplate.query("SELECT * FROM product", new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

				Product pr = new Product();
				pr.setPid(rs.getInt(1));
				pr.setPname(rs.getString(2));
				return pr;
			}

		});

		model.addAttribute("productList", list);

		return "viewAll.jsp";
	}

	@RequestMapping("/deleteData/")
	public String deleteProd(@PathVariable int id) {
		System.out.println(id);
		int delete = jdbcTemplate.update("DELETE FROM product where pid = ?", id);
		if (delete != 0)
			System.out.println("deleted");
		else
			System.out.println("not deleted");
		return "home.jsp";
	}

}
