package io.elevenlabs.readerapp.ui.screens.authenticated.home;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ho.a;
import ho.l;
import ho.p;
import i1.j2;
import i1.o;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.HomeScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeScreenV3Kt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeScreenV4Kt;
import io.livekit.android.rpc.RpcError;
import ir.z1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u00ad\u0001\u0010\u0014\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017²\u0006\f\u0010\u0016\u001a\u00020\u00018\nX\u008a\u0084\u0002"}, d2 = {"Lir/z1;", "", "isHomeV4Enabled", "Lkotlin/Function0;", "Lsn/z;", "onNavigateToSettings", "bottomBar", "Lkotlin/Function2;", "", "Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "onNavigateToRead", "onNavigateToPlayer", "Lkotlin/Function1;", "onNavigateToDeeplink", "onNavigateToSearch", "onNavigateToVoiceDesign", "Li1/j2;", "sharedTransitionScope", "Li1/o;", "animatedContentScope", "HomeScreen", "(Lir/z1;Lho/a;Lho/p;Lho/p;Lho/p;Lho/l;Lho/a;Lho/a;Li1/j2;Li1/o;Lu2/m;I)V", "isHomeV4", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeScreenKt {
    public static final void HomeScreen(final z1 z1Var, final a aVar, final p pVar, final p pVar2, final p pVar3, final l lVar, final a aVar2, final a aVar3, final j2 j2Var, final o oVar, m mVar, final int i10) {
        int i11;
        boolean z6;
        q qVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        z1Var.getClass();
        aVar.getClass();
        pVar.getClass();
        pVar2.getClass();
        pVar3.getClass();
        lVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        j2Var.getClass();
        oVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-1668488643);
        if ((i10 & 6) == 0) {
            if (qVar2.h(z1Var)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i11 = i21 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i11 |= i20;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(pVar)) {
                i19 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i19 = 128;
            }
            i11 |= i19;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(pVar2)) {
                i18 = 2048;
            } else {
                i18 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i18;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(pVar3)) {
                i17 = 16384;
            } else {
                i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i17;
        }
        if ((196608 & i10) == 0) {
            if (qVar2.h(lVar)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i11 |= i16;
        }
        if ((1572864 & i10) == 0) {
            if (qVar2.h(aVar2)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i11 |= i15;
        }
        if ((12582912 & i10) == 0) {
            if (qVar2.h(aVar3)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i11 |= i14;
        }
        if ((100663296 & i10) == 0) {
            if (qVar2.f(j2Var)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i11 |= i13;
        }
        if ((805306368 & i10) == 0) {
            if (qVar2.h(oVar)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i11 |= i12;
        }
        if ((306783379 & i11) != 306783378) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            if (HomeScreen$lambda$0(c1.m(z1Var, qVar2, i11 & 14))) {
                qVar2.X(-287991632);
                int i22 = i11 >> 3;
                HomeScreenV4Kt.HomeScreenV4(aVar, null, pVar, pVar2, pVar3, lVar, aVar3, j2Var, oVar, qVar2, (i11 & 458752) | (i22 & 14) | (i11 & 896) | (i11 & 7168) | (i11 & 57344) | (i22 & 3670016) | (i22 & 29360128) | (i22 & 234881024), 2);
                qVar = qVar2;
                qVar.p(false);
            } else {
                qVar = qVar2;
                qVar.X(-287518789);
                HomeScreenV3Kt.HomeScreenV3(aVar, null, pVar, pVar2, pVar3, lVar, aVar2, aVar3, j2Var, oVar, qVar, ((i11 >> 3) & 14) | (i11 & 896) | (i11 & 7168) | (i11 & 57344) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), 2);
                qVar.p(false);
            }
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new p() { // from class: km.a
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z HomeScreen$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    HomeScreen$lambda$1 = HomeScreenKt.HomeScreen$lambda$1(z1.this, aVar, pVar, pVar2, pVar3, lVar, aVar2, aVar3, j2Var, oVar, i10, (m) obj, intValue);
                    return HomeScreen$lambda$1;
                }
            };
        }
    }

    private static final boolean HomeScreen$lambda$0(s2 s2Var) {
        return ((Boolean) s2Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z HomeScreen$lambda$1(z1 z1Var, a aVar, p pVar, p pVar2, p pVar3, l lVar, a aVar2, a aVar3, j2 j2Var, o oVar, int i10, m mVar, int i11) {
        HomeScreen(z1Var, aVar, pVar, pVar2, pVar3, lVar, aVar2, aVar3, j2Var, oVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
