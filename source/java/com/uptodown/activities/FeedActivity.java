package com.uptodown.activities;

import a6.g;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import c7.n;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import g5.k;
import g7.c;
import h5.q1;
import h5.u;
import j8.e;
import o4.b0;
import o4.f0;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class FeedActivity extends b0 {
    public static final /* synthetic */ int P = 0;
    public final n O = new n(new f0(this, 0));

    @Override // o4.b0
    public final void i0(long j, String str) {
        if (S()) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            e eVar = p0.f3588a;
            c8.f0.z(lifecycleScope, h8.n.f6148a, null, new g(this, j, str, (c) null, 4), 2);
        }
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n nVar = this.O;
        RelativeLayout relativeLayout = ((k) nVar.getValue()).f5512a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        ((k) nVar.getValue()).f5513b.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.core_vector_back));
        ((k) nVar.getValue()).f5513b.setNavigationContentDescription(getString(R.string.back));
        ((k) nVar.getValue()).f5513b.setNavigationOnClickListener(new u(this, 7));
        ((k) nVar.getValue()).l.setTypeface(s4.c.u);
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_fragment_container_feed, new q1()).commit();
        }
    }

    @Override // o4.b0
    public final void v0(k5.g gVar) {
        gVar.getClass();
        if (!isFinishing() && S()) {
            Intent intent = new Intent(this, (Class<?>) AppDetailActivity.class);
            intent.putExtra("appInfo", gVar);
            float f7 = UptodownApp.G;
            startActivity(intent, n4.e.a(this));
        }
    }
}
