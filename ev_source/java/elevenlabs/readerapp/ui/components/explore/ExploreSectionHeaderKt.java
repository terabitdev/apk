package io.elevenlabs.readerapp.ui.components.explore;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import i3.t;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import s4.y0;
import sn.z;
import t2.u;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aA\u0010\b\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000b\u001a\u000f\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"", "title", "Li3/t;", "modifier", "subtitle", "Lkotlin/Function0;", "Lsn/z;", "onHeaderClick", "ExploreSectionHeader", "(Ljava/lang/String;Li3/t;Ljava/lang/String;Lho/a;Lu2/m;II)V", "Preview_ExploreSectionHeader_TitleOnly", "(Lu2/m;I)V", "Preview_ExploreSectionHeader_WithSubtitle", "Preview_ExploreSectionHeader_LongText", "Preview_ExploreSectionHeader_SubtitleOnly", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExploreSectionHeaderKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreSectionHeader(String str, t tVar, String str2, ho.a aVar, u2.m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        String str3;
        int i15;
        int i16;
        ho.a aVar2;
        int i17;
        boolean z6;
        t tVar3;
        String str4;
        ho.a aVar3;
        r1 r10;
        t tVar4;
        String str5;
        ho.a aVar4;
        i3.q qVar;
        t tVar5;
        t tVar6;
        boolean z10;
        EchoTheme echoTheme;
        int i18;
        boolean z11;
        int i19;
        i3.k kVar = i3.d.f13005z0;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1813448123);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                str3 = str2;
                if (qVar2.f(str3)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    aVar2 = aVar;
                    if (qVar2.h(aVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    if ((i12 & 1171) == 1170) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar2.O(i12 & 1, z6)) {
                        i3.q qVar3 = i3.q.f13017a;
                        if (i20 != 0) {
                            tVar4 = qVar3;
                        } else {
                            tVar4 = tVar2;
                        }
                        if (i14 != 0) {
                            str5 = null;
                        } else {
                            str5 = str3;
                        }
                        if (i16 != 0) {
                            aVar4 = null;
                        } else {
                            aVar4 = aVar2;
                        }
                        t e10 = p2.e(tVar4, 1.0f);
                        if (aVar4 != null) {
                            tVar5 = l1.n.p(qVar3, false, null, new p4.k(0), null, aVar4, 11);
                            qVar = qVar3;
                        } else {
                            qVar = qVar3;
                            tVar5 = qVar;
                        }
                        ho.a aVar5 = aVar4;
                        t then = e10.then(tVar5);
                        EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                        int i21 = EchoTheme.$stable;
                        t G = r1.d.G(then, echoTheme2.getSpacings(qVar2, i21).getX5(), u.P, 2);
                        u0 u0Var = r1.j.f29228a;
                        x a10 = w.a(r1.j.g(echoTheme2.getSpacings(qVar2, i21).getX1_5()), i3.d.B0, qVar2, 0);
                        int hashCode = Long.hashCode(qVar2.T);
                        c3.o l4 = qVar2.l();
                        t c5 = i3.a.c(G, qVar2);
                        h4.h.f11920i.getClass();
                        h4.f fVar = h4.g.f11903b;
                        qVar2.b0();
                        if (qVar2.S) {
                            qVar2.k(fVar);
                        } else {
                            qVar2.k0();
                        }
                        h4.e eVar = h4.g.f11907f;
                        r.J(eVar, a10, qVar2);
                        h4.e eVar2 = h4.g.f11906e;
                        r.J(eVar2, l4, qVar2);
                        Integer valueOf = Integer.valueOf(hashCode);
                        h4.e eVar3 = h4.g.f11908g;
                        r.y(qVar2, valueOf, eVar3);
                        h4.d dVar = h4.g.f11909h;
                        r.F(dVar, qVar2);
                        h4.e eVar4 = h4.g.f11905d;
                        r.J(eVar4, c5, qVar2);
                        if (str != null) {
                            qVar2.X(-927745849);
                            k2 a11 = i2.a(r1.j.g(echoTheme2.getSpacings(qVar2, i21).getX0_5()), kVar, qVar2, 48);
                            int hashCode2 = Long.hashCode(qVar2.T);
                            c3.o l7 = qVar2.l();
                            t c10 = i3.a.c(qVar, qVar2);
                            qVar2.b0();
                            int i22 = i12;
                            if (qVar2.S) {
                                qVar2.k(fVar);
                            } else {
                                qVar2.k0();
                            }
                            r.J(eVar, a11, qVar2);
                            r.J(eVar2, l7, qVar2);
                            defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
                            r.J(eVar4, c10, qVar2);
                            EchoThemeTypography typography = echoTheme2.getTypography(qVar2, i21);
                            int i23 = EchoThemeTypography.$stable;
                            y0 lgCompact500 = typography.getLgCompact500(qVar2, i23);
                            EchoThemeColors.Text text = echoTheme2.getColors(qVar2, i21).getText();
                            int i24 = EchoThemeColors.Text.$stable;
                            long primary = text.getPrimary(qVar2, i24);
                            if (1.0f <= 0.0d) {
                                s1.a.a("invalid weight; must be greater than zero");
                            }
                            i3.q qVar4 = qVar;
                            tVar6 = tVar4;
                            j7.d(str, new m1(1.0f, false), primary, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, lgCompact500, qVar2, i22 & 14, 24960, 110584);
                            qVar2 = qVar2;
                            if (aVar5 != null) {
                                qVar2.X(-1249426947);
                                z11 = false;
                                echoTheme = echoTheme2;
                                i18 = i21;
                                y2.a(kd.a.M(R.drawable.chevron_right_rounded, qVar2, 0), null, p2.o(qVar4, 20), echoTheme.getColors(qVar2, i18).getIcon().getTertiary(qVar2, EchoThemeColors.Icon.$stable), qVar2, u3.c.$stable | 432, 0);
                                qVar2.p(false);
                            } else {
                                echoTheme = echoTheme2;
                                i18 = i21;
                                z11 = false;
                                qVar2.X(-1249121752);
                                qVar2.p(false);
                            }
                            z10 = true;
                            qVar2.p(true);
                            if (str5 != null) {
                                qVar2.X(-926801930);
                                str4 = str5;
                                j7.d(str4, null, ib.i.B(i18, i24, echoTheme, qVar2, qVar2), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar2, i18).getBaseRegular500(qVar2, i23), qVar2, (i22 >> 6) & 14, 24960, 110586);
                                qVar2 = qVar2;
                                qVar2.p(z11);
                            } else {
                                str4 = str5;
                                qVar2.X(-926525689);
                                qVar2.p(z11);
                            }
                            qVar2.p(z11);
                        } else {
                            int i25 = i12;
                            tVar6 = tVar4;
                            i3.q qVar5 = qVar;
                            String str6 = str5;
                            if (str6 != null && aVar5 != null) {
                                qVar2.X(-926423420);
                                k2 a12 = i2.a(r1.j.g(echoTheme2.getSpacings(qVar2, i21).getX0_5()), kVar, qVar2, 48);
                                int hashCode3 = Long.hashCode(qVar2.T);
                                c3.o l10 = qVar2.l();
                                t c11 = i3.a.c(qVar5, qVar2);
                                qVar2.b0();
                                if (qVar2.S) {
                                    qVar2.k(fVar);
                                } else {
                                    qVar2.k0();
                                }
                                r.J(eVar, a12, qVar2);
                                r.J(eVar2, l10, qVar2);
                                defpackage.f.u(hashCode3, qVar2, eVar3, qVar2, dVar);
                                r.J(eVar4, c11, qVar2);
                                y0 baseRegular500 = echoTheme2.getTypography(qVar2, i21).getBaseRegular500(qVar2, EchoThemeTypography.$stable);
                                long tertiary = echoTheme2.getColors(qVar2, i21).getText().getTertiary(qVar2, EchoThemeColors.Text.$stable);
                                if (1.0f <= 0.0d) {
                                    s1.a.a("invalid weight; must be greater than zero");
                                }
                                j7.d(str6, new m1(1.0f, false), tertiary, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, baseRegular500, qVar2, (i25 >> 6) & 14, 24960, 110584);
                                qVar2 = qVar2;
                                y2.a(kd.a.M(R.drawable.chevron_right_rounded, qVar2, 0), null, p2.o(qVar5, 20), echoTheme2.getColors(qVar2, i21).getIcon().getTertiary(qVar2, EchoThemeColors.Icon.$stable), qVar2, u3.c.$stable | 432, 0);
                                z10 = true;
                                qVar2.p(true);
                                qVar2.p(false);
                                str4 = str6;
                            } else {
                                z10 = true;
                                if (str6 != null) {
                                    qVar2.X(-925561682);
                                    str4 = str6;
                                    j7.d(str4, null, echoTheme2.getColors(qVar2, i21).getText().getTertiary(qVar2, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme2.getTypography(qVar2, i21).getBaseRegular500(qVar2, EchoThemeTypography.$stable), qVar2, (i25 >> 6) & 14, 24960, 110586);
                                    qVar2 = qVar2;
                                    qVar2.p(false);
                                } else {
                                    str4 = str6;
                                    qVar2.X(-925312473);
                                    qVar2.p(false);
                                }
                            }
                        }
                        qVar2.p(z10);
                        aVar3 = aVar5;
                        tVar3 = tVar6;
                    } else {
                        qVar2.R();
                        tVar3 = tVar2;
                        str4 = str3;
                        aVar3 = aVar2;
                    }
                    r10 = qVar2.r();
                    if (r10 == null) {
                        r10.f34012d = new q(str, tVar3, str4, aVar3, i10, i11);
                        return;
                    }
                    return;
                }
                aVar2 = aVar;
                if ((i12 & 1171) == 1170) {
                }
                if (!qVar2.O(i12 & 1, z6)) {
                }
                r10 = qVar2.r();
                if (r10 == null) {
                }
            }
            str3 = str2;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            aVar2 = aVar;
            if ((i12 & 1171) == 1170) {
            }
            if (!qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar2.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        str3 = str2;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        aVar2 = aVar;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar2.r();
        if (r10 == null) {
        }
    }

    public static final z ExploreSectionHeader$lambda$1(String str, t tVar, String str2, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        ExploreSectionHeader(str, tVar, str2, aVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_ExploreSectionHeader_LongText(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1693828585);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreSectionHeaderKt.INSTANCE.m1144getLambda$488979471$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 21);
        }
    }

    public static final z Preview_ExploreSectionHeader_LongText$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreSectionHeader_LongText(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreSectionHeader_SubtitleOnly(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(88958044);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreSectionHeaderKt.INSTANCE.getLambda$2075226422$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 23);
        }
    }

    public static final z Preview_ExploreSectionHeader_SubtitleOnly$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreSectionHeader_SubtitleOnly(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreSectionHeader_TitleOnly(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(212322226);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreSectionHeaderKt.INSTANCE.m1142getLambda$1092060904$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 22);
        }
    }

    public static final z Preview_ExploreSectionHeader_TitleOnly$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreSectionHeader_TitleOnly(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreSectionHeader_WithSubtitle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1439276670);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreSectionHeaderKt.INSTANCE.getLambda$546991708$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new g(i10, 24);
        }
    }

    public static final z Preview_ExploreSectionHeader_WithSubtitle$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreSectionHeader_WithSubtitle(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
