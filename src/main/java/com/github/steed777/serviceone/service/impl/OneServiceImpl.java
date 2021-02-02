package com.github.steed777.serviceone.service.impl;


import com.github.steed777.serviceone.model.OneModel;
import com.github.steed777.serviceone.service.OneService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OneServiceImpl implements OneService {

    List<OneModel> oneModels;

    @Override
    public List<OneModel> getOneModel() {
        if(oneModels == null){
            oneModels = new ArrayList<>();
            OneModel o1 = new OneModel(1 , "Николаев", "nic@yandex.ru");
            OneModel o2 = new OneModel(2, "Александров", "alek@yandex.ru");

            oneModels.add(o1);
            oneModels.add(o2);
        }
        return oneModels;
    }
}
