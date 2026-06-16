package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.e5;
import q2.j7;
import q2.y4;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u000f\u0010\u001a\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u0018\u001a\u000f\u0010\u001b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001b\u0010\u0018\u001a\u000f\u0010\u001c\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u0018\u001a\u000f\u0010\u001d\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001d\u0010\u0018\u001a\u000f\u0010\u001e\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001e\u0010\u0018¨\u0006&²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\f\u0010\"\u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\f\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u00020#8\nX\u008a\u0084\u0002"}, d2 = {"", "title", "Lkotlin/Function0;", "Lsn/z;", "onClick", "Li3/t;", "modifier", "Lio/elevenlabs/ui/components/EchoButtonVariant;", "variant", "Lio/elevenlabs/ui/components/EchoButtonSize;", "size", "", ParameterNames.ICON, "", "enabled", "fullWidth", "Lh5/f;", "maxWidth", "loading", "tintIcon", "EchoButton-562pCRU", "(Ljava/lang/String;Lho/a;Li3/t;Lio/elevenlabs/ui/components/EchoButtonVariant;Lio/elevenlabs/ui/components/EchoButtonSize;Ljava/lang/Integer;ZZLh5/f;ZZLu2/m;III)V", "EchoButton", "EchoButtonExtraSmallSizePreview", "(Lu2/m;I)V", "EchoButtonSmallSizePreview", "EchoButtonMediumSizePreview", "ElevenButtonLargeSizePreview", "EchoButtonDarkThemePreview", "EchoButtonFullWidthPreview", "EchoButtonStatesPreview", "Lp3/x;", "backgroundColor", "foregroundColor", "borderColor", "", "contentAlpha", "spinnerAlpha", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EchoButtonKt {

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
                iArr[EchoButtonVariant.GhostWhite.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EchoButtonVariant.GhostTertiary.ordinal()] = 5;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x01c1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0178  */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* renamed from: EchoButton-562pCRU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1835EchoButton562pCRU(final String str, final ho.a aVar, i3.t tVar, EchoButtonVariant echoButtonVariant, EchoButtonSize echoButtonSize, Integer num, boolean z6, boolean z10, h5.f fVar, boolean z11, boolean z12, u2.m mVar, final int i10, final int i11, final int i12) {
        int i13;
        i3.t tVar2;
        int i14;
        int i15;
        int i16;
        Integer num2;
        int i17;
        boolean z13;
        int i18;
        boolean z14;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        final EchoButtonVariant echoButtonVariant2;
        final EchoButtonSize echoButtonSize2;
        final h5.f fVar2;
        final boolean z15;
        u2.q qVar;
        final boolean z16;
        final boolean z17;
        final i3.t tVar3;
        final Integer num3;
        final boolean z18;
        u2.r1 r10;
        Integer num4;
        boolean z19;
        boolean z20;
        sn.p pVar;
        boolean z21;
        sn.p pVar2;
        float xl2;
        float f10;
        float f11;
        u2.s2 s2Var;
        s4.y0 smRegular500;
        float x42;
        float x0_5;
        int i27;
        h5.f fVar3;
        boolean z22;
        i3.t e10;
        ?? r32;
        i3.t tVar4;
        u2.q qVar2;
        int i28;
        float f12;
        boolean z23;
        boolean z24;
        boolean z25;
        str.getClass();
        aVar.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(495889190);
        if ((i10 & 6) == 0) {
            i13 = (qVar3.f(str) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= qVar3.h(aVar) ? 32 : 16;
        }
        int i29 = i12 & 4;
        if (i29 != 0) {
            i13 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            i13 |= qVar3.f(tVar2) ? RpcError.MAX_MESSAGE_BYTES : 128;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i10 & 3072) == 0) {
                i13 |= qVar3.d(echoButtonVariant == null ? -1 : echoButtonVariant.ordinal()) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i15 = i12 & 16;
            if (i15 == 0) {
                i13 |= 24576;
            } else if ((i10 & 24576) == 0) {
                i13 |= qVar3.d(echoButtonSize != null ? echoButtonSize.ordinal() : -1) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i16 = i12 & 32;
            if (i16 == 0) {
                i13 |= 196608;
            } else if ((196608 & i10) == 0) {
                num2 = num;
                i13 |= qVar3.f(num2) ? 131072 : 65536;
                i17 = i12 & 64;
                if (i17 != 0) {
                    i13 |= 1572864;
                } else if ((1572864 & i10) == 0) {
                    z13 = z6;
                    i13 |= qVar3.g(z13) ? 1048576 : 524288;
                    i18 = i12 & 128;
                    if (i18 == 0) {
                        i13 |= 12582912;
                        z14 = z10;
                    } else {
                        z14 = z10;
                        if ((i10 & 12582912) == 0) {
                            i13 |= qVar3.g(z14) ? 8388608 : 4194304;
                        }
                    }
                    i19 = i13;
                    i20 = i12 & RpcError.MAX_MESSAGE_BYTES;
                    if (i20 == 0) {
                        i19 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        i21 = i20;
                        i19 |= qVar3.f(fVar) ? 67108864 : 33554432;
                        i22 = i12 & 512;
                        if (i22 != 0) {
                            i19 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            i23 = i22;
                            i19 |= qVar3.g(z11) ? 536870912 : 268435456;
                            i24 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                            if (i24 == 0) {
                                i26 = i11 | 6;
                                i25 = i24;
                            } else if ((i11 & 6) == 0) {
                                i25 = i24;
                                i26 = i11 | (qVar3.g(z12) ? 4 : 2);
                            } else {
                                i25 = i24;
                                i26 = i11;
                            }
                            if (!qVar3.O(i19 & 1, (i19 & 306783379) == 306783378 || (i26 & 3) != 2)) {
                                i3.q qVar4 = i3.q.f13017a;
                                i3.t tVar5 = i29 != 0 ? qVar4 : tVar2;
                                EchoButtonVariant echoButtonVariant3 = i14 != 0 ? EchoButtonVariant.Primary : echoButtonVariant;
                                EchoButtonSize echoButtonSize3 = i15 != 0 ? EchoButtonSize.Medium : echoButtonSize;
                                if (i16 != 0) {
                                    num2 = null;
                                }
                                if (i17 != 0) {
                                    z13 = true;
                                }
                                boolean z26 = i18 != 0 ? false : z14;
                                h5.f fVar4 = i21 != 0 ? null : fVar;
                                boolean z27 = i23 != 0 ? false : z11;
                                boolean z28 = i25 != 0 ? true : z12;
                                if (z13) {
                                    qVar3.X(-1652067835);
                                    switch (WhenMappings.$EnumSwitchMapping$0[echoButtonVariant3.ordinal()]) {
                                        case 1:
                                            z24 = false;
                                            num4 = num2;
                                            z19 = z26;
                                            qVar3.X(-191839357);
                                            EchoTheme echoTheme = EchoTheme.INSTANCE;
                                            p3.x xVar = new p3.x(echoTheme.getColors(qVar3, 6).getFill().getPrimary(qVar3, 0));
                                            p3.x xVar2 = new p3.x(echoTheme.getColors(qVar3, 6).getText().getOnFillPrimary(qVar3, 0));
                                            int i30 = p3.x.f26439n;
                                            pVar = new sn.p(xVar, xVar2, new p3.x(p3.x.f26437l));
                                            qVar3.p(false);
                                            qVar3.p(z24);
                                            break;
                                        case 2:
                                            z24 = false;
                                            num4 = num2;
                                            z19 = z26;
                                            qVar3.X(-191834111);
                                            EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                                            pVar = new sn.p(new p3.x(echoTheme2.getColors(qVar3, 6).getFill().getDenaryAlpha(qVar3, 0)), new p3.x(ib.i.v(6, 0, echoTheme2, qVar3, qVar3)), new p3.x(p3.x.f26437l));
                                            qVar3.p(false);
                                            qVar3.p(z24);
                                            break;
                                        case 3:
                                            z24 = false;
                                            num4 = num2;
                                            z19 = z26;
                                            qVar3.X(-191829071);
                                            long j4 = p3.x.f26437l;
                                            pVar = new sn.p(new p3.x(j4), new p3.x(ib.i.v(6, 0, EchoTheme.INSTANCE, qVar3, qVar3)), new p3.x(j4));
                                            qVar3.p(false);
                                            qVar3.p(z24);
                                            break;
                                        case 4:
                                            z24 = false;
                                            num4 = num2;
                                            z19 = z26;
                                            qVar3.X(-191824361);
                                            long j10 = p3.x.f26437l;
                                            pVar = new sn.p(new p3.x(j10), new p3.x(EchoTheme.INSTANCE.getColorResources(qVar3, 6).getSolidWhite(qVar3, 0)), new p3.x(j10));
                                            qVar3.p(false);
                                            qVar3.p(z24);
                                            break;
                                        case 5:
                                            z24 = false;
                                            num4 = num2;
                                            qVar3.X(-191819374);
                                            long j11 = p3.x.f26437l;
                                            z19 = z26;
                                            pVar = new sn.p(new p3.x(j11), new p3.x(ib.i.B(6, 0, EchoTheme.INSTANCE, qVar3, qVar3)), new p3.x(j11));
                                            qVar3.p(false);
                                            qVar3.p(z24);
                                            break;
                                        case 6:
                                            qVar3.X(-191814749);
                                            p3.x xVar3 = new p3.x(p3.x.f26437l);
                                            EchoTheme echoTheme3 = EchoTheme.INSTANCE;
                                            num4 = num2;
                                            z24 = false;
                                            pVar = new sn.p(xVar3, new p3.x(ib.i.v(6, 0, echoTheme3, qVar3, qVar3)), new p3.x(echoTheme3.getColors(qVar3, 6).getBorder().getSenaryAlpha(qVar3, 0)));
                                            qVar3.p(false);
                                            z19 = z26;
                                            qVar3.p(z24);
                                            break;
                                        case 7:
                                            qVar3.X(-191809517);
                                            EchoTheme echoTheme4 = EchoTheme.INSTANCE;
                                            pVar = new sn.p(new p3.x(echoTheme4.getColors(qVar3, 6).getFill().getCriticalPrimary(qVar3, 0)), new p3.x(echoTheme4.getColors(qVar3, 6).getText().getOnFillPrimaryCritical(qVar3, 0)), new p3.x(p3.x.f26437l));
                                            z25 = false;
                                            qVar3.p(false);
                                            z24 = z25;
                                            num4 = num2;
                                            z19 = z26;
                                            qVar3.p(z24);
                                            break;
                                        case 8:
                                            qVar3.X(-191803610);
                                            EchoTheme echoTheme5 = EchoTheme.INSTANCE;
                                            pVar = new sn.p(new p3.x(echoTheme5.getColors(qVar3, 6).getFill().getWhiteSenary(qVar3, 0)), new p3.x(echoTheme5.getColors(qVar3, 6).getText().getWhitePrimary(qVar3, 0)), new p3.x(p3.x.f26437l));
                                            z25 = false;
                                            qVar3.p(false);
                                            z24 = z25;
                                            num4 = num2;
                                            z19 = z26;
                                            qVar3.p(z24);
                                            break;
                                        default:
                                            throw com.google.android.gms.internal.play_billing.b.h(-191839843, qVar3, false);
                                    }
                                } else {
                                    num4 = num2;
                                    z19 = z26;
                                    qVar3.X(-1650782668);
                                    int i31 = WhenMappings.$EnumSwitchMapping$0[echoButtonVariant3.ordinal()];
                                    if (i31 != 3) {
                                        if (i31 != 8) {
                                            qVar3.X(-1650397493);
                                            EchoTheme echoTheme6 = EchoTheme.INSTANCE;
                                            z21 = false;
                                            p3.x xVar4 = new p3.x(echoTheme6.getColors(qVar3, 6).getFill().getDenary(qVar3, 0));
                                            p3.x xVar5 = new p3.x(echoTheme6.getColors(qVar3, 6).getText().getInactive(qVar3, 0));
                                            int i32 = p3.x.f26439n;
                                            pVar2 = new sn.p(xVar4, xVar5, new p3.x(p3.x.f26437l));
                                            qVar3.p(false);
                                        } else {
                                            z21 = false;
                                            qVar3.X(-1650736385);
                                            EchoTheme echoTheme7 = EchoTheme.INSTANCE;
                                            p3.x xVar6 = new p3.x(echoTheme7.getColors(qVar3, 6).getFill().getWhiteSenary(qVar3, 0));
                                            p3.x xVar7 = new p3.x(echoTheme7.getColors(qVar3, 6).getText().getWhiteQuaternary(qVar3, 0));
                                            int i33 = p3.x.f26439n;
                                            pVar2 = new sn.p(xVar6, xVar7, new p3.x(p3.x.f26437l));
                                            qVar3.p(false);
                                        }
                                        pVar = pVar2;
                                        z20 = z21;
                                    } else {
                                        qVar3.X(-1650546634);
                                        int i34 = p3.x.f26439n;
                                        long j12 = p3.x.f26437l;
                                        z20 = false;
                                        sn.p pVar3 = new sn.p(new p3.x(j12), new p3.x(EchoTheme.INSTANCE.getColors(qVar3, 6).getText().getInactive(qVar3, 0)), new p3.x(j12));
                                        qVar3.p(false);
                                        pVar = pVar3;
                                    }
                                    qVar3.p(z20);
                                }
                                long j13 = ((p3.x) pVar.f31610a).f26440a;
                                long j14 = ((p3.x) pVar.f31611b).f26440a;
                                long j15 = ((p3.x) pVar.f31612c).f26440a;
                                u2.s2 a10 = i1.w2.a(j13, j1.e.s(200, 0, null, 6), "background_color", qVar3, 432, 8);
                                final u2.s2 a11 = i1.w2.a(j14, j1.e.s(200, 0, null, 6), "foreground_color", qVar3, 432, 8);
                                u2.s2 a12 = i1.w2.a(j15, j1.e.s(200, 0, null, 6), "border_color", qVar3, 432, 8);
                                int[] iArr = WhenMappings.$EnumSwitchMapping$1;
                                int i35 = iArr[echoButtonSize3.ordinal()];
                                if (i35 == 1) {
                                    qVar3.X(-191758360);
                                    xl2 = EchoTheme.INSTANCE.getRadii(qVar3, 6).getXl();
                                    qVar3.p(false);
                                } else if (i35 == 2) {
                                    qVar3.X(-191756853);
                                    xl2 = EchoTheme.INSTANCE.getRadii(qVar3, 6).getTwoXl();
                                    qVar3.p(false);
                                } else if (i35 == 3) {
                                    qVar3.X(-191755219);
                                    xl2 = EchoTheme.INSTANCE.getRadii(qVar3, 6).getThreeXl();
                                    qVar3.p(false);
                                } else if (i35 == 4) {
                                    qVar3.X(-191753556);
                                    xl2 = EchoTheme.INSTANCE.getRadii(qVar3, 6).getFourXl();
                                    qVar3.p(false);
                                } else {
                                    throw com.google.android.gms.internal.play_billing.b.h(-191760155, qVar3, false);
                                }
                                if (num4 != null) {
                                    qVar3.X(-1649329636);
                                    int i36 = iArr[echoButtonSize3.ordinal()];
                                    if (i36 == 1) {
                                        z23 = false;
                                        qVar3.X(-191749656);
                                        f10 = EchoTheme.INSTANCE.getRadii(qVar3, 6).getMd();
                                        qVar3.p(false);
                                    } else if (i36 == 2) {
                                        z23 = false;
                                        qVar3.X(-191748088);
                                        f10 = EchoTheme.INSTANCE.getRadii(qVar3, 6).getLg();
                                        qVar3.p(false);
                                    } else if (i36 == 3) {
                                        z23 = false;
                                        qVar3.X(-191746488);
                                        f10 = EchoTheme.INSTANCE.getRadii(qVar3, 6).getXl();
                                        qVar3.p(false);
                                    } else if (i36 == 4) {
                                        qVar3.X(-191744917);
                                        f10 = EchoTheme.INSTANCE.getRadii(qVar3, 6).getTwoXl();
                                        z23 = false;
                                        qVar3.p(false);
                                    } else {
                                        throw com.google.android.gms.internal.play_billing.b.h(-191751514, qVar3, false);
                                    }
                                    qVar3.p(z23);
                                } else {
                                    qVar3.X(-1649103584);
                                    qVar3.p(false);
                                    f10 = xl2;
                                }
                                int i37 = iArr[echoButtonSize3.ordinal()];
                                if (i37 != 1) {
                                    if (i37 == 2) {
                                        i28 = 10;
                                    } else if (i37 == 3) {
                                        f12 = 14;
                                        f11 = f12;
                                    } else {
                                        if (i37 != 4) {
                                            c6.p();
                                            return;
                                        }
                                        i28 = 18;
                                    }
                                    f12 = i28;
                                    f11 = f12;
                                } else {
                                    f11 = 6;
                                }
                                int i38 = iArr[echoButtonSize3.ordinal()];
                                if (i38 == 1) {
                                    s2Var = a12;
                                    qVar3.X(-191728110);
                                    smRegular500 = EchoTheme.INSTANCE.getTypography(qVar3, 6).getSmRegular500(qVar3, 0);
                                    qVar3.p(false);
                                } else if (i38 == 2) {
                                    s2Var = a12;
                                    qVar3.X(-191726126);
                                    smRegular500 = EchoTheme.INSTANCE.getTypography(qVar3, 6).getSmRegular500(qVar3, 0);
                                    qVar3.p(false);
                                } else if (i38 == 3) {
                                    qVar3.X(-191724108);
                                    s2Var = a12;
                                    smRegular500 = EchoTheme.INSTANCE.getTypography(qVar3, 6).getBaseRegular500(qVar3, 0);
                                    qVar3.p(false);
                                } else if (i38 == 4) {
                                    qVar3.X(-191722060);
                                    smRegular500 = EchoTheme.INSTANCE.getTypography(qVar3, 6).getBaseRegular500(qVar3, 0);
                                    qVar3.p(false);
                                    s2Var = a12;
                                } else {
                                    throw com.google.android.gms.internal.play_billing.b.h(-191730023, qVar3, false);
                                }
                                int i39 = iArr[echoButtonSize3.ordinal()];
                                if (i39 == 1) {
                                    qVar3.X(-191717720);
                                    x42 = EchoTheme.INSTANCE.getSpacings(qVar3, 6).getX4();
                                    qVar3.p(false);
                                } else if (i39 == 2) {
                                    qVar3.X(-191716120);
                                    x42 = EchoTheme.INSTANCE.getSpacings(qVar3, 6).getX4();
                                    qVar3.p(false);
                                } else if (i39 == 3) {
                                    qVar3.X(-191714488);
                                    x42 = EchoTheme.INSTANCE.getSpacings(qVar3, 6).getX5();
                                    qVar3.p(false);
                                } else if (i39 == 4) {
                                    qVar3.X(-191712888);
                                    x42 = EchoTheme.INSTANCE.getSpacings(qVar3, 6).getX5();
                                    qVar3.p(false);
                                } else {
                                    throw com.google.android.gms.internal.play_billing.b.h(-191719611, qVar3, false);
                                }
                                int i40 = iArr[echoButtonSize3.ordinal()];
                                if (i40 == 1) {
                                    qVar3.X(-191709878);
                                    x0_5 = EchoTheme.INSTANCE.getSpacings(qVar3, 6).getX0_5();
                                    i27 = 0;
                                    qVar3.p(false);
                                } else if (i40 == 2) {
                                    qVar3.X(-191708216);
                                    x0_5 = EchoTheme.INSTANCE.getSpacings(qVar3, 6).getX1();
                                    i27 = 0;
                                    qVar3.p(false);
                                } else if (i40 == 3) {
                                    qVar3.X(-191706582);
                                    x0_5 = EchoTheme.INSTANCE.getSpacings(qVar3, 6).getX1_5();
                                    i27 = 0;
                                    qVar3.p(false);
                                } else if (i40 == 4) {
                                    qVar3.X(-191704920);
                                    x0_5 = EchoTheme.INSTANCE.getSpacings(qVar3, 6).getX2();
                                    i27 = 0;
                                    qVar3.p(false);
                                } else {
                                    throw com.google.android.gms.internal.play_billing.b.h(-191711767, qVar3, false);
                                }
                                EchoTheme echoTheme8 = EchoTheme.INSTANCE;
                                float f13 = xl2;
                                float f14 = f10;
                                p3.b1 full = echoTheme8.getShapes(qVar3, 6).getFull(qVar3, i27);
                                Object L = qVar3.L();
                                u2.e eVar = u2.l.f33918a;
                                if (L == eVar) {
                                    L = j0.c.o(qVar3);
                                }
                                p1.l lVar = (p1.l) L;
                                if (fVar4 != null) {
                                    z22 = z13;
                                    fVar3 = fVar4;
                                    e10 = r1.p2.e(r1.p2.u(r1.p2.x(r1.p2.e(qVar4, 1.0f), i3.d.C0, 2), t2.u.P, fVar4.f12083a, 1), 1.0f);
                                } else {
                                    fVar3 = fVar4;
                                    z22 = z13;
                                    e10 = z19 ? r1.p2.e(qVar4, 1.0f) : qVar4;
                                }
                                i3.t c5 = m3.h.c(InteractionsKt.bounceOnPress$default(tVar5.then(e10), lVar, t2.u.P, t2.u.P, 6, null), full);
                                int i41 = i19 & 14;
                                boolean z29 = i41 == 4;
                                i3.t tVar6 = tVar5;
                                Object L2 = qVar3.L();
                                if (z29 || L2 == eVar) {
                                    L2 = new g(str, 8);
                                    qVar3.h0(L2);
                                }
                                i3.t h10 = l1.n.h(l1.n.n(p4.q.c(c5, true, (ho.l) L2), lVar, e5.b(t2.u.P, 3, EchoButton_562pCRU$lambda$1(a11), false), z22 && !z27, new p4.k(0), aVar, 8), EchoButton_562pCRU$lambda$0(a10), p3.h0.f26395b);
                                long EchoButton_562pCRU$lambda$2 = EchoButton_562pCRU$lambda$2(s2Var);
                                int i42 = p3.x.f26439n;
                                if (!p3.x.c(EchoButton_562pCRU$lambda$2, p3.x.f26437l)) {
                                    qVar3.X(-1646948309);
                                    tVar4 = l1.n.j(echoTheme8.getSpacings(qVar3, 6).getXpx(), EchoButton_562pCRU$lambda$2(s2Var), qVar4, full);
                                    r32 = 0;
                                    qVar3.p(false);
                                } else {
                                    r32 = 0;
                                    qVar3.X(-1646863586);
                                    qVar3.p(false);
                                    tVar4 = qVar4;
                                }
                                i3.t a13 = i1.i0.a(r1.d.I(r1.d.G(h10.then(tVar4), t2.u.P, f11, 1), f14, t2.u.P, f13, t2.u.P, 10), j1.e.s(300, r32, j1.y.f18444a, 2), 2);
                                f4.f1 d10 = r1.p.d(i3.d.f13001e, r32);
                                int hashCode = Long.hashCode(qVar3.T);
                                c3.o l4 = qVar3.l();
                                i3.t c10 = i3.a.c(a13, qVar3);
                                h4.h.f11920i.getClass();
                                h4.f fVar5 = h4.g.f11903b;
                                qVar3.b0();
                                if (qVar3.S) {
                                    qVar3.k(fVar5);
                                } else {
                                    qVar3.k0();
                                }
                                h4.e eVar2 = h4.g.f11907f;
                                u2.r.J(eVar2, d10, qVar3);
                                h4.e eVar3 = h4.g.f11906e;
                                u2.r.J(eVar3, l4, qVar3);
                                Integer valueOf = Integer.valueOf(hashCode);
                                h4.e eVar4 = h4.g.f11908g;
                                u2.r.y(qVar3, valueOf, eVar4);
                                h4.d dVar = h4.g.f11909h;
                                u2.r.F(dVar, qVar3);
                                h4.e eVar5 = h4.g.f11905d;
                                u2.r.J(eVar5, c10, qVar3);
                                u2.s2 b10 = j1.f.b(z27 ? t2.u.P : 1.0f, j1.e.s(150, 0, null, 6), "content_alpha", qVar3, 3120, 20);
                                u2.s2 b11 = j1.f.b(z27 ? 1.0f : t2.u.P, j1.e.s(150, 0, null, 6), "spinner_alpha", qVar3, 3120, 20);
                                r1.f fVar6 = r1.j.f29232e;
                                i3.k kVar = i3.d.f13005z0;
                                final s4.y0 y0Var = smRegular500;
                                i3.t b12 = r1.p2.b(m3.h.a(qVar4, EchoButton_562pCRU$lambda$5$0(b10)), t2.u.P, x42, 1);
                                r1.k2 a14 = r1.i2.a(fVar6, kVar, qVar3, 54);
                                int hashCode2 = Long.hashCode(qVar3.T);
                                c3.o l7 = qVar3.l();
                                i3.t c11 = i3.a.c(b12, qVar3);
                                qVar3.b0();
                                if (qVar3.S) {
                                    qVar3.k(fVar5);
                                } else {
                                    qVar3.k0();
                                }
                                u2.r.J(eVar2, a14, qVar3);
                                u2.r.J(eVar3, l7, qVar3);
                                defpackage.f.u(hashCode2, qVar3, eVar4, qVar3, dVar);
                                u2.r.J(eVar5, c11, qVar3);
                                if (num4 != null) {
                                    qVar3.X(403137624);
                                    l1.n.c(kd.a.M(num4.intValue(), qVar3, (i19 >> 15) & 14), null, r1.p2.o(qVar4, x42), null, null, t2.u.P, z28 ? new p3.n(EchoButton_562pCRU$lambda$1(a11), 5) : null, qVar3, u3.c.$stable | 48, 56);
                                    qVar2 = qVar3;
                                    r1.d.g(r1.p2.s(qVar4, x0_5), qVar2);
                                    qVar2.p(false);
                                } else {
                                    qVar2 = qVar3;
                                    qVar2.X(403427846);
                                    qVar2.p(false);
                                }
                                Object L3 = qVar2.L();
                                if (L3 == eVar) {
                                    L3 = new z(29);
                                    qVar2.h0(L3);
                                }
                                i1.l.b(str, null, (ho.l) L3, null, "title", null, c3.k.d(748019730, true, new ho.r() { // from class: io.elevenlabs.ui.components.s0
                                    @Override // ho.r
                                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                        sn.z EchoButton_562pCRU$lambda$5$2$1;
                                        int intValue = ((Integer) obj4).intValue();
                                        EchoButton_562pCRU$lambda$5$2$1 = EchoButtonKt.EchoButton_562pCRU$lambda$5$2$1(s4.y0.this, a11, (i1.o) obj, (String) obj2, (u2.m) obj3, intValue);
                                        return EchoButton_562pCRU$lambda$5$2$1;
                                    }
                                }, qVar2), qVar2, i41 | 1597824, 42);
                                qVar2.p(true);
                                y4.a(m3.h.a(r1.p2.o(qVar4, x42), EchoButton_562pCRU$lambda$5$1(b11)), EchoButton_562pCRU$lambda$1(a11), echoTheme8.getSpacings(qVar2, 6).getX0_5(), 0L, 0, t2.u.P, qVar2, 0, 56);
                                qVar2.p(true);
                                qVar = qVar2;
                                z15 = z27;
                                z18 = z28;
                                echoButtonVariant2 = echoButtonVariant3;
                                echoButtonSize2 = echoButtonSize3;
                                num3 = num4;
                                z17 = z19;
                                z16 = z22;
                                fVar2 = fVar3;
                                tVar3 = tVar6;
                            } else {
                                qVar3.R();
                                echoButtonVariant2 = echoButtonVariant;
                                echoButtonSize2 = echoButtonSize;
                                fVar2 = fVar;
                                z15 = z11;
                                qVar = qVar3;
                                z16 = z13;
                                z17 = z14;
                                tVar3 = tVar2;
                                num3 = num2;
                                z18 = z12;
                            }
                            r10 = qVar.r();
                            if (r10 == null) {
                                r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.t0
                                    @Override // ho.p
                                    public final Object invoke(Object obj, Object obj2) {
                                        sn.z EchoButton_562pCRU$lambda$6;
                                        int intValue = ((Integer) obj2).intValue();
                                        EchoButton_562pCRU$lambda$6 = EchoButtonKt.EchoButton_562pCRU$lambda$6(str, aVar, tVar3, echoButtonVariant2, echoButtonSize2, num3, z16, z17, fVar2, z15, z18, i10, i11, i12, (u2.m) obj, intValue);
                                        return EchoButton_562pCRU$lambda$6;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i23 = i22;
                        i24 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                        if (i24 == 0) {
                        }
                        if (!qVar3.O(i19 & 1, (i19 & 306783379) == 306783378 || (i26 & 3) != 2)) {
                        }
                        r10 = qVar.r();
                        if (r10 == null) {
                        }
                    }
                    i21 = i20;
                    i22 = i12 & 512;
                    if (i22 != 0) {
                    }
                    i23 = i22;
                    i24 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if (i24 == 0) {
                    }
                    if (!qVar3.O(i19 & 1, (i19 & 306783379) == 306783378 || (i26 & 3) != 2)) {
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                    }
                }
                z13 = z6;
                i18 = i12 & 128;
                if (i18 == 0) {
                }
                i19 = i13;
                i20 = i12 & RpcError.MAX_MESSAGE_BYTES;
                if (i20 == 0) {
                }
                i21 = i20;
                i22 = i12 & 512;
                if (i22 != 0) {
                }
                i23 = i22;
                i24 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i24 == 0) {
                }
                if (!qVar3.O(i19 & 1, (i19 & 306783379) == 306783378 || (i26 & 3) != 2)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            num2 = num;
            i17 = i12 & 64;
            if (i17 != 0) {
            }
            z13 = z6;
            i18 = i12 & 128;
            if (i18 == 0) {
            }
            i19 = i13;
            i20 = i12 & RpcError.MAX_MESSAGE_BYTES;
            if (i20 == 0) {
            }
            i21 = i20;
            i22 = i12 & 512;
            if (i22 != 0) {
            }
            i23 = i22;
            i24 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i24 == 0) {
            }
            if (!qVar3.O(i19 & 1, (i19 & 306783379) == 306783378 || (i26 & 3) != 2)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        i15 = i12 & 16;
        if (i15 == 0) {
        }
        i16 = i12 & 32;
        if (i16 == 0) {
        }
        num2 = num;
        i17 = i12 & 64;
        if (i17 != 0) {
        }
        z13 = z6;
        i18 = i12 & 128;
        if (i18 == 0) {
        }
        i19 = i13;
        i20 = i12 & RpcError.MAX_MESSAGE_BYTES;
        if (i20 == 0) {
        }
        i21 = i20;
        i22 = i12 & 512;
        if (i22 != 0) {
        }
        i23 = i22;
        i24 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i24 == 0) {
        }
        if (!qVar3.O(i19 & 1, (i19 & 306783379) == 306783378 || (i26 & 3) != 2)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final void EchoButtonDarkThemePreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1607938110);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(EchoTheme.Mode.Dark, ComposableSingletons$EchoButtonKt.INSTANCE.m1799getLambda$1002324060$ui_release(), qVar, 438, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 11);
        }
    }

    public static final sn.z EchoButtonDarkThemePreview$lambda$0(int i10, u2.m mVar, int i11) {
        EchoButtonDarkThemePreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void EchoButtonExtraSmallSizePreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1180942189);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoButtonKt.INSTANCE.m1803getLambda$951525433$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 12);
        }
    }

    public static final sn.z EchoButtonExtraSmallSizePreview$lambda$0(int i10, u2.m mVar, int i11) {
        EchoButtonExtraSmallSizePreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void EchoButtonFullWidthPreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1724619970);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoButtonKt.INSTANCE.m1802getLambda$885642200$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 14);
        }
    }

    public static final sn.z EchoButtonFullWidthPreview$lambda$0(int i10, u2.m mVar, int i11) {
        EchoButtonFullWidthPreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void EchoButtonMediumSizePreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1099280267);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoButtonKt.INSTANCE.getLambda$1785531621$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 16);
        }
    }

    public static final sn.z EchoButtonMediumSizePreview$lambda$0(int i10, u2.m mVar, int i11) {
        EchoButtonMediumSizePreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void EchoButtonSmallSizePreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-434944525);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoButtonKt.INSTANCE.getLambda$1249760601$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 13);
        }
    }

    public static final sn.z EchoButtonSmallSizePreview$lambda$0(int i10, u2.m mVar, int i11) {
        EchoButtonSmallSizePreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void EchoButtonStatesPreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1727650057);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoButtonKt.INSTANCE.m1800getLambda$1768537775$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 10);
        }
    }

    public static final sn.z EchoButtonStatesPreview$lambda$0(int i10, u2.m mVar, int i11) {
        EchoButtonStatesPreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final long EchoButton_562pCRU$lambda$0(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    private static final long EchoButton_562pCRU$lambda$1(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    private static final long EchoButton_562pCRU$lambda$2(u2.s2 s2Var) {
        return ((p3.x) s2Var.getValue()).f26440a;
    }

    public static final sn.z EchoButton_562pCRU$lambda$4$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 0);
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    private static final float EchoButton_562pCRU$lambda$5$0(u2.s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    private static final float EchoButton_562pCRU$lambda$5$1(u2.s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final i1.m0 EchoButton_562pCRU$lambda$5$2$0$0(i1.q qVar) {
        qVar.getClass();
        return i1.l.c(i1.y0.e(j1.e.s(150, 0, null, 6), 2), i1.y0.f(j1.e.s(150, 0, null, 6), 2));
    }

    public static final sn.z EchoButton_562pCRU$lambda$5$2$1(s4.y0 y0Var, u2.s2 s2Var, i1.o oVar, String str, u2.m mVar, int i10) {
        oVar.getClass();
        str.getClass();
        j7.d(str, null, EchoButton_562pCRU$lambda$1(s2Var), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, y0Var, mVar, (i10 >> 3) & 14, 24960, 110586);
        return sn.z.f31622a;
    }

    public static final sn.z EchoButton_562pCRU$lambda$6(String str, ho.a aVar, i3.t tVar, EchoButtonVariant echoButtonVariant, EchoButtonSize echoButtonSize, Integer num, boolean z6, boolean z10, h5.f fVar, boolean z11, boolean z12, int i10, int i11, int i12, u2.m mVar, int i13) {
        m1835EchoButton562pCRU(str, aVar, tVar, echoButtonVariant, echoButtonSize, num, z6, z10, fVar, z11, z12, mVar, u2.r.M(i10 | 1), u2.r.M(i11), i12);
        return sn.z.f31622a;
    }

    public static final void ElevenButtonLargeSizePreview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1889357301);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoButtonKt.INSTANCE.m1801getLambda$2090401807$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 15);
        }
    }

    public static final sn.z ElevenButtonLargeSizePreview$lambda$0(int i10, u2.m mVar, int i11) {
        ElevenButtonLargeSizePreview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
