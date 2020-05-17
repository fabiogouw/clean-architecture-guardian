package com.fabiogouw.cleanarchguardian.rules;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

public class PackageDependencyRule {

    public void test() {
        JavaClasses classesToCheck = new ClassFileImporter()
                .importPackages("io.reflectoring.buckpal..");
        noClasses()
                .that()
                .resideInAPackage("io.reflectoring.buckpal.domain..")
                .should()
                .dependOnClassesThat()
                .resideInAnyPackage("io.reflectoring.buckpal.application..")
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
