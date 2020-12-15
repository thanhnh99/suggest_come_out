package com.k62j.uet.suggest_come_out.models.entity;

import com.k62j.uet.suggest_come_out.models.request.ReqPostaDta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DecisiveTreeCondition extends BaseEntity{
    private String outlook;
    private String temp;
    private String wind;
    private String date;
    private String decisive;

    public DecisiveTreeCondition(ReqPostaDta requestData)
    {
        this.outlook = requestData.getOutlook();
        this.temp = requestData.getTemp().toString();
        this.wind = requestData.getWind();
        this.date = requestData.getDate();
        this.decisive = requestData.getDecisive();

    }
}
