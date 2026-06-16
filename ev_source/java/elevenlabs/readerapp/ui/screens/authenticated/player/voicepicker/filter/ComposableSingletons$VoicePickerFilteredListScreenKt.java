package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter;

import c3.j;
import ho.q;
import io.elevenlabs.readerapp.ui.components.VoiceRowShimmeringKt;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.c3;
import r1.u0;
import sn.z;
import t2.u;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$VoicePickerFilteredListScreenKt {
    public static final ComposableSingletons$VoicePickerFilteredListScreenKt INSTANCE = new ComposableSingletons$VoicePickerFilteredListScreenKt();
    private static q lambda$1126711054;
    private static q lambda$1423597303;

    static {
        final int i10 = 0;
        lambda$1423597303 = new j(new q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.b
            @Override // ho.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                z lambda_1423597303$lambda$0;
                z lambda_1126711054$lambda$0;
                int i11 = i10;
                t1.b bVar = (t1.b) obj;
                m mVar = (m) obj2;
                int intValue = ((Integer) obj3).intValue();
                switch (i11) {
                    case 0:
                        lambda_1423597303$lambda$0 = ComposableSingletons$VoicePickerFilteredListScreenKt.lambda_1423597303$lambda$0(bVar, mVar, intValue);
                        return lambda_1423597303$lambda$0;
                    default:
                        lambda_1126711054$lambda$0 = ComposableSingletons$VoicePickerFilteredListScreenKt.lambda_1126711054$lambda$0(bVar, mVar, intValue);
                        return lambda_1126711054$lambda$0;
                }
            }
        }, false, 1423597303);
        final int i11 = 1;
        lambda$1126711054 = new j(new q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.b
            @Override // ho.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                z lambda_1423597303$lambda$0;
                z lambda_1126711054$lambda$0;
                int i112 = i11;
                t1.b bVar = (t1.b) obj;
                m mVar = (m) obj2;
                int intValue = ((Integer) obj3).intValue();
                switch (i112) {
                    case 0:
                        lambda_1423597303$lambda$0 = ComposableSingletons$VoicePickerFilteredListScreenKt.lambda_1423597303$lambda$0(bVar, mVar, intValue);
                        return lambda_1423597303$lambda$0;
                    default:
                        lambda_1126711054$lambda$0 = ComposableSingletons$VoicePickerFilteredListScreenKt.lambda_1126711054$lambda$0(bVar, mVar, intValue);
                        return lambda_1126711054$lambda$0;
                }
            }
        }, false, 1126711054);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z lambda_1126711054$lambda$0(t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            WeakHashMap weakHashMap = c3.f29142x;
            r1.d.g(r1.d.N(u0.e(qVar).f29154l), qVar);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z lambda_1423597303$lambda$0(t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            VoiceRowShimmeringKt.m1109VoiceRowShimmeringkHDZbjc(u.P, qVar, 0, 1);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final q getLambda$1126711054$app_productionRelease() {
        return lambda$1126711054;
    }

    public final q getLambda$1423597303$app_productionRelease() {
        return lambda$1423597303;
    }
}
