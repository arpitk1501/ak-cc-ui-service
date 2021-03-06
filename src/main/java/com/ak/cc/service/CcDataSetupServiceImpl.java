package com.ak.cc.service;

import com.ak.cc.dao.AccountRepository;
import com.ak.cc.dao.AssetCompositeRepository;
import com.ak.cc.dao.LegalEntityRepository;
import com.ak.cc.dao.PositionRepository;
import com.ak.cc.entity.AccountEntity;
import com.ak.cc.entity.AssetCompositeEntity;
import com.ak.cc.entity.LegalEntity;
import com.ak.cc.entity.PositionEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Service
public class CcDataSetupServiceImpl implements CcDataSetupService {

    private final LegalEntityRepository legalEntityRepository;
    private final AccountRepository accountRepository;
    private final AssetCompositeRepository assetCompositeRepository;
    private final PositionRepository positionRepository;

    public CcDataSetupServiceImpl(LegalEntityRepository legalEntityRepository, AccountRepository accountRepository, AssetCompositeRepository assetCompositeRepository, PositionRepository positionRepository) {
        this.legalEntityRepository = legalEntityRepository;
        this.accountRepository = accountRepository;
        this.assetCompositeRepository = assetCompositeRepository;
        this.positionRepository = positionRepository;
    }

    @Override
    public LegalEntity saveLegalEntity(LegalEntity legalEntity) {
        legalEntity.setCreatedTs(LocalDateTime.now());
        return legalEntityRepository.save(legalEntity);
    }

    @Override
    public List<LegalEntity> getLe(String le) {
        return legalEntityRepository.findAllById(Collections.singletonList(le));
    }

    @Override
    public AccountEntity saveAccountEntity(AccountEntity accountEntity) {
        accountEntity.setCreatedTs(LocalDateTime.now());
        return accountRepository.save(accountEntity) ;
    }

    @Override
    public AssetCompositeEntity addComposite(AssetCompositeEntity assetCompositeEntity) {
        return assetCompositeRepository.save(assetCompositeEntity);
    }

    @Override
    public PositionEntity addPosition(PositionEntity positionEntity) {
        return positionRepository.save(positionEntity);
    }
}
