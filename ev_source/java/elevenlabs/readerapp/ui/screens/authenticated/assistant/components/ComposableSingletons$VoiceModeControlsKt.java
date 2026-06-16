package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import c3.j;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f;
import io.elevenlabs.ui.R;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.y2;
import r1.p2;
import sn.z;
import u2.e;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$VoiceModeControlsKt {
    public static final ComposableSingletons$VoiceModeControlsKt INSTANCE = new ComposableSingletons$VoiceModeControlsKt();

    /* renamed from: lambda$-1489639319 */
    private static p f259lambda$1489639319 = new j(new c(20), false, -1489639319);

    /* renamed from: lambda$-422258151 */
    private static p f260lambda$422258151 = new j(new c(21), false, -422258151);

    /* renamed from: lambda$-599486190 */
    private static p f261lambda$599486190 = new j(new c(22), false, -599486190);

    public static final z lambda__1489639319$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            y2.a(kd.a.M(R.drawable.keyboard_up_filled, qVar, 0), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.assistant_switch_to_text_button_accessibility_label), p2.o(i3.q.f13017a, 20), 0L, qVar, u3.c.$stable | 384, 8);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__422258151$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new f(20);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(21);
                qVar.h0(L2);
            }
            VoiceModeControlsKt.VoiceModeControls(false, false, aVar, (ho.a) L2, null, qVar, 3510, 16);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__599486190$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new f(22);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(23);
                qVar.h0(L2);
            }
            VoiceModeControlsKt.VoiceModeControls(false, true, aVar, (ho.a) L2, null, qVar, 3510, 16);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1489639319$app_productionRelease */
    public final p m1295getLambda$1489639319$app_productionRelease() {
        return f259lambda$1489639319;
    }

    /* renamed from: getLambda$-422258151$app_productionRelease */
    public final p m1296getLambda$422258151$app_productionRelease() {
        return f260lambda$422258151;
    }

    /* renamed from: getLambda$-599486190$app_productionRelease */
    public final p m1297getLambda$599486190$app_productionRelease() {
        return f261lambda$599486190;
    }
}
