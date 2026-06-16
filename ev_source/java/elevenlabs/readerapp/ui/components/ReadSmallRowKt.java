package io.elevenlabs.readerapp.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.ReadSource;
import io.elevenlabs.readerapp.ui.resources.ReadCoverFallbackResourceKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColorResources;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u001ao\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a7\u0010\u0019\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u001a\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u000f\u0010\u001d\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"", "title", "author", "coverUrl", "Lio/elevenlabs/domain/model/ReadSource;", "readSource", "originalFileType", "Lkotlin/Function0;", "Lsn/z;", "onClick", "rightIcon", "Lh5/f;", "padding", "accessibilityActionLabel", "ReadSmallRow-gMrHQkA", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/ReadSource;Ljava/lang/String;Lho/a;Lho/p;FLjava/lang/String;Lu2/m;II)V", "ReadSmallRow", "Li3/t;", "modifier", "ReadSmallShimmeringRow", "(Li3/t;Lu2/m;I)V", "size", "source", "ReadSmallRowAvatar-DzVHIIc", "(Ljava/lang/String;FLio/elevenlabs/domain/model/ReadSource;Ljava/lang/String;Lu2/m;II)V", "ReadSmallRowAvatar", "Preview_ReadSmallRowAvatar", "(Lu2/m;I)V", "Preview_ReadSmallRow", "Preview_ReadSmallShimmeringRow", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadSmallRowKt {
    public static final void Preview_ReadSmallRow(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1162560392);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1091ReadSmallRowgMrHQkA("The Origins of Efficiency", "Charles T. Munger, Peter D. Kaufman, Warren Buffett, John Collison", null, ReadSource.Book, "text/html", null, ComposableSingletons$ReadSmallRowKt.INSTANCE.getLambda$1558816164$app_productionRelease(), EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX4(), "", qVar, 102460854, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 8);
        }
    }

    public static final sn.z Preview_ReadSmallRow$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadSmallRow(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadSmallRowAvatar(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1471185873);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1092ReadSmallRowAvatarDzVHIIc(null, t2.u.P, ReadSource.Book, "text/html", qVar, 3462, 2);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 7);
        }
    }

    public static final sn.z Preview_ReadSmallRowAvatar$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadSmallRowAvatar(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadSmallShimmeringRow(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1500065513);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadSmallShimmeringRow(ib.i.e(EchoTheme.INSTANCE, qVar, EchoTheme.$stable, p2.e(i3.q.f13017a, 1.0f)), qVar, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 9);
        }
    }

    public static final sn.z Preview_ReadSmallShimmeringRow$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadSmallShimmeringRow(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* renamed from: ReadSmallRow-gMrHQkA */
    public static final void m1091ReadSmallRowgMrHQkA(String str, String str2, String str3, ReadSource readSource, String str4, ho.a aVar, ho.p pVar, float f10, String str5, u2.m mVar, int i10, int i11) {
        int i12;
        String str6;
        int i13;
        boolean z6;
        u2.q qVar;
        String str7;
        String str8;
        i3.q qVar2;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String str9;
        int i16;
        int i17;
        int i18;
        int i19;
        int ordinal;
        int i20;
        int i21;
        int i22;
        int i23;
        ho.p pVar2 = pVar;
        str.getClass();
        str2.getClass();
        pVar2.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-739616992);
        if ((i10 & 6) == 0) {
            if (qVar3.f(str)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.f(str2)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.f(str3)) {
                i21 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i21 = 128;
            }
            i12 |= i21;
        }
        if ((i10 & 3072) == 0) {
            if (readSource == null) {
                ordinal = -1;
            } else {
                ordinal = readSource.ordinal();
            }
            if (qVar3.d(ordinal)) {
                i20 = 2048;
            } else {
                i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i20;
        }
        if ((i10 & 24576) == 0) {
            if (qVar3.f(str4)) {
                i19 = 16384;
            } else {
                i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i19;
        }
        if ((196608 & i10) == 0) {
            if (qVar3.h(aVar)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i12 |= i18;
        }
        if ((1572864 & i10) == 0) {
            if (qVar3.h(pVar2)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        }
        if ((12582912 & i10) == 0) {
            if (qVar3.c(f10)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i12 |= i16;
        }
        int i24 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i24 != 0) {
            i12 |= 100663296;
            str6 = str5;
        } else {
            str6 = str5;
            if ((i10 & 100663296) == 0) {
                if (qVar3.f(str6)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i12 |= i13;
            }
        }
        int i25 = i12;
        if ((i25 & 38347923) != 38347922) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar3.O(i25 & 1, z6)) {
            if (i24 != 0) {
                str8 = null;
            } else {
                str8 = str6;
            }
            qVar3.X(-2102309378);
            i3.q qVar4 = i3.q.f13017a;
            i3.t h10 = l1.n.h(p2.e(qVar4, 1.0f), ib.i.d(ElevenLabsTheme.INSTANCE, qVar3, ElevenLabsTheme.$stable), p3.h0.f26395b);
            u2.e eVar = u2.l.f33918a;
            if (aVar != null) {
                qVar3.X(853867849);
                Object L = qVar3.L();
                if (L == eVar) {
                    L = j0.c.o(qVar3);
                }
                qVar2 = qVar4;
                i14 = 67108864;
                i15 = 131072;
                h10 = l1.n.n(h10, (p1.l) L, null, false, null, aVar, 28);
                qVar3.p(false);
            } else {
                qVar2 = qVar4;
                i14 = 67108864;
                i15 = 131072;
                qVar3.X(854108688);
                qVar3.p(false);
            }
            qVar3.p(false);
            i3.t E = r1.d.E(h10, f10);
            if ((i25 & 458752) == i15) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i25 & 234881024) == i14) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z14 = z10 | z11;
            if ((i25 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z15 = z14 | z12;
            int i26 = i25 & 14;
            if (i26 == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z16 = z15 | z13;
            Object L2 = qVar3.L();
            if (!z16 && L2 != eVar) {
                str9 = str8;
            } else {
                String str10 = str8;
                x0 x0Var = new x0(aVar, str10, str2, str, 1);
                str9 = str10;
                qVar3.h0(x0Var);
                L2 = x0Var;
            }
            i3.t c5 = p4.q.c(E, true, (ho.l) L2);
            r1.u0 u0Var = r1.j.f29228a;
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i27 = EchoTheme.$stable;
            r1.h y10 = ib.i.y(echoTheme, qVar3, i27);
            i3.k kVar = i3.d.f13005z0;
            k2 a10 = i2.a(y10, kVar, qVar3, 48);
            int hashCode = Long.hashCode(qVar3.T);
            c3.o l4 = qVar3.l();
            i3.t c10 = i3.a.c(c5, qVar3);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            h4.e eVar2 = h4.g.f11907f;
            u2.r.J(eVar2, a10, qVar3);
            h4.e eVar3 = h4.g.f11906e;
            u2.r.J(eVar3, l4, qVar3);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            u2.r.y(qVar3, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar3);
            h4.e eVar5 = h4.g.f11905d;
            u2.r.J(eVar5, c10, qVar3);
            int i28 = i25 >> 3;
            m1092ReadSmallRowAvatarDzVHIIc(str3, t2.u.P, readSource, str4, qVar3, ((i25 >> 6) & 14) | (i28 & 896) | (i28 & 7168), 2);
            i3.q qVar5 = qVar2;
            i3.t e10 = p2.e(qVar5, 1.0f);
            k2 a11 = i2.a(ib.i.m(echoTheme, qVar3, i27), kVar, qVar3, 48);
            int hashCode2 = Long.hashCode(qVar3.T);
            c3.o l7 = qVar3.l();
            i3.t c11 = i3.a.c(e10, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            u2.r.J(eVar2, a11, qVar3);
            u2.r.J(eVar3, l7, qVar3);
            defpackage.f.u(hashCode2, qVar3, eVar4, qVar3, dVar);
            u2.r.J(eVar5, c11, qVar3);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            r1.x a12 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar3, 0);
            int hashCode3 = Long.hashCode(qVar3.T);
            c3.o l10 = qVar3.l();
            i3.t c12 = i3.a.c(m1Var, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            u2.r.J(eVar2, a12, qVar3);
            u2.r.J(eVar3, l10, qVar3);
            defpackage.f.u(hashCode3, qVar3, eVar4, qVar3, dVar);
            u2.r.J(eVar5, c12, qVar3);
            EchoThemeTypography typography = echoTheme.getTypography(qVar3, i27);
            int i29 = EchoThemeTypography.$stable;
            s4.y0 baseRegular500 = typography.getBaseRegular500(qVar3, i29);
            Object L3 = qVar3.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.highlighter.z(29);
                qVar3.h0(L3);
            }
            j7.d(str, p4.q.b(qVar5, (ho.l) L3), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, baseRegular500, qVar3, i26, 24960, 110588);
            qVar = qVar3;
            s4.y0 a13 = s4.y0.a(echoTheme.getTypography(qVar, i27).getSmRegular400(qVar, i29), echoTheme.getColors(qVar, i27).getText().getSecondary(qVar, EchoThemeColors.Text.$stable), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214);
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new r0(0);
                qVar.h0(L4);
            }
            j7.d(str2, p4.q.b(qVar5, (ho.l) L4), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, a13, qVar, i28 & 14, 24960, 110588);
            qVar.p(true);
            pVar2 = pVar;
            j0.c.r((i25 >> 18) & 14, pVar2, qVar, true, true);
            str7 = str9;
        } else {
            qVar = qVar3;
            qVar.R();
            str7 = str6;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new s0(str, str2, str3, readSource, str4, aVar, pVar2, f10, str7, i10, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006e  */
    /* renamed from: ReadSmallRowAvatar-DzVHIIc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1092ReadSmallRowAvatarDzVHIIc(final String str, float f10, final ReadSource readSource, final String str2, u2.m mVar, final int i10, final int i11) {
        int i12;
        float f11;
        int i13;
        boolean z6;
        final float f12;
        r1 r10;
        float f13;
        boolean z10;
        boolean z11;
        float f14;
        boolean z12;
        int i14;
        int ordinal;
        int i15;
        int i16;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(440194877);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
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
            f11 = f10;
            if (qVar.c(f11)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i10 & 384) == 0) {
                if (readSource == null) {
                    ordinal = -1;
                } else {
                    ordinal = readSource.ordinal();
                }
                if (qVar.d(ordinal)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
            }
            if ((i10 & 3072) == 0) {
                if (qVar.f(str2)) {
                    i14 = 2048;
                } else {
                    i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i14;
            }
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i17 != 0) {
                    f13 = 44;
                } else {
                    f13 = f11;
                }
                if ((i12 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i12 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z13 || L == eVar) {
                    L = ReadCoverFallbackResourceKt.readCoverFallbackResource(readSource, str2);
                    qVar.h0(L);
                }
                Integer num = (Integer) L;
                i3.q qVar2 = i3.q.f13017a;
                i3.t o6 = p2.o(qVar2, f13);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i18 = EchoTheme.$stable;
                EchoThemeShapes shapes = echoTheme.getShapes(qVar, i18);
                int i19 = EchoThemeShapes.$stable;
                i3.t E = r1.d.E(l1.n.h(l1.n.j(1, echoTheme.getColors(qVar, i18).getBorder().getSeptenaryAlpha(qVar, EchoThemeColors.Border.$stable), m3.h.c(o6, shapes.getLg(qVar, i19)), echoTheme.getShapes(qVar, i18).getLg(qVar, i19)), echoTheme.getColors(qVar, i18).getFill().getUndenary(qVar, EchoThemeColors.Fill.$stable), p3.h0.f26395b), echoTheme.getSpacings(qVar, i18).getX1());
                Object L2 = qVar.L();
                if (L2 == eVar) {
                    L2 = new r0(1);
                    qVar.h0(L2);
                }
                i3.t b10 = p4.q.b(E, (ho.l) L2);
                f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(b10, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(h4.g.f11907f, d10, qVar);
                u2.r.J(h4.g.f11906e, l4, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar);
                u2.r.J(h4.g.f11905d, c5, qVar);
                if (str != null) {
                    qVar.X(1918211137);
                    float f15 = f13;
                    f14 = f15;
                    qc.m.b(str, null, m3.h.c(p2.r(qVar2, t2.u.P, t2.u.P, f15, f13, 3), z1.h.b(2)), null, f4.q.f8840c, null, qVar, (i12 & 14) | 1572912, 4024);
                    qVar.p(false);
                    z12 = true;
                } else {
                    f14 = f13;
                    if (num != null) {
                        qVar.X(1918613269);
                        z12 = true;
                        l1.n.c(kd.a.M(num.intValue(), qVar, 0), null, m3.h.j(p2.d(qVar2, 1.0f), 1.25f, 1.25f), null, f4.q.f8839b, t2.u.P, null, qVar, u3.c.$stable | 25008, 104);
                        qVar.p(false);
                    } else {
                        z12 = true;
                        qVar.X(1918934987);
                        qVar.p(false);
                    }
                }
                qVar.p(z12);
                f12 = f14;
            } else {
                qVar.R();
                f12 = f11;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.components.t0
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        sn.z ReadSmallRowAvatar_DzVHIIc$lambda$3;
                        int intValue = ((Integer) obj2).intValue();
                        ReadSmallRowAvatar_DzVHIIc$lambda$3 = ReadSmallRowKt.ReadSmallRowAvatar_DzVHIIc$lambda$3(str, f12, readSource, str2, i10, i11, (u2.m) obj, intValue);
                        return ReadSmallRowAvatar_DzVHIIc$lambda$3;
                    }
                };
                return;
            }
            return;
        }
        f11 = f10;
        if ((i10 & 384) == 0) {
        }
        if ((i10 & 3072) == 0) {
        }
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ReadSmallRowAvatar_DzVHIIc$lambda$1$0(p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.b(b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z ReadSmallRowAvatar_DzVHIIc$lambda$3(String str, float f10, ReadSource readSource, String str2, int i10, int i11, u2.m mVar, int i12) {
        m1092ReadSmallRowAvatarDzVHIIc(str, f10, readSource, str2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z ReadSmallRow_gMrHQkA$lambda$1$0(ho.a aVar, String str, String str2, String str3, p4.b0 b0Var) {
        b0Var.getClass();
        if (aVar != null && str != null) {
            p4.y.i(b0Var, 0);
            p4.y.d(str2 + " - " + str3, b0Var);
            p4.y.e(b0Var, ig.f.H(new p4.f(str, new fm.g(10, aVar))));
        } else {
            p4.y.b(b0Var);
        }
        return sn.z.f31622a;
    }

    public static final boolean ReadSmallRow_gMrHQkA$lambda$1$0$0(ho.a aVar) {
        aVar.invoke();
        return true;
    }

    public static final sn.z ReadSmallRow_gMrHQkA$lambda$2$0$0$0$0(p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.b(b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z ReadSmallRow_gMrHQkA$lambda$2$0$0$1$0(p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.b(b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z ReadSmallRow_gMrHQkA$lambda$3(String str, String str2, String str3, ReadSource readSource, String str4, ho.a aVar, ho.p pVar, float f10, String str5, int i10, int i11, u2.m mVar, int i12) {
        m1091ReadSmallRowgMrHQkA(str, str2, str3, readSource, str4, aVar, pVar, f10, str5, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void ReadSmallShimmeringRow(i3.t tVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        byte b10;
        int i13;
        tVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1049585271);
        if ((i10 & 6) == 0) {
            if (qVar.f(tVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i10 | i13;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.t a10 = fl.h.a(p2.v(tVar, null, 3), qVar);
            r1.u0 u0Var = r1.j.f29228a;
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i14 = EchoTheme.$stable;
            k2 a11 = i2.a(ib.i.y(echoTheme, qVar, i14), i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(a10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a11, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            i3.q qVar2 = i3.q.f13017a;
            i3.t c10 = m3.h.c(p2.o(qVar2, 44), echoTheme.getShapes(qVar, i14).getLg(qVar, EchoThemeShapes.$stable));
            EchoThemeColorResources colorResources = echoTheme.getColorResources(qVar, i14);
            int i15 = EchoThemeColorResources.$stable;
            long alphaGray900 = colorResources.getAlphaGray900(qVar, i15);
            p3.w0 w0Var = p3.h0.f26395b;
            r1.p.a(l1.n.h(c10, alphaGray900, w0Var), qVar, 0);
            r1.x a12 = r1.w.a(r1.j.g(echoTheme.getSpacings(qVar, i14).getX1()), i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c11 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a12, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            b10 = 0;
            r1.p.a(l1.n.h(p2.f(p2.e(qVar2, 0.5f), 12), echoTheme.getColorResources(qVar, i14).getAlphaGray900(qVar, i15), w0Var), qVar, 0);
            r1.p.a(l1.n.h(p2.f(p2.e(qVar2, 0.8f), 10), echoTheme.getColorResources(qVar, i14).getAlphaGray900(qVar, i15), w0Var), qVar, 0);
            i12 = 1;
            qVar.p(true);
            qVar.p(true);
        } else {
            i12 = 1;
            b10 = 0;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a2.e(tVar, i10, i12, b10);
        }
    }

    public static final sn.z ReadSmallShimmeringRow$lambda$1(i3.t tVar, int i10, u2.m mVar, int i11) {
        ReadSmallShimmeringRow(tVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
