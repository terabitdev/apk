package io.elevenlabs.readerapp.ui.components;

import i4.q2;
import io.elevenlabs.domain.model.AuthorProfileSection;
import io.elevenlabs.domain.model.SeriesSection;
import io.elevenlabs.ui.components.CalloutKt;
import io.elevenlabs.ui.components.CalloutType;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lio/elevenlabs/domain/model/AuthorProfileSection$Series;", "series", "Li3/t;", "modifier", "Lsn/z;", "SeriesSection", "(Lio/elevenlabs/domain/model/AuthorProfileSection$Series;Li3/t;Lu2/m;II)V", "Preview_SeriesSection", "(Lu2/m;I)V", "Preview_SeriesSection_NoImage", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SeriesSectionKt {
    public static final void Preview_SeriesSection(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1302745846);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$SeriesSectionKt.INSTANCE.m1082getLambda$2145224672$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 10);
        }
    }

    public static final sn.z Preview_SeriesSection$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_SeriesSection(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_SeriesSection_NoImage(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(801111685);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$SeriesSectionKt.INSTANCE.m1081getLambda$1217440869$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 11);
        }
    }

    public static final sn.z Preview_SeriesSection_NoImage$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_SeriesSection_NoImage(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void SeriesSection(AuthorProfileSection.Series series, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        int i14;
        series.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1552278139);
        if ((i10 & 6) == 0) {
            if (qVar.h(series)) {
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
            if (qVar.f(tVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            if (i15 != 0) {
                tVar = i3.q.f13017a;
            }
            q2 q2Var = (q2) qVar.j(i4.j1.f13138r);
            SeriesSection data = series.getData();
            String title = data.getTitle();
            String subtitle = data.getSubtitle();
            String str = "";
            if (subtitle == null) {
                subtitle = "";
            }
            CalloutType.Large large = new CalloutType.Large(title, subtitle);
            String imageUrl = data.getImageUrl();
            if (imageUrl != null) {
                str = imageUrl;
            }
            boolean h10 = qVar.h(q2Var) | qVar.h(data);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new y0(q2Var, data, 4);
                qVar.h0(L);
            }
            CalloutKt.Callout(large, str, (ho.a) L, r1.d.F(tVar, 20, 8), qVar, CalloutType.Large.$stable, 0);
        } else {
            qVar.R();
        }
        i3.t tVar2 = tVar;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.p(series, tVar2, i10, i11, 3);
        }
    }

    public static final sn.z SeriesSection$lambda$0$0(q2 q2Var, SeriesSection seriesSection) {
        q2Var.openUri(seriesSection.getDeeplink());
        return sn.z.f31622a;
    }

    public static final sn.z SeriesSection$lambda$1(AuthorProfileSection.Series series, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        SeriesSection(series, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
