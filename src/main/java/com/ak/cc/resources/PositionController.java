package com.ak.cc.resources;


import com.ak.cc.entity.PositionResponseEntity;
import com.ak.cc.service.PositionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/live-position")
public class PositionController {

    private final PositionService positionService;

    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    @GetMapping
    public List<PositionResponseEntity> getLivePositions(@RequestParam String leId) {
        System.out.println("in getLivePositions + " + leId);
        return positionService.getPositionCalc(leId);
    }
}
