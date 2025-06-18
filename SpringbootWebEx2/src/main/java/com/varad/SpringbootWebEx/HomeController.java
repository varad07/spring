package com.varad.SpringbootWebEx;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
    //servlet way
//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("number1"));
//        int num2 = Integer.parseInt(req.getParameter("number2"));
//        int result = num1+num2;
//        session.setAttribute("num1",num1);
//        session.setAttribute("num2",num2);
//        session.setAttribute("result",result);
//        return "result.jsp";
//    }

    //by spring
//@RequestMapping("add")
//public String add(@RequestParam("number1") int num1,@RequestParam("number2") int num2, Model model){
//    int result = num1+num2;
//    model.addAttribute("num1",num1);
//    model.addAttribute("num2",num2);
//    model.addAttribute("result",result);
////    session.setAttribute("num2",num2);
////    session.setAttribute("result",result);
//    return "result";
//}

    @RequestMapping("add")
    public String add(Alien alien){
        System.out.println("calling");
        return "result";
    }


}
