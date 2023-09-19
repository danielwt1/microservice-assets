package com.pragma.challenge.aws.microservice_assets.configuration;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.AbstractEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.AssetEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.ComputerEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.FixedEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.FurnitureEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.LicenseEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.MaintenanceEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.MonitorEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.TechnologyEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.AbstractRepository;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.AssetRepository;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.ComputerRepository;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.FixedRepository;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.FurnitureRepository;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.LicenseRepository;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.MaintenanceRepository;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.MonitorRepository;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.TechnologyRepository;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service.AbstractPersistenceAdapter;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service.AssetPersistenceAdapter;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service.ComputerPersistenceAdapter;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service.FixedPersistenceAdapter;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service.FurniturePersistenceAdapter;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service.LicensePersistenceAdapter;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service.MaintenancePersistenceAdapter;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service.MonitorPersistenceAdapter;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service.TechnologyPersistenceAdapter;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.AbstractApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.AssetApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.ComputerApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.FixedApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.FurnitureApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.LicenseApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.MonitorApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.TechnologyApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.AbstractPersistencePort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.AssetPersistencePort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.ComputerPersistencePort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.FixedPersistencePort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.FurniturePersistencePort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.LicensePersistencePort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.MaintenanceApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.MaintenancePersistencePort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.MonitorPersistencePort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.TechnologyPersistencePort;
import com.pragma.challenge.aws.microservice_assets.domain.usecase.AbstractUseCase;
import com.pragma.challenge.aws.microservice_assets.domain.usecase.AssetUseCase;
import com.pragma.challenge.aws.microservice_assets.domain.usecase.ComputerUseCase;
import com.pragma.challenge.aws.microservice_assets.domain.usecase.FixedUseCase;
import com.pragma.challenge.aws.microservice_assets.domain.usecase.FurnitureUseCase;
import com.pragma.challenge.aws.microservice_assets.domain.usecase.LicenseUseCase;
import com.pragma.challenge.aws.microservice_assets.domain.usecase.MaintenanceUseCase;
import com.pragma.challenge.aws.microservice_assets.domain.usecase.MonitorUseCase;
import com.pragma.challenge.aws.microservice_assets.domain.usecase.TechnologyUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

    private final AbstractRepository abstractRepository;
    private final AbstractEntityMapper abstractEntityMapper;

    private final AssetRepository assetRepository;
    private final AssetEntityMapper assetEntityMapper;

    private final ComputerRepository computerRepository;
    private final ComputerEntityMapper computerEntityMapper;

    private final FixedRepository fixedRepository;
    private final FixedEntityMapper fixedEntityMapper;

    private final LicenseRepository licenseRepository;
    private final LicenseEntityMapper licenseEntityMapper;


    private final MaintenanceRepository maintenanceRepository;
    private final MaintenanceEntityMapper maintenanceEntityMapper;

    private final MonitorRepository monitorRepository;
    private final MonitorEntityMapper monitorEntityMapper;

    private final FurnitureRepository furnitureRepository;
    private final FurnitureEntityMapper furnitureEntityMapper;

    private final TechnologyRepository technologyRepository;
    private final TechnologyEntityMapper technologyEntityMapper;

    public BeansConfiguration(AbstractRepository abstractRepository, AbstractEntityMapper abstractEntityMapper, AssetRepository assetRepository, AssetEntityMapper assetEntityMapper, ComputerRepository computerRepository, ComputerEntityMapper computerEntityMapper, FixedRepository fixedRepository, FixedEntityMapper fixedEntityMapper, LicenseRepository licenseRepository, LicenseEntityMapper licenseEntityMapper, MaintenanceRepository maintenanceRepository, MaintenanceEntityMapper maintenanceEntityMapper, MonitorRepository monitorRepository, MonitorEntityMapper monitorEntityMapper, FurnitureRepository furnitureRepository, FurnitureEntityMapper furnitureEntityMapper, TechnologyRepository technologyRepository, TechnologyEntityMapper technologyEntityMapper) {
        this.abstractRepository = abstractRepository;
        this.abstractEntityMapper = abstractEntityMapper;
        this.assetRepository = assetRepository;
        this.assetEntityMapper = assetEntityMapper;
        this.computerRepository = computerRepository;
        this.computerEntityMapper = computerEntityMapper;
        this.fixedRepository = fixedRepository;
        this.fixedEntityMapper = fixedEntityMapper;
        this.licenseRepository = licenseRepository;
        this.licenseEntityMapper = licenseEntityMapper;
        this.maintenanceRepository = maintenanceRepository;
        this.maintenanceEntityMapper = maintenanceEntityMapper;
        this.monitorRepository = monitorRepository;
        this.monitorEntityMapper = monitorEntityMapper;
        this.furnitureRepository = furnitureRepository;
        this.furnitureEntityMapper = furnitureEntityMapper;
        this.technologyRepository = technologyRepository;
        this.technologyEntityMapper = technologyEntityMapper;
    }
    @Bean
    public TechnologyPersistencePort technologyPersistencePort() {
        return new TechnologyPersistenceAdapter(technologyRepository, technologyEntityMapper);
    }
    @Bean
    public TechnologyApiPort technologyApiPort() {
        return new TechnologyUseCase(technologyPersistencePort());
    }
    @Bean
    public AbstractPersistencePort abstractPersistencePort() {
        return new AbstractPersistenceAdapter(abstractRepository, abstractEntityMapper);
    }

    @Bean
    public AssetPersistencePort assetPersistencePort() {
        return new AssetPersistenceAdapter(assetRepository, assetEntityMapper);
    }

    @Bean
    public ComputerPersistencePort computerPersistencePort() {
        return new ComputerPersistenceAdapter(computerRepository, computerEntityMapper);
    }

    @Bean
    public FixedPersistencePort fixedPersistencePort() {
        return new FixedPersistenceAdapter(fixedEntityMapper, fixedRepository);
    }

    @Bean
    public LicensePersistencePort licensePersistencePort() {
        return new LicensePersistenceAdapter(licenseRepository, licenseEntityMapper);
    }
    @Bean
    public FurniturePersistencePort  furniturePersistencePort() {
        return new FurniturePersistenceAdapter(furnitureRepository, furnitureEntityMapper);
    }

    @Bean
    public MaintenancePersistencePort maintenancePersistencePort() {
        return new MaintenancePersistenceAdapter(maintenanceRepository, maintenanceEntityMapper);
    }

    @Bean
    public MonitorPersistencePort monitorPersistencePort() {
        return new MonitorPersistenceAdapter(monitorRepository, monitorEntityMapper);
    }

    @Bean
    public AbstractApiPort abstractApiPort() {
        return new AbstractUseCase(abstractPersistencePort());
    }

    @Bean
    public AssetApiPort assetApiPort() {
        return new AssetUseCase(assetPersistencePort());
    }

    @Bean
    public ComputerApiPort computerApiPort() {
        return new ComputerUseCase(computerPersistencePort());
    }

    @Bean
    public FixedApiPort fixedApiPort() {
        return new FixedUseCase(fixedPersistencePort());
    }

    @Bean
    public LicenseApiPort licenseApiPort() {
        return new LicenseUseCase(licensePersistencePort());
    }

    @Bean
    public FurnitureApiPort furnitureApiPort() {
        return new FurnitureUseCase(furniturePersistencePort());
    }
    @Bean
    public MaintenanceApiPort maintenanceApiPort() {
        return new MaintenanceUseCase(maintenancePersistencePort());
    }

    @Bean
    public MonitorApiPort monitorApiPort() {
        return new MonitorUseCase(monitorPersistencePort());
    }

}
