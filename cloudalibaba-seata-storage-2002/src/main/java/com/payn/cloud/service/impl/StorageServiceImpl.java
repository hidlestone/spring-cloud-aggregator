package com.payn.cloud.service.impl;

import com.payn.cloud.dao.StorageDao;
import com.payn.cloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        try {
//            Thread.sleep(5000);
            storageDao.decrease(productId,count);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
