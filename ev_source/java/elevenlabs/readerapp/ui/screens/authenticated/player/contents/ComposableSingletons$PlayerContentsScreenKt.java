package io.elevenlabs.readerapp.ui.screens.authenticated.player.contents;

import ho.p;
import ho.q;
import io.elevenlabs.ui.echo.EchoTheme;
import ir.r;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.c3;
import r1.p2;
import r1.u0;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PlayerContentsScreenKt {
    private static q lambda$1204210953;
    private static q lambda$797514825;
    public static final ComposableSingletons$PlayerContentsScreenKt INSTANCE = new ComposableSingletons$PlayerContentsScreenKt();
    private static p lambda$857536661 = new c3.j(new e(3), false, 857536661);

    static {
        final int i10 = 0;
        lambda$797514825 = new c3.j(new q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.f
            @Override // ho.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                z lambda_797514825$lambda$0;
                z lambda_1204210953$lambda$0;
                int i11 = i10;
                t1.b bVar = (t1.b) obj;
                m mVar = (m) obj2;
                int intValue = ((Integer) obj3).intValue();
                switch (i11) {
                    case 0:
                        lambda_797514825$lambda$0 = ComposableSingletons$PlayerContentsScreenKt.lambda_797514825$lambda$0(bVar, mVar, intValue);
                        return lambda_797514825$lambda$0;
                    default:
                        lambda_1204210953$lambda$0 = ComposableSingletons$PlayerContentsScreenKt.lambda_1204210953$lambda$0(bVar, mVar, intValue);
                        return lambda_1204210953$lambda$0;
                }
            }
        }, false, 797514825);
        final int i11 = 1;
        lambda$1204210953 = new c3.j(new q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.f
            @Override // ho.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                z lambda_797514825$lambda$0;
                z lambda_1204210953$lambda$0;
                int i112 = i11;
                t1.b bVar = (t1.b) obj;
                m mVar = (m) obj2;
                int intValue = ((Integer) obj3).intValue();
                switch (i112) {
                    case 0:
                        lambda_797514825$lambda$0 = ComposableSingletons$PlayerContentsScreenKt.lambda_797514825$lambda$0(bVar, mVar, intValue);
                        return lambda_797514825$lambda$0;
                    default:
                        lambda_1204210953$lambda$0 = ComposableSingletons$PlayerContentsScreenKt.lambda_1204210953$lambda$0(bVar, mVar, intValue);
                        return lambda_1204210953$lambda$0;
                }
            }
        }, false, 1204210953);
    }

    public static final z lambda_1204210953$lambda$0(t1.b bVar, m mVar, int i10) {
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
            r1.d.g(r1.d.N(u0.e(qVar).f29155m), qVar);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_797514825$lambda$0(t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.d.g(p2.f(i3.q.f13017a, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX2()), qVar);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_857536661$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new l(8);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(11);
                qVar.h0(L2);
            }
            PlayerContentsScreenKt.PlayerContentsScreenUI(null, lVar, (ho.a) L2, r.c(0), qVar, 438);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_857536661$lambda$0$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public final q getLambda$1204210953$app_productionRelease() {
        return lambda$1204210953;
    }

    public final q getLambda$797514825$app_productionRelease() {
        return lambda$797514825;
    }

    public final p getLambda$857536661$app_productionRelease() {
        return lambda$857536661;
    }
}
