package io.elevenlabs.ui.components;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "accessibilityLabel", "Lkotlin/Function0;", "Lsn/z;", "onPress", "Li3/t;", "modifier", "Lp3/b1;", "shape", "Lkotlin/Function1;", "Lr1/l2;", FirebaseAnalytics.Param.CONTENT, "ButtonOutlined", "(Ljava/lang/String;Lho/a;Li3/t;Lp3/b1;Lho/q;Lu2/m;II)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ButtonOutlinedKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonOutlined(String str, ho.a aVar, i3.t tVar, p3.b1 b1Var, ho.q qVar, u2.m mVar, int i10, int i11) {
        String str2;
        int i12;
        i3.t tVar2;
        int i13;
        p3.b1 b1Var2;
        boolean z6;
        u2.q qVar2;
        i3.t tVar3;
        p3.b1 b1Var3;
        u2.r1 r10;
        int i14;
        int i15;
        int i16;
        int i17;
        str.getClass();
        aVar.getClass();
        qVar.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-1931974808);
        if ((i10 & 6) == 0) {
            str2 = str;
            if (qVar3.f(str2)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            str2 = str;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.h(aVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        int i18 = i11 & 4;
        if (i18 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar3.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i10 & 3072) != 0) {
                if ((i11 & 8) == 0) {
                    b1Var2 = b1Var;
                    if (qVar3.f(b1Var2)) {
                        i15 = 2048;
                        i12 |= i15;
                    }
                } else {
                    b1Var2 = b1Var;
                }
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i12 |= i15;
            } else {
                b1Var2 = b1Var;
            }
            if ((i10 & 24576) == 0) {
                if (qVar3.h(qVar)) {
                    i14 = 16384;
                } else {
                    i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i14;
            }
            if ((i12 & 9363) == 9362) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar3.O(i12 & 1, z6)) {
                qVar3.T();
                if ((i10 & 1) != 0 && !qVar3.y()) {
                    qVar3.R();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    tVar3 = tVar2;
                } else {
                    if (i18 != 0) {
                        tVar3 = i3.q.f13017a;
                    } else {
                        tVar3 = tVar2;
                    }
                    if ((i11 & 8) != 0) {
                        b1Var3 = ElevenLabsTheme.INSTANCE.getShapes(qVar3, 6).getFull();
                        i12 &= -7169;
                        qVar3.q();
                        qVar2 = qVar3;
                        ButtonContainerKt.m1780ButtonContainer83mGB3Q(str2, aVar, m3.h.c(l1.n.j(1, ElevenLabsTheme.INSTANCE.getColor(qVar3, 6).getDivider().m2059getLine0d7_KjU(), tVar3, b1Var3), b1Var3), 0L, false, 0, null, false, null, c3.k.d(-1877662716, true, new u(qVar, 0), qVar3), qVar2, (i12 & 14) | 805306368 | (i12 & 112), 504);
                    }
                }
                b1Var3 = b1Var2;
                qVar3.q();
                qVar2 = qVar3;
                ButtonContainerKt.m1780ButtonContainer83mGB3Q(str2, aVar, m3.h.c(l1.n.j(1, ElevenLabsTheme.INSTANCE.getColor(qVar3, 6).getDivider().m2059getLine0d7_KjU(), tVar3, b1Var3), b1Var3), 0L, false, 0, null, false, null, c3.k.d(-1877662716, true, new u(qVar, 0), qVar3), qVar2, (i12 & 14) | 805306368 | (i12 & 112), 504);
            } else {
                qVar2 = qVar3;
                qVar2.R();
                tVar3 = tVar2;
                b1Var3 = b1Var2;
            }
            r10 = qVar2.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(str, aVar, tVar3, b1Var3, qVar, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i10 & 3072) != 0) {
        }
        if ((i10 & 24576) == 0) {
        }
        if ((i12 & 9363) == 9362) {
        }
        if (!qVar3.O(i12 & 1, z6)) {
        }
        r10 = qVar2.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ButtonOutlined$lambda$0(ho.q qVar, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i10 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t F = r1.d.F(i3.q.f13017a, elevenLabsTheme.getSpacings(qVar2, 6).m2355getX3D9Ej5fM(), elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM());
            r1.k2 a10 = r1.i2.a(r1.j.f29228a, i3.d.f13005z0, qVar2, 48);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(F, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            u2.r.J(h4.g.f11905d, c5, qVar2);
            qVar.invoke(r1.m2.f29267a, qVar2, 6);
            qVar2.p(true);
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ButtonOutlined$lambda$1(String str, ho.a aVar, i3.t tVar, p3.b1 b1Var, ho.q qVar, int i10, int i11, u2.m mVar, int i12) {
        ButtonOutlined(str, aVar, tVar, b1Var, qVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
