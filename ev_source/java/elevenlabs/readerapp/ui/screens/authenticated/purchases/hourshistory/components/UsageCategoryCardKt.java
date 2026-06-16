package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.components;

import android.gov.nist.javax.sip.parser.TokenNames;
import c3.k;
import c3.o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import f3.a;
import h4.e;
import h4.f;
import h4.g;
import h4.h;
import ho.p;
import i3.t;
import ib.i;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.d;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.components.UsageCategoryCardKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ProgressBarKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import j0.c;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.j;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import s4.y0;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a¯\u0001\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00062\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0017\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001c\u0010\u001a\u001a\u000f\u0010\u001d\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001d\u0010\u001a\u001a\u000f\u0010\u001e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001e\u0010\u001a\u001a\u000f\u0010\u001f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001f\u0010\u001a\"\u0014\u0010!\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"", Constants.ScionAnalytics.PARAM_LABEL, "valueLabel", "", "progressCurrent", "progressTotal", "", "enabled", "Li3/t;", "modifier", "infoTooltip", "Lkotlin/Function0;", "Lsn/z;", "onInfoClick", "packsSummaryLabel", "hasPacks", "trailingLabel", "expanded", "onToggleExpanded", "expansion", "UsageCategoryCard", "(Ljava/lang/String;Ljava/lang/String;IIZLi3/t;Ljava/lang/String;Lho/a;Ljava/lang/String;ZLjava/lang/String;ZLho/a;Lho/p;Lu2/m;III)V", FirebaseAnalytics.Param.CONTENT, "PreviewCard", "(Lho/p;Lu2/m;I)V", "Preview_UsageCategoryCard_TextToAudio", "(Lu2/m;I)V", "Preview_UsageCategoryCard_TextToAudio_WithInfoTooltip", "Preview_UsageCategoryCard_ExtraHours_Collapsed", "Preview_UsageCategoryCard_ExtraHours_Expanded", "Preview_UsageCategoryCard_ExtraHours_Disabled", "Preview_UsageCategoryCard_ExtraHours_NoActivePacks", "", "DISABLED_ALPHA", TokenNames.F, "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class UsageCategoryCardKt {
    private static final float DISABLED_ALPHA = 0.4f;

    private static final void PreviewCard(p pVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        q qVar = (q) mVar;
        qVar.Z(825242956);
        if ((i10 & 6) == 0) {
            if (qVar.h(pVar)) {
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
            EchoTheme.INSTANCE.invoke(null, k.d(1985106738, true, new a(pVar, 3), qVar), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(i10, 4, pVar);
        }
    }

    public static final z PreviewCard$lambda$0(p pVar, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t E = r1.d.E(i3.q.f13017a, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX5());
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(E, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, a10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            c.q(0, pVar, qVar, true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PreviewCard$lambda$1(p pVar, int i10, m mVar, int i11) {
        PreviewCard(pVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_UsageCategoryCard_ExtraHours_Collapsed(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-635505349);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PreviewCard(ComposableSingletons$UsageCategoryCardKt.INSTANCE.m1659getLambda$884437304$app_productionRelease(), qVar, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 13);
        }
    }

    public static final z Preview_UsageCategoryCard_ExtraHours_Collapsed$lambda$0(int i10, m mVar, int i11) {
        Preview_UsageCategoryCard_ExtraHours_Collapsed(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_UsageCategoryCard_ExtraHours_Disabled(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-658689664);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PreviewCard(ComposableSingletons$UsageCategoryCardKt.INSTANCE.getLambda$1550037587$app_productionRelease(), qVar, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 15);
        }
    }

    public static final z Preview_UsageCategoryCard_ExtraHours_Disabled$lambda$0(int i10, m mVar, int i11) {
        Preview_UsageCategoryCard_ExtraHours_Disabled(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_UsageCategoryCard_ExtraHours_Expanded(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1744217763);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PreviewCard(ComposableSingletons$UsageCategoryCardKt.INSTANCE.m1657getLambda$342022282$app_productionRelease(), qVar, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 18);
        }
    }

    public static final z Preview_UsageCategoryCard_ExtraHours_Expanded$lambda$0(int i10, m mVar, int i11) {
        Preview_UsageCategoryCard_ExtraHours_Expanded(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_UsageCategoryCard_ExtraHours_NoActivePacks(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(2132871423);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PreviewCard(ComposableSingletons$UsageCategoryCardKt.INSTANCE.getLambda$664343564$app_productionRelease(), qVar, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 14);
        }
    }

    public static final z Preview_UsageCategoryCard_ExtraHours_NoActivePacks$lambda$0(int i10, m mVar, int i11) {
        Preview_UsageCategoryCard_ExtraHours_NoActivePacks(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_UsageCategoryCard_TextToAudio(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(701684750);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PreviewCard(ComposableSingletons$UsageCategoryCardKt.INSTANCE.m1656getLambda$1111171103$app_productionRelease(), qVar, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 17);
        }
    }

    public static final z Preview_UsageCategoryCard_TextToAudio$lambda$0(int i10, m mVar, int i11) {
        Preview_UsageCategoryCard_TextToAudio(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_UsageCategoryCard_TextToAudio_WithInfoTooltip(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-157089890);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PreviewCard(ComposableSingletons$UsageCategoryCardKt.INSTANCE.m1658getLambda$533660303$app_productionRelease(), qVar, 6);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 16);
        }
    }

    public static final z Preview_UsageCategoryCard_TextToAudio_WithInfoTooltip$lambda$0(int i10, m mVar, int i11) {
        Preview_UsageCategoryCard_TextToAudio_WithInfoTooltip(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UsageCategoryCard(final String str, final String str2, final int i10, final int i11, final boolean z6, t tVar, String str3, ho.a aVar, String str4, boolean z10, String str5, boolean z11, ho.a aVar2, p pVar, m mVar, final int i12, final int i13, final int i14) {
        int i15;
        t tVar2;
        String str6;
        ho.a aVar3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        q qVar;
        final String str7;
        final boolean z12;
        final String str8;
        final boolean z13;
        final ho.a aVar4;
        final t tVar3;
        final String str9;
        final ho.a aVar5;
        final p pVar2;
        r1 r10;
        int i25;
        float f10;
        i3.q qVar2;
        ho.a aVar6;
        String str10;
        boolean z14;
        p pVar3;
        ho.a aVar7;
        str.getClass();
        str2.getClass();
        q qVar3 = (q) mVar;
        qVar3.Z(1781384407);
        if ((i12 & 6) == 0) {
            i15 = (qVar3.f(str) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= qVar3.f(str2) ? 32 : 16;
        }
        int i26 = i12 & 384;
        int i27 = RpcError.MAX_MESSAGE_BYTES;
        if (i26 == 0) {
            i15 |= qVar3.d(i10) ? 256 : 128;
        }
        int i28 = i12 & 3072;
        int i29 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i28 == 0) {
            i15 |= qVar3.d(i11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i15 |= qVar3.g(z6) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        int i30 = i14 & 32;
        if (i30 != 0) {
            i15 |= 196608;
            tVar2 = tVar;
        } else {
            tVar2 = tVar;
            if ((i12 & 196608) == 0) {
                i15 |= qVar3.f(tVar2) ? 131072 : 65536;
            }
        }
        int i31 = i14 & 64;
        if (i31 != 0) {
            i15 |= 1572864;
            str6 = str3;
        } else {
            str6 = str3;
            if ((i12 & 1572864) == 0) {
                i15 |= qVar3.f(str6) ? 1048576 : 524288;
            }
        }
        int i32 = i14 & 128;
        if (i32 != 0) {
            i15 |= 12582912;
            aVar3 = aVar;
        } else {
            aVar3 = aVar;
            if ((i12 & 12582912) == 0) {
                i15 |= qVar3.h(aVar3) ? 8388608 : 4194304;
            }
        }
        int i33 = i14 & RpcError.MAX_MESSAGE_BYTES;
        if (i33 != 0) {
            i15 |= 100663296;
        } else if ((i12 & 100663296) == 0) {
            i15 |= qVar3.f(str4) ? 67108864 : 33554432;
        }
        int i34 = i14 & 512;
        if (i34 != 0) {
            i15 |= 805306368;
        } else if ((i12 & 805306368) == 0) {
            i16 = i34;
            i15 |= qVar3.g(z10) ? 536870912 : 268435456;
            i17 = i14 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i17 == 0) {
                i19 = i13 | 6;
                i18 = i17;
            } else if ((i13 & 6) == 0) {
                i18 = i17;
                i19 = i13 | (qVar3.f(str5) ? 4 : 2);
            } else {
                i18 = i17;
                i19 = i13;
            }
            i20 = i14 & 2048;
            if (i20 == 0) {
                i19 |= 48;
                i21 = i20;
            } else if ((i13 & 48) == 0) {
                i21 = i20;
                i19 |= qVar3.g(z11) ? 32 : 16;
            } else {
                i21 = i20;
            }
            int i35 = i19;
            i22 = i14 & 4096;
            if (i22 == 0) {
                i23 = i35 | 384;
            } else if ((i13 & 384) == 0) {
                if (!qVar3.h(aVar2)) {
                    i27 = 128;
                }
                i23 = i35 | i27;
            } else {
                i23 = i35;
            }
            i24 = i14 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (i24 == 0) {
                i23 |= 3072;
            } else if ((i13 & 3072) == 0) {
                if (qVar3.h(pVar)) {
                    i29 = 2048;
                }
                i23 |= i29;
                if (qVar3.O(i15 & 1, (i15 & 306783379) == 306783378 || (i23 & 1171) != 1170)) {
                    i3.q qVar4 = i3.q.f13017a;
                    if (i30 != 0) {
                        tVar2 = qVar4;
                    }
                    if (i31 != 0) {
                        str6 = null;
                    }
                    if (i32 != 0) {
                        aVar3 = null;
                    }
                    String str11 = i33 != 0 ? null : str4;
                    boolean z15 = i16 != 0 ? true : z10;
                    String str12 = i18 != 0 ? null : str5;
                    boolean z16 = i21 != 0 ? false : z11;
                    ho.a aVar8 = i22 != 0 ? null : aVar2;
                    p pVar4 = i24 == 0 ? pVar : null;
                    if (z6) {
                        i25 = i23;
                        f10 = 1.0f;
                    } else {
                        i25 = i23;
                        f10 = 0.4f;
                    }
                    String str13 = str6;
                    t a10 = m3.h.a(p2.e(tVar2, 1.0f), f10);
                    u0 u0Var = j.f29228a;
                    EchoTheme echoTheme = EchoTheme.INSTANCE;
                    int i36 = EchoTheme.$stable;
                    t tVar4 = tVar2;
                    int i37 = i15;
                    x a11 = w.a(j.g(echoTheme.getSpacings(qVar3, i36).getX2_5()), i3.d.B0, qVar3, 0);
                    int hashCode = Long.hashCode(qVar3.T);
                    o l4 = qVar3.l();
                    t c5 = i3.a.c(a10, qVar3);
                    h.f11920i.getClass();
                    f fVar = g.f11903b;
                    qVar3.b0();
                    String str14 = str11;
                    if (qVar3.S) {
                        qVar3.k(fVar);
                    } else {
                        qVar3.k0();
                    }
                    e eVar = g.f11907f;
                    r.J(eVar, a11, qVar3);
                    e eVar2 = g.f11906e;
                    r.J(eVar2, l4, qVar3);
                    Integer valueOf = Integer.valueOf(hashCode);
                    boolean z17 = z15;
                    e eVar3 = g.f11908g;
                    r.y(qVar3, valueOf, eVar3);
                    h4.d dVar = g.f11909h;
                    r.F(dVar, qVar3);
                    String str15 = str12;
                    e eVar4 = g.f11905d;
                    r.J(eVar4, c5, qVar3);
                    ho.a aVar9 = aVar3;
                    t e10 = p2.e(qVar4, 1.0f);
                    i3.k kVar = i3.d.f13005z0;
                    u0 u0Var2 = j.f29228a;
                    p pVar5 = pVar4;
                    k2 a12 = i2.a(u0Var2, kVar, qVar3, 48);
                    int hashCode2 = Long.hashCode(qVar3.T);
                    o l7 = qVar3.l();
                    t c10 = i3.a.c(e10, qVar3);
                    qVar3.b0();
                    if (qVar3.S) {
                        qVar3.k(fVar);
                    } else {
                        qVar3.k0();
                    }
                    r.J(eVar, a12, qVar3);
                    r.J(eVar2, l7, qVar3);
                    defpackage.f.u(hashCode2, qVar3, eVar3, qVar3, dVar);
                    r.J(eVar4, c10, qVar3);
                    EchoThemeTypography typography = echoTheme.getTypography(qVar3, i36);
                    int i38 = EchoThemeTypography.$stable;
                    y0 baseRegular500 = typography.getBaseRegular500(qVar3, i38);
                    EchoThemeColors.Text text = echoTheme.getColors(qVar3, i36).getText();
                    int i39 = EchoThemeColors.Text.$stable;
                    j7.d(str, null, text.getPrimary(qVar3, i39), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular500, qVar3, i37 & 14, 0, 131066);
                    if (str13 != null) {
                        qVar3.X(-212676249);
                        qVar2 = qVar4;
                        r1.d.g(p2.s(qVar2, echoTheme.getSpacings(qVar3, i36).getX1()), qVar3);
                        u3.c M = kd.a.M(R.drawable.ic_circle_info, qVar3, 0);
                        long quaternary = echoTheme.getColors(qVar3, i36).getIcon().getQuaternary(qVar3, EchoThemeColors.Icon.$stable);
                        t o6 = p2.o(qVar2, 16);
                        if (aVar9 == null || !z6) {
                            aVar7 = aVar9;
                        } else {
                            o6 = n.p(o6, false, null, null, null, aVar9, 15);
                            aVar7 = aVar9;
                        }
                        y2.a(M, null, o6, quaternary, qVar3, u3.c.$stable | 48, 0);
                        qVar3.p(false);
                        aVar6 = aVar7;
                    } else {
                        qVar2 = qVar4;
                        aVar6 = aVar9;
                        qVar3.X(-212205359);
                        qVar3.p(false);
                    }
                    if (1.0f <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    r1.d.g(new m1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), qVar3);
                    j7.d(str2, null, i.b(i36, i39, echoTheme, qVar3, qVar3), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar3, i36).getBaseRegular400(qVar3, i38), qVar3, (i37 >> 3) & 14, 0, 131066);
                    qVar3.p(true);
                    ProgressBarKt.m1869ProgressBareaDK9VM(i11 > 0 ? i10 / i11 : u.P, p2.f(p2.e(qVar2, 1.0f), 12), ReaderColors.Transparent.INSTANCE.m2487getBlack80d7_KjU(), 0L, qVar3, 48, 8);
                    qVar = qVar3;
                    boolean z18 = z6 && z17 && str14 != null && aVar8 != null;
                    boolean z19 = (!z6 || str15 == null || (z18 && z16)) ? false : true;
                    if (!z18 && !z19) {
                        qVar.X(-282847787);
                        qVar.p(false);
                        str10 = str15;
                        pVar3 = pVar5;
                    } else {
                        boolean z20 = z18;
                        qVar.X(-284249886);
                        t e11 = p2.e(qVar2, 1.0f);
                        if (z20) {
                            e11 = n.p(e11, false, null, null, null, aVar8, 15);
                        }
                        boolean z21 = z19;
                        k2 a13 = i2.a(u0Var2, kVar, qVar, 48);
                        int hashCode3 = Long.hashCode(qVar.T);
                        o l10 = qVar.l();
                        t c11 = i3.a.c(e11, qVar);
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        r.J(eVar, a13, qVar);
                        r.J(eVar2, l10, qVar);
                        defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
                        r.J(eVar4, c11, qVar);
                        if (z20) {
                            qVar.X(696820465);
                            j7.d(str14, null, i.B(i36, i39, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i36).getXsRegular400(qVar, i38), qVar, (i37 >> 24) & 14, 0, 131066);
                            r1.d.g(p2.s(qVar2, echoTheme.getSpacings(qVar, i36).getX1()), qVar);
                            y2.a(kd.a.M(R.drawable.ic_chevron_bottom, qVar, 0), null, m3.h.i(p2.o(qVar2, 16), z16 ? 180.0f : u.P), echoTheme.getColors(qVar, i36).getIcon().getQuaternary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 48, 0);
                            qVar.p(false);
                        } else {
                            qVar.X(697501814);
                            qVar.p(false);
                        }
                        if (z21) {
                            qVar.X(697544594);
                            if (1.0f <= 0.0d) {
                                s1.a.a("invalid weight; must be greater than zero");
                            }
                            r1.d.g(new m1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), qVar);
                            str10 = str15;
                            j7.d(str10, null, i.B(i36, i39, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i36).getXsRegular400(qVar, i38), qVar, i25 & 14, 0, 131066);
                            z14 = false;
                            qVar.p(false);
                        } else {
                            str10 = str15;
                            z14 = false;
                            qVar.X(697825206);
                            qVar.p(false);
                        }
                        qVar.p(true);
                        if (z20 && z16 && pVar5 != null) {
                            qVar.X(-282899030);
                            pVar3 = pVar5;
                            c.q((i25 >> 9) & 14, pVar3, qVar, z14);
                        } else {
                            pVar3 = pVar5;
                            qVar.X(-282857707);
                            qVar.p(z14);
                        }
                        qVar.p(z14);
                    }
                    qVar.p(true);
                    pVar2 = pVar3;
                    str8 = str10;
                    z13 = z16;
                    aVar4 = aVar8;
                    str9 = str13;
                    tVar3 = tVar4;
                    str7 = str14;
                    z12 = z17;
                    aVar5 = aVar6;
                } else {
                    qVar = qVar3;
                    qVar.R();
                    str7 = str4;
                    z12 = z10;
                    str8 = str5;
                    z13 = z11;
                    aVar4 = aVar2;
                    tVar3 = tVar2;
                    str9 = str6;
                    aVar5 = aVar3;
                    pVar2 = pVar;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new p() { // from class: nm.b
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            z UsageCategoryCard$lambda$1;
                            int intValue = ((Integer) obj2).intValue();
                            UsageCategoryCard$lambda$1 = UsageCategoryCardKt.UsageCategoryCard$lambda$1(str, str2, i10, i11, z6, tVar3, str9, aVar5, str7, z12, str8, z13, aVar4, pVar2, i12, i13, i14, (m) obj, intValue);
                            return UsageCategoryCard$lambda$1;
                        }
                    };
                    return;
                }
                return;
            }
            if (qVar3.O(i15 & 1, (i15 & 306783379) == 306783378 || (i23 & 1171) != 1170)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        i16 = i34;
        i17 = i14 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i17 == 0) {
        }
        i20 = i14 & 2048;
        if (i20 == 0) {
        }
        int i352 = i19;
        i22 = i14 & 4096;
        if (i22 == 0) {
        }
        i24 = i14 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i24 == 0) {
        }
        if (qVar3.O(i15 & 1, (i15 & 306783379) == 306783378 || (i23 & 1171) != 1170)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z UsageCategoryCard$lambda$1(String str, String str2, int i10, int i11, boolean z6, t tVar, String str3, ho.a aVar, String str4, boolean z10, String str5, boolean z11, ho.a aVar2, p pVar, int i12, int i13, int i14, m mVar, int i15) {
        UsageCategoryCard(str, str2, i10, i11, z6, tVar, str3, aVar, str4, z10, str5, z11, aVar2, pVar, mVar, r.M(i12 | 1), r.M(i13), i14);
        return z.f31622a;
    }
}
