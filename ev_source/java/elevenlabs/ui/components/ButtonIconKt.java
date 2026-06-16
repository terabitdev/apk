package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import io.elevenlabs.ui.theme.ColorScheme;
import io.elevenlabs.ui.theme.ElevenLabsColors;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.e5;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ak\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001ak\u0010\u0011\u001a\u00020\u00052\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", ParameterNames.ICON, "", "accessibilityLabel", "Lkotlin/Function0;", "Lsn/z;", "onPress", "Li3/t;", "modifier", "Lio/elevenlabs/ui/components/ButtonIconVariant;", "variant", "Lio/elevenlabs/ui/components/ButtonIconSize;", "size", "", "isLoading", "enabled", "tintIcon", "ButtonIcon", "(ILjava/lang/String;Lho/a;Li3/t;Lio/elevenlabs/ui/components/ButtonIconVariant;Lio/elevenlabs/ui/components/ButtonIconSize;ZZZLu2/m;II)V", "Lkotlin/Function1;", "Lp3/x;", "(Lho/q;Ljava/lang/String;Lho/a;Li3/t;Lio/elevenlabs/ui/components/ButtonIconVariant;Lio/elevenlabs/ui/components/ButtonIconSize;ZZLu2/m;II)V", "Preview_ButtonIcon", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ButtonIconKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ButtonIconSize.values().length];
            try {
                iArr[ButtonIconSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonIconSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonIconSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonIconSize.Huge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonIconVariant.values().length];
            try {
                iArr2[ButtonIconVariant.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ButtonIconVariant.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ButtonIconVariant.Transparent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ButtonIconVariant.TransparentInverted.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ButtonIconVariant.Tertiary.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ButtonIconVariant.Quaternary.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ButtonIconVariant.Square.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ButtonIconVariant.Menu.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ButtonIconVariant.ShareDetails.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonIcon(ho.q qVar, String str, ho.a aVar, i3.t tVar, ButtonIconVariant buttonIconVariant, ButtonIconSize buttonIconSize, boolean z6, boolean z10, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        int ordinal;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z11;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z12;
        ButtonIconVariant buttonIconVariant2;
        boolean z13;
        u2.q qVar2;
        i3.t tVar3;
        boolean z14;
        ButtonIconSize buttonIconSize2;
        u2.r1 r10;
        ButtonIconVariant buttonIconVariant3;
        ButtonIconSize buttonIconSize3;
        boolean z15;
        boolean z16;
        ButtonIconVariant buttonIconVariant4;
        sn.p pVar;
        int i23;
        p3.b1 full;
        float f10;
        boolean z17;
        int i24;
        int i25;
        int i26;
        qVar.getClass();
        str.getClass();
        aVar.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(1106396519);
        if ((i10 & 6) == 0) {
            if (qVar3.h(qVar)) {
                i26 = 4;
            } else {
                i26 = 2;
            }
            i12 = i26 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.f(str)) {
                i25 = 32;
            } else {
                i25 = 16;
            }
            i12 |= i25;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.h(aVar)) {
                i24 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i24 = 128;
            }
            i12 |= i24;
        }
        int i27 = i11 & 8;
        if (i27 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar3.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            int i28 = -1;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (buttonIconVariant == null) {
                    ordinal = -1;
                } else {
                    ordinal = buttonIconVariant.ordinal();
                }
                if (qVar3.d(ordinal)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
            }
            i16 = i11 & 32;
            if (i16 == 0) {
                i12 |= 196608;
            } else if ((196608 & i10) == 0) {
                if (buttonIconSize != null) {
                    i28 = buttonIconSize.ordinal();
                }
                if (qVar3.d(i28)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            i18 = i11 & 64;
            if (i18 == 0) {
                i12 |= 1572864;
            } else if ((1572864 & i10) == 0) {
                z11 = z6;
                if (qVar3.g(z11)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
                i20 = i11 & 128;
                if (i20 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (qVar3.g(z10)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (qVar3.O(i22 & 1, z12)) {
                    i3.q qVar4 = i3.q.f13017a;
                    if (i27 != 0) {
                        tVar3 = qVar4;
                    } else {
                        tVar3 = tVar2;
                    }
                    if (i14 != 0) {
                        buttonIconVariant3 = ButtonIconVariant.Primary;
                    } else {
                        buttonIconVariant3 = buttonIconVariant;
                    }
                    if (i16 != 0) {
                        buttonIconSize3 = ButtonIconSize.Large;
                    } else {
                        buttonIconSize3 = buttonIconSize;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i20 != 0) {
                        z16 = true;
                    } else {
                        z16 = z10;
                    }
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    ElevenLabsColors colors = elevenLabsTheme.getColors(qVar3, 6);
                    ColorScheme color = elevenLabsTheme.getColor(qVar3, 6);
                    int[] iArr = WhenMappings.$EnumSwitchMapping$1;
                    switch (iArr[buttonIconVariant3.ordinal()]) {
                        case 1:
                            buttonIconVariant4 = buttonIconVariant3;
                            pVar = new sn.p(new p3.x(colors.getPrimaryButtonBg()), new p3.x(colors.getPrimaryButtonText()), new p3.x(colors.getPrimaryButtonBorder()));
                            break;
                        case 2:
                            buttonIconVariant4 = buttonIconVariant3;
                            pVar = new sn.p(new p3.x(colors.getSecondaryButtonBg()), new p3.x(colors.getSecondaryButtonText()), new p3.x(colors.getSecondaryButtonBorder()));
                            break;
                        case 3:
                            buttonIconVariant4 = buttonIconVariant3;
                            pVar = new sn.p(new p3.x(colors.getTransparentButtonBg()), new p3.x(colors.getTransparentButtonText()), new p3.x(colors.getTransparentButtonBorder()));
                            break;
                        case 4:
                            buttonIconVariant4 = buttonIconVariant3;
                            pVar = new sn.p(new p3.x(colors.getTransparentInvertedButtonBg()), new p3.x(colors.getTransparentInvertedButtonText()), new p3.x(colors.getTransparentInvertedButtonBorder()));
                            break;
                        case 5:
                            buttonIconVariant4 = buttonIconVariant3;
                            pVar = new sn.p(new p3.x(colors.getTertiaryButtonBg()), new p3.x(colors.getTertiaryButtonText()), new p3.x(colors.getTertiaryButtonBorder()));
                            break;
                        case 6:
                            buttonIconVariant4 = buttonIconVariant3;
                            pVar = new sn.p(new p3.x(colors.getQuaternaryButtonBg()), new p3.x(colors.getQuaternaryButtonText()), new p3.x(colors.getTransparent()));
                            break;
                        case 7:
                            buttonIconVariant4 = buttonIconVariant3;
                            pVar = new sn.p(new p3.x(colors.getTransparent()), new p3.x(color.getText().m2185getPrimary0d7_KjU()), new p3.x(colors.getDividerLineColor()));
                            break;
                        case 8:
                            buttonIconVariant4 = buttonIconVariant3;
                            pVar = new sn.p(new p3.x(colors.getSecondaryButtonBg()), new p3.x(colors.getSecondaryButtonText()), new p3.x(colors.getTransparent()));
                            break;
                        case 9:
                            buttonIconVariant4 = buttonIconVariant3;
                            pVar = new sn.p(new p3.x(colors.getShareDetailsActionBackground()), new p3.x(colors.getShareDetailsPrimaryText()), new p3.x(colors.getTransparent()));
                            break;
                        default:
                            c6.p();
                            return;
                    }
                    long j4 = ((p3.x) pVar.f31610a).f26440a;
                    long j10 = ((p3.x) pVar.f31611b).f26440a;
                    long j11 = ((p3.x) pVar.f31612c).f26440a;
                    int i29 = WhenMappings.$EnumSwitchMapping$0[buttonIconSize3.ordinal()];
                    if (i29 != 1) {
                        if (i29 != 2) {
                            if (i29 != 3) {
                                if (i29 == 4) {
                                    i23 = 56;
                                } else {
                                    c6.p();
                                    return;
                                }
                            } else {
                                i23 = 48;
                            }
                        } else {
                            i23 = 44;
                        }
                    } else {
                        i23 = 36;
                    }
                    float f11 = i23;
                    if (iArr[buttonIconVariant4.ordinal()] == 7) {
                        qVar3.X(-1904751543);
                        full = elevenLabsTheme.getShapes(qVar3, 6).getMd();
                        qVar3.p(false);
                    } else {
                        qVar3.X(-1904750197);
                        full = elevenLabsTheme.getShapes(qVar3, 6).getFull();
                        qVar3.p(false);
                    }
                    i3.t o6 = r1.p2.o(l1.n.j(1, j11, l1.n.h(m3.h.c(tVar3, full), j4, p3.h0.f26395b), full), f11);
                    if (z16) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.3f;
                    }
                    i3.t a10 = m3.h.a(o6, ((Number) j1.f.b(f10, null, "opacity", qVar3, 3072, 22).getValue()).floatValue());
                    if ((i22 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    Object L = qVar3.L();
                    u2.e eVar = u2.l.f33918a;
                    if (z17 || L == eVar) {
                        L = new g(str, 3);
                        qVar3.h0(L);
                    }
                    i3.t c5 = p4.q.c(a10, true, (ho.l) L);
                    Object L2 = qVar3.L();
                    if (L2 == eVar) {
                        L2 = j0.c.o(qVar3);
                    }
                    i3.t n2 = l1.n.n(c5, (p1.l) L2, e5.b(t2.u.P, 3, j10, false), z16, new p4.k(0), aVar, 8);
                    boolean z18 = z16;
                    r1.k2 a11 = r1.i2.a(r1.j.f29232e, i3.d.f13005z0, qVar3, 54);
                    int hashCode = Long.hashCode(qVar3.T);
                    c3.o l4 = qVar3.l();
                    i3.t c10 = i3.a.c(n2, qVar3);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar3.b0();
                    if (qVar3.S) {
                        qVar3.k(fVar);
                    } else {
                        qVar3.k0();
                    }
                    u2.r.J(h4.g.f11907f, a11, qVar3);
                    u2.r.J(h4.g.f11906e, l4, qVar3);
                    u2.r.y(qVar3, Integer.valueOf(hashCode), h4.g.f11908g);
                    u2.r.F(h4.g.f11909h, qVar3);
                    u2.r.J(h4.g.f11905d, c10, qVar3);
                    if (z15) {
                        qVar3.X(237968);
                        LoaderKt.m1840LoadereopBjH0(r1.p2.o(qVar4, 20), j10, 0L, null, qVar3, 6, 12);
                        qVar3.p(false);
                    } else {
                        qVar3.X(375050);
                        qVar.invoke(new p3.x(j10), qVar3, Integer.valueOf((i22 << 3) & 112));
                        qVar3.p(false);
                    }
                    qVar3.p(true);
                    z13 = z18;
                    qVar2 = qVar3;
                    buttonIconSize2 = buttonIconSize3;
                    z14 = z15;
                    buttonIconVariant2 = buttonIconVariant4;
                } else {
                    qVar3.R();
                    buttonIconVariant2 = buttonIconVariant;
                    z13 = z10;
                    qVar2 = qVar3;
                    tVar3 = tVar2;
                    z14 = z11;
                    buttonIconSize2 = buttonIconSize;
                }
                r10 = qVar2.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.m(qVar, str, aVar, tVar3, buttonIconVariant2, buttonIconSize2, z14, z13, i10, i11);
                    return;
                }
                return;
            }
            z11 = z6;
            i20 = i11 & 128;
            if (i20 != 0) {
            }
            i22 = i12;
            if ((i12 & 4793491) != 4793490) {
            }
            if (qVar3.O(i22 & 1, z12)) {
            }
            r10 = qVar2.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 16;
        int i282 = -1;
        if (i14 == 0) {
        }
        i16 = i11 & 32;
        if (i16 == 0) {
        }
        i18 = i11 & 64;
        if (i18 == 0) {
        }
        z11 = z6;
        i20 = i11 & 128;
        if (i20 != 0) {
        }
        i22 = i12;
        if ((i12 & 4793491) != 4793490) {
        }
        if (qVar3.O(i22 & 1, z12)) {
        }
        r10 = qVar2.r();
        if (r10 != null) {
        }
    }

    public static final sn.z ButtonIcon$lambda$1(int i10, String str, ho.a aVar, i3.t tVar, ButtonIconVariant buttonIconVariant, ButtonIconSize buttonIconSize, boolean z6, boolean z10, boolean z11, int i11, int i12, u2.m mVar, int i13) {
        ButtonIcon(i10, str, aVar, tVar, buttonIconVariant, buttonIconSize, z6, z10, z11, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    public static final sn.z ButtonIcon$lambda$2$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z ButtonIcon$lambda$5(ho.q qVar, String str, ho.a aVar, i3.t tVar, ButtonIconVariant buttonIconVariant, ButtonIconSize buttonIconSize, boolean z6, boolean z10, int i10, int i11, u2.m mVar, int i12) {
        ButtonIcon(qVar, str, aVar, tVar, buttonIconVariant, buttonIconSize, z6, z10, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ButtonIcon(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-32850476);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r1.d.b(r1.d.E(l1.n.y(i3.q.f13017a, l1.n.x(qVar), true, true), 10), null, null, null, 0, 0, ComposableSingletons$ButtonIconKt.INSTANCE.m1796getLambda$1964299783$ui_release(), qVar, 1572864, 62);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 25);
        }
    }

    public static final sn.z Preview_ButtonIcon$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ButtonIcon(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonIcon(final int i10, String str, ho.a aVar, i3.t tVar, ButtonIconVariant buttonIconVariant, ButtonIconSize buttonIconSize, boolean z6, boolean z10, boolean z11, u2.m mVar, int i11, int i12) {
        int i13;
        i3.t tVar2;
        int i14;
        int i15;
        int i16;
        boolean z12;
        int i17;
        int i18;
        int i19;
        int i20;
        u2.q qVar;
        ButtonIconVariant buttonIconVariant2;
        boolean z13;
        boolean z14;
        i3.t tVar3;
        boolean z15;
        ButtonIconSize buttonIconSize2;
        u2.r1 r10;
        int i21;
        i3.t tVar4;
        float f10;
        str.getClass();
        aVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-788996160);
        if ((i11 & 6) == 0) {
            i13 = (qVar2.d(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= qVar2.f(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= qVar2.h(aVar) ? RpcError.MAX_MESSAGE_BYTES : 128;
        }
        int i22 = i12 & 8;
        if (i22 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            tVar2 = tVar;
            i13 |= qVar2.f(tVar2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            i14 = i12 & 16;
            if (i14 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i13 |= qVar2.d(buttonIconVariant == null ? -1 : buttonIconVariant.ordinal()) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i15 = i12 & 32;
            if (i15 == 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                i13 |= qVar2.d(buttonIconSize != null ? buttonIconSize.ordinal() : -1) ? 131072 : 65536;
            }
            i16 = i12 & 64;
            if (i16 == 0) {
                i13 |= 1572864;
                z12 = z6;
            } else {
                z12 = z6;
                if ((i11 & 1572864) == 0) {
                    i13 |= qVar2.g(z12) ? 1048576 : 524288;
                }
            }
            i17 = i12 & 128;
            if (i17 == 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                i13 |= qVar2.g(z10) ? 8388608 : 4194304;
            }
            i18 = i12 & RpcError.MAX_MESSAGE_BYTES;
            if (i18 == 0) {
                i20 = i13 | 100663296;
            } else {
                if ((i11 & 100663296) == 0) {
                    i19 = i13 | (qVar2.g(z11) ? 67108864 : 33554432);
                } else {
                    i19 = i13;
                }
                i20 = i19;
            }
            if (!qVar2.O(i20 & 1, (i20 & 38347923) == 38347922)) {
                if (i22 != 0) {
                    tVar4 = i3.q.f13017a;
                    i21 = i18;
                } else {
                    i21 = i18;
                    tVar4 = tVar2;
                }
                ButtonIconVariant buttonIconVariant3 = i14 != 0 ? ButtonIconVariant.Primary : buttonIconVariant;
                ButtonIconSize buttonIconSize3 = i15 != 0 ? ButtonIconSize.Large : buttonIconSize;
                boolean z16 = i16 != 0 ? false : z12;
                boolean z17 = i17 != 0 ? true : z10;
                final boolean z18 = i21 != 0 ? true : z11;
                int i23 = 458752 & i20;
                boolean z19 = i23 == 131072;
                Object L = qVar2.L();
                if (z19 || L == u2.l.f33918a) {
                    int i24 = WhenMappings.$EnumSwitchMapping$0[buttonIconSize3.ordinal()];
                    if (i24 == 1) {
                        f10 = 16;
                    } else {
                        if (i24 != 2 && i24 != 3 && i24 != 4) {
                            c6.p();
                            return;
                        }
                        f10 = 20;
                    }
                    L = new h5.f(f10);
                    qVar2.h0(L);
                }
                final float f11 = ((h5.f) L).f12083a;
                qVar = qVar2;
                ButtonIcon(c3.k.d(-948200757, true, new ho.q() { // from class: io.elevenlabs.ui.components.ButtonIconKt$ButtonIcon$1
                    @Override // ho.q
                    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        m1781invokeek8zF_U(((p3.x) obj).f26440a, (u2.m) obj2, ((Number) obj3).intValue());
                        return sn.z.f31622a;
                    }

                    /* renamed from: invoke-ek8zF_U, reason: not valid java name */
                    public final void m1781invokeek8zF_U(long j4, u2.m mVar2, int i25) {
                        int i26;
                        boolean z20;
                        p3.n nVar;
                        int i27;
                        if ((i25 & 6) == 0) {
                            if (((u2.q) mVar2).e(j4)) {
                                i27 = 4;
                            } else {
                                i27 = 2;
                            }
                            i26 = i25 | i27;
                        } else {
                            i26 = i25;
                        }
                        if ((i26 & 19) != 18) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        u2.q qVar3 = (u2.q) mVar2;
                        if (qVar3.O(i26 & 1, z20)) {
                            i3.t o6 = r1.p2.o(i3.q.f13017a, f11);
                            u3.c M = kd.a.M(i10, qVar3, 0);
                            if (z18) {
                                nVar = new p3.n(j4, 5);
                            } else {
                                nVar = null;
                            }
                            l1.n.c(M, null, o6, null, null, t2.u.P, nVar, qVar3, u3.c.$stable | 48, 56);
                            return;
                        }
                        qVar3.R();
                    }
                }, qVar2), str, aVar, tVar4, buttonIconVariant3, buttonIconSize3, z16, z17, qVar, (i20 & 112) | 6 | (i20 & 896) | (i20 & 7168) | (57344 & i20) | i23 | (3670016 & i20) | (i20 & 29360128), 0);
                z14 = z18;
                tVar3 = tVar4;
                buttonIconVariant2 = buttonIconVariant3;
                buttonIconSize2 = buttonIconSize3;
                z15 = z16;
                z13 = z17;
            } else {
                qVar = qVar2;
                qVar.R();
                buttonIconVariant2 = buttonIconVariant;
                z13 = z10;
                z14 = z11;
                tVar3 = tVar2;
                z15 = z12;
                buttonIconSize2 = buttonIconSize;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new r(i10, str, aVar, tVar3, buttonIconVariant2, buttonIconSize2, z15, z13, z14, i11, i12);
                return;
            }
            return;
        }
        tVar2 = tVar;
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        i15 = i12 & 32;
        if (i15 == 0) {
        }
        i16 = i12 & 64;
        if (i16 == 0) {
        }
        i17 = i12 & 128;
        if (i17 == 0) {
        }
        i18 = i12 & RpcError.MAX_MESSAGE_BYTES;
        if (i18 == 0) {
        }
        if (!qVar2.O(i20 & 1, (i20 & 38347923) == 38347922)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }
}
