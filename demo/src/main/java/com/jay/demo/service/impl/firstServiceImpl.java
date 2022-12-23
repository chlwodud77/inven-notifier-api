package com.jay.demo.service.impl;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.jay.demo.service.firstService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class firstServiceImpl implements firstService {

    @Override
    public Map<String, Object> getFirstData() {
        Map<String, Object> firstData = new HashMap<>();
        Map<String, Object> testData = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        testData.put("name", "jay");
        testData.put("age", 1);
        firstData.put("label1", testData);
        firstData.put("label2", "check2");
        firstData.put("label3", "check3");

        return firstData;
    }
}
