package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import c3.j;
import ho.p;
import ho.r;
import io.elevenlabs.readerapp.ui.components.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.y;
import sn.z;
import u2.e;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$MicPermissionPromptKt {
    public static final ComposableSingletons$MicPermissionPromptKt INSTANCE = new ComposableSingletons$MicPermissionPromptKt();
    private static r lambda$633195635 = new j(new l(5), false, 633195635);
    private static p lambda$2092385574 = new j(new c(4), false, 2092385574);
    private static r lambda$458043822 = new j(new l(6), false, 458043822);
    private static p lambda$2085099553 = new j(new c(5), false, 2085099553);

    public static final z lambda_2085099553$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new f(19);
                qVar.h0(L);
            }
            BottomSheetScaffoldKt.EchoBottomSheetScaffold(false, (ho.a) L, null, false, null, null, lambda$458043822, qVar, 1572912, 61);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_2092385574$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new f(18);
                qVar.h0(L);
            }
            BottomSheetScaffoldKt.EchoBottomSheetScaffold(false, (ho.a) L, null, false, null, null, lambda$633195635, qVar, 1572912, 61);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_458043822$lambda$0(y yVar, BottomSheetControl bottomSheetControl, m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        q qVar = (q) mVar;
        Object L = qVar.L();
        e eVar = u2.l.f33918a;
        if (L == eVar) {
            L = new f(16);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        Object L2 = qVar.L();
        if (L2 == eVar) {
            L2 = new f(17);
            qVar.h0(L2);
        }
        MicPermissionPromptKt.MicPermissionPrompt(aVar, null, true, (ho.a) L2, qVar, 3462, 2);
        return z.f31622a;
    }

    public static final z lambda_633195635$lambda$0(y yVar, BottomSheetControl bottomSheetControl, m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        q qVar = (q) mVar;
        Object L = qVar.L();
        if (L == u2.l.f33918a) {
            L = new f(15);
            qVar.h0(L);
        }
        MicPermissionPromptKt.MicPermissionPrompt((ho.a) L, null, false, null, qVar, 6, 14);
        return z.f31622a;
    }

    public final p getLambda$2085099553$app_productionRelease() {
        return lambda$2085099553;
    }

    public final p getLambda$2092385574$app_productionRelease() {
        return lambda$2092385574;
    }

    public final r getLambda$458043822$app_productionRelease() {
        return lambda$458043822;
    }

    public final r getLambda$633195635$app_productionRelease() {
        return lambda$633195635;
    }
}
