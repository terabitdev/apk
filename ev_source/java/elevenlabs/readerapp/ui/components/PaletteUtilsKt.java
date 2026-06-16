package io.elevenlabs.readerapp.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i1.w2;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import j1.a2;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u000e\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016²\u0006\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0015\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"", "url", "", "isDarkMode", "Lu2/s2;", "Lp3/x;", "rememberHeaderColor", "(Ljava/lang/String;ZLu2/m;I)Lu2/s2;", "imageUrl", "collectionLoaded", "hasSubpages", "subpageRefreshDone", "rememberAnimatedHeaderColor", "(Ljava/lang/String;ZZZLu2/m;I)Lp3/x;", "HeaderColorFallback", "J", "getHeaderColorFallback", "()J", "imageColor", "", "cachedHeaderColorRaw", "animatedColor", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PaletteUtilsKt {
    private static final long HeaderColorFallback = p3.h0.e(4288756316L);

    public static final long getHeaderColorFallback() {
        return HeaderColorFallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final p3.x rememberAnimatedHeaderColor(String str, boolean z6, boolean z10, boolean z11, u2.m mVar, int i10) {
        p3.x xVar;
        boolean z12;
        a2 a2Var;
        s2 rememberHeaderColor = rememberHeaderColor(str, EchoTheme.INSTANCE.isDarkMode(mVar, EchoTheme.$stable), mVar, i10 & 14);
        if (rememberAnimatedHeaderColor$lambda$0(rememberHeaderColor) != null) {
            xVar = rememberAnimatedHeaderColor$lambda$0(rememberHeaderColor);
        } else if ((str == null || str.length() == 0) && z6 && (!z10 || z11)) {
            xVar = new p3.x(HeaderColorFallback);
        } else {
            xVar = null;
        }
        long m2003getPrimary0d7_KjU = ElevenLabsTheme.INSTANCE.getColor(mVar, ElevenLabsTheme.$stable).getBackground().m2003getPrimary0d7_KjU();
        Object[] objArr = new Object[0];
        u2.q qVar = (u2.q) mVar;
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (L == eVar) {
            L = new a(7);
            qVar.h0(L);
        }
        u2.y0 y0Var = (u2.y0) f3.m.e(objArr, (ho.a) L, qVar, 48);
        if (rememberAnimatedHeaderColor$lambda$2(y0Var) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean f10 = qVar.f(xVar) | qVar.f(y0Var);
        Object L2 = qVar.L();
        if (f10 || L2 == eVar) {
            L2 = new PaletteUtilsKt$rememberAnimatedHeaderColor$1$1(xVar, y0Var, null);
            qVar.h0(L2);
        }
        u2.r.f((ho.p) L2, xVar, qVar);
        if (xVar == null) {
            if (z12) {
                xVar = new p3.x(rememberAnimatedHeaderColor$lambda$2(y0Var));
            } else {
                xVar = null;
            }
        }
        if (xVar != null) {
            m2003getPrimary0d7_KjU = xVar.f26440a;
        }
        long j4 = m2003getPrimary0d7_KjU;
        if (z12) {
            a2Var = new Object();
        } else {
            a2Var = j1.e.s(400, 0, null, 6);
        }
        s2 a10 = w2.a(j4, a2Var, "headerColor", qVar, 384, 8);
        if (xVar == null) {
            return null;
        }
        return new p3.x(rememberAnimatedHeaderColor$lambda$5(a10));
    }

    private static final p3.x rememberAnimatedHeaderColor$lambda$0(s2 s2Var) {
        return (p3.x) s2Var.getValue();
    }

    public static final u2.y0 rememberAnimatedHeaderColor$lambda$1$0() {
        return new u2.g1(0L);
    }

    private static final long rememberAnimatedHeaderColor$lambda$2(u2.y0 y0Var) {
        return ((u2.g1) y0Var).h();
    }

    public static final void rememberAnimatedHeaderColor$lambda$3(u2.y0 y0Var, long j4) {
        ((u2.g1) y0Var).i(j4);
    }

    private static final long rememberAnimatedHeaderColor$lambda$5(s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    public static final s2 rememberHeaderColor(String str, boolean z6, u2.m mVar, int i10) {
        boolean z10;
        u2.q qVar = (u2.q) mVar;
        Context context = (Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b);
        Boolean valueOf = Boolean.valueOf(z6);
        boolean z11 = false;
        if ((((i10 & 14) ^ 6) > 4 && qVar.f(str)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean h10 = z10 | qVar.h(context);
        if ((((i10 & 112) ^ 48) > 32 && qVar.g(z6)) || (i10 & 48) == 32) {
            z11 = true;
        }
        boolean z12 = h10 | z11;
        Object L = qVar.L();
        if (z12 || L == u2.l.f33918a) {
            L = new PaletteUtilsKt$rememberHeaderColor$1$1(str, context, z6, null);
            qVar.h0(L);
        }
        int i11 = i10 << 3;
        return u2.r.D(null, str, valueOf, (ho.p) L, qVar, (i11 & 112) | 6 | (i11 & 896));
    }
}
