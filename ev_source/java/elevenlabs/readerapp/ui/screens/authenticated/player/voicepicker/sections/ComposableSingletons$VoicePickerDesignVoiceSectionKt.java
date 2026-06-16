package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections;

import c3.j;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$VoicePickerDesignVoiceSectionKt {
    public static final ComposableSingletons$VoicePickerDesignVoiceSectionKt INSTANCE = new ComposableSingletons$VoicePickerDesignVoiceSectionKt();

    /* renamed from: lambda$-990004686 */
    private static p f516lambda$990004686 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.a(21), false, -990004686);

    public static final z lambda__990004686$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d(9);
                qVar.h0(L);
            }
            VoicePickerDesignVoiceSectionKt.VoiceDesignRow("Design your voice", "Create a unique AI voice", (ho.a) L, qVar, 438);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-990004686$app_productionRelease */
    public final p m1615getLambda$990004686$app_productionRelease() {
        return f516lambda$990004686;
    }
}
