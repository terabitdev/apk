package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ChipGroupKt {
    public static final ComposableSingletons$ChipGroupKt INSTANCE = new ComposableSingletons$ChipGroupKt();

    /* renamed from: lambda$-1403954128 */
    private static ho.q f642lambda$1403954128 = new c3.j(new c0(8), false, -1403954128);

    public static final sn.z lambda__1403954128$lambda$0(r1.v0 v0Var, u2.m mVar, int i10) {
        boolean z6;
        v0Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ChipKt.Chip("Narrative & Story", null, false, null, null, null, null, null, null, qVar, 390, 506);
            ChipKt.Chip("Conversational", null, true, null, null, null, null, null, null, qVar, 390, 506);
            ChipKt.Chip("Characters & Animation", null, true, null, null, null, null, null, null, qVar, 390, 506);
            ChipKt.Chip("Informative & Educational", null, true, null, null, null, null, null, null, qVar, 390, 506);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1403954128$ui_release */
    public final ho.q m1798getLambda$1403954128$ui_release() {
        return f642lambda$1403954128;
    }
}
