package hiber.Controller;


import hiber.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class UserController {

    @Autowired
    UserService carServiceImpl;

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int numbers, Model model) {
        model.addAttribute("carlist", carServiceImpl.getUserByCar("BMW", 320).toString().split(","));
        return "cars";
    }

}