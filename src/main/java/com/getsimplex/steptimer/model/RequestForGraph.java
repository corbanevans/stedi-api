//© 2021 corban Murdock

package com.getsimplex.steptimer.model;

import java.util.List;

/**
 * Created by corban on 10/7/2016.
 */
public class RequestForGraph {
    private String emailAddress;
    private List<TestResult> tests;

    public List<TestResult> getTests() {
        return tests;
    }

    public void setTests(List<TestResult> tests) {
        this.tests = tests;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
