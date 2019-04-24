package com.nine.palace.head.portrait;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.nine.palace.headpic.NinePalaceImageView;
import com.nine.palace.headpic.NinePalaceImageViewAdapter;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private String[] IMG_URL_ARR = {
            "https://pic4.zhimg.com/02685b7a5f2d8cbf74e1fd1ae61d563b_xll.jpg",
            "https://pic4.zhimg.com/fc04224598878080115ba387846eabc3_xll.jpg",
            "https://pic3.zhimg.com/d1750bd47b514ad62af9497bbe5bb17e_xll.jpg",
            "https://pic4.zhimg.com/da52c865cb6a472c3624a78490d9a3b7_xll.jpg",
            "https://pic3.zhimg.com/0c149770fc2e16f4a89e6fc479272946_xll.jpg",
            "https://pic1.zhimg.com/76903410e4831571e19a10f39717988c_xll.png",
            "https://pic3.zhimg.com/33c6cf59163b3f17ca0c091a5c0d9272_xll.jpg",
            "https://pic4.zhimg.com/52e093cbf96fd0d027136baf9b5cdcb3_xll.png",
            "https://pic3.zhimg.com/f6dc1c1cecd7ba8f4c61c7c31847773e_xll.jpg",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NinePalaceImageView ngiv1 = findViewById(R.id.ngiv1);
        NinePalaceImageViewAdapter adapter = new NinePalaceImageViewAdapter<String>() {
            @Override
            protected void onDisplayImage(Context context, ImageView imageView, String s) {
                Glide.with(MainActivity.this).load(s).into(imageView);
            }

            //重写该方法自定义生成ImageView方式，用于九宫格头像中的一个个图片控件，可以设置ScaleType等属性
            @Override
            protected ImageView generateImageView(Context context) {
                return super.generateImageView(context);
            }
        };
        ngiv1.setAdapter(adapter);
        ngiv1.setImagesData(Arrays.asList(IMG_URL_ARR));
    }
}
