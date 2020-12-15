package com.k62j.uet.suggest_come_out.controller;

import com.k62j.uet.suggest_come_out.models.request.ReqPostaDta;
import com.k62j.uet.suggest_come_out.models.response.http_response.MessageResponse;
import com.k62j.uet.suggest_come_out.service.ID3Service;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("id3")
public class ID3Controller {
    @Autowired
    ID3Service id3Service;

    @GetMapping()
    public ResponseEntity<MessageResponse> decisive(@RequestParam(name = "outlook") @NotNull String outlook,
                                                    @RequestParam(name = "temp") @NotNull Integer temp,
                                                    @RequestParam(name = "wind") @NotNull String wind,
                                                    @RequestParam(name = "date") @NotNull String date)
    {
        outlook = outlook.toLowerCase();
        wind = outlook.toUpperCase();
        date = outlook.toLowerCase();
        return ResponseEntity.ok().body(id3Service.decisive(outlook, temp, wind, date));
    }

    @PostMapping()
    public ResponseEntity<MessageResponse> postData(@RequestBody ReqPostaDta requestData)
    {
        return ResponseEntity.ok().body(id3Service.postData(requestData));
    }
}
