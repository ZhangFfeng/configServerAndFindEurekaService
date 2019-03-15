package com.gaeainfo.services;

import com.gaeainfo.config.ServiceConfig;
import com.gaeainfo.model.License;
import com.gaeainfo.repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LicenseService {
    @Autowired
    private LicenseRepository licenseRepository;

    @Autowired
    ServiceConfig serviceConfig;

    public License getLicense(String organizationId,String licenseId){
        License license = licenseRepository.findByOrganizationIdAndLicenseId(organizationId,licenseId);
        System.out.println("serviceConfig.getExampleProperty-----"+serviceConfig.getExampleProperty());
        return license.withComment(serviceConfig.getExampleProperty());
    }

    public List<License> getLicensesByOrg(String organizationId){
        return licenseRepository.findByOrganizationId(organizationId);
    }

    public void saveLicense(License license){
        license.withId(UUID.randomUUID().toString());
        licenseRepository.save(license);
    }

    public License getLicense(String organizationId,String licenseId,String clientType){
//        License license = licenseRepository.findByOrganizationIdAndLicenseId(organizationId,licenseId);
//        Organization org = retrieveOrgInfo(organizationId,clientType);
//
//     return license.with
        return  null;
    }

}
