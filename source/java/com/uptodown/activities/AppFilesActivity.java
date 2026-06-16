package com.uptodown.activities;

import a5.h;
import a5.i0;
import a5.j;
import a5.s;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.gestures.x;
import androidx.compose.foundation.style.c;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.d;
import c7.n;
import c7.z;
import c8.f0;
import c8.p0;
import com.uptodown.R;
import h5.o;
import h5.u;
import h7.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import k5.e;
import o4.b0;
import r0.i;
import w5.q;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class AppFilesActivity extends b0 {
    public static final /* synthetic */ int S = 0;
    public e Q;
    public final LifecycleCoroutineScope O = LifecycleOwnerKt.getLifecycleScope(this);
    public final n P = new n(new c(this, 26));
    public final i R = new i((Object) this, 18);

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (c8.f0.K(r10, r3, r0) == r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (c8.f0.K(r10, r4, r0) != r6) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w0(AppFilesActivity appFilesActivity, i7.c cVar) {
        o4.c cVar2;
        int i;
        ArrayList arrayList;
        if (cVar instanceof o4.c) {
            cVar2 = (o4.c) cVar;
            int i3 = cVar2.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar2.m = i3 - Integer.MIN_VALUE;
                Object obj = cVar2.f8553b;
                i = cVar2.m;
                g7.c cVar3 = null;
                a aVar = a.f6117a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                c7.a.e(obj);
                                return z.f3538a;
                            }
                            d.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        arrayList = cVar2.f8552a;
                        c7.a.e(obj);
                        j8.e eVar = p0.f3588a;
                        d8.c cVar4 = h8.n.f6148a;
                        o4.d dVar = new o4.d(appFilesActivity, arrayList, null);
                        cVar2.f8552a = null;
                        cVar2.m = 3;
                    } else {
                        arrayList = cVar2.f8552a;
                        c7.a.e(obj);
                    }
                } else {
                    ArrayList r = x.r(obj);
                    j8.e eVar2 = p0.f3588a;
                    d8.c cVar5 = h8.n.f6148a;
                    i0 i0Var = new i0(appFilesActivity, cVar3, 15);
                    cVar2.f8552a = r;
                    cVar2.m = 1;
                    if (f0.K(cVar5, i0Var, cVar2) != aVar) {
                        arrayList = r;
                    }
                    return aVar;
                }
                j8.e eVar3 = p0.f3588a;
                j8.d dVar2 = j8.d.f7053a;
                j jVar = new j(appFilesActivity, arrayList, cVar3, 20);
                cVar2.f8552a = arrayList;
                cVar2.m = 2;
            }
        }
        cVar2 = new o4.c(appFilesActivity, cVar);
        Object obj2 = cVar2.f8553b;
        i = cVar2.m;
        g7.c cVar32 = null;
        a aVar2 = a.f6117a;
        if (i == 0) {
        }
        j8.e eVar32 = p0.f3588a;
        j8.d dVar22 = j8.d.f7053a;
        j jVar2 = new j(appFilesActivity, arrayList, cVar32, 20);
        cVar2.f8552a = arrayList;
        cVar2.m = 2;
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        super.onCreate(bundle);
        try {
            RelativeLayout relativeLayout = x0().f5395a;
            relativeLayout.getClass();
            setContentView(relativeLayout);
            Intent intent = getIntent();
            if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("appInstalled")) {
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable = (Parcelable) extras.getParcelable("appInstalled", e.class);
                } else {
                    parcelable = extras.getParcelable("appInstalled");
                }
                this.Q = (e) parcelable;
            }
            g5.c x02 = x0();
            TextView textView = x02.r;
            RecyclerView recyclerView = x02.m;
            Toolbar toolbar = x02.f5397n;
            textView.setTypeface(s4.c.u);
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
            if (drawable != null) {
                toolbar.setNavigationIcon(drawable);
                toolbar.setNavigationContentDescription(getString(R.string.back));
            }
            toolbar.setNavigationOnClickListener(new u(this, 5));
            x02.q.setTypeface(s4.c.v);
            x02.l.setOnClickListener(new o(1));
            recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.addItemDecoration(new s((int) getResources().getDimension(R.dimen.margin_m)));
            if (this.Q != null) {
                y0();
                f0.z(this.O, null, null, new h(this, (g7.c) null, 21), 3);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final g5.c x0() {
        return (g5.c) this.P.getValue();
    }

    public final void y0() {
        ConcurrentHashMap concurrentHashMap = q.f11211a;
        e eVar = this.Q;
        eVar.getClass();
        x0().f5396b.setImageDrawable(q.b(this, eVar.l));
        TextView textView = x0().o;
        e eVar2 = this.Q;
        eVar2.getClass();
        textView.setText(eVar2.f7339b);
        x0().o.setTypeface(s4.c.u);
        TextView textView2 = x0().p;
        e eVar3 = this.Q;
        eVar3.getClass();
        textView2.setText(eVar3.f7340n);
        x0().p.setTypeface(s4.c.v);
    }
}
