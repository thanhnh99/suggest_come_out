package com.k62j.uet.suggest_come_out.models.response.http_response;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.k62j.uet.suggest_come_out.constant.MessageConstant;
import com.k62j.uet.suggest_come_out.constant.StatusCode;

@Data
@NoArgsConstructor
public class HttpResponse<T> extends MessageResponse {
    private T data;


    public HttpResponse(Integer statusCode, String message, T data)
    {
        super(statusCode,message);
        this.data = data;
    }
    public HttpResponse(T data)
    {
        super(StatusCode.OK, MessageConstant.SUCCESS);
        this.data = data;
    }
}