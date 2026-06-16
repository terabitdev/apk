package com.uptodown.activities;

import a5.h;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c7.n;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.activities.OrganizationActivity;
import f8.l1;
import g5.e0;
import g7.c;
import h5.u;
import j8.d;
import j8.e;
import k5.d0;
import k5.r;
import kotlin.jvm.internal.i0;
import o4.b0;
import o4.f0;
import o4.h3;
import o4.t5;
import o4.u5;
import o4.w5;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class OrganizationActivity extends b0 {
    public static final /* synthetic */ int R = 0;
    public final n O = new n(new f0(this, 15));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(w5.class), new u5(this, 0), new t5(this), new u5(this, 1));
    public r4.b0 Q;

    @Override // o4.b0
    public final void a0(d0 d0Var) {
        d0Var.getClass();
        r a10 = d0Var.a();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        e eVar = p0.f3588a;
        c8.f0.z(lifecycleScope, h8.n.f6148a, null, new h3(a10, this, null, 8), 2);
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        c cVar = null;
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("organizationID")) {
                l1 l1Var = x0().f9205d;
                Long valueOf = Long.valueOf(extras.getLong("organizationID"));
                l1Var.getClass();
                l1Var.j(null, valueOf);
            }
            if (extras.containsKey("organizationName")) {
                l1 l1Var2 = x0().f9206e;
                String string = extras.getString("organizationName");
                string.getClass();
                l1Var2.getClass();
                l1Var2.j(null, string);
            }
        }
        RelativeLayout relativeLayout = w0().f5439a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        final e0 w02 = w0();
        if (drawable != null) {
            w02.t.setNavigationIcon(drawable);
            w02.t.setNavigationContentDescription(getString(R.string.back));
        }
        Toolbar toolbar = w02.t;
        RecyclerView recyclerView = w02.r;
        TextView textView = w02.f5443x;
        toolbar.setNavigationOnClickListener(new u(this, 16));
        textView.setTypeface(s4.c.u);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        recyclerView.setItemAnimator(null);
        if (((CharSequence) x0().f9206e.getValue()).length() > 0) {
            textView.setText((CharSequence) x0().f9206e.getValue());
        }
        w02.s.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: o4.r5
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                int i = OrganizationActivity.R;
                OrganizationActivity organizationActivity = OrganizationActivity.this;
                if (!organizationActivity.x0().f9207f && !organizationActivity.x0().g) {
                    ScrollView scrollView = w02.s;
                    if (scrollView.getChildAt(scrollView.getChildCount() - 1).getBottom() - (scrollView.getScrollY() + scrollView.getHeight()) <= 0 && !organizationActivity.x0().f9207f && !organizationActivity.x0().g) {
                        r4.b0 b0Var = organizationActivity.Q;
                        if (b0Var != null) {
                            b0Var.a(true);
                        }
                        w5 x02 = organizationActivity.x0();
                        x02.getClass();
                        c8.c0 viewModelScope = ViewModelKt.getViewModelScope(x02);
                        j8.e eVar = c8.p0.f3588a;
                        c8.f0.z(viewModelScope, j8.d.f7053a, null, new h3(x02, organizationActivity, null, 10), 2);
                    }
                }
            }
        });
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new h(this, cVar, 28), 2);
        w5 x02 = x0();
        x02.getClass();
        c0 viewModelScope = ViewModelKt.getViewModelScope(x02);
        e eVar = p0.f3588a;
        c8.f0.z(viewModelScope, d.f7053a, null, new h3(x02, this, cVar, 9), 2);
    }

    public final e0 w0() {
        return (e0) this.O.getValue();
    }

    public final w5 x0() {
        return (w5) this.P.getValue();
    }
}
