package io.elevenlabs.ui.extensions;

import i4.j1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/elevenlabs/ui/extensions/SafeHapticFeedback;", "safeHapticFeedback", "(Lu2/m;I)Lio/elevenlabs/ui/extensions/SafeHapticFeedback;", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SafeHapticFeedbackKt {
    public static final SafeHapticFeedback safeHapticFeedback(m mVar, int i10) {
        q qVar = (q) mVar;
        final x3.a aVar = (x3.a) qVar.j(j1.f13133l);
        boolean f10 = qVar.f(aVar);
        Object L = qVar.L();
        if (f10 || L == l.f33918a) {
            L = new SafeHapticFeedback() { // from class: io.elevenlabs.ui.extensions.SafeHapticFeedbackKt$safeHapticFeedback$1$1
                @Override // io.elevenlabs.ui.extensions.SafeHapticFeedback
                /* renamed from: performHapticFeedback-CdsT49E */
                public void mo1982performHapticFeedbackCdsT49E(int type) {
                    try {
                        x3.a.this.mo944performHapticFeedbackCdsT49E(type);
                    } catch (Throwable unused) {
                    }
                }
            };
            qVar.h0(L);
        }
        return (SafeHapticFeedbackKt$safeHapticFeedback$1$1) L;
    }
}
