package com.fabiogouw.cleanarchguardian;

import com.fabiogouw.cleanarchguardian.rules.PackageDependencyRule;

public class Guardian {

    public void assertRules() {
        PackageDependencyRule rule1 = new PackageDependencyRule();
        rule1.test();
    }
}
