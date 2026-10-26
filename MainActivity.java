package com.example.numberrush;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
 @Override public void onCreate(Bundle state) {
  super.onCreate(state);
  requestWindowFeature(Window.FEATURE_NO_TITLE);
  getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
  WebView web = new WebView(this);
  web.setOverScrollMode(View.OVER_SCROLL_NEVER);
  web.setBackgroundColor(0xff08c7d2);
  WebSettings settings = web.getSettings();
  settings.setJavaScriptEnabled(true);
  settings.setDomStorageEnabled(true);
  settings.setSupportZoom(false);
  web.loadUrl("file:///android_asset/index.html");
  setContentView(web);
 }
 @Override public void onBackPressed() { super.onBackPressed(); }
}
