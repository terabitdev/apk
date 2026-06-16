package io.elevenlabs.ui.components;

import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "imageUrl", "Li3/t;", "modifier", "", "blurRadius", "Lsn/z;", "BlurBackground", "(Ljava/lang/String;Li3/t;FLu2/m;II)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BlurBackgroundKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BlurBackground(String str, i3.t tVar, float f10, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        float f11;
        int i14;
        boolean z6;
        i3.t tVar2;
        float f12;
        u2.r1 r10;
        i3.t tVar3;
        float f13;
        int i15;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(223802511);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (qVar.f(tVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            f11 = f10;
            if (qVar.c(f11)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i16 != 0) {
                    tVar3 = i3.q.f13017a;
                } else {
                    tVar3 = tVar;
                }
                if (i17 != 0) {
                    f13 = 100.0f;
                } else {
                    f13 = f11;
                }
                if (str != null) {
                    qVar.X(1511503574);
                    CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0(str, m3.h.b(tVar3, f13, p3.h0.f26395b), null, f4.q.f8839b, null, null, null, qVar, (i12 & 14) | 3072, 116);
                    qVar.p(false);
                } else {
                    qVar.X(1511685203);
                    qVar.p(false);
                }
                p3.s sVar = p3.t.Companion;
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                r1.p.a(l1.n.g(tVar3, p3.s.b(sVar, ig.f.I(new p3.x(p3.x.b(0.5f, elevenLabsTheme.getColor(qVar, 6).getBackground().m2003getPrimary0d7_KjU())), new p3.x(ib.i.d(elevenLabsTheme, qVar, 6))), t2.u.P, Float.POSITIVE_INFINITY, 8), null, 6), qVar, 0);
                tVar2 = tVar3;
                f12 = f13;
            } else {
                qVar.R();
                tVar2 = tVar;
                f12 = f11;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.b(str, tVar2, f12, i10, i11);
                return;
            }
            return;
        }
        f11 = f10;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z BlurBackground$lambda$0(String str, i3.t tVar, float f10, int i10, int i11, u2.m mVar, int i12) {
        BlurBackground(str, tVar, f10, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
