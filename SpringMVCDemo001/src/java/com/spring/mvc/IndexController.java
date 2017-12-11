/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author catarino
 */
@Controller
public class IndexController {
    
    
    @RequestMapping(value="/about")
    public ModelAndView getAbout()
    {
        return new ModelAndView( "about.jsp");
    }
}
