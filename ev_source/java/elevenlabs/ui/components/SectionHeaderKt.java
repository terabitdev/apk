package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\b\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0007¢\u0006\u0004\b\b\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/Function1;", "", "Lsn/z;", "onNavigateToDeeplink", "title", "deeplink", "Lio/elevenlabs/ui/components/SectionHeaderStyle;", "style", "SectionHeader", "(Lho/l;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/ui/components/SectionHeaderStyle;Lu2/m;I)V", "Li3/t;", "modifier", "Lkotlin/Function0;", "onClick", "(Ljava/lang/String;Lio/elevenlabs/ui/components/SectionHeaderStyle;Li3/t;Lho/a;Lu2/m;II)V", "Preview_DeeplinkHeader", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SectionHeaderKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SectionHeaderStyle.values().length];
            try {
                iArr[SectionHeaderStyle.Large.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SectionHeaderStyle.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void Preview_DeeplinkHeader(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(479468389);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t y10 = l1.n.y(r1.p2.e(i3.q.f13017a, 1.0f), l1.n.x(qVar), true, true);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(y10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new v0(8);
                qVar.h0(L);
            }
            SectionHeaderStyle sectionHeaderStyle = SectionHeaderStyle.Large;
            SectionHeader((ho.l) L, "Primary Style", "deeplink", sectionHeaderStyle, qVar, 3510);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new v0(9);
                qVar.h0(L2);
            }
            SectionHeaderStyle sectionHeaderStyle2 = SectionHeaderStyle.Small;
            SectionHeader((ho.l) L2, "Secondary Style", "deeplink", sectionHeaderStyle2, qVar, 3510);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new v0(10);
                qVar.h0(L3);
            }
            SectionHeader((ho.l) L3, "This is a very big title which spans into multiple lines. I really hope this looks good!", "deeplink", sectionHeaderStyle, qVar, 3510);
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new v0(11);
                qVar.h0(L4);
            }
            SectionHeader((ho.l) L4, "This is a very big title which spans into multiple lines. I really hope this looks good!", "deeplink", sectionHeaderStyle2, qVar, 3510);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 4);
        }
    }

    public static final sn.z Preview_DeeplinkHeader$lambda$0$0$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_DeeplinkHeader$lambda$0$1$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_DeeplinkHeader$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_DeeplinkHeader$lambda$0$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_DeeplinkHeader$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_DeeplinkHeader(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SectionHeader(String str, SectionHeaderStyle sectionHeaderStyle, i3.t tVar, ho.a aVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        ho.a aVar2;
        int i15;
        boolean z6;
        i3.t tVar3;
        ho.a aVar3;
        u2.r1 r10;
        i3.t tVar4;
        ho.a aVar4;
        sn.k kVar;
        int i16;
        int i17;
        str.getClass();
        sectionHeaderStyle.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2083618756);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.d(sectionHeaderStyle.ordinal())) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        int i18 = i11 & 4;
        if (i18 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                aVar2 = aVar;
                if (qVar.h(aVar2)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                if ((i12 & 1171) != 1170) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar.O(i12 & 1, z6)) {
                    if (i18 != 0) {
                        tVar4 = i3.q.f13017a;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i14 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    int i19 = WhenMappings.$EnumSwitchMapping$0[sectionHeaderStyle.ordinal()];
                    if (i19 != 1) {
                        if (i19 == 2) {
                            qVar.X(-902852509);
                            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                            kVar = new sn.k(elevenLabsTheme.getTypo(qVar, 6).getBodyMedium700(), new h5.f(elevenLabsTheme.getSpacings(qVar, 6).m2356getX4D9Ej5fM()));
                            qVar.p(false);
                        } else {
                            throw com.google.android.gms.internal.play_billing.b.h(-902858486, qVar, false);
                        }
                    } else {
                        qVar.X(-902857052);
                        ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                        kVar = new sn.k(elevenLabsTheme2.getTypo(qVar, 6).getTitleMedium700(), new h5.f(elevenLabsTheme2.getSpacings(qVar, 6).m2356getX4D9Ej5fM()));
                        qVar.p(false);
                    }
                    c3.j d10 = c3.k.d(-1122376672, true, new io.elevenlabs.readerapp.ui.screens.authenticated.collections.q(((h5.f) kVar.f31601b).f12083a, str, (s4.y0) kVar.f31600a, aVar4), qVar);
                    int i20 = (i12 & 14) | 805306368 | ((i12 >> 6) & 112) | (i12 & 896);
                    i3.t tVar5 = tVar4;
                    ho.a aVar5 = aVar4;
                    ButtonContainerKt.m1780ButtonContainer83mGB3Q(str, aVar5, tVar5, 0L, false, 0, null, false, null, d10, qVar, i20, 504);
                    aVar3 = aVar5;
                    tVar3 = tVar5;
                } else {
                    qVar.R();
                    tVar3 = tVar2;
                    aVar3 = aVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.f(str, sectionHeaderStyle, tVar3, aVar3, i10, i11);
                    return;
                }
                return;
            }
            aVar2 = aVar;
            if ((i12 & 1171) != 1170) {
            }
            if (qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        aVar2 = aVar;
        if ((i12 & 1171) != 1170) {
        }
        if (qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z SectionHeader$lambda$0$0(ho.l lVar, String str) {
        lVar.invoke(str);
        return sn.z.f31622a;
    }

    public static final sn.z SectionHeader$lambda$1(ho.l lVar, String str, String str2, SectionHeaderStyle sectionHeaderStyle, int i10, u2.m mVar, int i11) {
        SectionHeader(lVar, str, str2, sectionHeaderStyle, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final sn.z SectionHeader$lambda$2(float f10, String str, s4.y0 y0Var, ho.a aVar, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.k kVar = i3.d.f13005z0;
            r1.u0 u0Var = r1.j.f29228a;
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            r1.h g10 = r1.j.g(elevenLabsTheme.getSpacings(qVar, 6).m2355getX3D9Ej5fM());
            float m2357getX5D9Ej5fM = elevenLabsTheme.getSpacings(qVar, 6).m2357getX5D9Ej5fM();
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = r1.p2.e(r1.d.F(qVar2, m2357getX5D9Ej5fM, f10), 1.0f);
            r1.k2 a10 = r1.i2.a(g10, kVar, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(e10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            j7.d(str, new r1.m1(1.0f, false), 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, y0Var, qVar, 0, 24960, 110588);
            if (aVar != null) {
                qVar.X(395678149);
                q2.y2.a(kd.a.M(R.drawable.chevron_right, qVar, 0), null, r1.p2.o(qVar2, 14), ib.i.w(elevenLabsTheme, qVar, 6), qVar, u3.c.$stable | 432, 0);
                qVar.p(false);
            } else {
                qVar.X(395978942);
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z SectionHeader$lambda$3(String str, SectionHeaderStyle sectionHeaderStyle, i3.t tVar, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        SectionHeader(str, sectionHeaderStyle, tVar, aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void SectionHeader(ho.l lVar, String str, String str2, SectionHeaderStyle sectionHeaderStyle, u2.m mVar, int i10) {
        int i11;
        lVar.getClass();
        str.getClass();
        str2.getClass();
        sectionHeaderStyle.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(993924991);
        if ((i10 & 6) == 0) {
            i11 = (qVar.h(lVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= qVar.f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= qVar.f(str2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= qVar.d(sectionHeaderStyle.ordinal()) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (qVar.O(i11 & 1, (i11 & 1171) != 1170)) {
            boolean z6 = ((i11 & 14) == 4) | ((i11 & 896) == 256);
            Object L = qVar.L();
            if (z6 || L == u2.l.f33918a) {
                L = new b0(lVar, str2, 2);
                qVar.h0(L);
            }
            SectionHeader(str, sectionHeaderStyle, null, (ho.a) L, qVar, ((i11 >> 3) & 14) | ((i11 >> 6) & 112), 4);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.d(lVar, str, str2, sectionHeaderStyle, i10, 12);
        }
    }
}
