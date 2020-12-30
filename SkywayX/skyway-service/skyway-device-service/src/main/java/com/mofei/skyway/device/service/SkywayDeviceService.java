package com.mofei.skyway.device.service;

import com.mofei.skyway.device.entity.SkywayDevice;
import com.mofei.skyway.device.mapper.SkywayDeviceMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author mofei
 * @date 2020/12/29 20:21
 */
@Service
public class SkywayDeviceService {
    @Resource
    private SkywayDeviceMapper skywayDeviceMapper;

    public SkywayDevice getById(String id) {
        return skywayDeviceMapper.selectById(id);
    }
}
