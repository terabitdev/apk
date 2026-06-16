package io.elevenlabs.ui.components;

import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"", "count", "Lw1/e0;", "pagerState", "Li3/t;", "modifier", "Lsn/z;", "TabIndicator", "(ILw1/e0;Li3/t;Lu2/m;II)V", "Lp3/x;", "color", "Lh5/f;", "spacing", "wormTransition-1gnV_Wk", "(Li3/t;Lw1/e0;JF)Li3/t;", "wormTransition", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class TabIndicatorKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TabIndicator(int i10, w1.e0 e0Var, i3.t tVar, u2.m mVar, int i11, int i12) {
        int i13;
        i3.t tVar2;
        int i14;
        boolean z6;
        w1.e0 e0Var2;
        i3.t tVar3;
        u2.r1 r10;
        int i15;
        long m2179getNeutral0d7_KjU;
        int i16;
        int i17;
        e0Var.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(891647077);
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
            if (qVar.f(e0Var)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i13 |= i16;
        }
        int i18 = i12 & 4;
        if (i18 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i13 |= i14;
            if ((i13 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i13 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i18 != 0) {
                    tVar2 = qVar2;
                }
                float f10 = 16;
                float f11 = 4;
                float f12 = 6;
                long m2178getActive0d7_KjU = ElevenLabsTheme.INSTANCE.getColor(qVar, 6).getTabIndicator().m2178getActive0d7_KjU();
                f4.f1 d10 = r1.p.d(i3.d.f13000d, false);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(tVar2, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                h4.e eVar = h4.g.f11907f;
                u2.r.J(eVar, d10, qVar);
                h4.e eVar2 = h4.g.f11906e;
                u2.r.J(eVar2, l4, qVar);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar3 = h4.g.f11908g;
                u2.r.y(qVar, valueOf, eVar3);
                h4.d dVar = h4.g.f11909h;
                u2.r.F(dVar, qVar);
                h4.e eVar4 = h4.g.f11905d;
                u2.r.J(eVar4, c5, qVar);
                r1.h g10 = r1.j.g(f12);
                i3.t f13 = r1.p2.f(tVar2, f11);
                i3.t tVar4 = tVar2;
                r1.k2 a10 = r1.i2.a(g10, i3.d.f13005z0, qVar, 54);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l7 = qVar.l();
                i3.t c10 = i3.a.c(f13, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(eVar, a10, qVar);
                u2.r.J(eVar2, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
                u2.r.J(eVar4, c10, qVar);
                qVar.X(195114535);
                for (int i19 = 0; i19 < i10; i19++) {
                    i3.t s10 = r1.p2.s(r1.p2.f(qVar2, f11), f10);
                    if (i19 == ((u2.f1) e0Var.f35962d.f5294c).h()) {
                        qVar.X(-817692500);
                        i15 = 0;
                        qVar.p(false);
                        m2179getNeutral0d7_KjU = m2178getActive0d7_KjU;
                    } else {
                        i15 = 0;
                        qVar.X(-580562862);
                        m2179getNeutral0d7_KjU = ElevenLabsTheme.INSTANCE.getColor(qVar, 6).getTabIndicator().m2179getNeutral0d7_KjU();
                        qVar.p(false);
                    }
                    r1.p.a(l1.n.h(s10, m2179getNeutral0d7_KjU, z1.h.f39128a), qVar, i15);
                }
                e0Var2 = e0Var;
                qVar.p(false);
                qVar.p(true);
                r1.p.a(r1.p2.s(r1.p2.f(m1883wormTransition1gnV_Wk(qVar2, e0Var2, m2178getActive0d7_KjU, f12), f11), f10), qVar, 0);
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                e0Var2 = e0Var;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new q1(i10, e0Var2, tVar3, i11, i12, 1);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i13 & 147) == 146) {
        }
        if (!qVar.O(i13 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z TabIndicator$lambda$1(int i10, w1.e0 e0Var, i3.t tVar, int i11, int i12, u2.m mVar, int i13) {
        TabIndicator(i10, e0Var, tVar, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    /* renamed from: wormTransition-1gnV_Wk */
    private static final i3.t m1883wormTransition1gnV_Wk(i3.t tVar, w1.e0 e0Var, long j4, float f10) {
        return m3.h.e(tVar, new x2(f10, e0Var, j4));
    }

    public static final sn.z wormTransition_1gnV_Wk$lambda$0(float f10, w1.e0 e0Var, long j4, r3.e eVar) {
        eVar.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (eVar.b() >> 32)) + eVar.B(f10);
        float f11 = 1;
        float h10 = ((((u2.e1) e0Var.f35962d.f5295d).h() + ((u2.f1) e0Var.f35962d.f5294c).h()) % f11) * 2;
        float f12 = ((int) r10) * intBitsToFloat;
        float f13 = h10 - f11;
        if (t2.u.P >= f13) {
            f13 = 0.0f;
        }
        float f14 = (f13 * intBitsToFloat) + f12;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (eVar.b() >> 32)) + f12;
        if (1.0f <= h10) {
            h10 = 1.0f;
        }
        o3.d e10 = n0.l.e(f14, t2.u.P, (h10 * intBitsToFloat) + intBitsToFloat2, Float.intBitsToFloat((int) (eVar.b() & 4294967295L)), (Float.floatToRawIntBits(50.0f) << 32) | (Float.floatToRawIntBits(50.0f) & 4294967295L));
        p3.i a10 = p3.k.a();
        p3.v0.c(a10, e10);
        eVar.O(a10, j4);
        return sn.z.f31622a;
    }
}
