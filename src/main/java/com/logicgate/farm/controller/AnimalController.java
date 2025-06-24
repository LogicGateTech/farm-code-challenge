package com.logicgate.farm.controller;

import com.logicgate.farm.domain.Animal;
import com.logicgate.farm.service.AnimalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

  private final AnimalService animalService;

  @Autowired
  public AnimalController(AnimalService animalService) {
    this.animalService = animalService;
  }

  @GetMapping(path = "/api/v1/animals")
  public List<Animal> findAllAnimals() {
    return animalService.findAll();
  }

}
