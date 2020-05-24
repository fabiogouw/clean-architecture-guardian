package com.fabiogouw.architectureguardian;

public class GuardianOptions {
    private String domainPackagePattern;
    private String useCasePackagePattern;
    private String adapterPackagePattern;
    private String configurationPackagePattern;

    public String getDomainPackagePattern() {
        return domainPackagePattern;
    }

    public String getUseCasePackagePattern() {
        return useCasePackagePattern;
    }

    public String getAdapterPackagePattern() {
        return adapterPackagePattern;
    }

    public String getConfigurationPackagePattern() {
        return configurationPackagePattern;
    }

    public void setDomainPackagePattern(String value) {
        domainPackagePattern = value;
    }

    public void setUseCasePackagePattern(String value) {
        useCasePackagePattern = value;
    }

    public void setAdapterPackagePattern(String value) {
        adapterPackagePattern = value;
    }

    public void setConfigurationPackagePattern(String value) {
        configurationPackagePattern = value;
    }
}
