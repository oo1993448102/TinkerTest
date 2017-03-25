package demo.life.com.tinkertest;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by EchoZhou on 2017/3/23.
 */

public class SampleApplication extends TinkerApplication {
    protected SampleApplication() {
        super(
                ShareConstants.TINKER_ENABLE_ALL,
                "com.tencent.tinker.loader.TinkerLoader");
    }
}
