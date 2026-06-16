package io.elevenlabs.readerapp.ui.components.homev3;

import a2.e3;
import c3.j;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PreviewReadFromFollowingRowV3DefaultGroupPreviewReadFromFollowingRowV3Kt {
    public static final ComposableSingletons$PreviewReadFromFollowingRowV3DefaultGroupPreviewReadFromFollowingRowV3Kt INSTANCE = new ComposableSingletons$PreviewReadFromFollowingRowV3DefaultGroupPreviewReadFromFollowingRowV3Kt();

    /* renamed from: lambda$-552237593 */
    private static p f165lambda$552237593 = new j(new e3(16), false, -552237593);

    public static /* synthetic */ z a(m mVar, int i10) {
        return lambda__552237593$lambda$0(mVar, i10);
    }

    public static final z lambda__552237593$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadFromFollowingRowKt.Preview_ReadFromFollowingRowV3(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-552237593$app_productionRelease */
    public final p m1173getLambda$552237593$app_productionRelease() {
        return f165lambda$552237593;
    }
}
