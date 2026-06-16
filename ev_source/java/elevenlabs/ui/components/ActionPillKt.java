package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.e5;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", Constants.ScionAnalytics.PARAM_LABEL, "iconUrl", "Lkotlin/Function0;", "Lsn/z;", "onClick", "Li3/t;", "modifier", "ActionPill", "(Ljava/lang/String;Ljava/lang/String;Lho/a;Li3/t;Lu2/m;II)V", "Preview_ActionPill", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ActionPillKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActionPill(String str, String str2, ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar2;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        u2.r1 r10;
        int i14;
        int i15;
        int i16;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2019023086);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        } else {
            aVar2 = aVar;
        }
        int i17 = i11 & 8;
        if (i17 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i17 != 0) {
                    tVar3 = qVar2;
                } else {
                    tVar3 = tVar2;
                }
                i3.t h10 = r1.p2.h(tVar3, 48, t2.u.P, 2);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                i3.t h11 = l1.n.h(m3.h.c(h10, echoTheme.getShapes(qVar, 6).getFull(qVar, 0)), echoTheme.getColors(qVar, 6).getFill().getDenary(qVar, 0), p3.h0.f26395b);
                Object L = qVar.L();
                if (L == u2.l.f33918a) {
                    L = j0.c.o(qVar);
                }
                i3.t H = r1.d.H(l1.n.n(h11, (p1.l) L, e5.b(t2.u.P, 3, ib.i.v(6, 0, echoTheme, qVar, qVar), false), false, new p4.k(0), aVar2, 12), echoTheme.getSpacings(qVar, 6).getX4(), echoTheme.getSpacings(qVar, 6).getX3(), echoTheme.getSpacings(qVar, 6).getX4(), echoTheme.getSpacings(qVar, 6).getX3());
                r1.k2 a10 = r1.i2.a(r1.j.f29232e, i3.d.f13005z0, qVar, 54);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(H, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(h4.g.f11907f, a10, qVar);
                u2.r.J(h4.g.f11906e, l4, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar);
                u2.r.J(h4.g.f11905d, c5, qVar);
                CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0(str2, r1.p2.o(qVar2, echoTheme.getSpacings(qVar, 6).getX5()), new p3.x(echoTheme.getColors(qVar, 6).getIcon().getPrimary(qVar, 0)), f4.q.f8840c, null, null, null, qVar, ((i12 >> 3) & 14) | 3072, 112);
                r1.d.g(r1.p2.s(qVar2, echoTheme.getSpacings(qVar, 6).getX3()), qVar);
                j7.d(str, null, ib.i.v(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar, 6).getBaseRegular500(qVar, 0), qVar, i12 & 14, 24960, 110586);
                qVar = qVar;
                qVar.p(true);
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.q(str, str2, aVar, tVar3, i10, i11, 2);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ActionPill$lambda$2(String str, String str2, ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        ActionPill(str, str2, aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ActionPill(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1303504820);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ActionPillKt.INSTANCE.m1794getLambda$979800654$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 17);
        }
    }

    public static final sn.z Preview_ActionPill$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ActionPill(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
