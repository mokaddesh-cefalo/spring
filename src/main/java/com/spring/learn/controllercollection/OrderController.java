package com.spring.learn.controllercollection;

import com.spring.learn.modelclasses.Order;
import com.spring.learn.modelclasses.Taco;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/current")
    public String processOrder(Model model) {
        model.addAttribute("order", new Order());
        return "orderForm";
    }
}
