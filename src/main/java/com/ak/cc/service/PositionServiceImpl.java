package com.ak.cc.service;

import com.ak.cc.dao.PositionCalcRepository;
import com.ak.cc.entity.PositionResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PositionServiceImpl implements PositionService{

    private PositionCalcRepository positionCalcRepository;

    public PositionServiceImpl(PositionCalcRepository positionCalcRepository) {
        this.positionCalcRepository = positionCalcRepository;
    }

    @Override
    public List<PositionResponseEntity> getPositionCalc(String leId) {
        return positionCalcRepository.findByLeId(leId);
    }
}
