package com.k62j.uet.suggest_come_out.handleException;

import com.k62j.uet.suggest_come_out.constant.StatusCode;
import com.k62j.uet.suggest_come_out.models.response.http_response.HttpResponse;
import com.k62j.uet.suggest_come_out.models.response.http_response.MessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
//@Order(Ordered.LOWEST_PRECEDENCE)
public class ExceptionHandle {
    /**
     * Tất cả các Exception không được khai báo sẽ được xử lý tại đây
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.OK)
    public MessageResponse handleAllException(Exception exception) {
        // quá trình kiểm soat lỗi diễn ra ở đây
        if (exception instanceof MethodArgumentNotValidException) {
            Object body = ((MethodArgumentNotValidException) exception).getBindingResult().getAllErrors();
            return new HttpResponse<Object>(StatusCode.BAD_REQUEST, "Fail", body);
        }
        return new MessageResponse(StatusCode.BAD_REQUEST, exception.getMessage());
    }
}