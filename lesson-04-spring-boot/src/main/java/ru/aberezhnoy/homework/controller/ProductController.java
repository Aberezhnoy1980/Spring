package ru.aberezhnoy.homework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.aberezhnoy.homework.model.Product;
import ru.aberezhnoy.homework.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showForm(Model model) {
        model.addAttribute("product", new Product());
        return "create-product";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String processForm(Product product) {
        productService.save(product);
        return "redirect:/product/all";
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public String getProductId(Model model, @PathVariable Long id) {
        model.addAttribute("product", productService.findById(id));
        return "product";
    }

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public String getAllProducts(Model model) {
        model.addAttribute("products", productService.findAll());
        return "product-list";
    }

    @RequestMapping(path = "/delete", method = RequestMethod.GET)
    public String deleteById(@RequestParam Long id) {
        productService.deleteById(id);
        return "redirect:/product/all";
    }
}
