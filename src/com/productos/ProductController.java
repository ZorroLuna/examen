package com.productos;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
 
@Controller
public class ProductController {
 
    @Autowired
    private ProductService prodService;
 
    @RequestMapping("/")
    public ModelAndView home() {
        List<Producto> listproducto = prodService.listAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listProduct", listproducto);
        return mav;
    }
    @RequestMapping("/new")
    public String newprodForm(Map<String, Object> model) {
        Producto prod = new Producto();
        model.put("producto", prod);
        return "new_producto";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProd(@ModelAttribute("producto") Producto prod) {
        prodService.save(prod);
        return "redirect:/";
    }
    
    @RequestMapping("/edit")
    public ModelAndView editProdForm(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("edit_producto");
        Producto prod = prodService.get(id);
        mav.addObject("producto", prod);
     
        return mav;
    }
    
    @RequestMapping("/delete")
    public String deleteProdForm(@RequestParam long id) {
        prodService.delete(id);
        return "redirect:/";       
    }
    @RequestMapping("/search")
    public ModelAndView search(@RequestParam String keyword) {
        List<Producto> result = prodService.search(keyword);
        ModelAndView mav = new ModelAndView("search");
        mav.addObject("result", result);
     
        return mav;    
    }
    
}