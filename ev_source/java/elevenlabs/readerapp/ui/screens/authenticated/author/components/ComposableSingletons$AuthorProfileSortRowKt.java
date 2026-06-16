package io.elevenlabs.readerapp.ui.screens.authenticated.author.components;

import c3.j;
import ho.p;
import io.elevenlabs.readerapp.ui.components.MetaStatKeys;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.a;
import j1.c2;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import sn.z;
import tn.a0;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AuthorProfileSortRowKt {
    public static final ComposableSingletons$AuthorProfileSortRowKt INSTANCE = new ComposableSingletons$AuthorProfileSortRowKt();
    private static p lambda$2132759409 = new j(new a(13), false, 2132759409);
    private static p lambda$2023843360 = new j(new a(14), false, 2023843360);

    public static final z lambda_2023843360$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Map J = a0.J(new k("recent", "Recently Added"), new k("alphabetical", "A-Z"), new k(MetaStatKeys.KEY_RATING, "Rating"));
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new c2(21);
                qVar.h0(L);
            }
            AuthorProfileSortRowKt.AuthorProfileSortRow("alphabetical", J, null, (ho.l) L, null, qVar, 3510, 16);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_2023843360$lambda$0$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda_2132759409$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Map J = a0.J(new k("recent", "Recently Added"), new k("alphabetical", "A-Z"), new k(MetaStatKeys.KEY_RATING, "Rating"));
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new c2(22);
                qVar.h0(L);
            }
            AuthorProfileSortRowKt.AuthorProfileSortRow("recent", J, "23 Books", (ho.l) L, null, qVar, 3510, 16);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_2132759409$lambda$0$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public final p getLambda$2023843360$app_productionRelease() {
        return lambda$2023843360;
    }

    public final p getLambda$2132759409$app_productionRelease() {
        return lambda$2132759409;
    }
}
