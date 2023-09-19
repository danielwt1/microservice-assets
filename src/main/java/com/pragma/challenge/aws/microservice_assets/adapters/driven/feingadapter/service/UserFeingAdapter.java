package com.pragma.challenge.aws.microservice_assets.adapters.driven.feingadapter.service;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.feingadapter.client.UserFeingClient;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.feingadapter.mapper.EmployeeModelMapper;
import com.pragma.challenge.aws.microservice_assets.domain.model.AccountableMaintenanceModel;
import com.pragma.challenge.aws.microservice_assets.domain.model.SedeAccountableModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.UserServiceFeingPort;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.apache.logging.log4j.Logger;

public class UserFeingAdapter implements UserServiceFeingPort {
    private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(UserFeingAdapter.class);
    private final UserFeingClient userFeingClient;
    private final EmployeeModelMapper employeeModelMapper;

    public UserFeingAdapter(UserFeingClient userFeingClient, EmployeeModelMapper employeeModelMapper) {
        this.userFeingClient = userFeingClient;
        this.employeeModelMapper = employeeModelMapper;
    }

    @CircuitBreaker(name = "sedeFeingClient", fallbackMethod = "getSedeAccountableFallback")
    @Override
    public SedeAccountableModel getSedeAccountable(Long typeId, Long idSede) {
        return this.userFeingClient.getSedeByIdAndType(typeId, idSede).getBody();
    }
    @CircuitBreaker(name = "accountableFeingClient", fallbackMethod = "getAccountableMaintenanceFallback")
    @Override
    public AccountableMaintenanceModel getAccountableMaintenance(Long typeId, Long idUser) {
        return null;
    }
    public SedeAccountableModel getSedeAccountableFallback(Long typeId, Long idSede, Throwable throwable) {
        logger.error("Error al obtener la sede accountable: ");
        return new SedeAccountableModel();
    }
    public AccountableMaintenanceModel getAccountableMaintenanceFallback(Long typeId, Long idUser, Throwable throwable) {
        logger.error("Error al obtener el accountable maintenance:");
        return new AccountableMaintenanceModel();
    }
}
