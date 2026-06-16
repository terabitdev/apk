package io.elevenlabs.ui.extensions;

import a2.v0;
import a2.y;
import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.n0;
import androidx.lifecycle.b0;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import f4.e1;
import f4.g1;
import f4.h1;
import f4.s1;
import h5.f;
import ho.l;
import ho.p;
import i4.j1;
import i4.x2;
import i4.y1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d;
import ir.z1;
import j.j;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import m3.h;
import o7.e;
import p3.y0;
import r1.c3;
import r1.u0;
import sn.z;
import t2.u;
import u2.h0;
import u2.i0;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.z0;
import us.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001aK\u0010\u000e\u001a\u0004\u0018\u00010\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u0019\u0010\u001c\u001a\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001e\u0010\u001c\u001a\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0 H\u0007¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b#\u0010$\u001a?\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010 \"\u0004\b\u0000\u0010%\"\u0004\b\u0001\u0010&*\b\u0012\u0004\u0012\u00028\u00000'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0007¢\u0006\u0004\b)\u0010*\u001a#\u0010.\u001a\u00020\u0000*\u00020\u00002\u0006\u0010+\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/\u001a\u000f\u00101\u001a\u000200H\u0007¢\u0006\u0004\b1\u00102¨\u00065²\u0006\u0010\u00103\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00104\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Li3/t;", "Lu3/c;", "painter", "backgroundStreched", "(Li3/t;Lu3/c;Lu2/m;I)Li3/t;", "", "", "permissions", "Lkotlin/Function1;", "Landroid/content/Context;", "", "checkIsGranted", "Lsn/z;", "onResult", "rememberPermissionsGranted", "([Ljava/lang/String;Lho/l;Lho/l;Lu2/m;II)Ljava/lang/Boolean;", "rememberIsAppInForeground", "(Lu2/m;I)Z", "Landroidx/lifecycle/t;", "onEvent", "OnLifecycleEvent", "(Lho/l;Lu2/m;I)V", "", "px", "Lh5/f;", "rememberPxToDp", "(ILu2/m;I)F", "", "(FLu2/m;I)F", "dp", "rememberDpToPx-8Feqmps", "rememberDpToPx", "Lu2/s2;", "rememberKeyboardVisibleState", "(Lu2/m;I)Lu2/s2;", "disableClickThrough", "(Li3/t;)Li3/t;", TokenNames.T, TokenNames.R, "Lir/z1;", "selector", "selectAsState", "(Lir/z1;Lho/l;Lu2/m;I)Lu2/s2;", "scaleX", "Li3/e;", "horizontalAlignment", "scaleWidth", "(Li3/t;FLi3/e;)Li3/t;", "Lh5/h;", "rememberWindowContainerSize", "(Lu2/m;I)J", "permissionsGranted", "isAppInForeground", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposeExtensionsKt {
    public static final void OnLifecycleEvent(l lVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(1191899665);
        if ((i10 & 6) == 0) {
            if (qVar.h(lVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            z0 H = r.H(lVar, qVar);
            z0 H2 = r.H(qVar.j(e.f24864a), qVar);
            Object value = H2.getValue();
            boolean f10 = qVar.f(H2) | qVar.f(H);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new io.elevenlabs.ocr.e(H2, H, 1);
                qVar.h0(L);
            }
            r.c(value, (l) L, qVar);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new em.a(lVar, i10, 10);
        }
    }

    public static final h0 OnLifecycleEvent$lambda$0$0(s2 s2Var, s2 s2Var2, i0 i0Var) {
        i0Var.getClass();
        final v lifecycle = ((b0) s2Var.getValue()).getLifecycle();
        final androidx.lifecycle.q qVar = new androidx.lifecycle.q(s2Var2, 1);
        lifecycle.addObserver(qVar);
        return new h0() { // from class: io.elevenlabs.ui.extensions.ComposeExtensionsKt$OnLifecycleEvent$lambda$0$0$$inlined$onDispose$1
            @Override // u2.h0
            public void dispose() {
                v.this.removeObserver(qVar);
            }
        };
    }

    public static final void OnLifecycleEvent$lambda$0$0$0(s2 s2Var, b0 b0Var, t tVar) {
        b0Var.getClass();
        tVar.getClass();
        ((l) s2Var.getValue()).invoke(tVar);
    }

    public static final z OnLifecycleEvent$lambda$1(l lVar, int i10, m mVar, int i11) {
        OnLifecycleEvent(lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final i3.t backgroundStreched(i3.t tVar, u3.c cVar, m mVar, int i10) {
        boolean z6;
        tVar.getClass();
        cVar.getClass();
        if ((((i10 & 112) ^ 48) > 32 && ((q) mVar).h(cVar)) || (i10 & 48) == 32) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        Object L = qVar.L();
        if (z6 || L == u2.l.f33918a) {
            L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.a(cVar, 5);
            qVar.h0(L);
        }
        return h.e(tVar, (l) L);
    }

    public static final z backgroundStreched$lambda$0$0(u3.c cVar, r3.e eVar) {
        eVar.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (eVar.b() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (eVar.b() & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (cVar.mo938getIntrinsicSizeNHjbRc() >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (cVar.mo938getIntrinsicSizeNHjbRc() & 4294967295L));
        if (intBitsToFloat3 > u.P && intBitsToFloat4 > u.P) {
            float max = intBitsToFloat4 * Math.max(intBitsToFloat / intBitsToFloat3, intBitsToFloat2 / intBitsToFloat4);
            u3.c.m2645drawx_KDEd0$default(cVar, eVar, (Float.floatToRawIntBits(intBitsToFloat3 * r0) << 32) | (Float.floatToRawIntBits(max) & 4294967295L), u.P, null, 6, null);
        }
        return z.f31622a;
    }

    public static final i3.t disableClickThrough(i3.t tVar) {
        tVar.getClass();
        return n.p(tVar, false, null, null, null, new d(25), 14);
    }

    /* renamed from: rememberDpToPx-8Feqmps */
    public static final float m1979rememberDpToPx8Feqmps(float f10, m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        h5.c cVar = (h5.c) qVar.j(j1.f13129h);
        boolean f11 = qVar.f(cVar);
        if ((((i10 & 14) ^ 6) > 4 && qVar.c(f10)) || (i10 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z10 = z6 | f11;
        Object L = qVar.L();
        if (z10 || L == u2.l.f33918a) {
            L = Float.valueOf(cVar.d0(f10));
            qVar.h0(L);
        }
        return ((Number) L).floatValue();
    }

    public static final boolean rememberIsAppInForeground(m mVar, int i10) {
        q qVar = (q) mVar;
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (L == eVar) {
            L = r.A(Boolean.FALSE);
            qVar.h0(L);
        }
        z0 z0Var = (z0) L;
        Object L2 = qVar.L();
        if (L2 == eVar) {
            L2 = new y(z0Var, 17);
            qVar.h0(L2);
        }
        OnLifecycleEvent((l) L2, qVar, 6);
        return rememberIsAppInForeground$lambda$1(z0Var);
    }

    private static final boolean rememberIsAppInForeground$lambda$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void rememberIsAppInForeground$lambda$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z rememberIsAppInForeground$lambda$3$0(z0 z0Var, t tVar) {
        tVar.getClass();
        if (tVar == t.ON_STOP) {
            rememberIsAppInForeground$lambda$2(z0Var, false);
        } else if (tVar == t.ON_START) {
            rememberIsAppInForeground$lambda$2(z0Var, true);
        }
        return z.f31622a;
    }

    public static final s2 rememberKeyboardVisibleState(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        WeakHashMap weakHashMap = c3.f29142x;
        if (u0.e(qVar).f29160s.e().f29200d > 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        return r.H(Boolean.valueOf(z6), qVar);
    }

    public static final Boolean rememberPermissionsGranted(String[] strArr, l lVar, l lVar2, m mVar, int i10, int i11) {
        l lVar3;
        Object obj;
        boolean z6;
        boolean z10;
        strArr.getClass();
        int i12 = i11 & 2;
        Object obj2 = u2.l.f33918a;
        if (i12 != 0) {
            q qVar = (q) mVar;
            boolean h10 = qVar.h(strArr);
            Object L = qVar.L();
            if (h10 || L == obj2) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.a(strArr, 6);
                qVar.h0(L);
            }
            lVar3 = (l) L;
        } else {
            lVar3 = lVar;
        }
        if ((i11 & 4) != 0) {
            q qVar2 = (q) mVar;
            Object L2 = qVar2.L();
            if (L2 == obj2) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d(24);
                qVar2.h0(L2);
            }
            obj = (l) L2;
        } else {
            obj = lVar2;
        }
        q qVar3 = (q) mVar;
        Object L3 = qVar3.L();
        if (L3 == obj2) {
            L3 = r.A(null);
            qVar3.h0(L3);
        }
        z0 z0Var = (z0) L3;
        Context context = (Context) qVar3.j(AndroidCompositionLocals_androidKt.f2291b);
        n0 n0Var = new n0(2);
        int i13 = (i10 & 112) ^ 48;
        boolean z11 = true;
        if ((i13 > 32 && qVar3.f(lVar3)) || (i10 & 48) == 32) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean h11 = z6 | qVar3.h(context);
        if ((((i10 & 896) ^ 384) > 256 && qVar3.f(obj)) || (i10 & 384) == 256) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = h11 | z10;
        Object L4 = qVar3.L();
        if (z12 || L4 == obj2) {
            Object v0Var = new v0(lVar3, context, obj, z0Var, 12);
            qVar3.h0(v0Var);
            L4 = v0Var;
        }
        j C = android.support.v4.media.session.b.C(n0Var, (l) L4, qVar3, 0);
        boolean rememberIsAppInForeground = rememberIsAppInForeground(qVar3, 0);
        Boolean valueOf = Boolean.valueOf(rememberIsAppInForeground);
        boolean g10 = qVar3.g(rememberIsAppInForeground);
        if ((i13 <= 32 || !qVar3.f(lVar3)) && (i10 & 48) != 32) {
            z11 = false;
        }
        boolean h12 = g10 | z11 | qVar3.h(context) | qVar3.h(C) | qVar3.h(strArr);
        Object L5 = qVar3.L();
        if (h12 || L5 == obj2) {
            Object composeExtensionsKt$rememberPermissionsGranted$3$1 = new ComposeExtensionsKt$rememberPermissionsGranted$3$1(rememberIsAppInForeground, lVar3, context, C, strArr, z0Var, null);
            qVar3.h0(composeExtensionsKt$rememberPermissionsGranted$3$1);
            L5 = composeExtensionsKt$rememberPermissionsGranted$3$1;
        }
        r.f((p) L5, valueOf, qVar3);
        return rememberPermissionsGranted$lambda$3(z0Var);
    }

    public static final boolean rememberPermissionsGranted$lambda$0$0(String[] strArr, Context context) {
        context.getClass();
        for (String str : strArr) {
            if (context.checkSelfPermission(str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static final z rememberPermissionsGranted$lambda$1$0(boolean z6) {
        return z.f31622a;
    }

    private static final Boolean rememberPermissionsGranted$lambda$3(z0 z0Var) {
        return (Boolean) z0Var.getValue();
    }

    public static final z rememberPermissionsGranted$lambda$5$0(l lVar, Context context, l lVar2, z0 z0Var, Map map) {
        map.getClass();
        z0Var.setValue((Boolean) lVar.invoke(context));
        lVar2.invoke(Boolean.valueOf(kotlin.jvm.internal.m.c(rememberPermissionsGranted$lambda$3(z0Var), Boolean.TRUE)));
        return z.f31622a;
    }

    public static final float rememberPxToDp(float f10, m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        h5.c cVar = (h5.c) qVar.j(j1.f13129h);
        boolean f11 = qVar.f(cVar);
        if ((((i10 & 14) ^ 6) > 4 && qVar.c(f10)) || (i10 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z10 = z6 | f11;
        Object L = qVar.L();
        if (z10 || L == u2.l.f33918a) {
            L = new f(cVar.T(f10));
            qVar.h0(L);
        }
        return ((f) L).f12083a;
    }

    public static final long rememberWindowContainerSize(m mVar, int i10) {
        q qVar = (q) mVar;
        x2 x2Var = (x2) qVar.j(j1.f13140t);
        h5.c cVar = (h5.c) qVar.j(j1.f13129h);
        y1 y1Var = (y1) x2Var;
        boolean e10 = qVar.e(y1Var.a()) | qVar.f(cVar);
        Object L = qVar.L();
        if (e10 || L == u2.l.f33918a) {
            L = new h5.h(g.a(cVar.S((int) (y1Var.a() >> 32)), cVar.S((int) (y1Var.a() & 4294967295L))));
            qVar.h0(L);
        }
        return ((h5.h) L).f12085a;
    }

    public static final i3.t scaleWidth(i3.t tVar, float f10, i3.e eVar) {
        tVar.getClass();
        eVar.getClass();
        return f4.i0.m(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.b(f10, eVar, 2), tVar);
    }

    public static /* synthetic */ i3.t scaleWidth$default(i3.t tVar, float f10, i3.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = i3.d.B0;
        }
        return scaleWidth(tVar, f10, eVar);
    }

    public static final g1 scaleWidth$lambda$0(final float f10, i3.e eVar, h1 h1Var, e1 e1Var, h5.a aVar) {
        int i10;
        long j4;
        h1Var.getClass();
        e1Var.getClass();
        final s1 V = e1Var.V(aVar.f12077a);
        int y10 = jo.a.y(V.f8868a * f10);
        if (kotlin.jvm.internal.m.c(eVar, i3.d.B0)) {
            j4 = p3.h0.j(u.P, 0.5f);
            i10 = 0;
        } else {
            boolean c5 = kotlin.jvm.internal.m.c(eVar, i3.d.D0);
            int i11 = V.f8868a;
            if (c5) {
                i10 = y10 - i11;
                j4 = p3.h0.j(1.0f, 0.5f);
            } else {
                i10 = (y10 - i11) / 2;
                j4 = p3.h0.j(0.5f, 0.5f);
            }
        }
        final int i12 = i10;
        final long j10 = j4;
        return h1Var.Z(y10, V.f8869b, tn.u.f33548a, new l() { // from class: io.elevenlabs.ui.extensions.c
            @Override // ho.l
            public final Object invoke(Object obj) {
                z scaleWidth$lambda$0$0;
                scaleWidth$lambda$0$0 = ComposeExtensionsKt.scaleWidth$lambda$0$0(s1.this, i12, f10, j10, (f4.r1) obj);
                return scaleWidth$lambda$0$0;
            }
        });
    }

    public static final z scaleWidth$lambda$0$0(s1 s1Var, int i10, float f10, long j4, f4.r1 r1Var) {
        r1Var.getClass();
        f4.r1.r(r1Var, s1Var, i10, 0, new b(f10, 0, j4), 4);
        return z.f31622a;
    }

    public static final z scaleWidth$lambda$0$0$0(float f10, long j4, p3.i0 i0Var) {
        i0Var.getClass();
        y0 y0Var = (y0) i0Var;
        y0Var.r(f10);
        y0Var.z(j4);
        return z.f31622a;
    }

    public static final <T, R> s2 selectAsState(z1 z1Var, l lVar, m mVar, int i10) {
        boolean z6;
        z1Var.getClass();
        lVar.getClass();
        Object invoke = lVar.invoke(z1Var.getValue());
        q qVar = (q) mVar;
        boolean h10 = qVar.h(z1Var);
        if ((((i10 & 112) ^ 48) > 32 && qVar.f(lVar)) || (i10 & 48) == 32) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z10 = h10 | z6;
        Object L = qVar.L();
        if (z10 || L == u2.l.f33918a) {
            L = new ComposeExtensionsKt$selectAsState$1$1(z1Var, lVar, null);
            qVar.h0(L);
        }
        return r.C(invoke, z1Var, (p) L, qVar, (i10 << 3) & 112);
    }

    public static final float rememberPxToDp(int i10, m mVar, int i11) {
        q qVar = (q) mVar;
        h5.c cVar = (h5.c) qVar.j(j1.f13129h);
        boolean f10 = ((((i11 & 14) ^ 6) > 4 && qVar.d(i10)) || (i11 & 6) == 4) | qVar.f(cVar);
        Object L = qVar.L();
        if (f10 || L == u2.l.f33918a) {
            L = new f(cVar.S(i10));
            qVar.h0(L);
        }
        return ((f) L).f12083a;
    }
}
