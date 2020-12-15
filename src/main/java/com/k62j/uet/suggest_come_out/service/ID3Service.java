package com.k62j.uet.suggest_come_out.service;

import com.k62j.uet.suggest_come_out.dao.IDecisiveTreeConditionDAO;
import com.k62j.uet.suggest_come_out.id3.Id3;
import com.k62j.uet.suggest_come_out.models.entity.DecisiveTreeCondition;
import com.k62j.uet.suggest_come_out.models.request.ReqPostaDta;
import com.k62j.uet.suggest_come_out.models.response.http_response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ID3Service {
    @Autowired
    Id3 id3;

    @Autowired
    IDecisiveTreeConditionDAO decisiveTreeConditionDAO;
    public MessageResponse decisive(String outlook,
                                    Integer temp,
                                    String wind,
                                    String date) {
        MessageResponse response = new MessageResponse();
        response.setMessage(id3.decision(outlook, temp, wind, date));
        return response;
    }

    public MessageResponse postData(@RequestBody ReqPostaDta requestData)
    {
        DecisiveTreeCondition decisiveTreeCondition = new DecisiveTreeCondition(requestData);
        decisiveTreeConditionDAO.save(decisiveTreeCondition);
        MessageResponse response = new MessageResponse();
        return response;
    }
}
