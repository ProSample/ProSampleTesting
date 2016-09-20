package com.barantech.prosampletdd;

import android.content.Context;
import android.os.Parcel;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * Instrumented Test Sample
 * Created by mary on 19/09/16.
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    ClassUnderTest.ParcelableTest parcelableTest;
    @Test
    public void useAppContext(){
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("com.barantech.prosampletdd",appContext.getPackageName());
    }

    @Before
    public void init(){
        parcelableTest = new ClassUnderTest.ParcelableTest("abc",123);
    }

    @Test
    public void logHistory_ParcelableWriteRead() {


        // Write the data.
        Parcel parcel = Parcel.obtain();
        parcelableTest.writeToParcel(parcel, 0);

        // After you're done with writing, you need to reset the parcel for reading.
        parcel.setDataPosition(0);

        // Read the data.
        ClassUnderTest.ParcelableTest createdFromParcel = ClassUnderTest.ParcelableTest.CREATOR.createFromParcel(parcel);

        // Verify that the received data is correct.
        assertThat(createdFromParcel.string, is("abc"));
        assertThat(createdFromParcel.aLong, is(123l));
    }

}
