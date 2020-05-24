package com.fabiogouw.architectureguardian;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class GuardianBuilder {

    private GuardianOptions options = new GuardianOptions();

    public GuardianBuilder withDomainLayerDefinedBy(String packagePattern) {
        options.setDomainPackagePattern(packagePattern);
        return this;
    }

    public GuardianBuilder withUseCaseLayerDefinedBy(String packagePattern) {
        return this;
    }

    public GuardianBuilder withAdapterLayerDefinedBy(String packagePattern) {
        return this;
    }

    public Guardian build() {
        return new Guardian(options);
    }
}