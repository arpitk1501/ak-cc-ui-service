package com.ak.cc.service;

import com.ak.cc.entity.PositionResponseEntity;

import java.util.List;

public interface PositionService {

List<PositionResponseEntity> getPositionCalc(String leId);
}
