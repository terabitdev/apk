package io.elevenlabs.readerapp.ui.components.explore;

import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import ka.j0;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.w1;
import s4.o0;
import sn.z;
import t1.b0;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a)\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lt1/z;", "rememberCarouselLazyListState", "(Lu2/m;I)Lt1/z;", "", "", "urls", "", "useCoverCacheKey", "Lsn/z;", "PreloadCarouselImages", "(Ljava/util/List;ZLu2/m;II)V", "", "NESTED_PREFETCH_ITEM_COUNT", TokenNames.I, "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExploreCarouselDefaultsKt {
    private static final int NESTED_PREFETCH_ITEM_COUNT = 6;

    public static final void PreloadCarouselImages(List<String> list, boolean z6, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        list.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1411259032);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        boolean z11 = false;
        if ((i12 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i12 & 1, z10)) {
            if (i15 != 0) {
                z6 = true;
            }
            Context context = (Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b);
            Boolean valueOf = Boolean.valueOf(z6);
            boolean h10 = qVar.h(context) | qVar.h(list);
            if ((i12 & 112) == 32) {
                z11 = true;
            }
            boolean z12 = h10 | z11;
            Object L = qVar.L();
            if (z12 || L == u2.l.f33918a) {
                L = new ExploreCarouselDefaultsKt$PreloadCarouselImages$1$1(context, list, z6, null);
                qVar.h0(L);
            }
            r.g(list, valueOf, (ho.p) L, qVar);
        } else {
            qVar.R();
        }
        boolean z13 = z6;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.i(list, z13, i10, i11, 1);
        }
    }

    public static final z PreloadCarouselImages$lambda$1(List list, boolean z6, int i10, int i11, u2.m mVar, int i12) {
        PreloadCarouselImages(list, z6, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final t1.z rememberCarouselLazyListState(u2.m mVar, int i10) {
        u2.q qVar = (u2.q) mVar;
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (L == eVar) {
            L = new t1.a(6);
            qVar.h0(L);
        }
        t1.a aVar = (t1.a) L;
        t1.q qVar2 = b0.f31750a;
        Object[] objArr = {aVar};
        j0 j0Var = t1.z.f31871x;
        j0 b10 = f3.m.b(new o0(2), new w1(aVar, 5));
        boolean d10 = qVar.d(0) | qVar.d(0) | qVar.h(aVar);
        Object L2 = qVar.L();
        if (d10 || L2 == eVar) {
            L2 = new qa.g(aVar, 7);
            qVar.h0(L2);
        }
        return (t1.z) f3.m.c(objArr, b10, (ho.a) L2, qVar, 0);
    }
}
