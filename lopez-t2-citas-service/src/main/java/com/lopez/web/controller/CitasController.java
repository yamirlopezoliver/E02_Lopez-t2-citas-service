package com.lopez.web.controller;

import com.lopez.web.dto.CitasDto;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class CitasController {
    @GetMapping("/by-doctor/{doctorId}")
    public List<CitasDto> getCitasByCitas(@PathVariable Long doctorId,
                                                 @AuthenticationPrincipal Jwt jwt){
        String clientId = jwt.getClaimAsString("clientId");
        return List.of(
                new CitasDto(1L, "Lopez Oliver_01"),
                new CitasDto(2L, "Lopez Oliver_02")
        );


    }
}
