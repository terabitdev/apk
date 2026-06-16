package io.elevenlabs.ui.extensions;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i3.t;
import io.elevenlabs.ui.echo.EchoTheme;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import m3.h;
import p3.b1;
import p3.x;
import u2.m;
import vl.l;
import vl.o;
import vl.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0019\u0010\u0005\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\r\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/ui/extensions/GlassState;", "rememberGlassState", "(Lu2/m;I)Lio/elevenlabs/ui/extensions/GlassState;", "Li3/t;", RemoteConfigConstants.ResponseFieldKey.STATE, "glassSource", "(Li3/t;Lio/elevenlabs/ui/extensions/GlassState;)Li3/t;", "Lh5/f;", "blurRadius", "Lp3/x;", "tint", "glassEffect-EnRY0Kc", "(Li3/t;Lio/elevenlabs/ui/extensions/GlassState;FJ)Li3/t;", "glassEffect", "glassButtonEffect", "(Li3/t;Lio/elevenlabs/ui/extensions/GlassState;Lu2/m;I)Li3/t;", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class GlassModifiersKt {
    public static final t glassButtonEffect(t tVar, GlassState glassState, m mVar, int i10) {
        tVar.getClass();
        glassState.getClass();
        EchoTheme echoTheme = EchoTheme.INSTANCE;
        long senaryAlpha = echoTheme.getColors(mVar, 6).getBorder().getSenaryAlpha(mVar, 0);
        long senaryAlpha2 = echoTheme.getColors(mVar, 6).getFill().getSenaryAlpha(mVar, 0);
        b1 full = echoTheme.getShapes(mVar, 6).getFull(mVar, 0);
        return n.h(m1980glassEffectEnRY0Kc(h.c(n.j(1, senaryAlpha, tVar, full), full), glassState, 5, senaryAlpha2), senaryAlpha2, full);
    }

    /* renamed from: glassEffect-EnRY0Kc, reason: not valid java name */
    public static final t m1980glassEffectEnRY0Kc(t tVar, GlassState glassState, float f10, long j4) {
        tVar.getClass();
        glassState.getClass();
        return vl.c.f(tVar, glassState.getHazeState(), new o(0L, new q(j4), f10, 25));
    }

    /* renamed from: glassEffect-EnRY0Kc$default, reason: not valid java name */
    public static t m1981glassEffectEnRY0Kc$default(t tVar, GlassState glassState, float f10, long j4, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 5;
        }
        if ((i10 & 4) != 0) {
            int i11 = x.f26439n;
            j4 = x.f26438m;
        }
        return m1980glassEffectEnRY0Kc(tVar, glassState, f10, j4);
    }

    public static final t glassSource(t tVar, GlassState glassState) {
        tVar.getClass();
        glassState.getClass();
        vl.n hazeState = glassState.getHazeState();
        hazeState.getClass();
        return tVar.then(new l(hazeState));
    }

    public static final GlassState rememberGlassState(m mVar, int i10) {
        u2.q qVar = (u2.q) mVar;
        Object L = qVar.L();
        if (L == u2.l.f33918a) {
            L = new GlassState(new vl.n());
            qVar.h0(L);
        }
        return (GlassState) L;
    }
}
