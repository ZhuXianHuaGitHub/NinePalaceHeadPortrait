# 仿微信九宫格头像

### 介绍

加载在线图片的仿微信九宫格头像

### 如何配置网络库

第一步：在项目的gradle里配置

```
      allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
      }
```

第二步：在module的gradle里配置
```
     dependencies {
         implementation 'com.github.ZhuXianHuaGitHub:NinePalaceHeadPortrait:1.0'
     }
```

### 如何使用

定义布局文件
```
<com.nine.palace.headpic.NinePalaceImageView
        android:id="@+id/npiv1"
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:layout_margin="2dp"
        android:background="#eeeeee"/>
```

定义布局文件
```
1、实例化组件
	NinePalaceImageView npiv1 = findViewById(R.id.npiv1);
```

```
2、加载图片适配器
	NinePalaceImageViewAdapter adapter = new NinePalaceImageViewAdapter<String>() {
            @Override
            protected void onDisplayImage(Context context, ImageView imageView, String s) {
                Glide.with(this).load(s).into(imageView);
            }

            //重写该方法自定义生成ImageView方式，用于九宫格头像中的一个个图片控件，可以设置ScaleType等属性
            @Override
            protected ImageView generateImageView(Context context) {
                return super.generateImageView(context);
            }
        };
```

```
3、加载适配器、设置数据
	npiv1.setAdapter(adapter);
	npiv1.setImagesData(mDatas); 
```

      



















