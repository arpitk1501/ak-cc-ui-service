package com.ak.cc.service;

import com.ak.cc.entity.AccountEntity;
import com.ak.cc.entity.AssetCompositeEntity;
import com.ak.cc.entity.LegalEntity;
import com.ak.cc.entity.PositionEntity;

public interface CcService {

    LegalEntity saveLegalEntity(LegalEntity legalEntity);
    AccountEntity saveAccountEntity(AccountEntity accountEntity);
    AssetCompositeEntity addComposite(AssetCompositeEntity assetCompositeEntity);
    PositionEntity addPosition(PositionEntity positionEntity);
}
