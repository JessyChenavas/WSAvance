package com.example.WSAvance.controller;

import com.example.WSAvance.models.Vol;
import com.example.WSAvance.repository.VolRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Controller
@RequestMapping(path = "/vol")
public class VolController {
    private VolRepository volRepository;
    public VolController(VolRepository volRepository) {
        this.volRepository = volRepository;
    }

    @GetMapping("")
    public String all(Model model) {
        List<Vol> vols = this.volRepository.findAll();

        model.addAttribute("vols", vols);

        return "vols";
    }
}
