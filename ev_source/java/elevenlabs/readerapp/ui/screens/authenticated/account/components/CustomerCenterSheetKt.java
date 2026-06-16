package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.theme.ColorScheme;
import io.elevenlabs.ui.theme.ElevenLabsColors;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p3.x;
import q2.b8;
import q2.f0;
import q2.g0;
import s4.y0;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onDismiss", "CustomerCenterSheet", "(Lho/a;Lu2/m;I)V", "Lp3/x;", "primary", "errorContainer", "Lq2/f0;", "customerCenterColorScheme-RFnl5yQ", "(JJLu2/m;I)Lq2/f0;", "customerCenterColorScheme", "color", "contrastingOn-8_81llA", "(J)J", "contrastingOn", "buttonTextColor", "Lq2/b8;", "customerCenterTypography-ek8zF_U", "(JLu2/m;I)Lq2/b8;", "customerCenterTypography", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CustomerCenterSheetKt {
    public static final void CustomerCenterSheet(ho.a aVar, m mVar, int i10) {
        int i11;
        boolean z6;
        ho.a aVar2;
        int i12;
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(454852612);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            ComposableSingletons$CustomerCenterSheetKt composableSingletons$CustomerCenterSheetKt = ComposableSingletons$CustomerCenterSheetKt.INSTANCE;
            aVar2 = aVar;
            BottomSheetScaffoldKt.EchoBottomSheetScaffold(false, aVar2, null, false, null, composableSingletons$CustomerCenterSheetKt.getLambda$498549638$app_productionRelease(), composableSingletons$CustomerCenterSheetKt.m1242getLambda$146789865$app_productionRelease(), qVar, ((i11 << 3) & 112) | 1772928, 17);
        } else {
            aVar2 = aVar;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new hm.b(aVar2, i10, 5);
        }
    }

    public static final z CustomerCenterSheet$lambda$0(ho.a aVar, int i10, m mVar, int i11) {
        CustomerCenterSheet(aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* renamed from: access$contrastingOn-8_81llA */
    public static final /* synthetic */ long m1249access$contrastingOn8_81llA(long j4) {
        return m1252contrastingOn8_81llA(j4);
    }

    /* renamed from: access$customerCenterColorScheme-RFnl5yQ */
    public static final /* synthetic */ f0 m1250access$customerCenterColorSchemeRFnl5yQ(long j4, long j10, m mVar, int i10) {
        return m1253customerCenterColorSchemeRFnl5yQ(j4, j10, mVar, i10);
    }

    /* renamed from: access$customerCenterTypography-ek8zF_U */
    public static final /* synthetic */ b8 m1251access$customerCenterTypographyek8zF_U(long j4, m mVar, int i10) {
        return m1254customerCenterTypographyek8zF_U(j4, mVar, i10);
    }

    /* renamed from: contrastingOn-8_81llA */
    public static final long m1252contrastingOn8_81llA(long j4) {
        if (h0.w(j4) > 0.5f) {
            int i10 = x.f26439n;
            return x.f26427b;
        }
        int i11 = x.f26439n;
        return x.f26431f;
    }

    /* renamed from: customerCenterColorScheme-RFnl5yQ */
    public static final f0 m1253customerCenterColorSchemeRFnl5yQ(long j4, long j10, m mVar, int i10) {
        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
        int i11 = ElevenLabsTheme.$stable;
        ElevenLabsColors colors = elevenLabsTheme.getColors(mVar, i11);
        ColorScheme color = elevenLabsTheme.getColor(mVar, i11);
        if (color.isDark()) {
            return g0.d(j4, m1252contrastingOn8_81llA(j4), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, colors.getPrimaryBg(), color.getText().m2185getPrimary0d7_KjU(), color.getBackground().m2005getSecondary0d7_KjU(), color.getText().m2185getPrimary0d7_KjU(), 0L, color.getText().m2186getSecondary0d7_KjU(), 0L, 0L, 0L, 0L, 0L, j10, m1252contrastingOn8_81llA(j10), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -50716676, 65535);
        }
        return g0.h(j4, m1252contrastingOn8_81llA(j4), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, colors.getPrimaryBg(), color.getText().m2185getPrimary0d7_KjU(), color.getBackground().m2005getSecondary0d7_KjU(), color.getText().m2185getPrimary0d7_KjU(), 0L, color.getText().m2186getSecondary0d7_KjU(), 0L, 0L, 0L, 0L, 0L, j10, m1252contrastingOn8_81llA(j10), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -50716676, 65535);
    }

    /* renamed from: customerCenterTypography-ek8zF_U */
    public static final b8 m1254customerCenterTypographyek8zF_U(long j4, m mVar, int i10) {
        y0 body = ElevenLabsTheme.INSTANCE.getTypo(mVar, ElevenLabsTheme.$stable).getBody();
        long j10 = x.f26438m;
        return new b8(y0.a(body, j10, 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), y0.a(body, j10, 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), y0.a(body, j4, 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), 28031);
    }
}
