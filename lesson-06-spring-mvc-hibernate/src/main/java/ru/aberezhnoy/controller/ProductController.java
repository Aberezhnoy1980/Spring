package ru.aberezhnoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.aberezhnoy.entity.Product;
import ru.aberezhnoy.service.ProductService;

@Controller
@RequestMapping("/product")
//@RequiredArgsConstructor
@Transactional
public class ProductController {

    private final ProductService ps;

    public ProductController(ProductService ps) {
        this.ps = ps;
    }

    @GetMapping("/create")
    public String showForm(Model model) {
        model.addAttribute("product", new Product());
        return "create-product";
    }

    @PostMapping("/create")
    public String processForm(Product product) {
        ps.saveOrUpdate(product);
        return "redirect:/product/all";
    }

    @GetMapping("/all")
    public String getAllProduct(Model model) {
        model.addAttribute("products", ps.findAll());
        return "product-list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam Long id) {
        ps.deleteById(id);
        return "redirect:/product/all";
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public String getProductId(Model model, @PathVariable Long id) {
        model.addAttribute("product", ps.findById(id));
        return "product";
    }
}
