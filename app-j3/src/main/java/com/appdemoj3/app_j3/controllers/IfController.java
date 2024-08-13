package com.appdemoj3.app_j3.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.appdemoj3.app_j3.models.User;

@Controller

public class IfController {

    // MAPEAR CON LOS IF

    // http://localhost:8080/if/list
    @GetMapping("/v1/list")

    public String list(ModelMap model){

    List<User> users = Arrays.asList(
    new User(null, "Perez" ,null),
    new User("Martha","Sanchez",null),
    new User("Vicente","Camargo",null)
    );
    model.addAttribute("title", "Listado de Usuarios");
    model.addAttribute("users", users);
    return "CARLA/list"; // DEBE SER EL NOMBRE DEL HTML Y SU UBICACION

    }



    // http://localhost:8080/list
    @GetMapping("/v2/list")

        public String listdetails(ModelMap model){

        User user = new User("Juan",null,null);
        User userA = new User("Camilo","Hernandez",null);
        User userB = new User("Martha","Estupiñan","xd");

        List<User> users = new ArrayList<>();

        users.add(user);
        users.add(userA);
        users.add(userB);

        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", users);

        return "CARLA/list"; // DEBE SER EL NOMBRE DEL HTML Y SU UBICACION

        }   

        // Lo mismo pero usando as list
 
        @GetMapping("/v3/list")

        public String listarraydetails(Model model){

        User user = new User("Juan","Perez" , "123124");
        User userA = new User("Camilo","Hernandez","123124");
        User userB = new User("Martha","Estupiñan" , "123124");

        List<User> users = Arrays.asList(user,userA,userB);
        
        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", users);

        return "CARLA/list";
        
        }  

}
