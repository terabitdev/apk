package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import io.elevenlabs.domain.model.Filter;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.extensions.CountryFlagExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.c3;
import r1.u0;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$VoiceFiltersDialogKt {
    public static final ComposableSingletons$VoiceFiltersDialogKt INSTANCE = new ComposableSingletons$VoiceFiltersDialogKt();

    /* renamed from: lambda$-1473319083 */
    private static ho.p f620lambda$1473319083 = new c3.j(new a(11), false, -1473319083);
    private static ho.q lambda$1340528260;
    private static ho.q lambda$37332271;

    static {
        final int i10 = 0;
        lambda$1340528260 = new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.b
            @Override // ho.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                z lambda_1340528260$lambda$0;
                z lambda_37332271$lambda$0;
                switch (i10) {
                    case 0:
                        lambda_1340528260$lambda$0 = ComposableSingletons$VoiceFiltersDialogKt.lambda_1340528260$lambda$0((Filter) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                        return lambda_1340528260$lambda$0;
                    default:
                        lambda_37332271$lambda$0 = ComposableSingletons$VoiceFiltersDialogKt.lambda_37332271$lambda$0((t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                        return lambda_37332271$lambda$0;
                }
            }
        }, false, 1340528260);
        final int i11 = 1;
        lambda$37332271 = new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.b
            @Override // ho.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                z lambda_1340528260$lambda$0;
                z lambda_37332271$lambda$0;
                switch (i11) {
                    case 0:
                        lambda_1340528260$lambda$0 = ComposableSingletons$VoiceFiltersDialogKt.lambda_1340528260$lambda$0((Filter) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                        return lambda_1340528260$lambda$0;
                    default:
                        lambda_37332271$lambda$0 = ComposableSingletons$VoiceFiltersDialogKt.lambda_37332271$lambda$0((t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                        return lambda_37332271$lambda$0;
                }
            }
        }, false, 37332271);
    }

    public static final z lambda_1340528260$lambda$0(Filter filter, u2.m mVar, int i10) {
        filter.getClass();
        j7.d(CountryFlagExtensionsKt.getFlagEmoji(filter.getKey()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ElevenLabsTheme.INSTANCE.getTypo(mVar, ElevenLabsTheme.$stable).getPill700(), mVar, 0, 0, 131070);
        return z.f31622a;
    }

    public static final z lambda_37332271$lambda$0(t1.b bVar, u2.m mVar, int i10) {
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

    public static final z lambda__1473319083$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            y2.a(kd.a.M(R.drawable.magnifying_glass, qVar, 0), null, null, defpackage.f.b(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), qVar, u3.c.$stable | 48, 4);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1473319083$app_productionRelease */
    public final ho.p m1749getLambda$1473319083$app_productionRelease() {
        return f620lambda$1473319083;
    }

    public final ho.q getLambda$1340528260$app_productionRelease() {
        return lambda$1340528260;
    }

    public final ho.q getLambda$37332271$app_productionRelease() {
        return lambda$37332271;
    }
}
