package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.e5;
import q2.y4;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001ao\u0010\u0011\u001a\u00020\u00032\b\b\u0001\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u000f\u0010\u0017\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u000f\u0010\u0018\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0018\u0010\u0014\u001a\u000f\u0010\u0019\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0019\u0010\u0014\u001a\u000f\u0010\u001a\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u0014¨\u0006\"²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001d\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001e\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020\u001f8\nX\u008a\u0084\u0002"}, d2 = {"", ParameterNames.ICON, "Lkotlin/Function0;", "Lsn/z;", "onClick", "Li3/t;", "modifier", "", "contentDescription", "Lio/elevenlabs/ui/components/EchoButtonVariant;", "variant", "Lio/elevenlabs/ui/components/EchoButtonSize;", "size", "", "enabled", "loading", "tintIcon", "EchoIconButton", "(ILho/a;Li3/t;Ljava/lang/String;Lio/elevenlabs/ui/components/EchoButtonVariant;Lio/elevenlabs/ui/components/EchoButtonSize;ZZZLu2/m;II)V", "EchoIconButtonExtraSmallSizePreview", "(Lu2/m;I)V", "EchoIconButtonSmallSizePreview", "EchoIconButtonMediumSizePreview", "EchoIconButtonLargeSizePreview", "EchoIconButtonDarkThemePreview", "EchoIconButtonStatesPreview", "EchoIconButtonVariantsPreview", "Lp3/x;", "backgroundColor", "foregroundColor", "borderColor", "", "contentAlpha", "spinnerAlpha", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EchoIconButtonKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EchoButtonVariant.values().length];
            try {
                iArr[EchoButtonVariant.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EchoButtonVariant.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EchoButtonVariant.Ghost.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EchoButtonVariant.GhostTertiary.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EchoButtonVariant.GhostWhite.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EchoButtonVariant.Border.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EchoButtonVariant.Critical.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EchoButtonVariant.SecondaryWhite.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EchoButtonSize.values().length];
            try {
                iArr2[EchoButtonSize.ExtraSmall.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EchoButtonSize.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EchoButtonSize.Medium.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EchoButtonSize.Large.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x016a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EchoIconButton(int i10, ho.a aVar, i3.t tVar, String str, EchoButtonVariant echoButtonVariant, EchoButtonSize echoButtonSize, boolean z6, boolean z10, boolean z11, u2.m mVar, int i11, int i12) {
        int i13;
        i3.t tVar2;
        int i14;
        int i15;
        String str2;
        int i16;
        int i17;
        int ordinal;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z12;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z13;
        int i29;
        EchoButtonVariant echoButtonVariant2;
        EchoButtonSize echoButtonSize2;
        boolean z14;
        i3.t tVar3;
        boolean z15;
        String str3;
        boolean z16;
        u2.r1 r10;
        String str4;
        EchoButtonVariant echoButtonVariant3;
        EchoButtonSize echoButtonSize3;
        boolean z17;
        boolean z18;
        i3.t tVar4;
        EchoButtonVariant echoButtonVariant4;
        boolean z19;
        boolean z20;
        sn.p pVar;
        sn.p pVar2;
        int i30;
        float f10;
        int i31;
        float x42;
        boolean z21;
        boolean z22;
        boolean z23;
        i3.t tVar5;
        float f11;
        p3.n nVar;
        int i32;
        boolean z24;
        sn.p pVar3;
        boolean z25;
        int i33;
        int i34;
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1679700610);
        if ((i11 & 6) == 0) {
            if (qVar.d(i10)) {
                i34 = 4;
            } else {
                i34 = 2;
            }
            i13 = i34 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar.h(aVar)) {
                i33 = 32;
            } else {
                i33 = 16;
            }
            i13 |= i33;
        }
        int i35 = i12 & 4;
        if (i35 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i13 |= i14;
            i15 = i12 & 8;
            if (i15 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                str2 = str;
                if (qVar.f(str2)) {
                    i16 = 2048;
                } else {
                    i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i13 |= i16;
                i17 = i12 & 16;
                int i36 = -1;
                if (i17 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    if (echoButtonVariant == null) {
                        ordinal = -1;
                    } else {
                        ordinal = echoButtonVariant.ordinal();
                    }
                    if (qVar.d(ordinal)) {
                        i18 = 16384;
                    } else {
                        i18 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 32;
                if (i19 != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (echoButtonSize != null) {
                        i36 = echoButtonSize.ordinal();
                    }
                    if (qVar.d(i36)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 64;
                if (i21 != 0) {
                    i13 |= 1572864;
                    z12 = z6;
                } else {
                    z12 = z6;
                    if ((i11 & 1572864) == 0) {
                        if (qVar.g(z12)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i13 |= i22;
                    }
                }
                i23 = i12 & 128;
                if (i23 != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (qVar.g(z10)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i13 |= i24;
                }
                int i37 = i13;
                i25 = i12 & RpcError.MAX_MESSAGE_BYTES;
                if (i25 != 0) {
                    i37 |= 100663296;
                    i26 = i25;
                } else if ((i11 & 100663296) == 0) {
                    i26 = i25;
                    if (qVar.g(z11)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i37 |= i27;
                } else {
                    i26 = i25;
                }
                i28 = i37;
                if ((i28 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (qVar.O(i28 & 1, z13)) {
                    i3.q qVar2 = i3.q.f13017a;
                    if (i35 != 0) {
                        tVar2 = qVar2;
                    }
                    if (i15 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i17 != 0) {
                        echoButtonVariant3 = EchoButtonVariant.Primary;
                    } else {
                        echoButtonVariant3 = echoButtonVariant;
                    }
                    if (i19 != 0) {
                        echoButtonSize3 = EchoButtonSize.Medium;
                    } else {
                        echoButtonSize3 = echoButtonSize;
                    }
                    if (i21 != 0) {
                        z12 = true;
                    }
                    if (i23 != 0) {
                        z17 = false;
                    } else {
                        z17 = z10;
                    }
                    if (i26 != 0) {
                        z18 = true;
                    } else {
                        z18 = z11;
                    }
                    if (z12) {
                        qVar.X(-702562743);
                        switch (WhenMappings.$EnumSwitchMapping$0[echoButtonVariant3.ordinal()]) {
                            case 1:
                                tVar4 = tVar2;
                                echoButtonVariant4 = echoButtonVariant3;
                                z19 = z12;
                                z24 = false;
                                qVar.X(-715399489);
                                EchoTheme echoTheme = EchoTheme.INSTANCE;
                                pVar2 = new sn.p(new p3.x(echoTheme.getColors(qVar, 6).getFill().getPrimary(qVar, 0)), new p3.x(echoTheme.getColors(qVar, 6).getText().getOnFillPrimary(qVar, 0)), new p3.x(p3.x.f26437l));
                                qVar.p(false);
                                qVar.p(z24);
                                break;
                            case 2:
                                tVar4 = tVar2;
                                echoButtonVariant4 = echoButtonVariant3;
                                z19 = z12;
                                z24 = false;
                                qVar.X(-715394243);
                                EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                                pVar2 = new sn.p(new p3.x(echoTheme2.getColors(qVar, 6).getFill().getDenaryAlpha(qVar, 0)), new p3.x(ib.i.v(6, 0, echoTheme2, qVar, qVar)), new p3.x(p3.x.f26437l));
                                qVar.p(false);
                                qVar.p(z24);
                                break;
                            case 3:
                                tVar4 = tVar2;
                                echoButtonVariant4 = echoButtonVariant3;
                                z19 = z12;
                                z24 = false;
                                qVar.X(-715389203);
                                long j4 = p3.x.f26437l;
                                pVar2 = new sn.p(new p3.x(j4), new p3.x(ib.i.v(6, 0, EchoTheme.INSTANCE, qVar, qVar)), new p3.x(j4));
                                qVar.p(false);
                                qVar.p(z24);
                                break;
                            case 4:
                                tVar4 = tVar2;
                                echoButtonVariant4 = echoButtonVariant3;
                                z19 = z12;
                                z24 = false;
                                qVar.X(-715384402);
                                long j10 = p3.x.f26437l;
                                pVar2 = new sn.p(new p3.x(j10), new p3.x(ib.i.B(6, 0, EchoTheme.INSTANCE, qVar, qVar)), new p3.x(j10));
                                qVar.p(false);
                                qVar.p(z24);
                                break;
                            case 5:
                                tVar4 = tVar2;
                                echoButtonVariant4 = echoButtonVariant3;
                                z24 = false;
                                qVar.X(-715379661);
                                long j11 = p3.x.f26437l;
                                z19 = z12;
                                pVar2 = new sn.p(new p3.x(j11), new p3.x(EchoTheme.INSTANCE.getColorResources(qVar, 6).getSolidWhite(qVar, 0)), new p3.x(j11));
                                qVar.p(false);
                                qVar.p(z24);
                                break;
                            case 6:
                                qVar.X(-715374881);
                                p3.x xVar = new p3.x(p3.x.f26437l);
                                EchoTheme echoTheme3 = EchoTheme.INSTANCE;
                                tVar4 = tVar2;
                                echoButtonVariant4 = echoButtonVariant3;
                                z24 = false;
                                pVar2 = new sn.p(xVar, new p3.x(ib.i.v(6, 0, echoTheme3, qVar, qVar)), new p3.x(echoTheme3.getColors(qVar, 6).getBorder().getSenaryAlpha(qVar, 0)));
                                qVar.p(false);
                                z19 = z12;
                                qVar.p(z24);
                                break;
                            case 7:
                                qVar.X(-715369649);
                                EchoTheme echoTheme4 = EchoTheme.INSTANCE;
                                pVar3 = new sn.p(new p3.x(echoTheme4.getColors(qVar, 6).getFill().getCriticalPrimary(qVar, 0)), new p3.x(echoTheme4.getColors(qVar, 6).getText().getOnFillPrimaryCritical(qVar, 0)), new p3.x(p3.x.f26437l));
                                z25 = false;
                                qVar.p(false);
                                tVar4 = tVar2;
                                echoButtonVariant4 = echoButtonVariant3;
                                z19 = z12;
                                pVar2 = pVar3;
                                z24 = z25;
                                qVar.p(z24);
                                break;
                            case 8:
                                qVar.X(-715363742);
                                EchoTheme echoTheme5 = EchoTheme.INSTANCE;
                                pVar3 = new sn.p(new p3.x(echoTheme5.getColors(qVar, 6).getFill().getWhiteSenary(qVar, 0)), new p3.x(echoTheme5.getColors(qVar, 6).getText().getWhitePrimary(qVar, 0)), new p3.x(p3.x.f26437l));
                                z25 = false;
                                qVar.p(false);
                                tVar4 = tVar2;
                                echoButtonVariant4 = echoButtonVariant3;
                                z19 = z12;
                                pVar2 = pVar3;
                                z24 = z25;
                                qVar.p(z24);
                                break;
                            default:
                                throw com.google.android.gms.internal.play_billing.b.h(-715399975, qVar, false);
                        }
                    } else {
                        tVar4 = tVar2;
                        echoButtonVariant4 = echoButtonVariant3;
                        z19 = z12;
                        qVar.X(-701277576);
                        int i38 = WhenMappings.$EnumSwitchMapping$0[echoButtonVariant4.ordinal()];
                        if (i38 != 3) {
                            if (i38 != 8) {
                                qVar.X(-700892401);
                                EchoTheme echoTheme6 = EchoTheme.INSTANCE;
                                z20 = false;
                                pVar = new sn.p(new p3.x(echoTheme6.getColors(qVar, 6).getFill().getDenary(qVar, 0)), new p3.x(echoTheme6.getColors(qVar, 6).getText().getInactive(qVar, 0)), new p3.x(p3.x.f26437l));
                                qVar.p(false);
                            } else {
                                z20 = false;
                                qVar.X(-701231293);
                                EchoTheme echoTheme7 = EchoTheme.INSTANCE;
                                pVar = new sn.p(new p3.x(echoTheme7.getColors(qVar, 6).getFill().getWhiteSenary(qVar, 0)), new p3.x(echoTheme7.getColors(qVar, 6).getText().getWhiteQuaternary(qVar, 0)), new p3.x(p3.x.f26437l));
                                qVar.p(false);
                            }
                        } else {
                            z20 = false;
                            qVar.X(-701041542);
                            long j12 = p3.x.f26437l;
                            pVar = new sn.p(new p3.x(j12), new p3.x(EchoTheme.INSTANCE.getColors(qVar, 6).getText().getInactive(qVar, 0)), new p3.x(j12));
                            qVar.p(false);
                        }
                        pVar2 = pVar;
                        qVar.p(z20);
                    }
                    long j13 = ((p3.x) pVar2.f31610a).f26440a;
                    long j14 = ((p3.x) pVar2.f31611b).f26440a;
                    long j15 = ((p3.x) pVar2.f31612c).f26440a;
                    u2.s2 a10 = i1.w2.a(j13, j1.e.s(200, 0, null, 6), "background_color", qVar, 432, 8);
                    u2.s2 a11 = i1.w2.a(j14, j1.e.s(200, 0, null, 6), "foreground_color", qVar, 432, 8);
                    u2.s2 a12 = i1.w2.a(j15, j1.e.s(200, 0, null, 6), "border_color", qVar, 432, 8);
                    int[] iArr = WhenMappings.$EnumSwitchMapping$1;
                    int i39 = iArr[echoButtonSize3.ordinal()];
                    if (i39 != 1) {
                        if (i39 != 2) {
                            if (i39 != 3) {
                                if (i39 == 4) {
                                    i32 = 18;
                                } else {
                                    c6.p();
                                    return;
                                }
                            } else {
                                f10 = 14;
                                i30 = 6;
                            }
                        } else {
                            i32 = 10;
                        }
                        f10 = i32;
                        i30 = 6;
                    } else {
                        i30 = 6;
                        f10 = 6;
                    }
                    int i40 = iArr[echoButtonSize3.ordinal()];
                    if (i40 != 1) {
                        if (i40 != 2) {
                            if (i40 != 3) {
                                if (i40 == 4) {
                                    qVar.X(-715305596);
                                    x42 = EchoTheme.INSTANCE.getSpacings(qVar, i30).getX5();
                                    i31 = 0;
                                    qVar.p(false);
                                } else {
                                    throw com.google.android.gms.internal.play_billing.b.h(-715312319, qVar, false);
                                }
                            } else {
                                i31 = 0;
                                qVar.X(-715307196);
                                x42 = EchoTheme.INSTANCE.getSpacings(qVar, i30).getX5();
                                qVar.p(false);
                            }
                        } else {
                            i31 = 0;
                            qVar.X(-715308828);
                            x42 = EchoTheme.INSTANCE.getSpacings(qVar, i30).getX4();
                            qVar.p(false);
                        }
                    } else {
                        i31 = 0;
                        qVar.X(-715310428);
                        x42 = EchoTheme.INSTANCE.getSpacings(qVar, i30).getX4();
                        qVar.p(false);
                    }
                    EchoTheme echoTheme8 = EchoTheme.INSTANCE;
                    p3.b1 full = echoTheme8.getShapes(qVar, i30).getFull(qVar, i31);
                    Object L = qVar.L();
                    u2.e eVar = u2.l.f33918a;
                    if (L == eVar) {
                        L = j0.c.o(qVar);
                    }
                    p1.l lVar = (p1.l) L;
                    i3.t c5 = m3.h.c(InteractionsKt.bounceOnPress$default(tVar4, lVar, t2.u.P, t2.u.P, 6, null), full);
                    Object L2 = qVar.L();
                    if (L2 == eVar) {
                        L2 = new v0(0);
                        qVar.h0(L2);
                    }
                    i3.t c10 = p4.q.c(c5, true, (ho.l) L2);
                    if ((i28 & 7168) == 2048) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    Object L3 = qVar.L();
                    if (z21 || L3 == eVar) {
                        L3 = new g(str4, 9);
                        qVar.h0(L3);
                    }
                    i3.t b10 = p4.q.b(c10, (ho.l) L3);
                    if (z19 && !z17) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    i3.t h10 = l1.n.h(l1.n.n(b10, lVar, e5.b(t2.u.P, 3, EchoIconButton$lambda$1(a11), false), z22, new p4.k(0), aVar, 8), EchoIconButton$lambda$0(a10), p3.h0.f26395b);
                    if (!p3.x.c(EchoIconButton$lambda$2(a12), p3.x.f26437l)) {
                        qVar.X(-698907409);
                        tVar5 = l1.n.j(echoTheme8.getSpacings(qVar, 6).getXpx(), EchoIconButton$lambda$2(a12), qVar2, full);
                        z23 = false;
                        qVar.p(false);
                    } else {
                        z23 = false;
                        qVar.X(-698822686);
                        qVar.p(false);
                        tVar5 = qVar2;
                    }
                    i3.t E = r1.d.E(h10.then(tVar5), f10);
                    f4.f1 d10 = r1.p.d(i3.d.f13001e, z23);
                    int hashCode = Long.hashCode(qVar.T);
                    c3.o l4 = qVar.l();
                    i3.t c11 = i3.a.c(E, qVar);
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
                    u2.r.J(h4.g.f11905d, c11, qVar);
                    float f12 = 1.0f;
                    if (z17) {
                        f11 = t2.u.P;
                    } else {
                        f11 = 1.0f;
                    }
                    u2.s2 b11 = j1.f.b(f11, j1.e.s(150, 0, null, 6), "content_alpha", qVar, 3120, 20);
                    if (!z17) {
                        f12 = t2.u.P;
                    }
                    u2.s2 b12 = j1.f.b(f12, j1.e.s(150, 0, null, 6), "spinner_alpha", qVar, 3120, 20);
                    i29 = i10;
                    u3.c M = kd.a.M(i29, qVar, i28 & 14);
                    i3.t a13 = m3.h.a(r1.p2.o(qVar2, x42), EchoIconButton$lambda$6$0(b11));
                    if (z18) {
                        nVar = new p3.n(EchoIconButton$lambda$1(a11), 5);
                    } else {
                        nVar = null;
                    }
                    l1.n.c(M, null, a13, null, null, t2.u.P, nVar, qVar, u3.c.$stable | 48, 56);
                    y4.a(m3.h.a(r1.p2.o(qVar2, x42), EchoIconButton$lambda$6$1(b12)), EchoIconButton$lambda$1(a11), echoTheme8.getSpacings(qVar, 6).getX0_5(), 0L, 0, t2.u.P, qVar, 0, 56);
                    qVar = qVar;
                    qVar.p(true);
                    str3 = str4;
                    echoButtonSize2 = echoButtonSize3;
                    z14 = z17;
                    z16 = z18;
                    tVar3 = tVar4;
                    echoButtonVariant2 = echoButtonVariant4;
                    z15 = z19;
                } else {
                    i29 = i10;
                    qVar.R();
                    echoButtonVariant2 = echoButtonVariant;
                    echoButtonSize2 = echoButtonSize;
                    z14 = z10;
                    tVar3 = tVar2;
                    z15 = z12;
                    str3 = str2;
                    z16 = z11;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new r(i29, aVar, tVar3, str3, echoButtonVariant2, echoButtonSize2, z15, z14, z16, i11, i12);
                    return;
                }
                return;
            }
            str2 = str;
            i17 = i12 & 16;
            int i362 = -1;
            if (i17 != 0) {
            }
            i19 = i12 & 32;
            if (i19 != 0) {
            }
            i21 = i12 & 64;
            if (i21 != 0) {
            }
            i23 = i12 & 128;
            if (i23 != 0) {
            }
            int i372 = i13;
            i25 = i12 & RpcError.MAX_MESSAGE_BYTES;
            if (i25 != 0) {
            }
            i28 = i372;
            if ((i28 & 38347923) != 38347922) {
            }
            if (qVar.O(i28 & 1, z13)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i15 = i12 & 8;
        if (i15 == 0) {
        }
        str2 = str;
        i17 = i12 & 16;
        int i3622 = -1;
        if (i17 != 0) {
        }
        i19 = i12 & 32;
        if (i19 != 0) {
        }
        i21 = i12 & 64;
        if (i21 != 0) {
        }
        i23 = i12 & 128;
        if (i23 != 0) {
        }
        int i3722 = i13;
        i25 = i12 & RpcError.MAX_MESSAGE_BYTES;
        if (i25 != 0) {
        }
        i28 = i3722;
        if ((i28 & 38347923) != 38347922) {
        }
        if (qVar.O(i28 & 1, z13)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final long EchoIconButton$lambda$0(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    private static final long EchoIconButton$lambda$1(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    private static final long EchoIconButton$lambda$2(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    public static final sn.z EchoIconButton$lambda$4$0(p4.b0 b0Var) {
        b0Var.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z EchoIconButton$lambda$5$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 0);
        if (str != null) {
            p4.y.d(str, b0Var);
        }
        return sn.z.f31622a;
    }

    private static final float EchoIconButton$lambda$6$0(u2.s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    private static final float EchoIconButton$lambda$6$1(u2.s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z EchoIconButton$lambda$7(int i10, ho.a aVar, i3.t tVar, String str, EchoButtonVariant echoButtonVariant, EchoButtonSize echoButtonSize, boolean z6, boolean z10, boolean z11, int i11, int i12, u2.m mVar, int i13) {
        EchoIconButton(i10, aVar, tVar, str, echoButtonVariant, echoButtonSize, z6, z10, z11, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    public static final void EchoIconButtonDarkThemePreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1461804940);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(EchoTheme.Mode.Dark, ComposableSingletons$EchoIconButtonKt.INSTANCE.m1807getLambda$19846926$ui_release(), qVar, 438, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 23);
        }
    }

    public static final sn.z EchoIconButtonDarkThemePreview$lambda$0(int i10, u2.m mVar, int i11) {
        EchoIconButtonDarkThemePreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void EchoIconButtonExtraSmallSizePreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1183925005);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoIconButtonKt.INSTANCE.m1804getLambda$1067095705$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 20);
        }
    }

    public static final sn.z EchoIconButtonExtraSmallSizePreview$lambda$0(int i10, u2.m mVar, int i11) {
        EchoIconButtonExtraSmallSizePreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void EchoIconButtonLargeSizePreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-342973195);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoIconButtonKt.INSTANCE.m1806getLambda$1824625061$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 18);
        }
    }

    public static final sn.z EchoIconButtonLargeSizePreview$lambda$0(int i10, u2.m mVar, int i11) {
        EchoIconButtonLargeSizePreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void EchoIconButtonMediumSizePreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1893066923);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoIconButtonKt.INSTANCE.m1805getLambda$1088467963$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 21);
        }
    }

    public static final sn.z EchoIconButtonMediumSizePreview$lambda$0(int i10, u2.m mVar, int i11) {
        EchoIconButtonMediumSizePreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void EchoIconButtonSmallSizePreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1857973567);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoIconButtonKt.INSTANCE.getLambda$955341863$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 19);
        }
    }

    public static final sn.z EchoIconButtonSmallSizePreview$lambda$0(int i10, u2.m mVar, int i11) {
        EchoIconButtonSmallSizePreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void EchoIconButtonStatesPreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2007564649);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoIconButtonKt.INSTANCE.getLambda$154935025$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 22);
        }
    }

    public static final sn.z EchoIconButtonStatesPreview$lambda$0(int i10, u2.m mVar, int i11) {
        EchoIconButtonStatesPreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void EchoIconButtonVariantsPreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2110172067);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoIconButtonKt.INSTANCE.getLambda$1508187517$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 24);
        }
    }

    public static final sn.z EchoIconButtonVariantsPreview$lambda$0(int i10, u2.m mVar, int i11) {
        EchoIconButtonVariantsPreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
