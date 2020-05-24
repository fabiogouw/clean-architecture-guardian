package com.fabiogouw.architectureguardian.rules;

import com.fabiogouw.architectureguardian.GuardianOptions;
import com.tngtech.archunit.core.domain.JavaClasses;

public class NoFrameworksForUseCasesRule extends Rule {

    public NoFrameworksForUseCasesRule(GuardianOptions options) {
        super(options);
    }

    @Override
    public void validate(JavaClasses classesToCheck) {
        super.validate(classesToCheck);
    }
}
