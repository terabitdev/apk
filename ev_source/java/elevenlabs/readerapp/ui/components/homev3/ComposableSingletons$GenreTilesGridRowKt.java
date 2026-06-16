package io.elevenlabs.readerapp.ui.components.homev3;

import a2.e3;
import c3.j;
import fm.d;
import ho.p;
import ig.f;
import io.elevenlabs.domain.model.GenreTilesGridRow;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$GenreTilesGridRowKt {
    public static final ComposableSingletons$GenreTilesGridRowKt INSTANCE = new ComposableSingletons$GenreTilesGridRowKt();

    /* renamed from: lambda$-860566693 */
    private static p f162lambda$860566693 = new j(new e3(10), false, -860566693);

    public static final z lambda__860566693$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            List I = f.I(new GenreTilesGridRow.Tile("Mystery and Suspense", "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FHome%20Actions%2Fadded-to-library.png?alt=media&token=16738384-4f47-4894-a36f-91afa120cc62", "placeholder", "Mystery and Suspense"), new GenreTilesGridRow.Tile("Action and Adventure", "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FHome%20Actions%2Fcollections.png?alt=media&token=b332c31c-2e96-4aab-8140-64e499e375c0", "placeholder", "Action and Adventure"), new GenreTilesGridRow.Tile("History", "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FHome%20Actions%2Fgenfm.png?alt=media&token=fef2e1b7-677f-4bb7-bddc-e87212559015", "placeholder", "History"), new GenreTilesGridRow.Tile("Fantasy", "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FHome%20Actions%2Fgenfm.png?alt=media&token=fef2e1b7-677f-4bb7-bddc-e87212559015", "placeholder", "Fantasy"), new GenreTilesGridRow.Tile("Romance", "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FHome%20Actions%2Fadded-to-library.png?alt=media&token=16738384-4f47-4894-a36f-91afa120cc62", "placeholder", "Romance"), new GenreTilesGridRow.Tile("Distopia", "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FHome%20Actions%2Fcollections.png?alt=media&token=b332c31c-2e96-4aab-8140-64e499e375c0", "placeholder", "Distopia"));
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new d(2);
                qVar.h0(L);
            }
            GenreTilesGridRowKt.GenreTilesGridRowV3("Import to listen", I, (ho.l) L, null, qVar, 390, 8);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__860566693$lambda$0$0$0(GenreTilesGridRow.Tile tile) {
        tile.getClass();
        return z.f31622a;
    }

    /* renamed from: getLambda$-860566693$app_productionRelease */
    public final p m1170getLambda$860566693$app_productionRelease() {
        return f162lambda$860566693;
    }
}
