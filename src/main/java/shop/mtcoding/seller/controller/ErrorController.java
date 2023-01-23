package shop.mtcoding.seller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
    
    @GetMapping("/notfound")
    public String notFound() {
        return "error/error";
    }
}
