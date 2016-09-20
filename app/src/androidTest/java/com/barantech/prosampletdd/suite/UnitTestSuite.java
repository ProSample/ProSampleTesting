package com.barantech.prosampletdd.suite;

import com.barantech.prosampletdd.ApplicationTest;
import com.barantech.prosampletdd.ExampleInstrumentedTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Suite sample
 * Created by mary on 20/09/16.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ApplicationTest.class, ExampleInstrumentedTest.class})
public class UnitTestSuite {
}
