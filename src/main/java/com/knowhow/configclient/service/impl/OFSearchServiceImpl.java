package com.knowhow.configclient.service.impl;

import com.knowhow.configclient.SearchType;
import com.knowhow.configclient.service.SearchService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service("OF")
@Order(1)
public class OFSearchServiceImpl implements SearchService {

    @Override
    public String findAddress() {
        return "find address using OF Database";
    }
}
