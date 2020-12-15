package com.k62j.uet.suggest_come_out.models.request;

import com.sun.istack.NotNull;
import lombok.Getter;

@Getter
public class ReqPostaDta {
    @NotNull
    private String outlook;

    @NotNull
    private Integer temp;

    @NotNull
    private String wind;

    @NotNull
    private String date;

    @NotNull
    private String decisive;

}
