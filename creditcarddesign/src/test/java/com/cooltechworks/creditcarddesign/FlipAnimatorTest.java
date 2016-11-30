package com.cooltechworks.creditcarddesign;

import android.graphics.Camera;
import android.os.Build;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static com.cooltechworks.creditcarddesign.FlipAnimator.DIRECTION_X;
import static com.cooltechworks.creditcarddesign.FlipAnimator.DIRECTION_Y;
import static com.cooltechworks.creditcarddesign.FlipAnimator.DIRECTION_Z;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.M)
public class FlipAnimatorTest {
    @Test
    public void rotateCamera() throws Exception {
        FlipAnimator flipAnimator = new FlipAnimator(null, null, 0, 0);
        Camera camera = Mockito.mock(Camera.class);

        flipAnimator.rotateCamera(234, DIRECTION_X, camera);
        Mockito.verify(camera).rotateX(234);

        flipAnimator.rotateCamera(234, DIRECTION_Z, camera);
        Mockito.verify(camera).rotateZ(234);

        flipAnimator.rotateCamera(234, DIRECTION_Y, camera);
        Mockito.verify(camera).rotateY(234);
    }

}