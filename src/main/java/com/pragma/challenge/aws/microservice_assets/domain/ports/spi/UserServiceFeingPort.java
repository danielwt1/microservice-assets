package com.pragma.challenge.aws.microservice_assets.domain.ports.spi;

import com.pragma.challenge.aws.microservice_assets.domain.model.AccountableMaintenanceModel;
import com.pragma.challenge.aws.microservice_assets.domain.model.SedeAccountableModel;

public interface UserServiceFeingPort {
    SedeAccountableModel getSedeAccountable(Long typeId, Long idSede);
    AccountableMaintenanceModel getAccountableMaintenance(Long typeId,Long idUser);

}
