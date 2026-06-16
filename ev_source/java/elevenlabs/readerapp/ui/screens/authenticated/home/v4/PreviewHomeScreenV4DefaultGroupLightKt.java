package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "Lhd/b;", "PreviewHomeScreenV4DefaultGroupLight", "Ljava/util/List;", "getPreviewHomeScreenV4DefaultGroupLight", "()Ljava/util/List;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PreviewHomeScreenV4DefaultGroupLightKt {
    private static final List<hd.b> PreviewHomeScreenV4DefaultGroupLight = vq.k.u0(new eo.i(vq.k.j0(new HomeScreenV4PreviewProvider().getValues().iterator()), new b(3), 3));

    public static final hd.b PreviewHomeScreenV4DefaultGroupLight$lambda$0(int i10, HomeStateV4 homeStateV4) {
        homeStateV4.getClass();
        return new hd.b("io.elevenlabs.readerapp.ui.screens.authenticated.home.v4_Preview_HomeScreenV4_null_DefaultGroup_Light_0_null_" + i10, "Default Group", "Light", new c3.j(new w(1, homeStateV4), true, 1138490055), null, 1952);
    }

    public static final z PreviewHomeScreenV4DefaultGroupLight$lambda$0$0(HomeStateV4 homeStateV4, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomeScreenV4Kt.Preview_HomeScreenV4(homeStateV4, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final List<hd.b> getPreviewHomeScreenV4DefaultGroupLight() {
        return PreviewHomeScreenV4DefaultGroupLight;
    }
}
