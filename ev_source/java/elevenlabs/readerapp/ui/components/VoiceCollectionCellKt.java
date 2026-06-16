package io.elevenlabs.readerapp.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import i4.w1;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.LandscapistImageKt;
import io.elevenlabs.ui.compositionlocal.LocalSnapshotTestsContextKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a5\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "title", "imageUrl", "Lp3/x;", "color", "Lkotlin/Function0;", "Lsn/z;", "onClick", "VoiceCollectionCell-FNF3uiM", "(Ljava/lang/String;Ljava/lang/String;JLho/a;Lu2/m;I)V", "VoiceCollectionCell", "Preview_VoiceCollectionCell", "(Lu2/m;I)V", "", "imageLoaded", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VoiceCollectionCellKt {
    public static final void Preview_VoiceCollectionCell(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1066388598);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            float f10 = 12;
            i3.t E = r1.d.E(i3.q.f13017a, f10);
            r1.x a10 = r1.w.a(r1.j.g(f10), i3.d.B0, qVar, 6);
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
            long j4 = p3.x.f26435j;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new a(15);
                qVar.h0(L);
            }
            m1095VoiceCollectionCellFNF3uiM("Sci-fi", "", j4, (ho.a) L, qVar, 3510);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(16);
                qVar.h0(L2);
            }
            m1095VoiceCollectionCellFNF3uiM("Sci-fi Essentials Wow So Essential Trust Me Please", "", j4, (ho.a) L2, qVar, 3510);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 17);
        }
    }

    public static final sn.z Preview_VoiceCollectionCell$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VoiceCollectionCell(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x02ca  */
    /* renamed from: VoiceCollectionCell-FNF3uiM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1095VoiceCollectionCellFNF3uiM(String str, String str2, long j4, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean booleanValue;
        boolean z10;
        int i12;
        i3.l lVar;
        int i13;
        u2.e eVar;
        boolean f10;
        Object L;
        int i14;
        int i15;
        int i16;
        int i17;
        i3.l lVar2 = i3.d.f13000d;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1564724454);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar.e(j4)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i14;
        }
        if ((i11 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            if (((Boolean) qVar.j(w1.f13252a)).booleanValue()) {
                qVar.X(-1425992402);
                qVar.p(false);
                booleanValue = true;
            } else {
                qVar.X(-461640607);
                booleanValue = ((Boolean) qVar.j(LocalSnapshotTestsContextKt.getLocalSnapshotTestsContext())).booleanValue();
                qVar.p(false);
            }
            Context context = (Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b);
            Object[] objArr = {str};
            Object L2 = qVar.L();
            u2.e eVar2 = u2.l.f33918a;
            if (L2 == eVar2) {
                L2 = new a(14);
                qVar.h0(L2);
            }
            u2.z0 z0Var = (u2.z0) f3.m.e(objArr, (ho.a) L2, qVar, 48);
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i18 = ElevenLabsTheme.$stable;
            int i19 = i11;
            i3.t p10 = l1.n.p(l1.n.h(m3.h.c(e10, elevenLabsTheme.getShapes(qVar, i18).getLg2()), p3.x.b(0.1f, j4), p3.h0.f26395b), false, null, null, null, aVar, 15);
            int i20 = i19 & 14;
            if (i20 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object L3 = qVar.L();
            if (z10 || L3 == eVar2) {
                L3 = new am.c(str, 3);
                qVar.h0(L3);
            }
            i3.t E = r1.d.E(p4.q.c(p10, true, (ho.l) L3), elevenLabsTheme.getSpacings(qVar, i18).m2353getX2D9Ej5fM());
            r1.u0 u0Var = r1.j.f29228a;
            k2 a10 = i2.a(r1.j.g(elevenLabsTheme.getSpacings(qVar, i18).m2358getX6D9Ej5fM()), i3.d.f13005z0, qVar, 48);
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
            h4.e eVar3 = h4.g.f11907f;
            u2.r.J(eVar3, a10, qVar);
            h4.e eVar4 = h4.g.f11906e;
            u2.r.J(eVar4, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            boolean z11 = booleanValue;
            h4.e eVar5 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar5);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar6 = h4.g.f11905d;
            u2.r.J(eVar6, c5, qVar);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar3, d10, qVar);
            u2.r.J(eVar4, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar5, qVar, dVar);
            u2.r.J(eVar6, c10, qVar);
            boolean VoiceCollectionCell_FNF3uiM$lambda$1 = VoiceCollectionCell_FNF3uiM$lambda$1(z0Var);
            r1.t tVar = r1.t.f29349a;
            if (!VoiceCollectionCell_FNF3uiM$lambda$1 && !z11) {
                qVar.X(1554169490);
                i13 = 0;
                qVar.p(false);
                lVar = lVar2;
                i12 = i18;
            } else {
                qVar.X(1553792778);
                i12 = i18;
                lVar = lVar2;
                i13 = 0;
                r1.p.a(tVar.b(l1.n.h(m3.h.i(r1.d.B(p2.s(p2.f(qVar2, 126), 30), 110, t2.u.P, 2), 6.0f), p3.x.b(0.15f, j4), elevenLabsTheme.getShapes(qVar, i12).getMd()), lVar), qVar, 0);
                qVar.p(false);
            }
            i3.t b10 = tVar.b(m3.h.c(p2.o(qVar2, 136), elevenLabsTheme.getShapes(qVar, i12).getMx()), lVar);
            u3.c M = kd.a.M(R.drawable.genfm_import_bg, qVar, i13);
            vk.i iVar = new vk.i(null, 0L, 123);
            boolean h10 = qVar.h(context);
            if ((i19 & 112) == 32) {
                i13 = 1;
            }
            int i21 = (h10 ? 1 : 0) | i13;
            Object L4 = qVar.L();
            if (i21 == 0) {
                eVar = eVar2;
                if (L4 != eVar) {
                    ho.a aVar2 = (ho.a) L4;
                    f10 = qVar.f(z0Var);
                    L = qVar.L();
                    if (!f10 || L == eVar) {
                        L = new a2.y(z0Var, 12);
                        qVar.h0(L);
                    }
                    LandscapistImageKt.LandscapistCoilImage(aVar2, b10, null, iVar, (ho.l) L, M, c3.k.d(849961422, true, new a1(b10, j4), qVar), null, null, qVar, (u3.c.$stable << 15) | 1575936, 388);
                    qVar.p(true);
                    s4.y0 subtitleLarge700 = elevenLabsTheme.getTypo(qVar, i12).getSubtitleLarge700();
                    if (1.0f <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    j7.d(str, new m1(1.0f, true), 0L, 0L, null, 0L, null, 0L, 2, true, 2, 0, null, subtitleLarge700, qVar, i20, 28032, 102396);
                    qVar = qVar;
                    qVar.p(true);
                }
            } else {
                eVar = eVar2;
            }
            L4 = new y0(context, str2, 5);
            qVar.h0(L4);
            ho.a aVar22 = (ho.a) L4;
            f10 = qVar.f(z0Var);
            L = qVar.L();
            if (!f10) {
            }
            L = new a2.y(z0Var, 12);
            qVar.h0(L);
            LandscapistImageKt.LandscapistCoilImage(aVar22, b10, null, iVar, (ho.l) L, M, c3.k.d(849961422, true, new a1(b10, j4), qVar), null, null, qVar, (u3.c.$stable << 15) | 1575936, 388);
            qVar.p(true);
            s4.y0 subtitleLarge7002 = elevenLabsTheme.getTypo(qVar, i12).getSubtitleLarge700();
            if (1.0f <= 0.0d) {
            }
            j7.d(str, new m1(1.0f, true), 0L, 0L, null, 0L, null, 0L, 2, true, 2, 0, null, subtitleLarge7002, qVar, i20, 28032, 102396);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new b1(str, str2, j4, aVar, i10);
        }
    }

    public static final u2.z0 VoiceCollectionCell_FNF3uiM$lambda$0$0() {
        return u2.r.A(Boolean.FALSE);
    }

    private static final boolean VoiceCollectionCell_FNF3uiM$lambda$1(u2.z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void VoiceCollectionCell_FNF3uiM$lambda$2(u2.z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final sn.z VoiceCollectionCell_FNF3uiM$lambda$3$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 0);
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    public static final ad.i VoiceCollectionCell_FNF3uiM$lambda$4$0$0$0(Context context, String str) {
        ad.h hVar = new ad.h(context);
        hVar.f1788c = str;
        hVar.b();
        return hVar.a();
    }

    public static final sn.z VoiceCollectionCell_FNF3uiM$lambda$4$0$1$0(u2.z0 z0Var, wk.e eVar) {
        eVar.getClass();
        VoiceCollectionCell_FNF3uiM$lambda$2(z0Var, eVar instanceof wk.d);
        return sn.z.f31622a;
    }

    public static final sn.z VoiceCollectionCell_FNF3uiM$lambda$4$0$2(i3.t tVar, long j4, r1.s sVar, wk.b bVar, u2.m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        bVar.getClass();
        if ((i10 & 129) != 128) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.p.a(l1.n.h(tVar, p3.x.b(0.1f, j4), p3.h0.f26395b), qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z VoiceCollectionCell_FNF3uiM$lambda$5(String str, String str2, long j4, ho.a aVar, int i10, u2.m mVar, int i11) {
        m1095VoiceCollectionCellFNF3uiM(str, str2, j4, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
