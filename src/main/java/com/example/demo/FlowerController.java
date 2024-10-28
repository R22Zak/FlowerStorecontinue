package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flowers") 
public class FlowerController {

    @GetMapping
    public List<Flower> getFlowers() {
        Flower flower1 = new Flower();
        flower1.setSepalLength(5.5);
        flower1.setPrice(15.0);
        flower1.setFlowerType(FlowerType.ROSE);
        flower1.setColor(FlowerColor.RED);

        Flower flower2 = new Flower();
        flower2.setSepalLength(6.0);
        flower2.setPrice(12.0);
        flower2.setFlowerType(FlowerType.TULIP);
        flower2.setColor(FlowerColor.BLUE);

        return List.of(flower1, flower2);
    }
}
