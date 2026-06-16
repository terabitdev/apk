package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "iconResId", "textResId", "Lkotlin/Function0;", "Lsn/z;", "onClick", "", "isSelected", "BigImportButton", "(IILho/a;ZLu2/m;II)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BigImportButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BigImportButton(final int i10, final int i11, final ho.a aVar, boolean z6, u2.m mVar, final int i12, final int i13) {
        int i14;
        boolean z10;
        int i15;
        boolean z11;
        u2.q qVar;
        final boolean z12;
        u2.r1 r10;
        int i16;
        int i17;
        int i18;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(583021749);
        if ((i12 & 6) == 0) {
            if (qVar2.d(i10)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i14 = i18 | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            if (qVar2.d(i11)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i14 |= i17;
        }
        if ((i12 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i14 |= i16;
        }
        int i19 = i13 & 8;
        if (i19 != 0) {
            i14 |= 3072;
        } else if ((i12 & 3072) == 0) {
            z10 = z6;
            if (qVar2.g(z10)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i14 |= i15;
            if ((i14 & 1171) == 1170) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!qVar2.O(i14 & 1, z11)) {
                if (i19 != 0) {
                    z12 = false;
                } else {
                    z12 = z10;
                }
                final String R = kj.c.R(qVar2, i11);
                qVar = qVar2;
                ButtonContainerKt.m1780ButtonContainer83mGB3Q(R, aVar, m3.h.c(i3.q.f13017a, ElevenLabsTheme.INSTANCE.getShapes(qVar2, 6).getMd()), 0L, false, 0, null, false, null, c3.k.d(16647505, true, new ho.q() { // from class: io.elevenlabs.ui.components.l
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        sn.z BigImportButton$lambda$0;
                        int intValue = ((Integer) obj3).intValue();
                        BigImportButton$lambda$0 = BigImportButtonKt.BigImportButton$lambda$0(z12, R, i10, (r1.s) obj, (u2.m) obj2, intValue);
                        return BigImportButton$lambda$0;
                    }
                }, qVar2), qVar, ((i14 >> 3) & 112) | 805306368, 504);
            } else {
                qVar = qVar2;
                qVar.R();
                z12 = z10;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.m
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        sn.z BigImportButton$lambda$1;
                        int intValue = ((Integer) obj2).intValue();
                        BigImportButton$lambda$1 = BigImportButtonKt.BigImportButton$lambda$1(i10, i11, aVar, z12, i12, i13, (u2.m) obj, intValue);
                        return BigImportButton$lambda$1;
                    }
                };
                return;
            }
            return;
        }
        z10 = z6;
        if ((i14 & 1171) == 1170) {
        }
        if (!qVar2.O(i14 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sn.z BigImportButton$lambda$0(boolean z6, String str, int i10, r1.s sVar, u2.m mVar, int i11) {
        boolean z10;
        i3.t tVar;
        sVar.getClass();
        if ((i11 & 17) != 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z10)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            float m2353getX2D9Ej5fM = elevenLabsTheme.getSpacings(qVar, 6).m2353getX2D9Ej5fM();
            i3.q qVar2 = i3.q.f13017a;
            i3.t E = r1.d.E(qVar2, m2353getX2D9Ej5fM);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
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
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            i3.t c10 = m3.h.c(r1.p2.o(qVar2, 60), elevenLabsTheme.getShapes(qVar, 6).getMd());
            if (z6) {
                qVar.X(-15809690);
                tVar = l1.n.j(2, defpackage.f.b(elevenLabsTheme, qVar, 6), qVar2, elevenLabsTheme.getShapes(qVar, 6).getMd());
                qVar.p(false);
            } else {
                qVar.X(-15807165);
                qVar.p(false);
                tVar = qVar2;
            }
            i3.t h10 = l1.n.h(c10.then(tVar), elevenLabsTheme.getColor(qVar, 6).getButtonBackground().m2018getSecondary0d7_KjU(), p3.h0.f26395b);
            f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c11 = i3.a.c(h10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d10, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            q2.y2.a(kd.a.M(i10, qVar, 0), null, r1.p2.o(qVar2, 24), 0L, qVar, u3.c.$stable | 432, 8);
            qVar.p(true);
            r1.d.g(r1.p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, 6).m2350getX1D9Ej5fM()), qVar);
            j7.d(str, null, defpackage.f.A(elevenLabsTheme, qVar, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyTiny500(), qVar, 0, 0, 131066);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sn.z BigImportButton$lambda$1(int i10, int i11, ho.a aVar, boolean z6, int i12, int i13, u2.m mVar, int i14) {
        BigImportButton(i10, i11, aVar, z6, mVar, u2.r.M(i12 | 1), i13);
        return sn.z.f31622a;
    }
}
