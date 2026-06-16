package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections;

import c3.j;
import ho.q;
import ho.r;
import io.elevenlabs.readerapp.ui.components.VoiceRowShimmeringKt;
import io.elevenlabs.readerapp.ui.components.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f;
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
public final class ComposableSingletons$VoicePickerSectionsListKt {
    public static final ComposableSingletons$VoicePickerSectionsListKt INSTANCE = new ComposableSingletons$VoicePickerSectionsListKt();

    /* renamed from: lambda$-1428770564 */
    private static q f518lambda$1428770564 = new j(new f(11), false, -1428770564);

    /* renamed from: lambda$-1324513851 */
    private static q f517lambda$1324513851 = new j(new f(12), false, -1324513851);
    private static r lambda$635010091 = new j(new l(8), false, 635010091);

    public static final z lambda_635010091$lambda$0(t1.b bVar, int i10, m mVar, int i11) {
        boolean z6;
        bVar.getClass();
        if ((i11 & 129) != 128) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            VoiceRowShimmeringKt.m1109VoiceRowShimmeringkHDZbjc(u.P, qVar, 0, 1);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1324513851$lambda$0(t1.b bVar, m mVar, int i10) {
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

    public static final z lambda__1428770564$lambda$0(t1.b bVar, m mVar, int i10) {
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

    /* renamed from: getLambda$-1324513851$app_productionRelease */
    public final q m1616getLambda$1324513851$app_productionRelease() {
        return f517lambda$1324513851;
    }

    /* renamed from: getLambda$-1428770564$app_productionRelease */
    public final q m1617getLambda$1428770564$app_productionRelease() {
        return f518lambda$1428770564;
    }

    public final r getLambda$635010091$app_productionRelease() {
        return lambda$635010091;
    }
}
