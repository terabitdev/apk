package com.uptodown.activities;

import a5.h;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import b.d;
import c7.n;
import c7.z;
import c8.p0;
import com.uptodown.R;
import g5.t;
import h5.u;
import h7.a;
import i7.c;
import j8.e;
import o4.b0;
import o4.f0;
import o4.j1;
import o4.k1;
import o4.l1;
import r0.i;
import r4.o;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class LanguageSettingsActivity extends b0 {
    public static final /* synthetic */ int S = 0;
    public o O;
    public final i P = new i((Object) this, 20);
    public final n Q = new n(new f0(this, 6));
    public final LifecycleCoroutineScope R = LifecycleOwnerKt.getLifecycleScope(this);

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        if (c8.f0.K(r9, r1, r0) == r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (c8.f0.K(r9, r1, r0) != r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (c8.f0.K(r9, r1, r0) == r6) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w0(LanguageSettingsActivity languageSettingsActivity, c cVar) {
        j1 j1Var;
        int i;
        if (cVar instanceof j1) {
            j1Var = (j1) cVar;
            int i3 = j1Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j1Var.l = i3 - Integer.MIN_VALUE;
                Object obj = j1Var.f8777a;
                i = j1Var.l;
                int i8 = 1;
                g7.c cVar2 = null;
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
                        c7.a.e(obj);
                        e eVar = p0.f3588a;
                        d8.c cVar3 = h8.n.f6148a;
                        l1 l1Var = new l1(languageSettingsActivity, null);
                        j1Var.l = 3;
                    } else {
                        c7.a.e(obj);
                    }
                } else {
                    c7.a.e(obj);
                    e eVar2 = p0.f3588a;
                    d8.c cVar4 = h8.n.f6148a;
                    k1 k1Var = new k1(languageSettingsActivity, cVar2, 0);
                    j1Var.l = 1;
                }
                e eVar3 = p0.f3588a;
                j8.d dVar = j8.d.f7053a;
                k1 k1Var2 = new k1(languageSettingsActivity, cVar2, i8);
                j1Var.l = 2;
            }
        }
        j1Var = new j1(languageSettingsActivity, cVar);
        Object obj2 = j1Var.f8777a;
        i = j1Var.l;
        int i82 = 1;
        g7.c cVar22 = null;
        a aVar2 = a.f6117a;
        if (i == 0) {
        }
        e eVar32 = p0.f3588a;
        j8.d dVar2 = j8.d.f7053a;
        k1 k1Var22 = new k1(languageSettingsActivity, cVar22, i82);
        j1Var.l = 2;
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = x0().f5595a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            x0().m.setNavigationIcon(drawable);
            x0().m.setNavigationContentDescription(getString(R.string.back));
        }
        x0().f5597n.setTypeface(s4.c.u);
        x0().m.setNavigationOnClickListener(new u(this, 10));
        x0().f5596b.setOnClickListener(new h5.o(5));
        x0().l.setLayoutManager(new LinearLayoutManager(this, 1, false));
        x0().l.setItemAnimator(new DefaultItemAnimator());
        c8.f0.z(this.R, null, null, new h(this, (g7.c) null, 23), 3);
    }

    public final t x0() {
        return (t) this.Q.getValue();
    }
}
