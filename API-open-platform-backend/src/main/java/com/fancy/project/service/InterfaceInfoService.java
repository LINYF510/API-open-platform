package com.fancy.project.service;

import com.fancy.project.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Fancy
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2025-03-11 12:40:28
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
