package com.k62j.uet.suggest_come_out.models.response.http_response;

import com.k62j.uet.suggest_come_out.constant.MessageConstant;
import com.k62j.uet.suggest_come_out.constant.StatusCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageResponse {
    private Integer statusCode = StatusCode.OK;
    private String message = MessageConstant.SUCCESS;
}
