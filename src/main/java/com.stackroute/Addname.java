package com.stackroute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stackroute.add.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Addname {

    @RequestMapping("/add")

   public ModelAndView addname(HttpServletRequest request,HttpServletResponse response) {

        System.out.print("The name is :");
        int i=Integer.parseInt(request.getParameter("t1"));
        int j=Integer.parseInt(request.getParameter("t2"));
        AddService  as=new AddService();
        int k=as.add(i,j);
        System.out.println(k);

        ModelAndView mv =new ModelAndView("display");
        mv.addObject("result",k);
        System.out.println(mv);
        return mv;
    }

}
