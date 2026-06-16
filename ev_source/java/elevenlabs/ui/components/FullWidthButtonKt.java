package io.elevenlabs.ui.components;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeSpacings;
import io.elevenlabs.ui.theme.ColorMathKt;
import io.elevenlabs.ui.theme.ColorScheme;
import io.elevenlabs.ui.theme.ElevenLabsColors;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.e5;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001am\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001am\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0012\u001aq\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\rH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001d\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001f\u0010\u001e¨\u0006%²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002²\u0006\f\u0010\"\u001a\u00020 8\nX\u008a\u0084\u0002²\u0006\f\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002"}, d2 = {"", Constants.ScionAnalytics.PARAM_LABEL, "Lkotlin/Function0;", "Lsn/z;", "onPress", "Li3/t;", "modifier", "Lio/elevenlabs/ui/components/FullWidthButtonSize;", "size", "Lio/elevenlabs/ui/components/FullWidthButtonVariant;", "variant", "", ParameterNames.ICON, "", "isLoading", "enabled", "tintIcon", "EchoThemeFullWidthButton", "(Ljava/lang/String;Lho/a;Li3/t;Lio/elevenlabs/ui/components/FullWidthButtonSize;Lio/elevenlabs/ui/components/FullWidthButtonVariant;Ljava/lang/Integer;ZZZLu2/m;II)V", "FullWidthButton", "Lio/elevenlabs/ui/components/ButtonSpecs;", "style", "Lh5/f;", "horizontalPadding", "verticalPadding", "isDarkTheme", "InternalFullWidthButton-dqcolps", "(Ljava/lang/String;Lho/a;Li3/t;Ljava/lang/Integer;ZZZLio/elevenlabs/ui/components/ButtonSpecs;FFZLu2/m;II)V", "InternalFullWidthButton", "Preview_FullWidthButton", "(Lu2/m;I)V", "Preview_EchoThemeFullWidthButton", "Lp3/x;", "finalBackgroundColor", "finalBorderColor", "", "alpha", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class FullWidthButtonKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FullWidthButtonVariant.values().length];
            try {
                iArr[FullWidthButtonVariant.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FullWidthButtonVariant.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FullWidthButtonVariant.Tertiary.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FullWidthButtonVariant.Border.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FullWidthButtonVariant.Destructive.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FullWidthButtonVariant.Subscriptions.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FullWidthButtonVariant.Text.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FullWidthButtonSize.values().length];
            try {
                iArr2[FullWidthButtonSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[FullWidthButtonSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[FullWidthButtonSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EchoThemeFullWidthButton(String str, ho.a aVar, i3.t tVar, FullWidthButtonSize fullWidthButtonSize, FullWidthButtonVariant fullWidthButtonVariant, Integer num, boolean z6, boolean z10, boolean z11, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int ordinal;
        int i15;
        int i16;
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
        boolean z12;
        u2.q qVar;
        i3.t tVar2;
        FullWidthButtonSize fullWidthButtonSize2;
        FullWidthButtonVariant fullWidthButtonVariant2;
        boolean z13;
        boolean z14;
        Integer num3;
        boolean z15;
        u2.r1 r10;
        i3.t tVar3;
        FullWidthButtonSize fullWidthButtonSize3;
        FullWidthButtonVariant fullWidthButtonVariant3;
        int i28;
        Integer num4;
        boolean z16;
        int i29;
        boolean z17;
        boolean z18;
        ButtonSpecs buttonSpecs;
        sn.k kVar;
        int i30;
        int i31;
        str.getClass();
        aVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1748323342);
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
            if (qVar2.f(tVar)) {
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
                if (fullWidthButtonSize == null) {
                    ordinal = -1;
                } else {
                    ordinal = fullWidthButtonSize.ordinal();
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
                if (fullWidthButtonVariant != null) {
                    i33 = fullWidthButtonVariant.ordinal();
                }
                if (qVar2.d(i33)) {
                    i17 = 16384;
                } else {
                    i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i17;
            }
            i18 = i11 & 32;
            if (i18 == 0) {
                i12 |= 196608;
            } else if ((196608 & i10) == 0) {
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
                } else if ((1572864 & i10) == 0) {
                    if (qVar2.g(z6)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                    i22 = i11 & 128;
                    if (i22 == 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (qVar2.g(z10)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    }
                    int i34 = i12;
                    i24 = i11 & RpcError.MAX_MESSAGE_BYTES;
                    if (i24 == 0) {
                        i34 |= 100663296;
                        i25 = i24;
                    } else if ((i10 & 100663296) == 0) {
                        i25 = i24;
                        if (qVar2.g(z11)) {
                            i26 = 67108864;
                        } else {
                            i26 = 33554432;
                        }
                        i34 |= i26;
                    } else {
                        i25 = i24;
                    }
                    i27 = i34;
                    if ((i27 & 38347923) == 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!qVar2.O(i27 & 1, z12)) {
                        if (i32 != 0) {
                            tVar3 = i3.q.f13017a;
                        } else {
                            tVar3 = tVar;
                        }
                        if (i14 != 0) {
                            fullWidthButtonSize3 = FullWidthButtonSize.Medium;
                        } else {
                            fullWidthButtonSize3 = fullWidthButtonSize;
                        }
                        if (i16 != 0) {
                            fullWidthButtonVariant3 = FullWidthButtonVariant.Primary;
                        } else {
                            fullWidthButtonVariant3 = fullWidthButtonVariant;
                        }
                        if (i18 != 0) {
                            num4 = null;
                            i28 = i22;
                        } else {
                            i28 = i22;
                            num4 = num2;
                        }
                        if (i20 != 0) {
                            z16 = false;
                        } else {
                            z16 = z6;
                        }
                        if (i28 != 0) {
                            i29 = i25;
                            z17 = true;
                        } else {
                            i29 = i25;
                            z17 = z10;
                        }
                        if (i29 != 0) {
                            z18 = true;
                        } else {
                            z18 = z11;
                        }
                        EchoTheme echoTheme = EchoTheme.INSTANCE;
                        EchoThemeColors colors = echoTheme.getColors(qVar2, 6);
                        EchoThemeSpacings spacings = echoTheme.getSpacings(qVar2, 6);
                        boolean isDarkMode = echoTheme.isDarkMode(qVar2, 6);
                        switch (WhenMappings.$EnumSwitchMapping$0[fullWidthButtonVariant3.ordinal()]) {
                            case 1:
                                qVar2.X(806537199);
                                buttonSpecs = new ButtonSpecs(colors.getFill().getPrimary(qVar2, 0), colors.getText().getOnFillPrimary(qVar2, 0), p3.x.f26437l, echoTheme.getShapes(qVar2, 6).getFull(qVar2, 0), echoTheme.getTypography(qVar2, 6).getBaseRegular500(qVar2, 0), spacings.getX2(), false, null);
                                qVar2.p(false);
                                break;
                            case 2:
                                qVar2.X(806549965);
                                buttonSpecs = new ButtonSpecs(colors.getFill().getDenaryAlpha(qVar2, 0), colors.getText().getPrimary(qVar2, 0), p3.x.f26437l, echoTheme.getShapes(qVar2, 6).getFull(qVar2, 0), echoTheme.getTypography(qVar2, 6).getBaseRegular500(qVar2, 0), spacings.getX2(), false, null);
                                qVar2.p(false);
                                break;
                            case 3:
                                qVar2.X(806562640);
                                buttonSpecs = new ButtonSpecs(colors.getFill().getTertiary(qVar2, 0), colors.getText().getOnFillPrimary(qVar2, 0), p3.x.f26437l, echoTheme.getShapes(qVar2, 6).getFull(qVar2, 0), echoTheme.getTypography(qVar2, 6).getBaseRegular500(qVar2, 0), spacings.getX2(), false, null);
                                qVar2.p(false);
                                break;
                            case 4:
                                qVar2.X(806575347);
                                buttonSpecs = new ButtonSpecs(colors.getFill().getDuodenary(qVar2, 0), colors.getText().getPrimary(qVar2, 0), colors.getBorder().getSenaryAlpha(qVar2, 0), echoTheme.getShapes(qVar2, 6).getFull(qVar2, 0), echoTheme.getTypography(qVar2, 6).getBaseRegular500(qVar2, 0), spacings.getX2(), false, null);
                                qVar2.p(false);
                                break;
                            case 5:
                                qVar2.X(806588319);
                                buttonSpecs = new ButtonSpecs(colors.getFill().getCriticalPrimary(qVar2, 0), colors.getText().getOnFillPrimaryCritical(qVar2, 0), p3.x.f26437l, echoTheme.getShapes(qVar2, 6).getFull(qVar2, 0), echoTheme.getTypography(qVar2, 6).getBaseRegular500(qVar2, 0), spacings.getX2(), false, null);
                                qVar2.p(false);
                                break;
                            case 6:
                                qVar2.X(806601714);
                                buttonSpecs = new ButtonSpecs(colors.getFill().getQuaternary(qVar2, 0), colors.getText().getOnFillPrimary(qVar2, 0), p3.x.f26437l, echoTheme.getShapes(qVar2, 6).getFull(qVar2, 0), echoTheme.getTypography(qVar2, 6).getBaseRegular500(qVar2, 0), spacings.getX2(), false, null);
                                qVar2.p(false);
                                break;
                            case 7:
                                qVar2.X(806614400);
                                long j4 = p3.x.f26437l;
                                buttonSpecs = new ButtonSpecs(j4, colors.getText().getPrimary(qVar2, 0), j4, p3.h0.f26395b, echoTheme.getTypography(qVar2, 6).getBaseRegular500(qVar2, 0), spacings.getX2(), false, null);
                                qVar2.p(false);
                                break;
                            default:
                                throw com.google.android.gms.internal.play_billing.b.h(806537774, qVar2, false);
                        }
                        ButtonSpecs buttonSpecs2 = buttonSpecs;
                        int i35 = WhenMappings.$EnumSwitchMapping$1[fullWidthButtonSize3.ordinal()];
                        if (i35 != 1) {
                            if (i35 != 2) {
                                if (i35 == 3) {
                                    kVar = new sn.k(new h5.f(spacings.getX4()), new h5.f(spacings.getX4()));
                                } else {
                                    c6.p();
                                    return;
                                }
                            } else {
                                kVar = new sn.k(new h5.f(spacings.getX4()), new h5.f(spacings.getX3()));
                            }
                        } else {
                            kVar = new sn.k(new h5.f(spacings.getX3()), new h5.f(spacings.getX2()));
                        }
                        int i36 = i27 & 1022;
                        int i37 = i27 >> 6;
                        qVar = qVar2;
                        m1839InternalFullWidthButtondqcolps(str, aVar, tVar3, num4, z16, z17, z18, buttonSpecs2, ((h5.f) kVar.f31600a).f12083a, ((h5.f) kVar.f31601b).f12083a, isDarkMode, qVar, i36 | (i37 & 7168) | (57344 & i37) | (458752 & i37) | (i37 & 3670016), 0);
                        fullWidthButtonSize2 = fullWidthButtonSize3;
                        fullWidthButtonVariant2 = fullWidthButtonVariant3;
                        tVar2 = tVar3;
                        num3 = num4;
                        z13 = z16;
                        z15 = z17;
                        z14 = z18;
                    } else {
                        qVar = qVar2;
                        qVar.R();
                        tVar2 = tVar;
                        fullWidthButtonSize2 = fullWidthButtonSize;
                        fullWidthButtonVariant2 = fullWidthButtonVariant;
                        z13 = z6;
                        z14 = z11;
                        num3 = num2;
                        z15 = z10;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new b1(str, aVar, tVar2, fullWidthButtonSize2, fullWidthButtonVariant2, num3, z13, z15, z14, i10, i11, 0);
                        return;
                    }
                    return;
                }
                i22 = i11 & 128;
                if (i22 == 0) {
                }
                int i342 = i12;
                i24 = i11 & RpcError.MAX_MESSAGE_BYTES;
                if (i24 == 0) {
                }
                i27 = i342;
                if ((i27 & 38347923) == 38347922) {
                }
                if (!qVar2.O(i27 & 1, z12)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            num2 = num;
            i20 = i11 & 64;
            if (i20 != 0) {
            }
            i22 = i11 & 128;
            if (i22 == 0) {
            }
            int i3422 = i12;
            i24 = i11 & RpcError.MAX_MESSAGE_BYTES;
            if (i24 == 0) {
            }
            i27 = i3422;
            if ((i27 & 38347923) == 38347922) {
            }
            if (!qVar2.O(i27 & 1, z12)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
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
        if (i22 == 0) {
        }
        int i34222 = i12;
        i24 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i24 == 0) {
        }
        i27 = i34222;
        if ((i27 & 38347923) == 38347922) {
        }
        if (!qVar2.O(i27 & 1, z12)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z EchoThemeFullWidthButton$lambda$0(String str, ho.a aVar, i3.t tVar, FullWidthButtonSize fullWidthButtonSize, FullWidthButtonVariant fullWidthButtonVariant, Integer num, boolean z6, boolean z10, boolean z11, int i10, int i11, u2.m mVar, int i12) {
        EchoThemeFullWidthButton(str, aVar, tVar, fullWidthButtonSize, fullWidthButtonVariant, num, z6, z10, z11, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FullWidthButton(String str, ho.a aVar, i3.t tVar, FullWidthButtonSize fullWidthButtonSize, FullWidthButtonVariant fullWidthButtonVariant, Integer num, boolean z6, boolean z10, boolean z11, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int ordinal;
        int i15;
        int i16;
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
        boolean z12;
        u2.q qVar;
        i3.t tVar2;
        FullWidthButtonSize fullWidthButtonSize2;
        FullWidthButtonVariant fullWidthButtonVariant2;
        boolean z13;
        boolean z14;
        Integer num3;
        boolean z15;
        u2.r1 r10;
        i3.t tVar3;
        FullWidthButtonSize fullWidthButtonSize3;
        FullWidthButtonVariant fullWidthButtonVariant3;
        int i28;
        Integer num4;
        boolean z16;
        int i29;
        boolean z17;
        boolean z18;
        ButtonSpecs buttonSpecs;
        sn.k kVar;
        int i30;
        int i31;
        str.getClass();
        aVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1370222538);
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
            if (qVar2.f(tVar)) {
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
                if (fullWidthButtonSize == null) {
                    ordinal = -1;
                } else {
                    ordinal = fullWidthButtonSize.ordinal();
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
                if (fullWidthButtonVariant != null) {
                    i33 = fullWidthButtonVariant.ordinal();
                }
                if (qVar2.d(i33)) {
                    i17 = 16384;
                } else {
                    i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i17;
            }
            i18 = i11 & 32;
            if (i18 == 0) {
                i12 |= 196608;
            } else if ((196608 & i10) == 0) {
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
                } else if ((1572864 & i10) == 0) {
                    if (qVar2.g(z6)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                    i22 = i11 & 128;
                    if (i22 == 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (qVar2.g(z10)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    }
                    int i34 = i12;
                    i24 = i11 & RpcError.MAX_MESSAGE_BYTES;
                    if (i24 == 0) {
                        i34 |= 100663296;
                        i25 = i24;
                    } else if ((i10 & 100663296) == 0) {
                        i25 = i24;
                        if (qVar2.g(z11)) {
                            i26 = 67108864;
                        } else {
                            i26 = 33554432;
                        }
                        i34 |= i26;
                    } else {
                        i25 = i24;
                    }
                    i27 = i34;
                    if ((i27 & 38347923) == 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!qVar2.O(i27 & 1, z12)) {
                        if (i32 != 0) {
                            tVar3 = i3.q.f13017a;
                        } else {
                            tVar3 = tVar;
                        }
                        if (i14 != 0) {
                            fullWidthButtonSize3 = FullWidthButtonSize.Medium;
                        } else {
                            fullWidthButtonSize3 = fullWidthButtonSize;
                        }
                        if (i16 != 0) {
                            fullWidthButtonVariant3 = FullWidthButtonVariant.Primary;
                        } else {
                            fullWidthButtonVariant3 = fullWidthButtonVariant;
                        }
                        if (i18 != 0) {
                            num4 = null;
                            i28 = i22;
                        } else {
                            i28 = i22;
                            num4 = num2;
                        }
                        if (i20 != 0) {
                            z16 = false;
                        } else {
                            z16 = z6;
                        }
                        if (i28 != 0) {
                            i29 = i25;
                            z17 = true;
                        } else {
                            i29 = i25;
                            z17 = z10;
                        }
                        if (i29 != 0) {
                            z18 = true;
                        } else {
                            z18 = z11;
                        }
                        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                        ElevenLabsColors colors = elevenLabsTheme.getColors(qVar2, 6);
                        ColorScheme color = elevenLabsTheme.getColor(qVar2, 6);
                        boolean w6 = l1.n.w(qVar2);
                        switch (WhenMappings.$EnumSwitchMapping$0[fullWidthButtonVariant3.ordinal()]) {
                            case 1:
                                qVar2.X(1771119016);
                                buttonSpecs = new ButtonSpecs(colors.getPrimaryButtonBg(), colors.getPrimaryButtonText(), colors.getPrimaryButtonBorder(), elevenLabsTheme.getShapes(qVar2, 6).getMd(), elevenLabsTheme.getTypo(qVar2, 6).getButtonMediumEleven700(), elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM(), true, null);
                                qVar2.p(false);
                                break;
                            case 2:
                                qVar2.X(1771130286);
                                buttonSpecs = new ButtonSpecs(colors.getSecondaryButtonBg(), colors.getSecondaryButtonText(), colors.getSecondaryButtonBorder(), elevenLabsTheme.getShapes(qVar2, 6).getMd(), elevenLabsTheme.getTypo(qVar2, 6).getButtonMediumEleven700(), elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM(), true, null);
                                qVar2.p(false);
                                break;
                            case 3:
                                qVar2.X(1771141707);
                                buttonSpecs = new ButtonSpecs(colors.getTertiaryButtonBg(), colors.getTertiaryButtonText(), colors.getTertiaryButtonBorder(), elevenLabsTheme.getShapes(qVar2, 6).getMd(), elevenLabsTheme.getTypo(qVar2, 6).getButtonMediumEleven700(), elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM(), true, null);
                                qVar2.p(false);
                                break;
                            case 4:
                                qVar2.X(1771152979);
                                buttonSpecs = new ButtonSpecs(ReaderColors.Transparent.INSTANCE.m2490getClear0d7_KjU(), color.getButtonText().m2043getTertiary0d7_KjU(), color.getButtonBorder().m2030getSecondary0d7_KjU(), elevenLabsTheme.getShapes(qVar2, 6).getMd(), elevenLabsTheme.getTypo(qVar2, 6).getButtonMediumEleven700(), elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM(), true, null);
                                qVar2.p(false);
                                break;
                            case 5:
                                qVar2.X(1771164666);
                                buttonSpecs = new ButtonSpecs(colors.getDangerConfirmButtonBg(), colors.getDangerConfirmButtonText(), colors.getDangerConfirmButtonBorder(), elevenLabsTheme.getShapes(qVar2, 6).getMd(), elevenLabsTheme.getTypo(qVar2, 6).getButtonMediumEleven700(), elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM(), true, null);
                                qVar2.p(false);
                                break;
                            case 6:
                                qVar2.X(1771176612);
                                ReaderColors readerColors = ReaderColors.INSTANCE;
                                buttonSpecs = new ButtonSpecs(readerColors.m2372getBlue5000d7_KjU(), readerColors.m2466getWhite0d7_KjU(), ReaderColors.Transparent.INSTANCE.m2490getClear0d7_KjU(), elevenLabsTheme.getShapes(qVar2, 6).getMd(), elevenLabsTheme.getTypo(qVar2, 6).getButtonMediumEleven700(), elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM(), true, null);
                                qVar2.p(false);
                                break;
                            case 7:
                                qVar2.X(1771187593);
                                ReaderColors.Transparent transparent = ReaderColors.Transparent.INSTANCE;
                                buttonSpecs = new ButtonSpecs(transparent.m2490getClear0d7_KjU(), color.getButtonText().m2041getPrimary0d7_KjU(), transparent.m2490getClear0d7_KjU(), p3.h0.f26395b, elevenLabsTheme.getTypo(qVar2, 6).getButtonMediumEleven700(), elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM(), true, null);
                                qVar2.p(false);
                                break;
                            default:
                                throw com.google.android.gms.internal.play_billing.b.h(1771119337, qVar2, false);
                        }
                        ButtonSpecs buttonSpecs2 = buttonSpecs;
                        int i35 = WhenMappings.$EnumSwitchMapping$1[fullWidthButtonSize3.ordinal()];
                        if (i35 != 1) {
                            if (i35 != 2) {
                                if (i35 == 3) {
                                    qVar2.X(1771206736);
                                    kVar = new sn.k(new h5.f(elevenLabsTheme.getSpacings(qVar2, 6).m2356getX4D9Ej5fM()), new h5.f(elevenLabsTheme.getSpacings(qVar2, 6).m2356getX4D9Ej5fM()));
                                    qVar2.p(false);
                                } else {
                                    throw com.google.android.gms.internal.play_billing.b.h(1771199178, qVar2, false);
                                }
                            } else {
                                qVar2.X(1771203664);
                                kVar = new sn.k(new h5.f(elevenLabsTheme.getSpacings(qVar2, 6).m2356getX4D9Ej5fM()), new h5.f(elevenLabsTheme.getSpacings(qVar2, 6).m2355getX3D9Ej5fM()));
                                qVar2.p(false);
                            }
                        } else {
                            qVar2.X(1771200560);
                            kVar = new sn.k(new h5.f(elevenLabsTheme.getSpacings(qVar2, 6).m2355getX3D9Ej5fM()), new h5.f(elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM()));
                            qVar2.p(false);
                        }
                        int i36 = i27 & 1022;
                        int i37 = i27 >> 6;
                        qVar = qVar2;
                        m1839InternalFullWidthButtondqcolps(str, aVar, tVar3, num4, z16, z17, z18, buttonSpecs2, ((h5.f) kVar.f31600a).f12083a, ((h5.f) kVar.f31601b).f12083a, w6, qVar, i36 | (i37 & 7168) | (57344 & i37) | (458752 & i37) | (i37 & 3670016), 0);
                        fullWidthButtonSize2 = fullWidthButtonSize3;
                        fullWidthButtonVariant2 = fullWidthButtonVariant3;
                        tVar2 = tVar3;
                        num3 = num4;
                        z13 = z16;
                        z15 = z17;
                        z14 = z18;
                    } else {
                        qVar = qVar2;
                        qVar.R();
                        tVar2 = tVar;
                        fullWidthButtonSize2 = fullWidthButtonSize;
                        fullWidthButtonVariant2 = fullWidthButtonVariant;
                        z13 = z6;
                        z14 = z11;
                        num3 = num2;
                        z15 = z10;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new b1(str, aVar, tVar2, fullWidthButtonSize2, fullWidthButtonVariant2, num3, z13, z15, z14, i10, i11, 1);
                        return;
                    }
                    return;
                }
                i22 = i11 & 128;
                if (i22 == 0) {
                }
                int i342 = i12;
                i24 = i11 & RpcError.MAX_MESSAGE_BYTES;
                if (i24 == 0) {
                }
                i27 = i342;
                if ((i27 & 38347923) == 38347922) {
                }
                if (!qVar2.O(i27 & 1, z12)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            num2 = num;
            i20 = i11 & 64;
            if (i20 != 0) {
            }
            i22 = i11 & 128;
            if (i22 == 0) {
            }
            int i3422 = i12;
            i24 = i11 & RpcError.MAX_MESSAGE_BYTES;
            if (i24 == 0) {
            }
            i27 = i3422;
            if ((i27 & 38347923) == 38347922) {
            }
            if (!qVar2.O(i27 & 1, z12)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
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
        if (i22 == 0) {
        }
        int i34222 = i12;
        i24 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i24 == 0) {
        }
        i27 = i34222;
        if ((i27 & 38347923) == 38347922) {
        }
        if (!qVar2.O(i27 & 1, z12)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z FullWidthButton$lambda$0(String str, ho.a aVar, i3.t tVar, FullWidthButtonSize fullWidthButtonSize, FullWidthButtonVariant fullWidthButtonVariant, Integer num, boolean z6, boolean z10, boolean z11, int i10, int i11, u2.m mVar, int i12) {
        FullWidthButton(str, aVar, tVar, fullWidthButtonSize, fullWidthButtonVariant, num, z6, z10, z11, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* renamed from: InternalFullWidthButton-dqcolps */
    private static final void m1839InternalFullWidthButtondqcolps(final String str, final ho.a aVar, final i3.t tVar, final Integer num, final boolean z6, final boolean z10, final boolean z11, final ButtonSpecs buttonSpecs, final float f10, final float f11, final boolean z12, u2.m mVar, final int i10, final int i11) {
        int i12;
        int i13;
        boolean z13;
        u2.q qVar;
        long m1986blendButtonBgColorWithThemeOverlayDxMtmZc;
        long m1986blendButtonBgColorWithThemeOverlayDxMtmZc2;
        boolean z14;
        float f12;
        String str2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-639013227);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i12 = i24 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i12 |= i23;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.f(tVar)) {
                i22 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i22 = 128;
            }
            i12 |= i22;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.f(num)) {
                i21 = 2048;
            } else {
                i21 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i21;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.g(z6)) {
                i20 = 16384;
            } else {
                i20 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i20;
        }
        if ((i10 & 196608) == 0) {
            if (qVar2.g(z10)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i12 |= i19;
        }
        if ((1572864 & i10) == 0) {
            if (qVar2.g(z11)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        if ((12582912 & i10) == 0) {
            if (qVar2.f(buttonSpecs)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i12 |= i17;
        }
        if ((100663296 & i10) == 0) {
            if (qVar2.c(f10)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i12 |= i16;
        }
        if ((805306368 & i10) == 0) {
            if (qVar2.c(f11)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i12 |= i15;
        }
        int i25 = i12;
        if ((i11 & 6) == 0) {
            if (qVar2.g(z12)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i11 | i14;
        } else {
            i13 = i11;
        }
        if ((i25 & 306783379) == 306783378 && (i13 & 3) == 2) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (qVar2.O(i25 & 1, z13)) {
            if (z10) {
                m1986blendButtonBgColorWithThemeOverlayDxMtmZc = buttonSpecs.m1788getBackgroundColor0d7_KjU();
            } else {
                m1986blendButtonBgColorWithThemeOverlayDxMtmZc = ColorMathKt.m1986blendButtonBgColorWithThemeOverlayDxMtmZc(buttonSpecs.m1788getBackgroundColor0d7_KjU(), z12);
            }
            u2.s2 a10 = i1.w2.a(m1986blendButtonBgColorWithThemeOverlayDxMtmZc, null, "background_color", qVar2, 384, 10);
            if (z10) {
                m1986blendButtonBgColorWithThemeOverlayDxMtmZc2 = buttonSpecs.m1789getBorderColor0d7_KjU();
            } else {
                m1986blendButtonBgColorWithThemeOverlayDxMtmZc2 = ColorMathKt.m1986blendButtonBgColorWithThemeOverlayDxMtmZc(buttonSpecs.m1789getBorderColor0d7_KjU(), z12);
            }
            u2.s2 a11 = i1.w2.a(m1986blendButtonBgColorWithThemeOverlayDxMtmZc2, null, "border_color", qVar2, 384, 10);
            p3.b1 shape = buttonSpecs.getShape();
            i3.t c5 = m3.h.c(tVar, shape);
            if ((i25 & 14) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            Object L = qVar2.L();
            u2.e eVar = u2.l.f33918a;
            if (z14 || L == eVar) {
                L = new g(str, 11);
                qVar2.h0(L);
            }
            i3.t c10 = p4.q.c(c5, true, (ho.l) L);
            Object L2 = qVar2.L();
            if (L2 == eVar) {
                L2 = j0.c.o(qVar2);
            }
            i3.t F = r1.d.F(l1.n.j(1, InternalFullWidthButton_dqcolps$lambda$1(a11), l1.n.h(l1.n.n(c10, (p1.l) L2, e5.b(t2.u.P, 3, buttonSpecs.m1790getForegroundColor0d7_KjU(), false), z10, new p4.k(0), aVar, 8), InternalFullWidthButton_dqcolps$lambda$0(a10), p3.h0.f26395b), shape), f10, f11);
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
            if (z6) {
                f12 = t2.u.P;
            } else {
                f12 = 1.0f;
            }
            u2.s2 b10 = j1.f.b(f12, null, "alpha", qVar2, 3072, 22);
            r1.f fVar2 = r1.j.f29232e;
            i3.k kVar = i3.d.f13005z0;
            float InternalFullWidthButton_dqcolps$lambda$4$0 = InternalFullWidthButton_dqcolps$lambda$4$0(b10);
            i3.q qVar3 = i3.q.f13017a;
            i3.t a12 = m3.h.a(qVar3, InternalFullWidthButton_dqcolps$lambda$4$0);
            r1.k2 a13 = r1.i2.a(fVar2, kVar, qVar2, 54);
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
            if (num != null) {
                qVar2.X(507787199);
                InternalFullWidthButton_dqcolps$IconComponent(z11, buttonSpecs, num.intValue(), qVar2, (i25 >> 9) & 14);
                r1.d.g(r1.p2.s(qVar3, buttonSpecs.m1791getIconSpacingD9Ej5fM()), qVar2);
                qVar2.p(false);
            } else {
                qVar2.X(507902519);
                qVar2.p(false);
            }
            if (buttonSpecs.getUppercaseText()) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                str2 = upperCase;
            } else {
                str2 = str;
            }
            j7.d(str2, null, buttonSpecs.m1790getForegroundColor0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, buttonSpecs.getTextStyle(), qVar2, 0, 24960, 110586);
            qVar2.p(true);
            i1.e2.c(z6, null, null, null, null, c3.k.d(-447789321, true, new c1(buttonSpecs, 0), qVar2), qVar2, ((i25 >> 12) & 14) | 196608, 30);
            qVar = qVar2;
            qVar.p(true);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.d1
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z InternalFullWidthButton_dqcolps$lambda$5;
                    int intValue = ((Integer) obj2).intValue();
                    InternalFullWidthButton_dqcolps$lambda$5 = FullWidthButtonKt.InternalFullWidthButton_dqcolps$lambda$5(str, aVar, tVar, num, z6, z10, z11, buttonSpecs, f10, f11, z12, i10, i11, (u2.m) obj, intValue);
                    return InternalFullWidthButton_dqcolps$lambda$5;
                }
            };
        }
    }

    private static final void InternalFullWidthButton_dqcolps$IconComponent(boolean z6, ButtonSpecs buttonSpecs, int i10, u2.m mVar, int i11) {
        p3.n nVar;
        i3.t o6 = r1.p2.o(i3.q.f13017a, 20);
        u3.c M = kd.a.M(i10, mVar, i11 & 14);
        if (z6) {
            nVar = new p3.n(buttonSpecs.m1790getForegroundColor0d7_KjU(), 5);
        } else {
            nVar = null;
        }
        l1.n.c(M, null, o6, null, null, t2.u.P, nVar, mVar, u3.c.$stable | 432, 56);
    }

    private static final long InternalFullWidthButton_dqcolps$lambda$0(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    private static final long InternalFullWidthButton_dqcolps$lambda$1(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    public static final sn.z InternalFullWidthButton_dqcolps$lambda$2$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 0);
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    private static final float InternalFullWidthButton_dqcolps$lambda$4$0(u2.s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z InternalFullWidthButton_dqcolps$lambda$4$2(ButtonSpecs buttonSpecs, i1.g0 g0Var, u2.m mVar, int i10) {
        g0Var.getClass();
        LoaderKt.m1840LoadereopBjH0(r1.p2.o(i3.q.f13017a, 20), buttonSpecs.m1790getForegroundColor0d7_KjU(), 0L, null, mVar, 6, 12);
        return sn.z.f31622a;
    }

    public static final sn.z InternalFullWidthButton_dqcolps$lambda$5(String str, ho.a aVar, i3.t tVar, Integer num, boolean z6, boolean z10, boolean z11, ButtonSpecs buttonSpecs, float f10, float f11, boolean z12, int i10, int i11, u2.m mVar, int i12) {
        m1839InternalFullWidthButtondqcolps(str, aVar, tVar, num, z6, z10, z11, buttonSpecs, f10, f11, z12, mVar, u2.r.M(i10 | 1), u2.r.M(i11));
        return sn.z.f31622a;
    }

    public static final void Preview_EchoThemeFullWidthButton(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-621818944);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$FullWidthButtonKt.INSTANCE.m1813getLambda$1133657958$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 12);
        }
    }

    public static final sn.z Preview_EchoThemeFullWidthButton$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_EchoThemeFullWidthButton(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_FullWidthButton(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2022931738);
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
            qVar.X(-480663430);
            tn.e eVar = (tn.e) FullWidthButtonVariant.getEntries();
            eVar.getClass();
            g1.a1 a1Var = new g1.a1(eVar, 9);
            while (a1Var.hasNext()) {
                FullWidthButtonVariant fullWidthButtonVariant = (FullWidthButtonVariant) a1Var.next();
                qVar.X(-480661518);
                tn.e eVar2 = (tn.e) FullWidthButtonSize.getEntries();
                eVar2.getClass();
                g1.a1 a1Var2 = new g1.a1(eVar2, 9);
                while (a1Var2.hasNext()) {
                    FullWidthButtonSize fullWidthButtonSize = (FullWidthButtonSize) a1Var2.next();
                    String str = "Button " + fullWidthButtonVariant + Separators.SLASH + fullWidthButtonSize;
                    int i11 = R.drawable.email_1;
                    Object L = qVar.L();
                    u2.e eVar3 = u2.l.f33918a;
                    if (L == eVar3) {
                        L = new u0(4);
                        qVar.h0(L);
                    }
                    g1.a1 a1Var3 = a1Var2;
                    g1.a1 a1Var4 = a1Var;
                    FullWidthButton(str, (ho.a) L, null, fullWidthButtonSize, fullWidthButtonVariant, Integer.valueOf(i11), false, false, false, qVar, 48, 452);
                    float f10 = 4;
                    r1.p.a(r1.p2.f(qVar2, f10), qVar, 6);
                    String str2 = "Button " + fullWidthButtonVariant + Separators.SLASH + fullWidthButtonSize;
                    int i12 = R.drawable.email_1;
                    Object L2 = qVar.L();
                    if (L2 == eVar3) {
                        L2 = new u0(5);
                        qVar.h0(L2);
                    }
                    FullWidthButton(str2, (ho.a) L2, null, fullWidthButtonSize, fullWidthButtonVariant, Integer.valueOf(i12), true, false, false, qVar, 1572912, 388);
                    r1.p.a(r1.p2.f(qVar2, f10), qVar, 6);
                    i3.t e10 = r1.p2.e(qVar2, 1.0f);
                    String str3 = "Button " + fullWidthButtonVariant + Separators.SLASH + fullWidthButtonSize;
                    int i13 = R.drawable.email_1;
                    Object L3 = qVar.L();
                    if (L3 == eVar3) {
                        L3 = new u0(6);
                        qVar.h0(L3);
                    }
                    FullWidthButton(str3, (ho.a) L3, e10, fullWidthButtonSize, fullWidthButtonVariant, Integer.valueOf(i13), true, false, false, qVar, 1573296, 384);
                    r1.p.a(r1.p2.f(qVar2, f10), qVar, 6);
                    a1Var2 = a1Var3;
                    a1Var = a1Var4;
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
            r10.f34012d = new y0(i10, 11);
        }
    }

    public static final sn.z Preview_FullWidthButton$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_FullWidthButton(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
