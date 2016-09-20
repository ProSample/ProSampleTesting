package com.barantech.prosampletdd;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/**
 * Created by mary on 17/09/16.
 */
public class ClassUnderTest {

    public String getAppName(Context context){
        return context.getString(R.string.app_name);
    }

    public static class ParcelableTest implements Parcelable{
        String string;
        long aLong;

        public ParcelableTest() {
        }

        public ParcelableTest(String string, long aLong) {
            this.string = string;
            this.aLong = aLong;
        }

        protected ParcelableTest(Parcel in) {
            string = in.readString();
            aLong = in.readLong();
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(string);
            dest.writeLong(aLong);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public static final Creator<ParcelableTest> CREATOR = new Creator<ParcelableTest>() {
            @Override
            public ParcelableTest createFromParcel(Parcel in) {
                return new ParcelableTest(in);
            }

            @Override
            public ParcelableTest[] newArray(int size) {
                return new ParcelableTest[size];
            }
        };
    }
}
