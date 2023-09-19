package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity.Asset;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity.projections.AssetResponseProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {
    @Query(value = "SELECT\n" +
            "    ass.assetid," +
            "    ass.invoice_number as invoiceNumber, \n" +
            "    ass.purchase_date as purchaseDate, \n" +
            "    ass.description, \n" +
            "    ass.status, \n" +
            "    ass.accountable_id as accountableId,\n" +
            "    ass.accountable_type_id as accountableTypeId,\n" +
            "    abs.url,\n" +
            "    com.hard_drive as hardDrive,\n" +
            "    com.processor,\n" +
            "    com.ram,\n" +
            "    fx.furniture_fixed_asset_id as idFK,\n" +
            "    furn.detail as furnDetail,\n" +
            "    furn.location as furnLocation,\n" +
            "    furn.manufacturer,\n" +
            "    furn.quantity,\n" +
            "    lic.expiration_date as expirationDate,\n" +
            "    lic.license_state,\n" +
            "    lic.provider,\n" +
            "    mant.accountable_maintenance_id as accountableMaintenanceId,\n" +
            "    mant.type_id as typeId,\n" +
            "    moni.inches,\n" +
            "    tech.brand,\n" +
            "    tech.detail as techDetail,\n" +
            "    tech.location as techLocation,\n" +
            "    tech.warranty_detail as warrantyDetail,\n" +
            "    tech.warranty_expiration_date as warrantyExpirationDate\n" +
            "FROM asset.asset ass\n" +
            "LEFT JOIN asset.abstract abs ON abs.abstract_asset_id = ass.assetid\n" +
            "LEFT JOIN asset.computer com ON com.tech_computer_asset_id = ass.assetid\n" +
            "LEFT JOIN asset.fixed fx ON fx.furniture_fixed_asset_id = ass.assetid\n" +
            "LEFT JOIN asset.furniture furn ON furn.furniture_asset_id = ass.assetid\n" +
            "LEFT JOIN asset.license lic ON lic.abstract_license_asset_id = ass.assetid\n" +
            "LEFT JOIN asset.maintenance mant ON mant.furniture_maintenance_asse_id = ass.assetid\n" +
            "LEFT JOIN asset.monitor moni ON moni.tech_monitor_asset_id = ass.assetid\n" +
            "LEFT JOIN asset.technology tech ON tech.tech_asset_id = ass.assetid;", nativeQuery = true)
    List<AssetResponseProjection> findallAssets();
}
