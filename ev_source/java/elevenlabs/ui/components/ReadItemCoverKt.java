package io.elevenlabs.ui.components;

import a2.k3;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0007¢\u0006\u0004\b\u0006\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "title", "imageUrl", "Li3/t;", "modifier", "Lsn/z;", "ReadItemCover", "(Ljava/lang/String;Ljava/lang/String;Li3/t;Lu2/m;I)V", "Lkotlin/Function0;", "image", "(Li3/t;Ljava/lang/String;Lho/p;Lu2/m;I)V", "Preview_ReadItemCover", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReadItemCoverKt {
    public static final void Preview_ReadItemCover(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-204822726);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t d10 = r1.p2.d(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t f10 = ib.i.f(elevenLabsTheme, qVar, 6, d10);
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(ib.i.n(elevenLabsTheme, qVar, 6), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(f10, qVar);
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
            float f11 = 52;
            float f12 = 78;
            ReadItemCover("The Wonderful Wizard of Oz", (String) null, r1.p2.f(r1.p2.s(qVar2, f11), f12), qVar, 438);
            float f13 = 2;
            ReadItemCover("The Wonderful Wizard of Oz", (String) null, r1.p2.f(r1.p2.s(qVar2, f11 * f13), f13 * f12), qVar, 438);
            float f14 = 3;
            ReadItemCover("The Wonderful Wizard of Oz", (String) null, r1.p2.f(r1.p2.s(qVar2, f11 * f14), f12 * f14), qVar, 438);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 2);
        }
    }

    public static final sn.z Preview_ReadItemCover$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadItemCover(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void ReadItemCover(i3.t tVar, String str, ho.p pVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        ho.p pVar2 = pVar;
        tVar.getClass();
        str.getClass();
        pVar2.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(721292220);
        if ((i10 & 6) == 0) {
            if (qVar.f(tVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(pVar2)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t h10 = l1.n.h(tVar, elevenLabsTheme.getColor(qVar, 6).getBackground().m2005getSecondary0d7_KjU(), p3.h0.f26395b);
            f4.f1 d10 = r1.p.d(i3.d.f13000d, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            i3.q qVar2 = i3.q.f13017a;
            int i15 = i11;
            l1.n.c(kd.a.M(R.drawable.book_cover, qVar, 0), null, r1.p2.d(qVar2, 1.0f), null, f4.q.f8839b, t2.u.P, null, qVar, u3.c.$stable | 25008, 104);
            r1.k2 a10 = r1.i2.a(r1.j.f29228a, i3.d.f13004y0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(qVar2, qVar);
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
            r1.d.g(r1.p2.e(qVar2, 0.15f), qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            AutoScalingTextKt.m1775AutoScalingTextpB_G1vE(str, new r1.m1(1.0f, true), elevenLabsTheme.getTypo(qVar, 6).getSubtitleSmall500(), 0L, null, 3, false, 0L, 0, qVar, ((i15 >> 3) & 14) | 196608, 472);
            qVar = qVar;
            r1.d.g(r1.p2.e(qVar2, 0.1f), qVar);
            qVar.p(true);
            pVar2 = pVar;
            j0.c.q((i15 >> 6) & 14, pVar2, qVar, true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 27, tVar, str, pVar2);
        }
    }

    public static final sn.z ReadItemCover$lambda$0(String str, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0(str, r1.p2.d(i3.q.f13017a, 1.0f), null, f4.q.f8839b, i3.d.Z, null, null, qVar, 27696, 100);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadItemCover$lambda$1(String str, String str2, i3.t tVar, int i10, u2.m mVar, int i11) {
        ReadItemCover(str, str2, tVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final sn.z ReadItemCover$lambda$3(i3.t tVar, String str, ho.p pVar, int i10, u2.m mVar, int i11) {
        ReadItemCover(tVar, str, pVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void ReadItemCover(String str, String str2, i3.t tVar, u2.m mVar, int i10) {
        int i11;
        str.getClass();
        tVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(692215322);
        if ((i10 & 6) == 0) {
            i11 = (qVar.f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= qVar.f(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= qVar.f(tVar) ? RpcError.MAX_MESSAGE_BYTES : 128;
        }
        if (qVar.O(i11 & 1, (i11 & 147) != 146)) {
            ReadItemCover(tVar, str, c3.k.d(250151835, true, new w(str2, 2), qVar), qVar, ((i11 << 3) & 112) | ((i11 >> 6) & 14) | 384);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y1(str, str2, tVar, i10, 0);
        }
    }
}
