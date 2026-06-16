package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsColors;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.e5;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", ParameterNames.ICON, "", "title", "Lkotlin/Function0;", "Lsn/z;", "onPress", "Li3/t;", "modifier", "SquareIconButton", "(ILjava/lang/String;Lho/a;Li3/t;Lu2/m;II)V", "Preview_SquareIconButton", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SquareIconButtonKt {
    public static final void Preview_SquareIconButton(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-96997286);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t E = r1.d.E(qVar2, 10);
            r1.x a10 = r1.w.a(r1.j.g(8), i3.d.C0, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
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
            int i11 = R.drawable.apple;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new u0(26);
                qVar.h0(L);
            }
            float f10 = 120;
            SquareIconButton(i11, "Apple", (ho.a) L, r1.p2.s(qVar2, f10), qVar, 3504, 0);
            int i12 = R.drawable.google;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new u0(27);
                qVar.h0(L2);
            }
            SquareIconButton(i12, "Google with very long text", (ho.a) L2, r1.p2.s(qVar2, f10), qVar, 3504, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 12);
        }
    }

    public static final sn.z Preview_SquareIconButton$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_SquareIconButton(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SquareIconButton(int i10, String str, ho.a aVar, i3.t tVar, u2.m mVar, int i11, int i12) {
        int i13;
        ho.a aVar2;
        i3.t tVar2;
        int i14;
        boolean z6;
        i3.t tVar3;
        u2.r1 r10;
        i3.t tVar4;
        boolean z10;
        int i15;
        int i16;
        int i17;
        str.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(391997366);
        if ((i11 & 6) == 0) {
            if (qVar.d(i10)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i13 = i17 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar.f(str)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i13 |= i16;
        }
        if ((i11 & 384) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i13 |= i15;
        } else {
            aVar2 = aVar;
        }
        int i18 = i12 & 8;
        if (i18 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i14;
            if ((i13 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i13 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i18 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                ElevenLabsColors colors = elevenLabsTheme.getColors(qVar, 6);
                i3.t c5 = m3.h.c(tVar4, elevenLabsTheme.getShapes(qVar, 6).getMd());
                if ((i13 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z10 || L == eVar) {
                    L = new g(str, 16);
                    qVar.h0(L);
                }
                i3.t c10 = p4.q.c(c5, true, (ho.l) L);
                Object L2 = qVar.L();
                if (L2 == eVar) {
                    L2 = j0.c.o(qVar);
                }
                i3.t E = r1.d.E(r1.p2.e(l1.n.h(l1.n.n(c10, (p1.l) L2, e5.b(t2.u.P, 3, colors.getSquareIconButtonFg(), false), false, new p4.k(0), aVar2, 12), colors.getSquareIconButtonBg(), p3.h0.f26395b), 1.0f), 16);
                r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c11 = i3.a.c(E, qVar);
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
                u2.r.J(h4.g.f11905d, c11, qVar);
                int i19 = i13;
                l1.n.c(kd.a.M(i10, qVar, i13 & 14), null, r1.p2.o(qVar2, 24), null, null, t2.u.P, new p3.n(colors.getSquareIconButtonFg(), 5), qVar, u3.c.$stable | 432, 56);
                j7.d(str, r1.d.I(qVar2, t2.u.P, 4, t2.u.P, t2.u.P, 13), colors.getSquareIconButtonFg(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodySmall500(), qVar, ((i19 >> 3) & 14) | 48, 24960, 110584);
                qVar = qVar;
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.h0(i10, str, aVar, tVar3, i11, i12);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i13 & 1171) == 1170) {
        }
        if (!qVar.O(i13 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z SquareIconButton$lambda$0$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 0);
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z SquareIconButton$lambda$3(int i10, String str, ho.a aVar, i3.t tVar, int i11, int i12, u2.m mVar, int i13) {
        SquareIconButton(i10, str, aVar, tVar, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }
}
