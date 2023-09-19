package com.pragma.challenge.aws.microservice_assets.adapters.driven.feingadapter.client;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.feingadapter.dto.AccountableMaintenanceDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.feingadapter.dto.SedeAccountMaintenanceDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "userFeingClient", url = "${feing.client.user.url}")
public interface UserFeingClient {
    @GetMapping("/employee/")
    ResponseEntity<AccountableMaintenanceDTO> getEmployeeByIdAndType(@RequestParam Long id, @RequestParam Long type);

    @GetMapping("/sede/")
    ResponseEntity<SedeAccountMaintenanceDTO> getSedeByIdAndType(@RequestParam Long id, @RequestParam Long type);
}
