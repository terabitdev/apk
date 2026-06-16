package com.uptodown.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import c7.n;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import g5.m;
import g7.c;
import h5.o;
import h5.u;
import j8.e;
import kotlin.jvm.internal.i0;
import o4.b0;
import o4.f0;
import o4.k0;
import o4.m0;
import o4.n0;
import o4.o0;
import o4.q0;
import o4.r0;
import r0.i;
import r4.d;
import y5.f;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class FollowListActivity extends b0 {
    public static final /* synthetic */ int S = 0;
    public d Q;
    public final n O = new n(new f0(this, 1));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(r0.class), new o0(this, 0), new n0(this), new o0(this, 1));
    public final i R = new i((Object) this, 19);

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        int i;
        Bundle extras;
        String str3;
        super.onCreate(bundle);
        Intent intent = getIntent();
        c cVar = null;
        int i3 = 0;
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)) {
                i = extras.getInt(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            } else {
                i = 0;
            }
            if (extras.containsKey("userID")) {
                str3 = extras.getString("userID");
            } else {
                str3 = null;
            }
            if (extras.containsKey(HintConstants.AUTOFILL_HINT_USERNAME)) {
                str = extras.getString(HintConstants.AUTOFILL_HINT_USERNAME);
                str2 = str3;
            } else {
                str2 = str3;
                str = null;
            }
        } else {
            str = null;
            str2 = null;
            i = 0;
        }
        int i8 = 1;
        if (str2 != null && str2.length() != 0 && str != null && str.length() != 0) {
            RelativeLayout relativeLayout = w0().f5538a;
            relativeLayout.getClass();
            setContentView(relativeLayout);
            w0().m.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.core_vector_back));
            w0().m.setNavigationContentDescription(getString(R.string.back));
            w0().m.setNavigationOnClickListener(new u(this, 8));
            w0().o.setTypeface(s4.c.u);
            w0().f5540n.setTypeface(s4.c.v);
            if (i != 1) {
                if (i == 2) {
                    w0().o.setText(getString(R.string.user_followed, str));
                }
            } else {
                w0().o.setText(getString(R.string.user_followers, str));
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
            int dimension = (int) getResources().getDimension(R.dimen.margin_m);
            w0().l.addItemDecoration(new f(dimension, dimension));
            w0().l.setLayoutManager(linearLayoutManager);
            w0().l.addOnScrollListener(new k0(linearLayoutManager, this, i, str2));
            w0().f5539b.setOnClickListener(new o(3));
            if (i != 1) {
                if (i == 2) {
                    r0 x02 = x0();
                    x02.getClass();
                    c0 viewModelScope = ViewModelKt.getViewModelScope(x02);
                    e eVar = p0.f3588a;
                    c8.f0.z(viewModelScope, j8.d.f7053a, null, new q0(x02, this, str2, cVar, 1), 2);
                }
            } else {
                r0 x03 = x0();
                x03.getClass();
                c0 viewModelScope2 = ViewModelKt.getViewModelScope(x03);
                e eVar2 = p0.f3588a;
                c8.f0.z(viewModelScope2, j8.d.f7053a, null, new q0(x03, this, str2, cVar, 0), 2);
            }
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            d8.c cVar2 = h8.n.f6148a;
            c8.f0.z(lifecycleScope, cVar2, null, new m0(this, cVar, i3), 2);
            c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new m0(this, cVar, i8), 2);
        }
        LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(this);
        d8.c cVar22 = h8.n.f6148a;
        c8.f0.z(lifecycleScope2, cVar22, null, new m0(this, cVar, i3), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar22, null, new m0(this, cVar, i8), 2);
    }

    public final m w0() {
        return (m) this.O.getValue();
    }

    public final r0 x0() {
        return (r0) this.P.getValue();
    }
}
