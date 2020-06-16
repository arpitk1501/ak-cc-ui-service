package com.ak.cc.resources;

import com.ak.cc.entity.AccountEntity;
import com.ak.cc.entity.AssetCompositeEntity;
import com.ak.cc.entity.LegalEntity;
import com.ak.cc.entity.PositionEntity;
import com.ak.cc.service.CcService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/main")
public class CcDataSetupController {

    private final CcService ccService;

    public CcDataSetupController(CcService ccService) {
        this.ccService = ccService;
    }

    @GetMapping("/test")
    public String test(@RequestParam String input) {
        System.out.println("in test + " + input);
        return input;
    }

    @PostMapping("/add-le")
    public LegalEntity addLE(@RequestBody LegalEntity legalEntity) {
        System.out.println("in addLe + " + legalEntity);
        legalEntity = ccService.saveLegalEntity(legalEntity);
        return legalEntity;
    }

    @PostMapping("/add-account")
    public AccountEntity addAccount(@RequestBody AccountEntity accountEntity) {
        System.out.println("in addAccount + " + accountEntity);
        accountEntity = ccService.saveAccountEntity(accountEntity);
        return accountEntity;
    }

    @PostMapping("/add-asset-composite")
    public AssetCompositeEntity addComposite(@RequestBody AssetCompositeEntity assetCompositeEntity) {
        System.out.println("in addComposite + " + assetCompositeEntity);
        assetCompositeEntity = ccService.addComposite(assetCompositeEntity);
        return assetCompositeEntity;
    }

    @PostMapping("/add-position")
    public PositionEntity addPosition(@RequestBody PositionEntity positionEntity) {
        System.out.println("in addPosition + " + positionEntity);
        positionEntity = ccService.addPosition(positionEntity);
        return positionEntity;
    }
}
