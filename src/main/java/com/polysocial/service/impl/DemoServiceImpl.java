package com.polysocial.service.impl;

import com.polysocial.dto.DemoDTO;
import com.polysocial.entity.Demo;
import com.polysocial.service.DemoService;
import com.polysocial.utils.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public DemoDTO getDemo() {
        Logger.info("Start getDemo service");
        try {
            Demo demo = new Demo("Cao Thăng", "Mậu Phi", "Hoàng Duy", "Đăng Trường");
            DemoDTO response = modelMapper.map(demo, DemoDTO.class);
            return response;
        }catch (Exception ex){
            Logger.error("Get demo exception: " + ex);
            return null;
        }
    }
}
