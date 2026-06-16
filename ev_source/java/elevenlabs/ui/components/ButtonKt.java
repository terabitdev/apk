package io.elevenlabs.ui.components;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ColorMathKt;
import io.elevenlabs.ui.theme.ColorScheme;
import io.elevenlabs.ui.theme.ElevenLabsColors;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.e5;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aw\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001c²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, d2 = {"", Constants.ScionAnalytics.PARAM_LABEL, "Lkotlin/Function0;", "Lsn/z;", "onPress", "Li3/t;", "modifier", "Lio/elevenlabs/ui/components/ButtonSize;", "size", "Lio/elevenlabs/ui/components/ButtonVariant;", "variant", "", ParameterNames.ICON, "Lio/elevenlabs/ui/components/ButtonIconPosition;", "iconPosition", "", "isLoading", "enabled", "tintIcon", "Button", "(Ljava/lang/String;Lho/a;Li3/t;Lio/elevenlabs/ui/components/ButtonSize;Lio/elevenlabs/ui/components/ButtonVariant;Ljava/lang/Integer;Lio/elevenlabs/ui/components/ButtonIconPosition;ZZZLu2/m;II)V", "Preview_Button", "(Lu2/m;I)V", "Lp3/x;", "finalBackgroundColor", "finalBorderColor", "", "alpha", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ButtonKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ButtonVariant.values().length];
            try {
                iArr[ButtonVariant.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonVariant.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonVariant.Tertiary.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonVariant.Quaternary.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonVariant.DangerLight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonVariant.DangerConfirm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ButtonVariant.Fifthernary.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ButtonVariant.Dark.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonSize.values().length];
            try {
                iArr2[ButtonSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ButtonSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ButtonSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(final String str, final ho.a aVar, i3.t tVar, ButtonSize buttonSize, ButtonVariant buttonVariant, Integer num, ButtonIconPosition buttonIconPosition, boolean z6, boolean z10, boolean z11, u2.m mVar, final int i10, final int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        int ordinal;
        int i15;
        int i16;
        int ordinal2;
        int i17;
        int i18;
        Integer num2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z12;
        u2.q qVar;
        final ButtonSize buttonSize2;
        final ButtonVariant buttonVariant2;
        final ButtonIconPosition buttonIconPosition2;
        final boolean z13;
        final boolean z14;
        final i3.t tVar3;
        final Integer num3;
        final boolean z15;
        u2.r1 r10;
        i3.t tVar4;
        ButtonSize buttonSize3;
        ButtonVariant buttonVariant3;
        Integer num4;
        ButtonIconPosition buttonIconPosition3;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        ButtonIconPosition buttonIconPosition4;
        sn.p pVar;
        sn.k kVar;
        boolean z20;
        u2.s2 s2Var;
        float f10;
        final long j4;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        int i30;
        int i31;
        str.getClass();
        aVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(878652414);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i31 = 4;
            } else {
                i31 = 2;
            }
            i12 = i31 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar)) {
                i30 = 32;
            } else {
                i30 = 16;
            }
            i12 |= i30;
        }
        int i32 = i11 & 4;
        if (i32 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            int i33 = -1;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (buttonSize == null) {
                    ordinal = -1;
                } else {
                    ordinal = buttonSize.ordinal();
                }
                if (qVar2.d(ordinal)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
            }
            i16 = i11 & 16;
            if (i16 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (buttonVariant == null) {
                    ordinal2 = -1;
                } else {
                    ordinal2 = buttonVariant.ordinal();
                }
                if (qVar2.d(ordinal2)) {
                    i17 = 16384;
                } else {
                    i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i17;
            }
            i18 = i11 & 32;
            if (i18 == 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                num2 = num;
                if (qVar2.f(num2)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
                i20 = i11 & 64;
                if (i20 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (buttonIconPosition != null) {
                        i33 = buttonIconPosition.ordinal();
                    }
                    if (qVar2.d(i33)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
                i22 = i11 & 128;
                if (i22 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (qVar2.g(z6)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                }
                i24 = i11 & RpcError.MAX_MESSAGE_BYTES;
                if (i24 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (qVar2.g(z10)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i12 |= i25;
                }
                i26 = i11 & 512;
                if (i26 != 0) {
                    i27 = i26;
                    i28 = i12 | 805306368;
                } else {
                    if ((i10 & 805306368) == 0) {
                        i27 = i26;
                        if (qVar2.g(z11)) {
                            i29 = 536870912;
                        } else {
                            i29 = 268435456;
                        }
                        i12 |= i29;
                    } else {
                        i27 = i26;
                    }
                    i28 = i12;
                }
                if ((i28 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (qVar2.O(i28 & 1, z12)) {
                    i3.q qVar3 = i3.q.f13017a;
                    if (i32 != 0) {
                        tVar4 = qVar3;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i14 != 0) {
                        buttonSize3 = ButtonSize.Large;
                    } else {
                        buttonSize3 = buttonSize;
                    }
                    if (i16 != 0) {
                        buttonVariant3 = ButtonVariant.Primary;
                    } else {
                        buttonVariant3 = buttonVariant;
                    }
                    if (i18 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i20 != 0) {
                        buttonIconPosition3 = ButtonIconPosition.Start;
                    } else {
                        buttonIconPosition3 = buttonIconPosition;
                    }
                    if (i22 != 0) {
                        z16 = false;
                    } else {
                        z16 = z6;
                    }
                    if (i24 != 0) {
                        z17 = true;
                    } else {
                        z17 = z10;
                    }
                    if (i27 != 0) {
                        z18 = true;
                    } else {
                        z18 = z11;
                    }
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    ElevenLabsColors colors = elevenLabsTheme.getColors(qVar2, 6);
                    ColorScheme color = elevenLabsTheme.getColor(qVar2, 6);
                    boolean w6 = l1.n.w(qVar2);
                    switch (WhenMappings.$EnumSwitchMapping$0[buttonVariant3.ordinal()]) {
                        case 1:
                            z19 = z17;
                            buttonIconPosition4 = buttonIconPosition3;
                            pVar = new sn.p(new p3.x(colors.getPrimaryButtonBg()), new p3.x(colors.getPrimaryButtonText()), new p3.x(colors.getPrimaryButtonBorder()));
                            break;
                        case 2:
                            z19 = z17;
                            buttonIconPosition4 = buttonIconPosition3;
                            pVar = new sn.p(new p3.x(colors.getSecondaryButtonBg()), new p3.x(colors.getSecondaryButtonText()), new p3.x(colors.getSecondaryButtonBorder()));
                            break;
                        case 3:
                            z19 = z17;
                            buttonIconPosition4 = buttonIconPosition3;
                            pVar = new sn.p(new p3.x(colors.getTertiaryButtonBg()), new p3.x(colors.getTertiaryButtonText()), new p3.x(colors.getTertiaryButtonBorder()));
                            break;
                        case 4:
                            z19 = z17;
                            buttonIconPosition4 = buttonIconPosition3;
                            pVar = new sn.p(new p3.x(colors.getQuaternaryButtonBg()), new p3.x(colors.getQuaternaryButtonText()), new p3.x(colors.getTertiaryButtonBorder()));
                            break;
                        case 5:
                            z19 = z17;
                            buttonIconPosition4 = buttonIconPosition3;
                            pVar = new sn.p(new p3.x(colors.getDangerLightButtonBg()), new p3.x(colors.getDangerLightButtonText()), new p3.x(colors.getDangerLightButtonBorder()));
                            break;
                        case 6:
                            z19 = z17;
                            buttonIconPosition4 = buttonIconPosition3;
                            pVar = new sn.p(new p3.x(colors.getDangerConfirmButtonBg()), new p3.x(colors.getDangerConfirmButtonText()), new p3.x(colors.getDangerConfirmButtonBorder()));
                            break;
                        case 7:
                            buttonIconPosition4 = buttonIconPosition3;
                            z19 = z17;
                            pVar = new sn.p(new p3.x(colors.getTransparent()), new p3.x(color.getText().m2185getPrimary0d7_KjU()), new p3.x(colors.getDividerLineColor()));
                            break;
                        case 8:
                            buttonIconPosition4 = buttonIconPosition3;
                            pVar = new sn.p(new p3.x(p3.h0.c(1308622847)), new p3.x(p3.x.f26431f), new p3.x(colors.getTransparent()));
                            z19 = z17;
                            break;
                        default:
                            c6.p();
                            return;
                    }
                    long j10 = ((p3.x) pVar.f31610a).f26440a;
                    boolean z26 = z18;
                    long j11 = ((p3.x) pVar.f31611b).f26440a;
                    long j12 = ((p3.x) pVar.f31612c).f26440a;
                    if (!z19) {
                        j10 = ColorMathKt.m1986blendButtonBgColorWithThemeOverlayDxMtmZc(j10, w6);
                    }
                    u2.s2 a10 = i1.w2.a(j10, null, "background_color", qVar2, 384, 10);
                    if (!z19) {
                        j12 = ColorMathKt.m1986blendButtonBgColorWithThemeOverlayDxMtmZc(j12, w6);
                    }
                    u2.s2 a11 = i1.w2.a(j12, null, "border_color", qVar2, 384, 10);
                    int i34 = WhenMappings.$EnumSwitchMapping$1[buttonSize3.ordinal()];
                    if (i34 != 1) {
                        if (i34 != 2) {
                            if (i34 == 3) {
                                qVar2.X(-1723500776);
                                kVar = new sn.k(new h5.f(elevenLabsTheme.getSpacings(qVar2, 6).m2356getX4D9Ej5fM()), new h5.f(elevenLabsTheme.getSpacings(qVar2, 6).m2356getX4D9Ej5fM()));
                                qVar2.p(false);
                            } else {
                                throw com.google.android.gms.internal.play_billing.b.h(-1723507497, qVar2, false);
                            }
                        } else {
                            qVar2.X(-1723503560);
                            sn.k kVar2 = new sn.k(new h5.f(elevenLabsTheme.getSpacings(qVar2, 6).m2356getX4D9Ej5fM()), new h5.f(elevenLabsTheme.getSpacings(qVar2, 6).m2355getX3D9Ej5fM()));
                            qVar2.p(false);
                            kVar = kVar2;
                        }
                    } else {
                        qVar2.X(-1723506376);
                        kVar = new sn.k(new h5.f(elevenLabsTheme.getSpacings(qVar2, 6).m2355getX3D9Ej5fM()), new h5.f(elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM()));
                        qVar2.p(false);
                    }
                    float f11 = ((h5.f) kVar.f31600a).f12083a;
                    float f12 = ((h5.f) kVar.f31601b).f12083a;
                    p3.b1 md = elevenLabsTheme.getShapes(qVar2, 6).getMd();
                    i3.t c5 = m3.h.c(tVar4, md);
                    int i35 = i28 & 14;
                    if (i35 == 4) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    Object L = qVar2.L();
                    i3.t tVar5 = tVar4;
                    u2.e eVar = u2.l.f33918a;
                    if (!z20 && L != eVar) {
                        s2Var = a10;
                    } else {
                        s2Var = a10;
                        L = new g(str, 4);
                        qVar2.h0(L);
                    }
                    i3.t c10 = p4.q.c(c5, true, (ho.l) L);
                    Object L2 = qVar2.L();
                    if (L2 == eVar) {
                        L2 = j0.c.o(qVar2);
                    }
                    boolean z27 = z19;
                    i3.t F = r1.d.F(l1.n.j(1, Button$lambda$1(a11), l1.n.h(l1.n.n(c10, (p1.l) L2, e5.b(t2.u.P, 3, j11, false), z27, new p4.k(0), aVar, 8), Button$lambda$0(s2Var), p3.h0.f26395b), md), f11, f12);
                    f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
                    int hashCode = Long.hashCode(qVar2.T);
                    c3.o l4 = qVar2.l();
                    i3.t c11 = i3.a.c(F, qVar2);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar);
                    } else {
                        qVar2.k0();
                    }
                    h4.e eVar2 = h4.g.f11907f;
                    u2.r.J(eVar2, d10, qVar2);
                    h4.e eVar3 = h4.g.f11906e;
                    u2.r.J(eVar3, l4, qVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar4 = h4.g.f11908g;
                    u2.r.y(qVar2, valueOf, eVar4);
                    h4.d dVar = h4.g.f11909h;
                    u2.r.F(dVar, qVar2);
                    h4.e eVar5 = h4.g.f11905d;
                    u2.r.J(eVar5, c11, qVar2);
                    if (z16) {
                        f10 = t2.u.P;
                    } else {
                        f10 = 1.0f;
                    }
                    u2.s2 b10 = j1.f.b(f10, null, "alpha", qVar2, 3072, 22);
                    r1.f fVar2 = r1.j.f29232e;
                    i3.k kVar3 = i3.d.f13005z0;
                    i3.t a12 = m3.h.a(qVar3, Button$lambda$4$0(b10));
                    r1.k2 a13 = r1.i2.a(fVar2, kVar3, qVar2, 54);
                    int hashCode2 = Long.hashCode(qVar2.T);
                    c3.o l7 = qVar2.l();
                    i3.t c12 = i3.a.c(a12, qVar2);
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar);
                    } else {
                        qVar2.k0();
                    }
                    u2.r.J(eVar2, a13, qVar2);
                    u2.r.J(eVar3, l7, qVar2);
                    defpackage.f.u(hashCode2, qVar2, eVar4, qVar2, dVar);
                    u2.r.J(eVar5, c12, qVar2);
                    ButtonIconPosition buttonIconPosition5 = buttonIconPosition4;
                    if (buttonIconPosition5 == ButtonIconPosition.Start) {
                        qVar2.X(-1191897874);
                        if (num4 != null) {
                            qVar2.X(-1191863712);
                            Button$IconComponent(z26, j11, num4.intValue(), qVar2, (i28 >> 15) & 14);
                            z21 = z26;
                            j4 = j11;
                            r1.d.g(r1.p2.s(qVar3, elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM()), qVar2);
                            z22 = false;
                            qVar2.p(false);
                        } else {
                            j4 = j11;
                            z21 = z26;
                            z22 = false;
                            qVar2.X(-1191727250);
                            qVar2.p(false);
                        }
                        qVar2.p(z22);
                    } else {
                        j4 = j11;
                        z21 = z26;
                        z22 = false;
                        qVar2.X(-1191713362);
                        qVar2.p(false);
                    }
                    j7.d(str, null, j4, 0L, w4.g0.B0, 0L, null, 0L, 0, false, 1, 0, null, elevenLabsTheme.getTypo(qVar2, 6).getBodyLarge700(), qVar2, i35 | 1572864, 24576, 114618);
                    qVar = qVar2;
                    if (buttonIconPosition5 == ButtonIconPosition.End) {
                        qVar.X(-1191415514);
                        if (num4 != null) {
                            qVar.X(-1191381352);
                            if (1.0f <= 0.0d) {
                                s1.a.a("invalid weight; must be greater than zero");
                            }
                            z24 = true;
                            r1.d.g(new r1.m1(1.0f, true), qVar);
                            boolean z28 = z21;
                            Button$IconComponent(z28, j4, num4.intValue(), qVar, (i28 >> 15) & 14);
                            z23 = z28;
                            z25 = false;
                            qVar.p(false);
                        } else {
                            z23 = z21;
                            z25 = false;
                            z24 = true;
                            qVar.X(-1191267954);
                            qVar.p(false);
                        }
                        qVar.p(z25);
                    } else {
                        z23 = z21;
                        z24 = true;
                        qVar.X(-1191254066);
                        qVar.p(false);
                    }
                    qVar.p(z24);
                    boolean z29 = z16;
                    i1.e2.c(z29, null, null, null, null, c3.k.d(-343112096, z24, new ho.q() { // from class: io.elevenlabs.ui.components.s
                        @Override // ho.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            sn.z Button$lambda$4$2;
                            int intValue = ((Integer) obj3).intValue();
                            Button$lambda$4$2 = ButtonKt.Button$lambda$4$2(j4, (i1.g0) obj, (u2.m) obj2, intValue);
                            return Button$lambda$4$2;
                        }
                    }, qVar), qVar, ((i28 >> 21) & 14) | 196608, 30);
                    qVar.p(z24);
                    z13 = z29;
                    buttonIconPosition2 = buttonIconPosition5;
                    z14 = z23;
                    buttonSize2 = buttonSize3;
                    buttonVariant2 = buttonVariant3;
                    num3 = num4;
                    z15 = z27;
                    tVar3 = tVar5;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    buttonSize2 = buttonSize;
                    buttonVariant2 = buttonVariant;
                    buttonIconPosition2 = buttonIconPosition;
                    z13 = z6;
                    z14 = z11;
                    tVar3 = tVar2;
                    num3 = num2;
                    z15 = z10;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.t
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            sn.z Button$lambda$5;
                            Button$lambda$5 = ButtonKt.Button$lambda$5(str, aVar, tVar3, buttonSize2, buttonVariant2, num3, buttonIconPosition2, z13, z15, z14, i10, i11, (u2.m) obj, ((Integer) obj2).intValue());
                            return Button$lambda$5;
                        }
                    };
                    return;
                }
                return;
            }
            num2 = num;
            i20 = i11 & 64;
            if (i20 != 0) {
            }
            i22 = i11 & 128;
            if (i22 != 0) {
            }
            i24 = i11 & RpcError.MAX_MESSAGE_BYTES;
            if (i24 != 0) {
            }
            i26 = i11 & 512;
            if (i26 != 0) {
            }
            if ((i28 & 306783379) != 306783378) {
            }
            if (qVar2.O(i28 & 1, z12)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 8;
        int i332 = -1;
        if (i14 == 0) {
        }
        i16 = i11 & 16;
        if (i16 == 0) {
        }
        i18 = i11 & 32;
        if (i18 == 0) {
        }
        num2 = num;
        i20 = i11 & 64;
        if (i20 != 0) {
        }
        i22 = i11 & 128;
        if (i22 != 0) {
        }
        i24 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i24 != 0) {
        }
        i26 = i11 & 512;
        if (i26 != 0) {
        }
        if ((i28 & 306783379) != 306783378) {
        }
        if (qVar2.O(i28 & 1, z12)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final void Button$IconComponent(boolean z6, long j4, int i10, u2.m mVar, int i11) {
        p3.n nVar;
        i3.t o6 = r1.p2.o(i3.q.f13017a, 20);
        u3.c M = kd.a.M(i10, mVar, i11 & 14);
        if (z6) {
            nVar = new p3.n(j4, 5);
        } else {
            nVar = null;
        }
        l1.n.c(M, null, o6, null, null, t2.u.P, nVar, mVar, u3.c.$stable | 432, 56);
    }

    private static final long Button$lambda$0(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    private static final long Button$lambda$1(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    public static final sn.z Button$lambda$2$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 0);
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    private static final float Button$lambda$4$0(u2.s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z Button$lambda$4$2(long j4, i1.g0 g0Var, u2.m mVar, int i10) {
        g0Var.getClass();
        LoaderKt.m1840LoadereopBjH0(r1.p2.o(i3.q.f13017a, 20), j4, 0L, null, mVar, 6, 12);
        return sn.z.f31622a;
    }

    public static final sn.z Button$lambda$5(String str, ho.a aVar, i3.t tVar, ButtonSize buttonSize, ButtonVariant buttonVariant, Integer num, ButtonIconPosition buttonIconPosition, boolean z6, boolean z10, boolean z11, int i10, int i11, u2.m mVar, int i12) {
        Button(str, aVar, tVar, buttonSize, buttonVariant, num, buttonIconPosition, z6, z10, z11, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_Button(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1745470586);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            l1.f2 x10 = l1.n.x(qVar);
            i3.q qVar2 = i3.q.f13017a;
            i3.t E = r1.d.E(l1.n.y(qVar2, x10, true, true), 10);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
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
            qVar.X(385920659);
            tn.e eVar = (tn.e) ButtonVariant.getEntries();
            eVar.getClass();
            g1.a1 a1Var = new g1.a1(eVar, 9);
            while (a1Var.hasNext()) {
                ButtonVariant buttonVariant = (ButtonVariant) a1Var.next();
                qVar.X(385922292);
                tn.e eVar2 = (tn.e) ButtonSize.getEntries();
                eVar2.getClass();
                g1.a1 a1Var2 = new g1.a1(eVar2, 9);
                while (a1Var2.hasNext()) {
                    ButtonSize buttonSize = (ButtonSize) a1Var2.next();
                    qVar.X(385923859);
                    tn.e eVar3 = (tn.e) ButtonIconPosition.getEntries();
                    eVar3.getClass();
                    g1.a1 a1Var3 = new g1.a1(eVar3, 9);
                    while (a1Var3.hasNext()) {
                        ButtonIconPosition buttonIconPosition = (ButtonIconPosition) a1Var3.next();
                        String str = "Button " + buttonVariant + Separators.SLASH + buttonSize;
                        int i11 = R.drawable.apple;
                        Object L = qVar.L();
                        u2.e eVar4 = u2.l.f33918a;
                        if (L == eVar4) {
                            L = new a(7);
                            qVar.h0(L);
                        }
                        g1.a1 a1Var4 = a1Var3;
                        i3.q qVar3 = qVar2;
                        g1.a1 a1Var5 = a1Var;
                        g1.a1 a1Var6 = a1Var2;
                        ButtonSize buttonSize2 = buttonSize;
                        Button(str, (ho.a) L, null, buttonSize2, buttonVariant, Integer.valueOf(i11), buttonIconPosition, false, false, false, qVar, 48, 900);
                        float f10 = 4;
                        r1.p.a(r1.p2.f(qVar3, f10), qVar, 6);
                        String str2 = "Button " + buttonVariant + Separators.SLASH + buttonSize2;
                        int i12 = R.drawable.apple;
                        Object L2 = qVar.L();
                        if (L2 == eVar4) {
                            L2 = new a(8);
                            qVar.h0(L2);
                        }
                        Button(str2, (ho.a) L2, null, buttonSize2, buttonVariant, Integer.valueOf(i12), buttonIconPosition, true, false, false, qVar, 12582960, 772);
                        r1.p.a(r1.p2.f(qVar3, f10), qVar, 6);
                        i3.t e10 = r1.p2.e(qVar3, 1.0f);
                        String str3 = "Button " + buttonVariant + Separators.SLASH + buttonSize2;
                        int i13 = R.drawable.apple;
                        Object L3 = qVar.L();
                        if (L3 == eVar4) {
                            L3 = new a(9);
                            qVar.h0(L3);
                        }
                        Button(str3, (ho.a) L3, e10, buttonSize2, buttonVariant, Integer.valueOf(i13), buttonIconPosition, true, false, false, qVar, 12583344, 768);
                        r1.p.a(r1.p2.f(qVar3, f10), qVar, 6);
                        buttonSize = buttonSize2;
                        qVar2 = qVar3;
                        a1Var3 = a1Var4;
                        a1Var = a1Var5;
                        a1Var2 = a1Var6;
                    }
                    qVar.p(false);
                }
                qVar.p(false);
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 26);
        }
    }

    public static final sn.z Preview_Button$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Button(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
