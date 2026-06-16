package com.uptodown.activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import com.uptodown.R;
import h5.u;
import o4.b0;
import s4.c;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class CustomWebView extends b0 {
    public static final /* synthetic */ int Q = 0;
    public String O;
    public String P;

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this).inflate(R.layout.custom_web_view, (ViewGroup) null);
        inflate.getClass();
        setContentView(inflate);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("title")) {
                this.O = extras.getString("title");
            }
            if (extras.containsKey("url")) {
                this.P = extras.getString("url");
            }
        }
        ((ImageView) findViewById(R.id.iv_back_custom_web_view)).setOnClickListener(new u(this, 6));
        TextView textView = (TextView) findViewById(R.id.tv_title_custom_web_view);
        textView.setTypeface(c.v);
        textView.setText(this.O);
        WebView webView = (WebView) findViewById(R.id.wv_custom_web_view);
        webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setSupportZoom(true);
        webView.setScrollBarStyle(GroupFlagsKt.HasAuxSlotFlag);
        webView.setScrollbarFadingEnabled(true);
        webView.setInitialScale(80);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        String str = this.P;
        if (str != null) {
            webView.loadUrl(str);
        }
    }
}
