package com.example.thymeleaf_tour.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// mvc controller annotation to handle http requests/generation of responses
@Controller
public class HomeController {

    // annotation for this GET requests url path
    @GetMapping("/showflowerList")

    // CONTROLLER METHOD that is invoked by Spring when a GET request is made to url path
    // Model obj 'model is passed in as param/arg
    // in Spring MVC, Model is used to pass data from the controller to the view.
    public String sendDataToHtml(Model model) {

        // array of strings
        String[] flowers = new String[]{"Rose", "Lily", "Tulip", "Carnation", "Hyacinth"};

        // array of strings
        String[] City = new String[]{"nyc", "nj", "dallas", "chicago", "philadelphia"};

        // method that adds the flowers array to the model with the name "flowersVariable"
        model.addAttribute("flowersVariable", flowers);

        // method that adds the City array to the model with the name "CityVariable".
        model.addAttribute("CityVariable", City);

        // after processing, the method will return a string "viewFlowers".
        // The data and this view name will be used to generate a response to the client when a GET request is made to "/showflowerList".
        // The actual view template ("viewFlowers") would then
        // use the data in the model to render an appropriate HTML response, displaying the flower names and cities.
        return "viewFlowers";
    }
}
