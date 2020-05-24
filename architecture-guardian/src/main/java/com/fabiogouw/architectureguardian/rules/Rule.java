package com.fabiogouw.architectureguardian.rules;

import com.fabiogouw.architectureguardian.GuardianOptions;
import com.tngtech.archunit.core.domain.JavaClasses;

public abstract class Rule {

    private final GuardianOptions options;

    public Rule(GuardianOptions options) {
        this.options = options;
    }

    public void validate(JavaClasses classesToCheck) {

    }

    protected GuardianOptions getCurrentOptions() {
        return this.options;
    }
}
