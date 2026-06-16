package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\n\u001a3\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"", ParameterNames.TEXT, "", ParameterNames.ICON, "Lio/elevenlabs/ui/components/MetaChipVariant;", "variant", "Lsn/z;", "MetaChip", "(Ljava/lang/String;ILio/elevenlabs/ui/components/MetaChipVariant;Lu2/m;II)V", "iconUrl", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/ui/components/MetaChipVariant;Lu2/m;II)V", "Lkotlin/Function0;", "MetaChipUi", "(Ljava/lang/String;Lho/p;Lio/elevenlabs/ui/components/MetaChipVariant;Lu2/m;II)V", "Preview_MetaChip", "(Lu2/m;I)V", "Preview_MetaChip_WithIconUrl", "Preview_MetaChip_NoIcon", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class MetaChipKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MetaChipVariant.values().length];
            try {
                iArr[MetaChipVariant.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MetaChipVariant.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void MetaChip(String str, String str2, MetaChipVariant metaChipVariant, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        int ordinal;
        int i14;
        boolean z6;
        String str3;
        MetaChipVariant metaChipVariant2;
        String str4;
        MetaChipVariant metaChipVariant3;
        int i15;
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1768001089);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (qVar.f(str2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (metaChipVariant == null) {
                ordinal = -1;
            } else {
                ordinal = metaChipVariant.ordinal();
            }
            if (qVar.d(ordinal)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            c3.j jVar = null;
            if (i16 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i17 != 0) {
                metaChipVariant3 = MetaChipVariant.Secondary;
            } else {
                metaChipVariant3 = metaChipVariant;
            }
            if (str4 == null) {
                qVar.X(1336683473);
                qVar.p(false);
            } else {
                qVar.X(1336683474);
                jVar = c3.k.d(-695635047, true, new k(metaChipVariant3, str4, 2), qVar);
                qVar.p(false);
            }
            MetaChipUi(str, jVar, metaChipVariant3, qVar, i12 & 910, 0);
            str3 = str4;
            metaChipVariant2 = metaChipVariant3;
        } else {
            qVar.R();
            str3 = str2;
            metaChipVariant2 = metaChipVariant;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(str, str3, metaChipVariant2, i10, i11, 29);
        }
    }

    public static final sn.z MetaChip$lambda$0(MetaChipVariant metaChipVariant, int i10, u2.m mVar, int i11) {
        boolean z6;
        long v9;
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            int i12 = WhenMappings.$EnumSwitchMapping$0[metaChipVariant.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    qVar.X(-2067888361);
                    v9 = ib.i.b(6, 0, EchoTheme.INSTANCE, qVar, qVar);
                    qVar.p(false);
                } else {
                    throw com.google.android.gms.internal.play_billing.b.h(-2067893214, qVar, false);
                }
            } else {
                qVar.X(-2067890763);
                v9 = ib.i.v(6, 0, EchoTheme.INSTANCE, qVar, qVar);
                qVar.p(false);
            }
            q2.y2.a(kd.a.M(i10, qVar, 0), null, null, v9, qVar, u3.c.$stable | 48, 4);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z MetaChip$lambda$1(String str, int i10, MetaChipVariant metaChipVariant, int i11, int i12, u2.m mVar, int i13) {
        MetaChip(str, i10, metaChipVariant, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    public static final sn.z MetaChip$lambda$2$0(MetaChipVariant metaChipVariant, String str, u2.m mVar, int i10) {
        boolean z6;
        long v9;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[metaChipVariant.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    qVar.X(1509624386);
                    v9 = ib.i.b(6, 0, EchoTheme.INSTANCE, qVar, qVar);
                    qVar.p(false);
                } else {
                    throw com.google.android.gms.internal.play_billing.b.h(1509619289, qVar, false);
                }
            } else {
                qVar.X(1509621856);
                v9 = ib.i.v(6, 0, EchoTheme.INSTANCE, qVar, qVar);
                qVar.p(false);
            }
            CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0(str, null, new p3.x(v9), null, null, null, null, qVar, 0, 122);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z MetaChip$lambda$3(String str, String str2, MetaChipVariant metaChipVariant, int i10, int i11, u2.m mVar, int i12) {
        MetaChip(str, str2, metaChipVariant, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0042  */
    /* JADX WARN: Type inference failed for: r1v16, types: [io.elevenlabs.ui.echo.EchoThemeTypography] */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void MetaChipUi(String str, ho.p pVar, MetaChipVariant metaChipVariant, u2.m mVar, int i10, int i11) {
        int i12;
        ho.p pVar2;
        int i13;
        int i14;
        int ordinal;
        int i15;
        boolean z6;
        u2.q qVar;
        MetaChipVariant metaChipVariant2;
        ho.p pVar3;
        u2.r1 r10;
        ho.p pVar4;
        MetaChipVariant metaChipVariant3;
        boolean z10;
        long primary;
        long j4;
        boolean z11;
        ?? r32;
        int i16;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1040330525);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            pVar2 = pVar;
            if (qVar2.h(pVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                if (metaChipVariant == null) {
                    ordinal = -1;
                } else {
                    ordinal = metaChipVariant.ordinal();
                }
                if (qVar2.d(ordinal)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
            }
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                if (i17 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar2;
                }
                if (i14 != 0) {
                    metaChipVariant3 = MetaChipVariant.Secondary;
                } else {
                    metaChipVariant3 = metaChipVariant;
                }
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                p3.b1 full = echoTheme.getShapes(qVar2, 6).getFull(qVar2, 0);
                i3.q qVar3 = i3.q.f13017a;
                i3.t F = r1.d.F(l1.n.h(m3.h.c(qVar3, full), echoTheme.getColors(qVar2, 6).getFill().getDenaryAlpha(qVar2, 0), p3.h0.f26395b), echoTheme.getSpacings(qVar2, 6).getX2(), echoTheme.getSpacings(qVar2, 6).getX1());
                f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
                int hashCode = Long.hashCode(qVar2.T);
                c3.o l4 = qVar2.l();
                i3.t c5 = i3.a.c(F, qVar2);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                h4.e eVar = h4.g.f11907f;
                u2.r.J(eVar, d10, qVar2);
                h4.e eVar2 = h4.g.f11906e;
                u2.r.J(eVar2, l4, qVar2);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar3 = h4.g.f11908g;
                u2.r.y(qVar2, valueOf, eVar3);
                h4.d dVar = h4.g.f11909h;
                u2.r.F(dVar, qVar2);
                h4.e eVar4 = h4.g.f11905d;
                u2.r.J(eVar4, c5, qVar2);
                r1.k2 a10 = r1.i2.a(r1.j.f29232e, i3.d.f13005z0, qVar2, 54);
                int i18 = i12;
                int hashCode2 = Long.hashCode(qVar2.T);
                c3.o l7 = qVar2.l();
                i3.t c10 = i3.a.c(qVar3, qVar2);
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                u2.r.J(eVar, a10, qVar2);
                u2.r.J(eVar2, l7, qVar2);
                defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
                u2.r.J(eVar4, c10, qVar2);
                int i19 = WhenMappings.$EnumSwitchMapping$0[metaChipVariant3.ordinal()];
                if (i19 != 1) {
                    if (i19 == 2) {
                        z10 = false;
                        primary = ib.i.g(1600951286, 6, echoTheme, qVar2, qVar2).getSecondary(qVar2, 0);
                        qVar2.p(false);
                    } else {
                        throw com.google.android.gms.internal.play_billing.b.h(1600946433, qVar2, false);
                    }
                } else {
                    z10 = false;
                    primary = ib.i.g(1600948884, 6, echoTheme, qVar2, qVar2).getPrimary(qVar2, 0);
                    qVar2.p(false);
                }
                long j10 = primary;
                if (pVar4 != null) {
                    qVar2.X(-1910057513);
                    i3.t o6 = r1.p2.o(qVar3, 16);
                    f4.f1 d11 = r1.p.d(i3.d.f12997a, z10);
                    j4 = j10;
                    int hashCode3 = Long.hashCode(qVar2.T);
                    c3.o l10 = qVar2.l();
                    i3.t c11 = i3.a.c(o6, qVar2);
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar);
                    } else {
                        qVar2.k0();
                    }
                    u2.r.J(eVar, d11, qVar2);
                    u2.r.J(eVar2, l10, qVar2);
                    defpackage.f.u(hashCode3, qVar2, eVar3, qVar2, dVar);
                    u2.r.J(eVar4, c11, qVar2);
                    z11 = true;
                    j0.c.q((i18 >> 3) & 14, pVar4, qVar2, true);
                    r1.d.g(r1.p2.s(qVar3, echoTheme.getSpacings(qVar2, 6).getX0_5()), qVar2);
                    r32 = 0;
                    qVar2.p(false);
                } else {
                    j4 = j10;
                    z11 = true;
                    qVar2.X(-1909867049);
                    r1.d.g(r1.p2.f(qVar3, 16), qVar2);
                    qVar2.p(z10);
                    r32 = z10;
                }
                j7.d(str, null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar2, 6).getXsRegular500(qVar2, r32), qVar2, i18 & 14, 0, 131066);
                qVar = qVar2;
                qVar.p(z11);
                qVar.p(z11);
                pVar3 = pVar4;
                metaChipVariant2 = metaChipVariant3;
            } else {
                qVar = qVar2;
                qVar.R();
                metaChipVariant2 = metaChipVariant;
                pVar3 = pVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(str, pVar3, metaChipVariant2, i10, i11, 28);
                return;
            }
            return;
        }
        pVar2 = pVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        if ((i12 & 147) == 146) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z MetaChipUi$lambda$1(String str, ho.p pVar, MetaChipVariant metaChipVariant, int i10, int i11, u2.m mVar, int i12) {
        MetaChipUi(str, pVar, metaChipVariant, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_MetaChip(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1764234184);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t e10 = r1.p2.e(i3.q.f13017a, 1.0f);
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(ib.i.y(EchoTheme.INSTANCE, qVar, 6), i3.d.B0, qVar, 0);
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
            qVar.X(-2030448384);
            for (MetaChipVariant metaChipVariant : MetaChipVariant.getEntries()) {
                MetaChip("MetaChip - " + metaChipVariant, R.drawable.feather, metaChipVariant, qVar, 0, 0);
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 21);
        }
    }

    public static final sn.z Preview_MetaChip$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_MetaChip(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_MetaChip_NoIcon(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1734968699);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t e10 = r1.p2.e(i3.q.f13017a, 1.0f);
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(ib.i.y(EchoTheme.INSTANCE, qVar, 6), i3.d.B0, qVar, 0);
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
            qVar.X(2041707569);
            for (MetaChipVariant metaChipVariant : MetaChipVariant.getEntries()) {
                MetaChip("No Icon - " + metaChipVariant, (String) null, metaChipVariant, qVar, 48, 0);
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 23);
        }
    }

    public static final sn.z Preview_MetaChip_NoIcon$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_MetaChip_NoIcon(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_MetaChip_WithIconUrl(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(993664247);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t e10 = r1.p2.e(i3.q.f13017a, 1.0f);
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(ib.i.y(EchoTheme.INSTANCE, qVar, 6), i3.d.B0, qVar, 0);
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
            qVar.X(-1676392009);
            for (MetaChipVariant metaChipVariant : MetaChipVariant.getEntries()) {
                MetaChip("With Icon URL - " + metaChipVariant, "https://example.com/icon.png", metaChipVariant, qVar, 48, 0);
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 22);
        }
    }

    public static final sn.z Preview_MetaChip_WithIconUrl$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_MetaChip_WithIconUrl(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void MetaChip(String str, int i10, MetaChipVariant metaChipVariant, u2.m mVar, int i11, int i12) {
        int i13;
        String str2;
        MetaChipVariant metaChipVariant2;
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(779435387);
        if ((i11 & 6) == 0) {
            i13 = (qVar.f(str) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= qVar.d(i10) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= qVar.d(metaChipVariant == null ? -1 : metaChipVariant.ordinal()) ? RpcError.MAX_MESSAGE_BYTES : 128;
        }
        if (qVar.O(i13 & 1, (i13 & 147) != 146)) {
            if (i14 != 0) {
                metaChipVariant = MetaChipVariant.Secondary;
            }
            MetaChipVariant metaChipVariant3 = metaChipVariant;
            str2 = str;
            MetaChipUi(str2, c3.k.d(257065774, true, new em.a(metaChipVariant3, i10, 9), qVar), metaChipVariant3, qVar, (i13 & 14) | 48 | (i13 & 896), 0);
            metaChipVariant2 = metaChipVariant3;
        } else {
            str2 = str;
            qVar.R();
            metaChipVariant2 = metaChipVariant;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q1(str2, i10, metaChipVariant2, i11, i12);
        }
    }
}
