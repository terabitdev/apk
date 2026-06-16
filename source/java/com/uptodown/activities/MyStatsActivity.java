package com.uptodown.activities;

import a5.h;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.view.inputmethod.b;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.work.Constraints;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import c7.n;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.workers.SendUserUsageStatsWorker;
import g5.a0;
import g7.c;
import h5.o;
import h5.u;
import j8.d;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i0;
import n4.e;
import o4.a5;
import o4.b0;
import o4.b5;
import o4.d5;
import o4.f0;
import o4.h3;
import w5.r;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class MyStatsActivity extends b0 {
    public static final /* synthetic */ int R = 0;
    public final n O = new n(new f0(this, 12));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(d5.class), new b5(this, 0), new a5(this), new b5(this, 1));
    public final ActivityResultLauncher Q;

    public MyStatsActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new b(this, 28));
        registerForActivityResult.getClass();
        this.Q = registerForActivityResult;
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5368a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        c cVar = null;
        if (!r.b(this)) {
            this.Q.launch(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
        } else {
            float f7 = UptodownApp.G;
            if (!e.o(this, "SendUserUsageStatsWorker")) {
                WorkManager.Companion.getInstance(this).enqueue(new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) SendUserUsageStatsWorker.class, 24L, TimeUnit.HOURS).addTag("SendUserUsageStatsWorker").setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
            }
            x0();
            d5 d5Var = (d5) this.P.getValue();
            d5Var.getClass();
            c0 viewModelScope = ViewModelKt.getViewModelScope(d5Var);
            j8.e eVar = p0.f3588a;
            c8.f0.z(viewModelScope, d.f7053a, null, new h3(d5Var, this, cVar, 6), 2);
        }
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new h(this, cVar, 26), 2);
    }

    public final a0 w0() {
        return (a0) this.O.getValue();
    }

    public final void x0() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            w0().f5370n.setNavigationIcon(drawable);
            w0().f5370n.setNavigationContentDescription(getString(R.string.back));
        }
        w0().f5370n.setNavigationOnClickListener(new u(this, 13));
        w0().E.setTypeface(s4.c.u);
        w0().F.setTypeface(s4.c.u);
        w0().G.setTypeface(s4.c.u);
        w0().p.setTypeface(s4.c.v);
        w0().q.setTypeface(s4.c.u);
        w0().H.setTypeface(s4.c.v);
        w0().I.setTypeface(s4.c.u);
        w0().o.setTypeface(s4.c.v);
        w0().B.setTypeface(s4.c.u);
        w0().C.setTypeface(s4.c.u);
        w0().t.setTypeface(s4.c.u);
        w0().u.setTypeface(s4.c.u);
        w0().f5374z.setTypeface(s4.c.u);
        w0().A.setTypeface(s4.c.u);
        w0().r.setTypeface(s4.c.u);
        w0().s.setTypeface(s4.c.u);
        w0().f5372x.setTypeface(s4.c.u);
        w0().f5373y.setTypeface(s4.c.u);
        w0().v.setTypeface(s4.c.u);
        w0().f5371w.setTypeface(s4.c.u);
        w0().J.setTypeface(s4.c.u);
        w0().D.setTypeface(s4.c.u);
        w0().l.setOnClickListener(new o(13));
    }
}
