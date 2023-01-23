package shop.mtcoding.seller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.seller.model.Product;
import shop.mtcoding.seller.model.ProductRepository;

@Controller
public class ProductController {
    
    @Autowired
    ProductRepository productRepository;

    @GetMapping({"/", "product"})
    public String main(Model model) {
        List<Product> productList = productRepository.findAll();

        model.addAttribute("productList", productList);
        return "product/list";
    }

    @GetMapping("/product/{id}")
    public String detail(@PathVariable int id, Model model) {
        Product product = productRepository.findById(id);
        model.addAttribute("product", product);

        return "product/detail";
    }

    @GetMapping("/product/{id}/updateForm")
    public String updateForm(@PathVariable int id, Model model) {
        Product product = productRepository.findById(id);
        model.addAttribute("product", product);
        return "/product/updateForm";
    }

    @PostMapping("/product/{id}/update")
    public String update(@PathVariable int id, String name, Integer price, Integer qty) {
        int result = productRepository.updateById(id, name, price, qty);
        if (result == -1) {
            return "redirect:/notfound";
        }

        return "redirect:/product/{id}";
    }

    @PostMapping("product/{id}/delete")
    public String delete(@PathVariable int id) {
        int result = productRepository.deleteById(id);
        if (result == -1) {
            return "redirect:/notfound";
        }

        return "redirect:/";
    }
}
