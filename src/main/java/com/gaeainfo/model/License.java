package com.gaeainfo.model;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "licenses")
public class License {
    @Id
    @Column(name = "license_id")
    private String licenseId;

    @Column(name = "organization_id")
    private String organizationId;

    @Column(name = "product_name")
    private String productName;
    @Column(name = "example_property")
    private String exampleProperty;

    public String getExampleProperty() {
        return exampleProperty;
    }

    public void setExampleProperty(String exampleProperty) {
        this.exampleProperty = exampleProperty;
    }

    public License() {
    }

    public License withComment(String exampleProperty) {
        this.setExampleProperty(exampleProperty);
        return this;
    }


    public License withId(String licenseId) {
        this.setLicenseId(licenseId);
        return this;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


}
