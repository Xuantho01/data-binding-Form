package controllers;

import model.Login;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import service.checkLogin;
@Controller
public class LoginController {

    @GetMapping("/")
    public String getLogin(Model model){
        model.addAttribute("login", new Login());
        return "index";
    }

    @PostMapping("/login")
    public String getDetail(@ModelAttribute Login login, Model model){
//        User user = checkLogin.checkLogin(login);
//        if (user == null){
//            return "index";
//        }
        model.addAttribute("login",login);
        return "detail";
    }
}
