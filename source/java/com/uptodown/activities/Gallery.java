package com.uptodown.activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c7.n;
import com.uptodown.R;
import g5.o;
import java.util.ArrayList;
import k5.k2;
import o4.a1;
import o4.b;
import o4.b0;
import o4.e1;
import o4.f0;
import o4.f1;
import s4.c;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class Gallery extends b0 {
    public static final /* synthetic */ int R = 0;
    public ArrayList P;
    public final n O = new n(new f0(this, 3));
    public final b Q = new b(this, 1);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle bundleExtra;
        ArrayList parcelableArrayList;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5554a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        getOnBackPressedDispatcher().addCallback(this, this.Q);
        Intent intent = getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("bundle")) != null) {
            if (bundleExtra.containsKey("images")) {
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelableArrayList = bundleExtra.getParcelableArrayList("images", k2.class);
                } else {
                    parcelableArrayList = bundleExtra.getParcelableArrayList("images");
                }
                this.P = parcelableArrayList;
            }
            if (bundleExtra.containsKey("index")) {
                i = bundleExtra.getInt("index");
                w0().f5556n.setAdapter(new e1(this));
                if (i > 0) {
                    w0().f5556n.setCurrentItem(i, false);
                }
                w0().f5556n.registerOnPageChangeCallback(new f1(this));
                x0(i);
                w0().m.setTypeface(c.u);
                w0().f5555b.setOnClickListener(new a1(this, 0));
            }
        }
        i = 0;
        w0().f5556n.setAdapter(new e1(this));
        if (i > 0) {
        }
        w0().f5556n.registerOnPageChangeCallback(new f1(this));
        x0(i);
        w0().m.setTypeface(c.u);
        w0().f5555b.setOnClickListener(new a1(this, 0));
    }

    public final o w0() {
        return (o) this.O.getValue();
    }

    public final void x0(int i) {
        Integer num;
        TextView textView = w0().m;
        Integer valueOf = Integer.valueOf(i + 1);
        ArrayList arrayList = this.P;
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.size());
        } else {
            num = null;
        }
        textView.setText(getString(R.string.gallery_item_count, valueOf, num));
    }
}
