package io.elevenlabs.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "imageUrl", "Li3/t;", "modifier", "Lp3/x;", "color", "Lsn/z;", "RemoteIcon-FNF3uiM", "(Ljava/lang/String;Li3/t;JLu2/m;II)V", "RemoteIcon", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RemoteIconKt {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if ((r21 & 4) != 0) goto L91;
     */
    /* renamed from: RemoteIcon-FNF3uiM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1870RemoteIconFNF3uiM(String str, i3.t tVar, long j4, u2.m mVar, int i10, int i11) {
        int i12;
        long j10;
        boolean z6;
        int i13;
        int i14;
        int i15;
        str.getClass();
        tVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(806044758);
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
        if ((i10 & 48) == 0) {
            if (qVar.f(tVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i10 & 384) == 0) {
            j10 = j4;
            if ((i11 & 4) == 0 && qVar.e(j10)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        } else {
            j10 = j4;
        }
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 4) != 0) {
                    j10 = defpackage.f.b(ElevenLabsTheme.INSTANCE, qVar, 6);
                    i12 &= -897;
                }
                qVar.q();
                ad.h hVar = new ad.h((Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b));
                hVar.f1788c = str;
                hVar.b();
                qc.m.b(hVar.a(), null, tVar, null, f4.q.f8839b, new p3.n(j10, 5), qVar, ((i12 << 3) & 896) | 1572912, 3768);
            }
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.n(str, tVar, j10, i10, i11, 3);
        }
    }

    public static final sn.z RemoteIcon_FNF3uiM$lambda$0(String str, i3.t tVar, long j4, int i10, int i11, u2.m mVar, int i12) {
        m1870RemoteIconFNF3uiM(str, tVar, j4, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
