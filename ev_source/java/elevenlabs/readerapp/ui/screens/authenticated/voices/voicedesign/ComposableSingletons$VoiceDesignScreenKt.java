package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$VoiceDesignScreenKt {
    public static final ComposableSingletons$VoiceDesignScreenKt INSTANCE = new ComposableSingletons$VoiceDesignScreenKt();
    private static p lambda$587728184 = new c3.j(new a(4), false, 587728184);
    private static p lambda$8603334 = new c3.j(new a(5), false, 8603334);

    public static final z lambda_587728184$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            VoiceDesignContract.State state = new VoiceDesignContract.State(null, null, false, null, null, 0, null, false, null, false, false, null, null, false, 16383, null);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new i(2);
                qVar.h0(L);
            }
            VoiceDesignScreenKt.VoiceDesignScreenUI(state, (ho.l) L, true, qVar, 432, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_587728184$lambda$0$0$0(VoiceDesignContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z lambda_8603334$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            VoiceDesignContract.State state = new VoiceDesignContract.State(VoiceDesignContract.Step.GENERATING, null, true, null, null, 0, null, false, null, false, false, null, null, false, 16378, null);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new i(1);
                qVar.h0(L);
            }
            VoiceDesignScreenKt.VoiceDesignScreenUI(state, (ho.l) L, true, qVar, 432, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_8603334$lambda$0$0$0(VoiceDesignContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public final p getLambda$587728184$app_productionRelease() {
        return lambda$587728184;
    }

    public final p getLambda$8603334$app_productionRelease() {
        return lambda$8603334;
    }
}
