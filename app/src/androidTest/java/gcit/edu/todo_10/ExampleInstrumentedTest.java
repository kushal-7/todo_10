package gcit.edu.todo_10;

import android.content.Context;

import androidx.test.filters.SmallTest;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("gcit.edu.todo_10", appContext.getPackageName());
    }

    private calc mcalc;

    @Before
    public void setUp(){
        mcalc=new calc();
    }
    @Test
    public void addTwoNumber(){
        double result=mcalc.Add(1d,2d);
        assertThat(result, is(equalTo(3d)));
    }

    @Test
    public void subTwoNumber(){
        double result=mcalc.Sub(2d,1d);
        assertThat(result, is(equalTo(1d)));
    }
    @Test
    public void subTwoNegativeNumber(){
        double result=mcalc.Sub(-2d,-1d);
        assertThat(result, is(equalTo(-3d)));
    }
    @Test
    public void MulTwoNumber(){
        double result=mcalc.Multi(2d,1d);
        assertThat(result, is(equalTo(2d)));
    }
    @Test
    public void MulTwoNumberZero(){
        double result=mcalc.Sub(0d,1d);
        assertThat(result, is(equalTo(0d)));
    }
    @Test
    public void divTwoNumber(){
        double result=mcalc.Sub(16d,4d);
        assertThat(result, is(equalTo(4d)));
    }
    @Test
    public void divTwoNumberzero(){
        double result=mcalc.Sub(0d,5d);
        assertThat(result, is(equalTo(0d)));
    }




}