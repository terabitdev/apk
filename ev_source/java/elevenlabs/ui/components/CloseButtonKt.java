package io.elevenlabs.ui.components;

import io.elevenlabs.ui.R;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onPress", "CloseButton", "(Lho/a;Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CloseButtonKt {
    public static final void CloseButton(ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        ho.a aVar2;
        int i12;
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1522080241);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            aVar2 = aVar;
            ButtonIconKt.ButtonIcon(R.drawable.close, kj.c.R(qVar, R.string.accessibility_bottom_sheet_dialog_close), aVar2, null, ButtonIconVariant.Secondary, ButtonIconSize.Medium, false, false, false, qVar, ((i11 << 6) & 896) | 221184, 456);
        } else {
            aVar2 = aVar;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new hm.b(aVar2, i10, 14);
        }
    }

    public static final sn.z CloseButton$lambda$0(ho.a aVar, int i10, u2.m mVar, int i11) {
        CloseButton(aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
