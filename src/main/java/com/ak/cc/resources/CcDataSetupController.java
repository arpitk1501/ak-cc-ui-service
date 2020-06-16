package com.ak.cc.resources;

import com.ak.cc.entity.AccountEntity;
import com.ak.cc.entity.AssetCompositeEntity;
import com.ak.cc.entity.LegalEntity;
import com.ak.cc.entity.PositionEntity;
import com.ak.cc.service.CcDataSetupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
public class CcDataSetupController {

    private final CcDataSetupService ccDataSetupService;

    public CcDataSetupController(CcDataSetupService ccDataSetupService) {
        this.ccDataSetupService = ccDataSetupService;
    }

    @GetMapping("/test")
    public String test(@RequestParam String input) {
        System.out.println("in test + " + input);
        return input;
    }

    @PostMapping("/add-le")
    public LegalEntity addLE(@RequestBody LegalEntity legalEntity) {
        System.out.println("in addLe + " + legalEntity);
        legalEntity = ccDataSetupService.saveLegalEntity(legalEntity);
        return legalEntity;
    }

    @GetMapping("/get-le")
    public List<LegalEntity> getLe(@RequestParam String input) {
        System.out.println("in getLe + " + input);
        return ccDataSetupService.getLe(input);
    }

    @PostMapping("/add-account")
    public AccountEntity addAccount(@RequestBody AccountEntity accountEntity) {
        System.out.println("in addAccount + " + accountEntity);
        accountEntity = ccDataSetupService.saveAccountEntity(accountEntity);
        return accountEntity;
    }

    @PostMapping("/add-asset-composite")
    public AssetCompositeEntity addComposite(@RequestBody AssetCompositeEntity assetCompositeEntity) {
        System.out.println("in addComposite + " + assetCompositeEntity);
        assetCompositeEntity = ccDataSetupService.addComposite(assetCompositeEntity);
        return assetCompositeEntity;
    }

    @PostMapping("/add-position")
    public PositionEntity addPosition(@RequestBody PositionEntity positionEntity) {
        System.out.println("in addPosition + " + positionEntity);
        positionEntity = ccDataSetupService.addPosition(positionEntity);
        return positionEntity;
    }
}
