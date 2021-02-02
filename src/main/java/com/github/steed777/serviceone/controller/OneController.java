package com.github.steed777.serviceone.controller;


import com.github.steed777.serviceone.model.OneModel;
import com.github.steed777.serviceone.service.OneService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/onemodel")
public class OneController {

    private OneService oneService;

    @GetMapping("/list")
    public List<OneModel> getAll(){
        return oneService.getOneModel();
    }

   /* @GetMapping("/{onemodelId}")
    public List<OneModel> getById(@PathVariable("onemodelId") int onemodelId){
 OneModel oneModel = oneService.getOneModel().stream().filter(x -> x.getId() == onemodelId).
         findFirst().orElse();
 return oneModel;
    }*/


}
