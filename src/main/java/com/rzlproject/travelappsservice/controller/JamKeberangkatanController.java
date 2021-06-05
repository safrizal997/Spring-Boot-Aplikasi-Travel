package com.rzlproject.travelappsservice.controller;

import com.rzlproject.travelappsservice.entity.JamKeberangkatan;
import com.rzlproject.travelappsservice.model.JamKeberangkatanRequest;
import com.rzlproject.travelappsservice.service.JamKeberangkaanService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/jamkeberangkatan", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin("*")
@Api(tags = "Jam Keberangkatan Service", description = "Handling Jam Keberangkatan Service")
public class JamKeberangkatanController {

    @Autowired
    private JamKeberangkaanService jamKeberangkaanService;

    @GetMapping
    public List<JamKeberangkatan> getAll() {
        return jamKeberangkaanService.getAll();
    }

    @PostMapping
    public JamKeberangkatan addJamKeberangkatan(@RequestBody JamKeberangkatanRequest jamKeberangkatanRequest) {
        return jamKeberangkaanService.addJamKeberangkatan(jamKeberangkatanRequest);
    }

    @PutMapping(path = "/{jamId}")
    public JamKeberangkatan editJamKeberangkatan(@RequestBody JamKeberangkatanRequest jamKeberangkatanRequest, @PathVariable("jamId") Long jamId) {
        return jamKeberangkaanService.editJamKeberangkatan(jamKeberangkatanRequest, jamId);
    }

    @DeleteMapping(path = "/{jamId)")
    public String DeleteJamById(@PathVariable("jamId") Long jamId) {
        return jamKeberangkaanService.DeleteJamById(jamId);
    }
}
