package com.fabiogouw.architectureguardian.rules;

import com.fabiogouw.architectureguardian.GuardianOptions;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

public class DomainPackageDependencyRule extends Rule {

    public DomainPackageDependencyRule(GuardianOptions options) {
        super(options);
    }

    @Override
    public void validate(JavaClasses classesToCheck) {
        noClasses()
                .that()
                .resideInAPackage(getCurrentOptions().getDomainPackagePattern())
                .should()
                .dependOnClassesThat()
                .resideOutsideOfPackages("java..", getCurrentOptions().getDomainPackagePattern())
                .check(classesToCheck);
        /*
        layeredArchitecture()
                .layer("Controller").definedBy("..controller..")
                .layer("Service").definedBy("..service..")
                .layer("Persistence").definedBy("..persistence..")

                .whereLayer("Controller").mayNotBeAccessedByAnyLayer()
                .whereLayer("Service").mayOnlyBeAccessedByLayers("Controller")
                .whereLayer("Persistence").mayOnlyBeAccessedByLayers("Service")
                .check(classesToCheck);
         */
    }
}
