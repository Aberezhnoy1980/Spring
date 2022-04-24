package ru.aberezhnoy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.aberezhnoy.config.ProductProps;

@Controller
@RequiredArgsConstructor
public class HelloController {

    private final ProductProps productProps;

    @GetMapping("/hello")
    public String helloMessageJsp(Model model) {
//        throw new RuntimeException("test Exception");
        if (!CollectionUtils.isEmpty(productProps.getProducts())) {
            model.addAttribute("msg", productProps.getProducts().size());
        }
        return "hello";
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public String handleRuntimeException(RuntimeException e) {
        return "So sad, but... fail";
    }
}
