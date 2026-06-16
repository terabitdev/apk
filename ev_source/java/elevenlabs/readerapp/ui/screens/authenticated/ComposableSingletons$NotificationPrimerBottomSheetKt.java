package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.NotificationPrimerModel;
import io.elevenlabs.domain.model.NotificationPrimerSource;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$NotificationPrimerBottomSheetKt {
    public static final ComposableSingletons$NotificationPrimerBottomSheetKt INSTANCE = new ComposableSingletons$NotificationPrimerBottomSheetKt();

    /* renamed from: lambda$-1174244057 */
    private static ho.p f183lambda$1174244057 = new c3.j(new b(8), false, -1174244057);
    private static ho.p lambda$1094072099 = new c3.j(new b(9), false, 1094072099);

    public static final sn.z lambda_1094072099$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            NotificationPrimerModel notificationPrimerModel = new NotificationPrimerModel("New from your favourite authors", "Void of Space by Jonathan Doe just released. Start listening now!", "Stay updated", "Turn on notifications to get the latest updates.");
            NotificationPrimerSource notificationPrimerSource = NotificationPrimerSource.IMPORT;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(15);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new d(16);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new d(17);
                qVar.h0(L3);
            }
            ho.a aVar3 = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new w(8);
                qVar.h0(L4);
            }
            NotificationPrimerBottomSheetKt.NotificationPrimerBottomSheetUI(notificationPrimerModel, notificationPrimerSource, aVar, aVar2, aVar3, (ho.l) L4, qVar, 224688);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_1094072099$lambda$0$3$0(Analytics.Event event) {
        event.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1174244057$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            NotificationPrimerModel notificationPrimerModel = new NotificationPrimerModel("New from your favourite authors", "Void of Space by Jonathan Doe just released. Start listening now!", "Stay updated", "Turn on notifications to get the latest updates.");
            NotificationPrimerSource notificationPrimerSource = NotificationPrimerSource.IMPORT;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(18);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new d(19);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new d(20);
                qVar.h0(L3);
            }
            ho.a aVar3 = (ho.a) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new w(9);
                qVar.h0(L4);
            }
            NotificationPrimerBottomSheetKt.NotificationPrimerBottomSheetUI(notificationPrimerModel, notificationPrimerSource, aVar, aVar2, aVar3, (ho.l) L4, qVar, 224688);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1174244057$lambda$0$3$0(Analytics.Event event) {
        event.getClass();
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1174244057$app_productionRelease */
    public final ho.p m1192getLambda$1174244057$app_productionRelease() {
        return f183lambda$1174244057;
    }

    public final ho.p getLambda$1094072099$app_productionRelease() {
        return lambda$1094072099;
    }
}
