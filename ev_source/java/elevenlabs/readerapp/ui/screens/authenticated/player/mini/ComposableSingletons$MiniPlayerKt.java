package io.elevenlabs.readerapp.ui.screens.authenticated.player.mini;

import c3.j;
import ho.p;
import io.elevenlabs.domain.model.ReadSource;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerContract;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$MiniPlayerKt {
    public static final ComposableSingletons$MiniPlayerKt INSTANCE = new ComposableSingletons$MiniPlayerKt();

    /* renamed from: lambda$-2119824392 */
    private static p f449lambda$2119824392 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.a(20), false, -2119824392);

    /* renamed from: lambda$-969643646 */
    private static p f450lambda$969643646 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.a(21), false, -969643646);
    private static p lambda$798944541 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.a(22), false, 798944541);
    private static p lambda$1502238598 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.a(23), false, 1502238598);

    public static final z lambda_1502238598$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            MiniPlayerContract.UiState.Shown shown = new MiniPlayerContract.UiState.Shown("Foo Bar", "Baz Qux", null, ReadSource.Book, "text/plain", MiniPlayerContract.PlayButtonState.Loading.INSTANCE);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(14);
                qVar.h0(L);
            }
            MiniPlayerKt.m1522MiniPlayerUIi2NWbI(shown, (ho.l) L, 16, false, 0L, qVar, 432, 24);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1502238598$lambda$0$0$0(MiniPlayerContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z lambda_798944541$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            MiniPlayerContract.UiState.Shown shown = new MiniPlayerContract.UiState.Shown("Foo BarFoo BarFoo BarFoo Bar", "Baz QuxBaz QuxBaz QuxBaz Qux", null, ReadSource.Book, "text/plain", new MiniPlayerContract.PlayButtonState.Active(false));
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(17);
                qVar.h0(L);
            }
            MiniPlayerKt.m1522MiniPlayerUIi2NWbI(shown, (ho.l) L, 16, false, 0L, qVar, 432, 24);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_798944541$lambda$0$0$0(MiniPlayerContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z lambda__2119824392$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            MiniPlayerContract.UiState.Shown shown = new MiniPlayerContract.UiState.Shown("Foo Bar", "Baz Qux", null, ReadSource.Book, "text/plain", new MiniPlayerContract.PlayButtonState.Active(true));
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(15);
                qVar.h0(L);
            }
            MiniPlayerKt.m1522MiniPlayerUIi2NWbI(shown, (ho.l) L, 16, false, 0L, qVar, 432, 24);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__2119824392$lambda$0$0$0(MiniPlayerContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z lambda__969643646$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            MiniPlayerContract.UiState.Shown shown = new MiniPlayerContract.UiState.Shown("Foo Bar", "Baz Qux", null, ReadSource.Book, "text/plain", new MiniPlayerContract.PlayButtonState.Active(false));
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(16);
                qVar.h0(L);
            }
            MiniPlayerKt.m1522MiniPlayerUIi2NWbI(shown, (ho.l) L, 16, false, 0L, qVar, 432, 24);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__969643646$lambda$0$0$0(MiniPlayerContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    /* renamed from: getLambda$-2119824392$app_productionRelease */
    public final p m1516getLambda$2119824392$app_productionRelease() {
        return f449lambda$2119824392;
    }

    /* renamed from: getLambda$-969643646$app_productionRelease */
    public final p m1517getLambda$969643646$app_productionRelease() {
        return f450lambda$969643646;
    }

    public final p getLambda$1502238598$app_productionRelease() {
        return lambda$1502238598;
    }

    public final p getLambda$798944541$app_productionRelease() {
        return lambda$798944541;
    }
}
