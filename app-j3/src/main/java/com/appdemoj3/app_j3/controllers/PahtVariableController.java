package com.appdemoj3.app_j3.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appdemoj3.app_j3.models.User;
import com.appdemoj3.app_j3.models.dto.ParamsDto;


import org.json.JSONObject;



// AQUI SE RECIBE SOLO UNA VARIABLE
 
@RestController 
@RequestMapping("/api/demovar")
@CrossOrigin (origins = "*")



public class PahtVariableController {

    // AQUI CON EL @VALUE EXTRAIGO LOS DATOS DEL PROPERTIES Y LOS INSERTO EN ESTA VARIABLES

    @Value("${app.name}")
    private String name;
    @Value("${app.message}")
    private String message;
    @Value("${app.version}")
    private String version;
    @Value("${app.listwords}")
    private String[] listwords;
    @Value("${app.listaroles}")
    private List<String> lstroles;

    // EL #{} SE USA PARA DEFINIR OPERACIONES ESPECIALES COMO EL SPLIT()
    @Value("#{'${app.listaroles}'.split(',')}")
    private List<String> customlstroles;
    @Value("#{'${app.listaroles}'.toUpperCase().split(',')}")
    private List<String> customlstrolesMayuscula;
    @Value("#{${app.inventory}}")
    private Map<String,Object> inventory;

    // El #{T()} , SE USA PARA DEFINIR OPERACIONES MATEMATICAS 
    @Value("#{T(java.lang.Integer).parseInt(${app.inventory}['price']) * T(java.lang.Integer).parseInt(${app.inventory}['stock'])}")
    private Long totalInv;


    //Usando Env CREAMOS VARIABLES DE ENTORNO
    @Autowired
    private Environment env;


    // ESTE METODO OBTIENE LOS VALORES DE LAS VARIABLE Y LOS INSERTA EN EL MAP LLAMADO JSON Y LO RETORNA
    @GetMapping("/valores")
    public Map<String,Object> valores(){
    Map<String,Object> json = new HashMap<>();
    json.put("name", name);
    json.put("version",version);
    json.put("listwords",listwords);
    json.put("lstroles", lstroles);
    json.put("clstroles", customlstroles);
    json.put("clstrolesMayus", customlstrolesMayuscula);
    json.put("inventory", inventory);
    json.put("valor", totalInv);
    json.put("message",message);
    json.put("message2",env.getProperty("app.message"));
    String data = env.getProperty("app.inventory");
    
    // el jsonobject tiene una dependencia en el pom.
    JSONObject jsonObject = new JSONObject(data);
    json.put("price2",jsonObject.getLong("price"));
    return json;
    }

    // http://localhost:8080/api/demovar/valores
    @GetMapping("/saludo/{message}")
    public ParamsDto saludo(@PathVariable String message) {
        ParamsDto param = new ParamsDto(); 
        param.setMessage(message);
        return param;
    } 





}
