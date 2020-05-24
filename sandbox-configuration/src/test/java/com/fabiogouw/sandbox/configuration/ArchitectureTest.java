package com.fabiogouw.sandbox.configuration;


import com.fabiogouw.architectureguardian.Guardian;
import com.fabiogouw.architectureguardian.GuardianBuilder;
import org.junit.jupiter.api.Test;

public class ArchitectureTest {
    @Test
    public void verifyArchitecture() {
        Guardian guardian = new GuardianBuilder()
                .withAdapterLayerDefinedBy( "com.fabiogouw.sandbox.adapters..")
                .withUseCaseLayerDefinedBy("com.fabiogouw.sandbox.application.usecases..")
                .withDomainLayerDefinedBy("com.fabiogouw.sandbox.domain..")
                .build();
        guardian.assertRules();
    }
}