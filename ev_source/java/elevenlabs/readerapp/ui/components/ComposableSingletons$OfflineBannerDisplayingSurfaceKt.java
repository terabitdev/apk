package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.domain.services.ConnectivityService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$OfflineBannerDisplayingSurfaceKt {
    public static final ComposableSingletons$OfflineBannerDisplayingSurfaceKt INSTANCE = new ComposableSingletons$OfflineBannerDisplayingSurfaceKt();

    /* renamed from: lambda$-1967848045 */
    private static ho.r f61lambda$1967848045 = new c3.j(new l(0), false, -1967848045);
    private static ho.r lambda$1057507097 = new c3.j(new l(1), false, 1057507097);

    /* renamed from: lambda$-1097141089 */
    private static ho.r f58lambda$1097141089 = new c3.j(new l(2), false, -1097141089);
    private static ho.p lambda$1252089016 = new c3.j(new im.d(15), false, 1252089016);

    /* renamed from: lambda$-1718337841 */
    private static ho.r f59lambda$1718337841 = new c3.j(new l(3), false, -1718337841);

    /* renamed from: lambda$-1906648618 */
    private static ho.p f60lambda$1906648618 = new c3.j(new im.d(16), false, -1906648618);

    public static final sn.z lambda_1057507097$lambda$0(r1.s sVar, h5.f fVar, u2.m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 129) != 128) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar2, 1.0f);
            f4.f1 d11 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(d10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar2);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d11, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            j7.d("Hello World", r1.t.f29349a.b(qVar2, i3.d.f13001e), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, qVar, 6, 0, 262140);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_1252089016$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            OfflineBannerDisplayingSurfaceKt.OfflineBannerDisplayingSurface(null, true, new ConnectivityService() { // from class: io.elevenlabs.readerapp.ui.components.ComposableSingletons$OfflineBannerDisplayingSurfaceKt$lambda$1252089016$1$1
                private final ir.j1 isConnected = ir.r.c(Boolean.FALSE);

                @Override // io.elevenlabs.domain.services.ConnectivityService
                /* renamed from: isConnected, reason: from getter */
                public ir.j1 getIsConnected() {
                    return this.isConnected;
                }
            }, f58lambda$1097141089, qVar, 3120, 1);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1097141089$lambda$0(r1.s sVar, h5.f fVar, u2.m mVar, int i10) {
        boolean z6;
        int i11;
        sVar.getClass();
        if ((i10 & 48) == 0) {
            if (((u2.q) mVar).c(fVar.f12083a)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 145) != 144) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            OfflineBannerDisplayingSurfaceKt.m1086ReadingContentPreview8Feqmps(fVar.f12083a, qVar, (i10 >> 3) & 14);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1718337841$lambda$0(r1.s sVar, h5.f fVar, u2.m mVar, int i10) {
        boolean z6;
        int i11;
        sVar.getClass();
        if ((i10 & 48) == 0) {
            if (((u2.q) mVar).c(fVar.f12083a)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 145) != 144) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            OfflineBannerDisplayingSurfaceKt.m1086ReadingContentPreview8Feqmps(fVar.f12083a, qVar, (i10 >> 3) & 14);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1906648618$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            OfflineBannerDisplayingSurfaceKt.OfflineBannerDisplayingSurface(null, true, new ConnectivityService() { // from class: io.elevenlabs.readerapp.ui.components.ComposableSingletons$OfflineBannerDisplayingSurfaceKt$lambda$-1906648618$1$1
                private final ir.j1 isConnected = ir.r.c(Boolean.FALSE);

                @Override // io.elevenlabs.domain.services.ConnectivityService
                /* renamed from: isConnected, reason: from getter */
                public ir.j1 getIsConnected() {
                    return this.isConnected;
                }
            }, f59lambda$1718337841, qVar, 3120, 1);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1967848045$lambda$0(r1.s sVar, h5.f fVar, u2.m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 129) != 128) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar2, 1.0f);
            f4.f1 d11 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(d10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar2);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d11, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            j7.d("Hello World", r1.t.f29349a.b(qVar2, i3.d.f13001e), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, qVar, 6, 0, 262140);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1097141089$app_productionRelease */
    public final ho.r m1033getLambda$1097141089$app_productionRelease() {
        return f58lambda$1097141089;
    }

    /* renamed from: getLambda$-1718337841$app_productionRelease */
    public final ho.r m1034getLambda$1718337841$app_productionRelease() {
        return f59lambda$1718337841;
    }

    /* renamed from: getLambda$-1906648618$app_productionRelease */
    public final ho.p m1035getLambda$1906648618$app_productionRelease() {
        return f60lambda$1906648618;
    }

    /* renamed from: getLambda$-1967848045$app_productionRelease */
    public final ho.r m1036getLambda$1967848045$app_productionRelease() {
        return f61lambda$1967848045;
    }

    public final ho.r getLambda$1057507097$app_productionRelease() {
        return lambda$1057507097;
    }

    public final ho.p getLambda$1252089016$app_productionRelease() {
        return lambda$1252089016;
    }
}
