package com.uptodown.activities;

import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import c7.n;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import g5.a1;
import h5.u;
import j8.d;
import j8.e;
import k5.v2;
import kotlin.jvm.internal.i0;
import m3.c;
import o4.b0;
import o4.f0;
import o4.gb;
import o4.h3;
import o4.ib;
import o4.jb;
import o4.kb;
import o4.mb;
import r4.b1;
import y5.i;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class UserCommentsActivity extends b0 {
    public static final /* synthetic */ int S = 0;
    public b1 Q;
    public final n O = new n(new f0(this, 27));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(mb.class), new kb(this, 0), new jb(this), new kb(this, 1));
    public final c R = new c(this, 27);

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        Bundle extras;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5375a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        v2 v2Var = (v2) x0().f8902e.getValue();
        g7.c cVar = null;
        if (getIntent() != null && (extras = getIntent().getExtras()) != null && extras.containsKey("userID")) {
            str = extras.getString("userID");
        } else {
            str = null;
        }
        v2Var.f7542a = str;
        w0().m.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.core_vector_back));
        w0().m.setNavigationContentDescription(getString(R.string.back));
        w0().m.setNavigationOnClickListener(new u(this, 19));
        w0().o.setTypeface(s4.c.u);
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        int i = 1;
        int i3 = 0;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        w0().l.addItemDecoration(new i(dimension, dimension, dimension, dimension));
        w0().l.setLayoutManager(linearLayoutManager);
        w0().l.setItemAnimator(null);
        w0().l.addOnScrollListener(new gb(linearLayoutManager, this));
        String str2 = ((v2) x0().f8902e.getValue()).f7542a;
        if (str2 != null && str2.length() != 0) {
            mb x02 = x0();
            x02.getClass();
            c0 viewModelScope = ViewModelKt.getViewModelScope(x02);
            e eVar = p0.f3588a;
            c8.f0.z(viewModelScope, d.f7053a, null, new h3(x02, this, cVar, 18), 2);
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        d8.c cVar2 = h8.n.f6148a;
        c8.f0.z(lifecycleScope, cVar2, null, new ib(this, cVar, i3), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new ib(this, cVar, i), 2);
    }

    public final a1 w0() {
        return (a1) this.O.getValue();
    }

    public final mb x0() {
        return (mb) this.P.getValue();
    }
}
