// ProductController.java
package com.zmall.app;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("product", "优秀商品");
        return "index";
    }

    @GetMapping("/comments")
    public String comments(Model model) {
        model.addAttribute("comments", new String[]{"好评！", "非常喜欢！", "物美价廉！"});
        return "comments";
    }
}
