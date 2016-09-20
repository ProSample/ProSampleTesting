package com.barantech.prosampletdd;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {

    private static final String FAKE_STRING = "ProSampleTDD";

    @Mock
    Context mMockContext;

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void readStringFromContext(){
        when(mMockContext.getString(R.string.app_name)).thenReturn(FAKE_STRING);
        ClassUnderTest classUnderTest = new ClassUnderTest();
        String result = classUnderTest.getAppName(mMockContext);
        assertThat(result, is(FAKE_STRING));
    }
}