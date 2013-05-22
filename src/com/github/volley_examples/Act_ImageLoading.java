/**
 * Copyright 2013 Ognyan Bankov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.volley_examples;

import com.android.volley.toolbox.ImageLoader;
import com.example.volley_examples.R;
import com.github.volley_examples.app.MyVolley;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Act_ImageLoading extends Activity {
   private ImageView mImageView;
   
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.act__image_loading);
      
      mImageView = (ImageView) findViewById(R.id.iv_image);
      
      
      Button btnImageLoadingRequest = (Button) findViewById(R.id.btn_image_loading);
      btnImageLoadingRequest.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View v) {
             ImageLoader imageLoader = MyVolley.getImageLoaderNoMemCache();
             imageLoader.get("https://lh3.googleusercontent.com/-LMUs793rAL4/SUQczGj6CBI/AAAAAAAAJqs/NLBzZMDMhS4/s720/P7300049aasd.JPG", 
                            ImageLoader.getImageListener(mImageView, 
                                                          R.drawable.no_image, 
                                                          R.drawable.error_image));
          }
      });
      
      Button btnImageLoadingErrorRequest = (Button) findViewById(R.id.btn_image_loading_error);
      btnImageLoadingErrorRequest.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View v) {
             ImageLoader imageLoader = MyVolley.getImageLoaderNoMemCache();
             imageLoader.get("https://lh3.googleusercontent.com/-LMUs793rAL4/SUQczGj6CBI/AAAAAAAAJqs/NLBzZMDMhS4a/s720/P7300049.JPG", 
                            ImageLoader.getImageListener(mImageView, 
                                                          R.drawable.no_image, 
                                                          R.drawable.error_image));
          }
      });
   }
}