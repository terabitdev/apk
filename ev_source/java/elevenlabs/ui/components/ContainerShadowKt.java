package io.elevenlabs.ui.components;

import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li3/t;", "modifier", "Lsn/z;", "ContainerShadow", "(Li3/t;Lu2/m;II)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ContainerShadowKt {
    public static final void ContainerShadow(i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-114340902);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (qVar.f(tVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            if (i14 != 0) {
                tVar = i3.q.f13017a;
            }
            r1.p.a(l1.n.h(r1.p2.f(tVar, 1), ElevenLabsTheme.INSTANCE.getColors(qVar, 6).getContainerShadow(), p3.h0.f26395b), qVar, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.t(tVar, i10, i11, 4);
        }
    }

    public static final sn.z ContainerShadow$lambda$0(i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        ContainerShadow(tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
