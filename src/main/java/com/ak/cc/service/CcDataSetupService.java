package com.ak.cc.service;

import com.ak.cc.entity.AccountEntity;
import com.ak.cc.entity.AssetCompositeEntity;
import com.ak.cc.entity.LegalEntity;
import com.ak.cc.entity.PositionEntity;

import java.util.List;

public interface CcDataSetupService {

    LegalEntity saveLegalEntity(LegalEntity legalEntity);
    List<LegalEntity> getLe(String le);
    AccountEntity saveAccountEntity(AccountEntity accountEntity);
    AssetCompositeEntity addComposite(AssetCompositeEntity assetCompositeEntity);
    PositionEntity addPosition(PositionEntity positionEntity);
}
