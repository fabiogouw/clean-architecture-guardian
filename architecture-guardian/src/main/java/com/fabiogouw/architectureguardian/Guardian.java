package com.fabiogouw.architectureguardian;

import com.fabiogouw.architectureguardian.rules.DomainPackageDependencyRule;
import com.fabiogouw.architectureguardian.rules.Rule;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;

public class Guardian {

    private GuardianOptions options;

    public Guardian(GuardianOptions options) {
        this.options = options;
    }

    public void assertRules() {
        JavaClasses classesToCheck = new ClassFileImporter()
                .importPackages("com.fabiogouw.sandbox..");
        Rule rule1 = new DomainPackageDependencyRule(this.options);
        rule1.validate(classesToCheck);
    }
}
