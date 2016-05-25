package com.somnus.androidglidedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * https://github.com/wasabeef/glide-transformations
 */
public class MainActivity extends AppCompatActivity {
  private ImageView img_;
    private ImageView img1_;
    private String url= "";


  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


      img_ = (ImageView) findViewById(R.id.img_);
      img1_ = (ImageView) findViewById(R.id.img1_);

      url  ="http://img.taopic.com/uploads/allimg/140720/240467-140H00K62786.jpg";

//      GlideUtils.loadImage(this, url, img_);
      GlideUtils.loadRoundedCorners(this, url, 20, img_);

//    GlideUtils.loadBlurImage(this,url,img1_);
      GlideUtils.loadBlurImage(this,url,20,img1_);

//      Glide.with(this)
//              .load("http://img.taopic.com/uploads/allimg/140720/240467-140H00K62786.jpg")
//              .bitmapTransform(new RoundedCornersTransformation(this, 30, 0,
//                      RoundedCornersTransformation.CornerType.ALL))
//              .into(img1_);




  }
}
