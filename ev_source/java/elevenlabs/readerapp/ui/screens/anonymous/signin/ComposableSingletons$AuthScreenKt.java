package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import ho.p;
import io.elevenlabs.ui.components.VideoPlayerKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$AuthScreenKt {
    public static final ComposableSingletons$AuthScreenKt INSTANCE = new ComposableSingletons$AuthScreenKt();

    /* renamed from: lambda$-121414390 */
    private static p f166lambda$121414390 = new c3.j(new i(0), false, -121414390);
    private static p lambda$1592067771 = new c3.j(new i(1), false, 1592067771);

    /* renamed from: lambda$-1228332425 */
    private static p f167lambda$1228332425 = new c3.j(new i(2), false, -1228332425);

    public static final z lambda_1592067771$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            SignInState signInState = new SignInState(null, false, false, false, false, SignInMode.INTRO, null, null, null, null, false, false, null, false, false, 32735, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new g(22);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new e(7);
                qVar.h0(L2);
            }
            AuthScreenKt.AuthScreenUI(signInState, lVar, (ho.a) L2, null, null, null, qVar, 432, 56);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1592067771$lambda$0$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda__121414390$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            SignInAccountBannedMessageTextKt.m1184SignInAccountBannedMessageTextFNF3uiM(null, elevenLabsTheme.getTypo(qVar, i11).getBodyLarge500(), defpackage.f.b(elevenLabsTheme, qVar, i11), qVar, 0, 1);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1228332425$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            VideoPlayerKt.VideoPlayerCacheProvider(lambda$1592067771, qVar, 6);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-121414390$app_productionRelease */
    public final p m1174getLambda$121414390$app_productionRelease() {
        return f166lambda$121414390;
    }

    /* renamed from: getLambda$-1228332425$app_productionRelease */
    public final p m1175getLambda$1228332425$app_productionRelease() {
        return f167lambda$1228332425;
    }

    public final p getLambda$1592067771$app_productionRelease() {
        return lambda$1592067771;
    }
}
