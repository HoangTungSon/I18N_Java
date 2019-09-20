package blogSource.controller;

import blogSource.request.User;
import blogSource.response.UserName;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("userName")
public class LoginController {

    @GetMapping("/login")
    public String login(@ModelAttribute("user") User user){
        return "login";
    }

    @PostMapping("/login")
    public String dashBoard(@ModelAttribute("user") User user, Model model){
        UserName userName = new UserName();
        userName.setUserName(user.getUser());
        model.addAttribute("userName", userName);
        return "redirect:dashBoard";
    }
}
