package com.uptodown.activities;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import c7.n;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import g5.d1;
import h5.u;
import j8.d;
import j8.e;
import kotlin.jvm.internal.i0;
import o4.ac;
import o4.b0;
import o4.bc;
import o4.dc;
import o4.f0;
import o4.g6;
import o4.h3;
import o4.j6;
import s4.c;
import y5.f;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class UserDevicesActivity extends b0 {
    public static final /* synthetic */ int R = 0;
    public final n O = new n(new f0(this, 29));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(dc.class), new bc(this, 0), new ac(this), new bc(this, 1));
    public final ActivityResultLauncher Q;

    public UserDevicesActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new j6(this, 5));
        registerForActivityResult.getClass();
        this.Q = registerForActivityResult;
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5433a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            w0().f5435n.setNavigationIcon(drawable);
            w0().f5435n.setNavigationContentDescription(getString(R.string.back));
        }
        w0().f5435n.setNavigationOnClickListener(new u(this, 20));
        w0().q.setTypeface(c.u);
        w0().p.setTypeface(c.v);
        w0().o.setTypeface(c.v);
        w0().m.setLayoutManager(new LinearLayoutManager(this, 1, false));
        w0().m.setItemAnimator(new DefaultItemAnimator());
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        w0().m.addItemDecoration(new f(dimension, dimension));
        g7.c cVar = null;
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new g6(this, cVar, 4), 2);
        dc dcVar = (dc) this.P.getValue();
        dcVar.getClass();
        c0 viewModelScope = ViewModelKt.getViewModelScope(dcVar);
        e eVar = p0.f3588a;
        c8.f0.z(viewModelScope, d.f7053a, null, new h3(this, dcVar, cVar, 21), 2);
    }

    public final d1 w0() {
        return (d1) this.O.getValue();
    }
}
