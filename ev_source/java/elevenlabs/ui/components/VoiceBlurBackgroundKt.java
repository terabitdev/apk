package io.elevenlabs.ui.components;

import io.elevenlabs.ui.R;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "id", "image", "Li3/t;", "modifier", "Lsn/z;", "VoiceBlurBackground", "(Ljava/lang/String;Ljava/lang/String;Li3/t;Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoiceBlurBackgroundKt {
    public static final void VoiceBlurBackground(String str, String str2, i3.t tVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        str.getClass();
        tVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-306744774);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(tVar)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        boolean z10 = true;
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            if (str2 == null) {
                qVar.X(1456970694);
                VoiceCircleKt.VoiceCircle(false, str, m3.h.j(m3.h.a(tVar, 0.3f), 2.0f, 2.0f), true, false, qVar, ((i11 << 3) & 112) | 3078, 16);
                qVar.p(false);
            } else {
                qVar.X(1457195816);
                u3.c M = kd.a.M(R.drawable.circle_0, qVar, 0);
                i3.t j4 = m3.h.j(m3.h.a(tVar, 0.3f), 2.0f, 2.0f);
                long j10 = 200;
                vk.i iVar = new vk.i(null, (j10 << 32) | (j10 & 4294967295L), 89);
                xk.b D = g0.c.D(ComposableSingletons$VoiceBlurBackgroundKt.INSTANCE.m1825getLambda$471316193$ui_release(), qVar);
                if ((i11 & 112) != 32) {
                    z10 = false;
                }
                Object L = qVar.L();
                if (z10 || L == u2.l.f33918a) {
                    L = new w1(str2, 1);
                    qVar.h0(L);
                }
                LandscapistImageKt.LandscapistCoilImage((ho.a) L, j4, D, null, iVar, null, M, null, null, null, qVar, u3.c.$stable << 18, 936);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y1(str, str2, tVar, i10, 1);
        }
    }

    public static final sn.z VoiceBlurBackground$lambda$1(String str, String str2, i3.t tVar, int i10, u2.m mVar, int i11) {
        VoiceBlurBackground(str, str2, tVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final Object VoiceBlurBackground$lambda$0$0(String str) {
        return str;
    }
}
