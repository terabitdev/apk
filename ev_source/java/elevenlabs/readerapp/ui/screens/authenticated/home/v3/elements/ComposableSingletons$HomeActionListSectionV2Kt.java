package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements;

import c3.j;
import ho.p;
import io.elevenlabs.domain.model.home.HomePageV3;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.k;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$HomeActionListSectionV2Kt {
    public static final ComposableSingletons$HomeActionListSectionV2Kt INSTANCE = new ComposableSingletons$HomeActionListSectionV2Kt();

    /* renamed from: lambda$-1901291286 */
    private static p f363lambda$1901291286 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.d(19), false, -1901291286);
    private static p lambda$948938852 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.d(20), false, 948938852);

    public static final z lambda_948938852$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomePageV3.Section.HomeActionList homeActionList = new HomePageV3.Section.HomeActionList("Import to listen", ig.f.H(new HomePageV3.Section.HomeActionList.HomeActionItem("Write text", "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FHome%20Actions%2Fadded-to-library.png?alt=media&token=16738384-4f47-4894-a36f-91afa120cc62", "placeholder", "123")));
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new a(0);
                qVar.h0(L);
            }
            HomeActionListSectionV2Kt.HomeActionListSectionV3(homeActionList, (ho.l) L, null, qVar, 48, 4);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_948938852$lambda$0$0$0(HomePageV3.Section.HomeActionList.HomeActionItem homeActionItem) {
        homeActionItem.getClass();
        return z.f31622a;
    }

    public static final z lambda__1901291286$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomePageV3.Section.HomeActionList homeActionList = new HomePageV3.Section.HomeActionList("Import to listen", ig.f.I(new HomePageV3.Section.HomeActionList.HomeActionItem("Write text", "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FHome%20Actions%2Fadded-to-library.png?alt=media&token=16738384-4f47-4894-a36f-91afa120cc62", "placeholder", "123"), new HomePageV3.Section.HomeActionList.HomeActionItem("Upload a file", "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FHome%20Actions%2Fcollections.png?alt=media&token=b332c31c-2e96-4aab-8140-64e499e375c0", "placeholder", "123"), new HomePageV3.Section.HomeActionList.HomeActionItem("Scan text", "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FHome%20Actions%2Fgenfm.png?alt=media&token=fef2e1b7-677f-4bb7-bddc-e87212559015", "placeholder", "123"), new HomePageV3.Section.HomeActionList.HomeActionItem("Paste a link", "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FHome%20Actions%2Fgenfm.png?alt=media&token=fef2e1b7-677f-4bb7-bddc-e87212559015", "placeholder", "123")));
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new k(29);
                qVar.h0(L);
            }
            HomeActionListSectionV2Kt.HomeActionListSectionV3(homeActionList, (ho.l) L, null, qVar, 48, 4);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1901291286$lambda$0$0$0(HomePageV3.Section.HomeActionList.HomeActionItem homeActionItem) {
        homeActionItem.getClass();
        return z.f31622a;
    }

    /* renamed from: getLambda$-1901291286$app_productionRelease */
    public final p m1414getLambda$1901291286$app_productionRelease() {
        return f363lambda$1901291286;
    }

    public final p getLambda$948938852$app_productionRelease() {
        return lambda$948938852;
    }
}
