package com.jing.zhou.iphoneswitch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by hbhd on 2017-08-07.
 * 一个超级像iPhone的开关
 */

public class MyPhoneSwitch extends View {
    public MyPhoneSwitch(Context context) {
        super(context,null,0);
    }

    public MyPhoneSwitch(Context context, AttributeSet attrs) {
        super(context, attrs,0);
    }

    public MyPhoneSwitch(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPic();
    }

    /**
     * 初始化开关按钮的资源文件
     */
    private void initPic() {

    }
}
