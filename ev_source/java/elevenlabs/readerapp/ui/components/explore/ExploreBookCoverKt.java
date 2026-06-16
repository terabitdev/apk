package io.elevenlabs.readerapp.ui.components.explore;

import a2.o0;
import a2.o2;
import a2.y;
import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import f4.f1;
import i3.t;
import i4.j1;
import i4.w1;
import io.elevenlabs.readerapp.ui.components.CoverAspectRatioKt;
import io.elevenlabs.readerapp.ui.components.i0;
import io.elevenlabs.readerapp.ui.components.r0;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.BlurredImagePlaceholderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.extensions.CoilExtensionsKt;
import io.elevenlabs.ui.extensions.GlassModifiersKt;
import io.elevenlabs.ui.extensions.GlassState;
import io.livekit.android.rpc.RpcError;
import ja.c1;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import p3.b1;
import p3.h0;
import p3.k0;
import p3.n0;
import p3.p0;
import p3.q0;
import p3.s;
import p3.s0;
import p3.v0;
import p3.w0;
import p3.x;
import q2.j7;
import q2.y2;
import r1.p2;
import r1.w;
import s4.y0;
import sn.z;
import t2.u;
import u2.r;
import u2.r1;
import u2.t2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u001aÅ\u0001\u0010\u001c\u001a\u00020\u00102\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a;\u0010&\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'\u001a!\u0010+\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u0015H\u0003¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010-\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b-\u0010.\u001a/\u00105\u001a\u00020\u00102\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\b\b\u0002\u00101\u001a\u00020\u00182\b\b\u0002\u00102\u001a\u00020 H\u0003¢\u0006\u0004\b3\u00104\u001a/\u00109\u001a\u0002082\u0006\u0010!\u001a\u00020 2\u0006\u00107\u001a\u0002062\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b9\u0010:\u001a\u0017\u0010<\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u0000H\u0002¢\u0006\u0004\b<\u0010=\u001a\u000f\u0010>\u001a\u00020\u0010H\u0007¢\u0006\u0004\b>\u0010?\u001a\u000f\u0010@\u001a\u00020\u0010H\u0007¢\u0006\u0004\b@\u0010?\u001a\u000f\u0010A\u001a\u00020\u0010H\u0007¢\u0006\u0004\bA\u0010?\u001a\u000f\u0010B\u001a\u00020\u0010H\u0007¢\u0006\u0004\bB\u0010?\"\u0014\u0010D\u001a\u00020C8\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010E\"\u0014\u0010F\u001a\u00020C8\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010E\"\u0014\u0010G\u001a\u00020C8\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010E\"\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000b0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L²\u0006\u0010\u0010K\u001a\u0004\u0018\u00010/8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "imageUrl", "Lio/elevenlabs/readerapp/ui/components/explore/BookCoverSize;", "size", "Li3/t;", "modifier", "Lh5/f;", "maxWidth", "", "fitToImageHeight", "centerLandscape", "Lp3/x;", "backgroundColor", "borderColor", "contentDescription", "Lkotlin/Function0;", "Lsn/z;", "onClick", "onPreviewClick", "isPlayingPreview", "blurPlaceholder", "", "coverAspectRatio", "collapseSquarishToSquare", "Li3/g;", "overrideAlignment", "ExploreBookCover-B29P9lA", "(Ljava/lang/String;Lio/elevenlabs/readerapp/ui/components/explore/BookCoverSize;Li3/t;FZZJJLjava/lang/String;Lho/a;Lho/a;ZLjava/lang/String;Ljava/lang/Double;ZLi3/g;Lu2/m;III)V", "ExploreBookCover", "Lqc/k;", "painter", "alignment", "Lp3/b1;", "shape", "Lh5/m;", "layoutDirection", "Lh5/c;", "density", "drawWithImageClip", "(Li3/t;Lqc/k;Li3/g;Lp3/b1;Lh5/m;Lh5/c;)Li3/t;", "Lp3/k0;", "bitmap", "aspectRatio", "BlurPlaceholder", "(Lp3/k0;Ljava/lang/Double;Lu2/m;I)V", "LoadingPlaceholder", "(Lio/elevenlabs/readerapp/ui/components/explore/BookCoverSize;Lu2/m;I)V", "Lo3/e;", "imageIntrinsicSize", "imageAlignment", "coverShape", "SpineOverlay-qYKer5k", "(Lo3/e;Li3/g;Lp3/b1;Lu2/m;II)V", "SpineOverlay", "Lo3/c;", "imageRect", "Lp3/v0;", "buildImageClipPath", "(Lp3/b1;Lo3/c;Lh5/m;Lh5/c;)Lp3/v0;", "url", "previewColor", "(Ljava/lang/String;)J", "Preview_ExploreBookCover_WithPreviewButton", "(Lu2/m;I)V", "Preview_ExploreBookCover_PreviewPlaying", "Preview_ExploreBookCover_AllSizes", "Preview_ExploreBookCover_BlurPlaceholder", "", "MIN_SPINE_ASPECT", TokenNames.F, "MAX_SPINE_ASPECT", "SPINE_REFERENCE_WIDTH_PX", "", "PREVIEW_COLORS", "Ljava/util/List;", "intrinsicSize", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExploreBookCoverKt {
    private static final float MAX_SPINE_ASPECT = 0.8333333f;
    private static final float MIN_SPINE_ASPECT = 0.5f;
    private static final List<x> PREVIEW_COLORS = ig.f.I(new x(h0.e(4285156499L)), new x(h0.e(4279861956L)), new x(h0.e(4287285542L)), new x(h0.e(4294924638L)), new x(h0.e(4294953530L)), new x(h0.e(4284370850L)), new x(h0.e(4294214751L)), new x(h0.e(4282025727L)), new x(h0.e(4290085773L)));
    private static final float SPINE_REFERENCE_WIDTH_PX = 120.0f;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookCoverSize.values().length];
            try {
                iArr[BookCoverSize.XSmall.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookCoverSize.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookCoverSize.Compact.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BookCoverSize.Medium.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final void BlurPlaceholder(k0 k0Var, Double d10, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        t d11;
        int i12;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-715055308);
        if ((i10 & 6) == 0) {
            if (qVar.h(k0Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(d10)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            if (d10 != null) {
                d11 = r1.d.j(qVar2, (float) d10.doubleValue(), true);
            } else {
                d11 = p2.d(qVar2, 1.0f);
            }
            BlurredImagePlaceholderKt.BlurredImagePlaceholder(k0Var, d11, qVar, i11 & 14, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a2.i(k0Var, d10, i10, 10);
        }
    }

    public static final z BlurPlaceholder$lambda$0(k0 k0Var, Double d10, int i10, u2.m mVar, int i11) {
        BlurPlaceholder(k0Var, d10, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0230  */
    /* renamed from: ExploreBookCover-B29P9lA */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1163ExploreBookCoverB29P9lA(final String str, final BookCoverSize bookCoverSize, t tVar, float f10, boolean z6, boolean z10, long j4, long j10, String str2, ho.a aVar, ho.a aVar2, boolean z11, String str3, Double d10, boolean z12, i3.g gVar, u2.m mVar, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        float f11;
        int i15;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        long j11;
        int i18;
        final long j12;
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
        int i30;
        int i31;
        int i32;
        int i33;
        u2.q qVar;
        final t tVar2;
        final String str4;
        final Double d11;
        final boolean z15;
        final i3.g gVar2;
        final float f12;
        final boolean z16;
        final boolean z17;
        final long j13;
        final ho.a aVar3;
        final ho.a aVar4;
        final boolean z18;
        final String str5;
        r1 r10;
        t tVar3;
        String str6;
        ho.a aVar5;
        ho.a aVar6;
        boolean z19;
        boolean z20;
        int i34;
        String str7;
        i3.g gVar3;
        int i35;
        t2 t2Var;
        o3.e eVar;
        String str8;
        ad.i iVar;
        boolean f13;
        Object L;
        Double d12;
        o3.e ExploreBookCover_B29P9lA$lambda$1;
        boolean z21;
        i3.g gVar4;
        float b10;
        qc.k kVar;
        float b11;
        i3.q qVar2;
        t tVar4;
        t tVar5;
        i3.g gVar5;
        b1 b1Var;
        String str9;
        boolean z22;
        boolean z23;
        int i36;
        int i37;
        i3.l lVar = i3.d.f13001e;
        bookCoverSize.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-2068670899);
        if ((i10 & 6) == 0) {
            i13 = (qVar3.f(str) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= qVar3.d(bookCoverSize.ordinal()) ? 32 : 16;
        }
        int i38 = i12 & 4;
        if (i38 != 0) {
            i13 |= 384;
        } else if ((i10 & 384) == 0) {
            i13 |= qVar3.f(tVar) ? RpcError.MAX_MESSAGE_BYTES : 128;
            i14 = i10 & 3072;
            int i39 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i14 != 0) {
                if ((i12 & 8) == 0) {
                    f11 = f10;
                    if (qVar3.c(f11)) {
                        i37 = 2048;
                        i13 |= i37;
                    }
                } else {
                    f11 = f10;
                }
                i37 = 1024;
                i13 |= i37;
            } else {
                f11 = f10;
            }
            i15 = i12 & 16;
            int i40 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (i15 == 0) {
                i13 |= 24576;
                z13 = z6;
                i16 = 32;
            } else {
                i16 = 32;
                if ((i10 & 24576) == 0) {
                    z13 = z6;
                    i13 |= qVar3.g(z13) ? 16384 : 8192;
                } else {
                    z13 = z6;
                }
            }
            i17 = i12 & 32;
            if (i17 == 0) {
                i13 |= 196608;
                z14 = z10;
            } else {
                z14 = z10;
                if ((i10 & 196608) == 0) {
                    i13 |= qVar3.g(z14) ? 131072 : 65536;
                }
            }
            if ((i10 & 1572864) != 0) {
                j11 = j4;
                i13 |= ((i12 & 64) == 0 && qVar3.e(j11)) ? 1048576 : 524288;
            } else {
                j11 = j4;
            }
            if ((i10 & 12582912) != 0) {
                i18 = i38;
                j12 = j10;
                i13 |= ((i12 & 128) == 0 && qVar3.e(j12)) ? 8388608 : 4194304;
            } else {
                i18 = i38;
                j12 = j10;
            }
            i19 = i12 & RpcError.MAX_MESSAGE_BYTES;
            if (i19 == 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                i13 |= qVar3.f(str2) ? 67108864 : 33554432;
            }
            i20 = i12 & 512;
            if (i20 == 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                i21 = i20;
                i13 |= qVar3.h(aVar) ? 536870912 : 268435456;
                i22 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i22 != 0) {
                    i24 = i11 | 6;
                    i23 = i22;
                } else if ((i11 & 6) == 0) {
                    i23 = i22;
                    i24 = i11 | (qVar3.h(aVar2) ? 4 : 2);
                } else {
                    i23 = i22;
                    i24 = i11;
                }
                i25 = i12 & 2048;
                if (i25 != 0) {
                    i24 |= 48;
                    i26 = i25;
                } else if ((i11 & 48) == 0) {
                    i26 = i25;
                    i24 |= qVar3.g(z11) ? i16 : 16;
                } else {
                    i26 = i25;
                }
                int i41 = i24;
                i27 = i12 & 4096;
                if (i27 != 0) {
                    i28 = i41 | 384;
                } else if ((i11 & 384) == 0) {
                    i28 = i41 | (qVar3.f(str3) ? RpcError.MAX_MESSAGE_BYTES : 128);
                } else {
                    i28 = i41;
                }
                i29 = i12 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                if (i29 != 0) {
                    i30 = i28 | 3072;
                } else {
                    int i42 = i28;
                    if ((i11 & 3072) == 0) {
                        if (qVar3.f(d10)) {
                            i39 = 2048;
                        }
                        i30 = i42 | i39;
                    } else {
                        i30 = i42;
                    }
                }
                i31 = i12 & 16384;
                if (i31 != 0) {
                    i32 = i30 | 24576;
                } else {
                    i32 = i30;
                    if ((i11 & 24576) == 0) {
                        if (qVar3.g(z12)) {
                            i40 = 16384;
                        }
                        i32 |= i40;
                        i33 = i12 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                        if (i33 == 0) {
                            i32 |= 196608;
                        } else if ((i11 & 196608) == 0) {
                            i32 |= qVar3.f(gVar) ? 131072 : 65536;
                        }
                        if (!qVar3.O(i13 & 1, (i13 & 306783379) == 306783378 || (i32 & 74899) != 74898)) {
                            qVar3.T();
                            int i43 = i10 & 1;
                            i3.q qVar4 = i3.q.f13017a;
                            if (i43 == 0 || qVar3.y()) {
                                tVar3 = i18 != 0 ? qVar4 : tVar;
                                if ((i12 & 8) != 0) {
                                    f11 = h5.h.b(bookCoverSize.getSize());
                                    i13 &= -7169;
                                }
                                if (i15 != 0) {
                                    z13 = false;
                                }
                                if (i17 != 0) {
                                    z14 = false;
                                }
                                if ((i12 & 64) != 0) {
                                    j11 = EchoTheme.INSTANCE.getColors(qVar3, EchoTheme.$stable).getFill().getDenary(qVar3, EchoThemeColors.Fill.$stable);
                                    i13 &= -3670017;
                                }
                                if ((i12 & 128) != 0) {
                                    j12 = EchoTheme.INSTANCE.getColors(qVar3, EchoTheme.$stable).getBorder().getSeptenary(qVar3, EchoThemeColors.Border.$stable);
                                    i13 &= -29360129;
                                }
                                str6 = i19 != 0 ? null : str2;
                                aVar5 = i21 != 0 ? null : aVar;
                                aVar6 = i23 != 0 ? null : aVar2;
                                z19 = i26 != 0 ? false : z11;
                                String str10 = i27 != 0 ? null : str3;
                                d11 = i29 != 0 ? null : d10;
                                z20 = i31 != 0 ? false : z12;
                                if (i33 != 0) {
                                    String str11 = str10;
                                    i34 = i13;
                                    str7 = str11;
                                    gVar3 = null;
                                } else {
                                    String str12 = str10;
                                    i34 = i13;
                                    str7 = str12;
                                    gVar3 = gVar;
                                }
                            } else {
                                qVar3.R();
                                if ((i12 & 8) != 0) {
                                    i13 &= -7169;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                }
                                if ((i12 & 128) != 0) {
                                    i13 &= -29360129;
                                }
                                tVar3 = tVar;
                                str6 = str2;
                                aVar5 = aVar;
                                aVar6 = aVar2;
                                z19 = z11;
                                d11 = d10;
                                z20 = z12;
                                gVar3 = gVar;
                                i34 = i13;
                                str7 = str3;
                            }
                            qVar3.q();
                            String str13 = str6;
                            GlassState rememberGlassState = GlassModifiersKt.rememberGlassState(qVar3, 0);
                            EchoTheme echoTheme = EchoTheme.INSTANCE;
                            int i44 = EchoTheme.$stable;
                            ho.a aVar7 = aVar5;
                            boolean z24 = z13;
                            b1 sm = echoTheme.getShapes(qVar3, i44).getSm(qVar3, EchoThemeShapes.$stable);
                            Context context = (Context) qVar3.j(AndroidCompositionLocals_androidKt.f2291b);
                            boolean z25 = z14;
                            h5.m mVar2 = (h5.m) qVar3.j(j1.f13135n);
                            h5.c cVar = (h5.c) qVar3.j(j1.f13129h);
                            t2 t2Var2 = w1.f13252a;
                            boolean z26 = ((Boolean) qVar3.j(t2Var2)).booleanValue() && str != null;
                            boolean z27 = (i34 & 14) == 4;
                            Object L2 = qVar3.L();
                            boolean z28 = z27;
                            u2.e eVar2 = u2.l.f33918a;
                            if (z28 || L2 == eVar2) {
                                if (z26) {
                                    i35 = i44;
                                    t2Var = t2Var2;
                                    eVar = new o3.e((Float.floatToRawIntBits(200.0f) << i16) | (Float.floatToRawIntBits(300.0f) & 4294967295L));
                                } else {
                                    i35 = i44;
                                    t2Var = t2Var2;
                                    eVar = null;
                                }
                                L2 = r.A(eVar);
                                qVar3.h0(L2);
                            } else {
                                i35 = i44;
                                t2Var = t2Var2;
                            }
                            z0 z0Var = (z0) L2;
                            k0 rememberBase64ImageBitmap = CoilExtensionsKt.rememberBase64ImageBitmap(str7, qVar3, (i32 >> 6) & 14);
                            if (str != null) {
                                String str14 = !z26 ? str : null;
                                if (str14 != null) {
                                    str8 = str7;
                                    ad.h coverData = CoilExtensionsKt.coverData(new ad.h(context), str14);
                                    coverData.b();
                                    iVar = coverData.a();
                                    f13 = qVar3.f(z0Var);
                                    L = qVar3.L();
                                    if (!f13 || L == eVar2) {
                                        L = new y(z0Var, 13);
                                        qVar3.h0(L);
                                    }
                                    qc.k j14 = qc.m.j(iVar, (ho.l) L, f4.q.f8840c, qVar3);
                                    if (d11 != null) {
                                        double doubleValue = d11.doubleValue();
                                        if (Math.abs(doubleValue) <= Double.MAX_VALUE && doubleValue > 0.0d) {
                                            d12 = d11;
                                            ExploreBookCover_B29P9lA$lambda$1 = ExploreBookCover_B29P9lA$lambda$1(z0Var);
                                            long j15 = j11;
                                            if (ExploreBookCover_B29P9lA$lambda$1 == null) {
                                                ExploreBookCover_B29P9lA$lambda$1 = d12 != null ? new o3.e((Float.floatToRawIntBits((float) d12.doubleValue()) << i16) | (Float.floatToRawIntBits(1.0f) & 4294967295L)) : null;
                                            }
                                            if (ExploreBookCover_B29P9lA$lambda$1 != null) {
                                                long j16 = ExploreBookCover_B29P9lA$lambda$1.f24778a;
                                                if (Float.intBitsToFloat((int) (j16 >> i16)) > Float.intBitsToFloat((int) (j16 & 4294967295L))) {
                                                    z21 = true;
                                                    if (gVar3 != null) {
                                                        gVar4 = (bookCoverSize == BookCoverSize.Square || (z25 && z21)) ? lVar : i3.d.Z;
                                                    } else {
                                                        gVar4 = gVar3;
                                                    }
                                                    if (z24) {
                                                        if (ExploreBookCover_B29P9lA$lambda$1 != null) {
                                                            o3.e eVar3 = !o3.e.e(ExploreBookCover_B29P9lA$lambda$1.f24778a) ? ExploreBookCover_B29P9lA$lambda$1 : null;
                                                            if (eVar3 != null) {
                                                                long j17 = eVar3.f24778a;
                                                                b10 = ae.l.l((Float.intBitsToFloat((int) (j17 >> i16)) / Float.intBitsToFloat((int) (j17 & 4294967295L))) * h5.h.a(bookCoverSize.getSize()), h5.h.b(bookCoverSize.getSize()), f11);
                                                            }
                                                        }
                                                        b10 = h5.h.b(bookCoverSize.getSize());
                                                    } else {
                                                        b10 = f11;
                                                    }
                                                    if (!z24) {
                                                        kVar = j14;
                                                        if (ExploreBookCover_B29P9lA$lambda$1 != null) {
                                                            o3.e eVar4 = !o3.e.e(ExploreBookCover_B29P9lA$lambda$1.f24778a) ? ExploreBookCover_B29P9lA$lambda$1 : null;
                                                            if (eVar4 != null) {
                                                                long j18 = eVar4.f24778a;
                                                                b11 = (Float.intBitsToFloat((int) (j18 & 4294967295L)) / Float.intBitsToFloat((int) (j18 >> i16))) * f11;
                                                                float a10 = h5.h.a(bookCoverSize.getSize());
                                                                if (b11 > a10) {
                                                                    b11 = a10;
                                                                }
                                                            }
                                                        }
                                                        b11 = h5.h.a(bookCoverSize.getSize());
                                                    } else {
                                                        kVar = j14;
                                                        b11 = (z20 && CoverAspectRatioKt.isCoverSquarish(d11)) ? h5.h.b(bookCoverSize.getSize()) : h5.h.a(bookCoverSize.getSize());
                                                    }
                                                    t f14 = p2.f(p2.s(tVar3, b10), b11);
                                                    if (aVar7 == null) {
                                                        qVar2 = qVar4;
                                                        tVar4 = tVar3;
                                                        tVar5 = l1.n.p(qVar4, false, null, new p4.k(0), null, aVar7, 11);
                                                    } else {
                                                        qVar2 = qVar4;
                                                        tVar4 = tVar3;
                                                        tVar5 = qVar2;
                                                    }
                                                    t c5 = m3.h.c(f14.then(tVar5), sm);
                                                    w0 w0Var = h0.f26395b;
                                                    qc.k kVar2 = kVar;
                                                    t j19 = l1.n.j((float) 0.25d, j12, l1.n.h(c5, j15, w0Var), sm);
                                                    f1 d13 = r1.p.d(i3.d.f12997a, false);
                                                    float f15 = f11;
                                                    long j20 = j12;
                                                    int hashCode = Long.hashCode(qVar3.T);
                                                    c3.o l4 = qVar3.l();
                                                    t c10 = i3.a.c(j19, qVar3);
                                                    h4.h.f11920i.getClass();
                                                    h4.f fVar = h4.g.f11903b;
                                                    qVar3.b0();
                                                    if (!qVar3.S) {
                                                        qVar3.k(fVar);
                                                    } else {
                                                        qVar3.k0();
                                                    }
                                                    h4.e eVar5 = h4.g.f11907f;
                                                    r.J(eVar5, d13, qVar3);
                                                    h4.e eVar6 = h4.g.f11906e;
                                                    r.J(eVar6, l4, qVar3);
                                                    Integer valueOf = Integer.valueOf(hashCode);
                                                    h4.e eVar7 = h4.g.f11908g;
                                                    r.y(qVar3, valueOf, eVar7);
                                                    h4.d dVar = h4.g.f11909h;
                                                    r.F(dVar, qVar3);
                                                    h4.e eVar8 = h4.g.f11905d;
                                                    r.J(eVar8, c10, qVar3);
                                                    o3.e eVar9 = ExploreBookCover_B29P9lA$lambda$1;
                                                    t glassSource = GlassModifiersKt.glassSource(p2.d(qVar2, 1.0f), rememberGlassState);
                                                    f1 d14 = r1.p.d(gVar4, false);
                                                    i3.g gVar6 = gVar4;
                                                    int hashCode2 = Long.hashCode(qVar3.T);
                                                    c3.o l7 = qVar3.l();
                                                    t c11 = i3.a.c(glassSource, qVar3);
                                                    qVar3.b0();
                                                    if (!qVar3.S) {
                                                        qVar3.k(fVar);
                                                    } else {
                                                        qVar3.k0();
                                                    }
                                                    r.J(eVar5, d14, qVar3);
                                                    r.J(eVar6, l7, qVar3);
                                                    defpackage.f.u(hashCode2, qVar3, eVar7, qVar3, dVar);
                                                    r.J(eVar8, c11, qVar3);
                                                    if (!z26) {
                                                        qVar3.X(814705795);
                                                        r1.p.a(l1.n.h(p2.d(qVar2, 1.0f), previewColor(str), w0Var), qVar3, 0);
                                                        qVar3.p(false);
                                                        gVar5 = gVar6;
                                                        b1Var = sm;
                                                        str9 = str13;
                                                    } else {
                                                        qVar3.X(814837483);
                                                        fe.h0 a11 = t2Var.a(Boolean.FALSE);
                                                        id.l lVar2 = new id.l(kVar2, gVar6, sm, mVar2, cVar, str13);
                                                        gVar5 = gVar6;
                                                        b1Var = sm;
                                                        str9 = str13;
                                                        r.a(a11, c3.k.d(1307121501, true, lVar2, qVar3), qVar3, 56);
                                                        if (ExploreBookCover_B29P9lA$lambda$1(z0Var) == null) {
                                                            qVar3.X(815653899);
                                                            if (rememberBase64ImageBitmap != null) {
                                                                qVar3.X(815701639);
                                                                z22 = false;
                                                                BlurPlaceholder(rememberBase64ImageBitmap, d12, qVar3, 0);
                                                                qVar3.p(false);
                                                            } else {
                                                                z22 = false;
                                                                qVar3.X(815827282);
                                                                LoadingPlaceholder(bookCoverSize, qVar3, (i34 >> 3) & 14);
                                                                qVar3.p(false);
                                                            }
                                                            qVar3.p(z22);
                                                        } else {
                                                            z22 = false;
                                                            qVar3.X(815921057);
                                                            qVar3.p(false);
                                                        }
                                                        qVar3.p(z22);
                                                    }
                                                    qVar3.p(true);
                                                    m1164SpineOverlayqYKer5k(eVar9, gVar5, b1Var, qVar3, 0, 0);
                                                    qVar = qVar3;
                                                    if (aVar6 == null) {
                                                        qVar.X(-156035130);
                                                        i3.l lVar3 = i3.d.Y;
                                                        r1.t tVar6 = r1.t.f29349a;
                                                        int i45 = i35;
                                                        t o6 = p2.o(r1.d.E(tVar6.b(qVar2, lVar3), echoTheme.getSpacings(qVar, i45).getX2()), 36);
                                                        z1.g gVar7 = z1.h.f39128a;
                                                        i3.q qVar5 = qVar2;
                                                        t p10 = l1.n.p(l1.n.j(1, echoTheme.getColors(qVar, i45).getBorder().getSenaryAlpha(qVar, EchoThemeColors.Border.$stable), m3.h.c(o6, gVar7), gVar7), false, null, new p4.k(0), null, aVar6, 11);
                                                        f1 d15 = r1.p.d(lVar, false);
                                                        int hashCode3 = Long.hashCode(qVar.T);
                                                        c3.o l10 = qVar.l();
                                                        t c12 = i3.a.c(p10, qVar);
                                                        qVar.b0();
                                                        if (qVar.S) {
                                                            qVar.k(fVar);
                                                        } else {
                                                            qVar.k0();
                                                        }
                                                        r.J(eVar5, d15, qVar);
                                                        r.J(eVar6, l10, qVar);
                                                        defpackage.f.u(hashCode3, qVar, eVar7, qVar, dVar);
                                                        r.J(eVar8, c12, qVar);
                                                        EchoThemeColors.Fill fill = echoTheme.getColors(qVar, i45).getFill();
                                                        int i46 = EchoThemeColors.Fill.$stable;
                                                        r1.p.a(l1.n.h(GlassModifiersKt.m1980glassEffectEnRY0Kc(tVar6.a(), rememberGlassState, 5, fill.getSenaryAlpha(qVar, i46)), echoTheme.getColors(qVar, i45).getFill().getSenaryAlpha(qVar, i46), gVar7), qVar, 0);
                                                        u3.c M = kd.a.M(z19 ? R.drawable.pause_round : R.drawable.volume_full, qVar, 0);
                                                        if (z19) {
                                                            i36 = io.elevenlabs.readerapp.R.string.accessibility_voice_preview_pause;
                                                        } else {
                                                            i36 = io.elevenlabs.readerapp.R.string.accessibility_voice_preview_play;
                                                        }
                                                        y2.a(M, kj.c.R(qVar, i36), p2.o(qVar5, 16), echoTheme.getColors(qVar, i45).getIcon().getWhitePrimary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 384, 0);
                                                        z23 = true;
                                                        qVar.p(true);
                                                        qVar.p(false);
                                                    } else {
                                                        z23 = true;
                                                        qVar.X(-154600357);
                                                        qVar.p(false);
                                                    }
                                                    qVar.p(z23);
                                                    z16 = z24;
                                                    z17 = z25;
                                                    str4 = str9;
                                                    str5 = str8;
                                                    aVar4 = aVar6;
                                                    gVar2 = gVar3;
                                                    z15 = z20;
                                                    tVar2 = tVar4;
                                                    z18 = z19;
                                                    aVar3 = aVar7;
                                                    j12 = j20;
                                                    j13 = j15;
                                                    f12 = f15;
                                                }
                                            }
                                            z21 = false;
                                            if (gVar3 != null) {
                                            }
                                            if (z24) {
                                            }
                                            if (!z24) {
                                            }
                                            t f142 = p2.f(p2.s(tVar3, b10), b11);
                                            if (aVar7 == null) {
                                            }
                                            t c52 = m3.h.c(f142.then(tVar5), sm);
                                            w0 w0Var2 = h0.f26395b;
                                            qc.k kVar22 = kVar;
                                            t j192 = l1.n.j((float) 0.25d, j12, l1.n.h(c52, j15, w0Var2), sm);
                                            f1 d132 = r1.p.d(i3.d.f12997a, false);
                                            float f152 = f11;
                                            long j202 = j12;
                                            int hashCode4 = Long.hashCode(qVar3.T);
                                            c3.o l42 = qVar3.l();
                                            t c102 = i3.a.c(j192, qVar3);
                                            h4.h.f11920i.getClass();
                                            h4.f fVar2 = h4.g.f11903b;
                                            qVar3.b0();
                                            if (!qVar3.S) {
                                            }
                                            h4.e eVar52 = h4.g.f11907f;
                                            r.J(eVar52, d132, qVar3);
                                            h4.e eVar62 = h4.g.f11906e;
                                            r.J(eVar62, l42, qVar3);
                                            Integer valueOf2 = Integer.valueOf(hashCode4);
                                            h4.e eVar72 = h4.g.f11908g;
                                            r.y(qVar3, valueOf2, eVar72);
                                            h4.d dVar2 = h4.g.f11909h;
                                            r.F(dVar2, qVar3);
                                            h4.e eVar82 = h4.g.f11905d;
                                            r.J(eVar82, c102, qVar3);
                                            o3.e eVar92 = ExploreBookCover_B29P9lA$lambda$1;
                                            t glassSource2 = GlassModifiersKt.glassSource(p2.d(qVar2, 1.0f), rememberGlassState);
                                            f1 d142 = r1.p.d(gVar4, false);
                                            i3.g gVar62 = gVar4;
                                            int hashCode22 = Long.hashCode(qVar3.T);
                                            c3.o l72 = qVar3.l();
                                            t c112 = i3.a.c(glassSource2, qVar3);
                                            qVar3.b0();
                                            if (!qVar3.S) {
                                            }
                                            r.J(eVar52, d142, qVar3);
                                            r.J(eVar62, l72, qVar3);
                                            defpackage.f.u(hashCode22, qVar3, eVar72, qVar3, dVar2);
                                            r.J(eVar82, c112, qVar3);
                                            if (!z26) {
                                            }
                                            qVar3.p(true);
                                            m1164SpineOverlayqYKer5k(eVar92, gVar5, b1Var, qVar3, 0, 0);
                                            qVar = qVar3;
                                            if (aVar6 == null) {
                                            }
                                            qVar.p(z23);
                                            z16 = z24;
                                            z17 = z25;
                                            str4 = str9;
                                            str5 = str8;
                                            aVar4 = aVar6;
                                            gVar2 = gVar3;
                                            z15 = z20;
                                            tVar2 = tVar4;
                                            z18 = z19;
                                            aVar3 = aVar7;
                                            j12 = j202;
                                            j13 = j15;
                                            f12 = f152;
                                        }
                                    }
                                    d12 = null;
                                    ExploreBookCover_B29P9lA$lambda$1 = ExploreBookCover_B29P9lA$lambda$1(z0Var);
                                    long j152 = j11;
                                    if (ExploreBookCover_B29P9lA$lambda$1 == null) {
                                    }
                                    if (ExploreBookCover_B29P9lA$lambda$1 != null) {
                                    }
                                    z21 = false;
                                    if (gVar3 != null) {
                                    }
                                    if (z24) {
                                    }
                                    if (!z24) {
                                    }
                                    t f1422 = p2.f(p2.s(tVar3, b10), b11);
                                    if (aVar7 == null) {
                                    }
                                    t c522 = m3.h.c(f1422.then(tVar5), sm);
                                    w0 w0Var22 = h0.f26395b;
                                    qc.k kVar222 = kVar;
                                    t j1922 = l1.n.j((float) 0.25d, j12, l1.n.h(c522, j152, w0Var22), sm);
                                    f1 d1322 = r1.p.d(i3.d.f12997a, false);
                                    float f1522 = f11;
                                    long j2022 = j12;
                                    int hashCode42 = Long.hashCode(qVar3.T);
                                    c3.o l422 = qVar3.l();
                                    t c1022 = i3.a.c(j1922, qVar3);
                                    h4.h.f11920i.getClass();
                                    h4.f fVar22 = h4.g.f11903b;
                                    qVar3.b0();
                                    if (!qVar3.S) {
                                    }
                                    h4.e eVar522 = h4.g.f11907f;
                                    r.J(eVar522, d1322, qVar3);
                                    h4.e eVar622 = h4.g.f11906e;
                                    r.J(eVar622, l422, qVar3);
                                    Integer valueOf22 = Integer.valueOf(hashCode42);
                                    h4.e eVar722 = h4.g.f11908g;
                                    r.y(qVar3, valueOf22, eVar722);
                                    h4.d dVar22 = h4.g.f11909h;
                                    r.F(dVar22, qVar3);
                                    h4.e eVar822 = h4.g.f11905d;
                                    r.J(eVar822, c1022, qVar3);
                                    o3.e eVar922 = ExploreBookCover_B29P9lA$lambda$1;
                                    t glassSource22 = GlassModifiersKt.glassSource(p2.d(qVar2, 1.0f), rememberGlassState);
                                    f1 d1422 = r1.p.d(gVar4, false);
                                    i3.g gVar622 = gVar4;
                                    int hashCode222 = Long.hashCode(qVar3.T);
                                    c3.o l722 = qVar3.l();
                                    t c1122 = i3.a.c(glassSource22, qVar3);
                                    qVar3.b0();
                                    if (!qVar3.S) {
                                    }
                                    r.J(eVar522, d1422, qVar3);
                                    r.J(eVar622, l722, qVar3);
                                    defpackage.f.u(hashCode222, qVar3, eVar722, qVar3, dVar22);
                                    r.J(eVar822, c1122, qVar3);
                                    if (!z26) {
                                    }
                                    qVar3.p(true);
                                    m1164SpineOverlayqYKer5k(eVar922, gVar5, b1Var, qVar3, 0, 0);
                                    qVar = qVar3;
                                    if (aVar6 == null) {
                                    }
                                    qVar.p(z23);
                                    z16 = z24;
                                    z17 = z25;
                                    str4 = str9;
                                    str5 = str8;
                                    aVar4 = aVar6;
                                    gVar2 = gVar3;
                                    z15 = z20;
                                    tVar2 = tVar4;
                                    z18 = z19;
                                    aVar3 = aVar7;
                                    j12 = j2022;
                                    j13 = j152;
                                    f12 = f1522;
                                }
                            }
                            str8 = str7;
                            iVar = null;
                            f13 = qVar3.f(z0Var);
                            L = qVar3.L();
                            if (!f13) {
                            }
                            L = new y(z0Var, 13);
                            qVar3.h0(L);
                            qc.k j142 = qc.m.j(iVar, (ho.l) L, f4.q.f8840c, qVar3);
                            if (d11 != null) {
                            }
                            d12 = null;
                            ExploreBookCover_B29P9lA$lambda$1 = ExploreBookCover_B29P9lA$lambda$1(z0Var);
                            long j1522 = j11;
                            if (ExploreBookCover_B29P9lA$lambda$1 == null) {
                            }
                            if (ExploreBookCover_B29P9lA$lambda$1 != null) {
                            }
                            z21 = false;
                            if (gVar3 != null) {
                            }
                            if (z24) {
                            }
                            if (!z24) {
                            }
                            t f14222 = p2.f(p2.s(tVar3, b10), b11);
                            if (aVar7 == null) {
                            }
                            t c5222 = m3.h.c(f14222.then(tVar5), sm);
                            w0 w0Var222 = h0.f26395b;
                            qc.k kVar2222 = kVar;
                            t j19222 = l1.n.j((float) 0.25d, j12, l1.n.h(c5222, j1522, w0Var222), sm);
                            f1 d13222 = r1.p.d(i3.d.f12997a, false);
                            float f15222 = f11;
                            long j20222 = j12;
                            int hashCode422 = Long.hashCode(qVar3.T);
                            c3.o l4222 = qVar3.l();
                            t c10222 = i3.a.c(j19222, qVar3);
                            h4.h.f11920i.getClass();
                            h4.f fVar222 = h4.g.f11903b;
                            qVar3.b0();
                            if (!qVar3.S) {
                            }
                            h4.e eVar5222 = h4.g.f11907f;
                            r.J(eVar5222, d13222, qVar3);
                            h4.e eVar6222 = h4.g.f11906e;
                            r.J(eVar6222, l4222, qVar3);
                            Integer valueOf222 = Integer.valueOf(hashCode422);
                            h4.e eVar7222 = h4.g.f11908g;
                            r.y(qVar3, valueOf222, eVar7222);
                            h4.d dVar222 = h4.g.f11909h;
                            r.F(dVar222, qVar3);
                            h4.e eVar8222 = h4.g.f11905d;
                            r.J(eVar8222, c10222, qVar3);
                            o3.e eVar9222 = ExploreBookCover_B29P9lA$lambda$1;
                            t glassSource222 = GlassModifiersKt.glassSource(p2.d(qVar2, 1.0f), rememberGlassState);
                            f1 d14222 = r1.p.d(gVar4, false);
                            i3.g gVar6222 = gVar4;
                            int hashCode2222 = Long.hashCode(qVar3.T);
                            c3.o l7222 = qVar3.l();
                            t c11222 = i3.a.c(glassSource222, qVar3);
                            qVar3.b0();
                            if (!qVar3.S) {
                            }
                            r.J(eVar5222, d14222, qVar3);
                            r.J(eVar6222, l7222, qVar3);
                            defpackage.f.u(hashCode2222, qVar3, eVar7222, qVar3, dVar222);
                            r.J(eVar8222, c11222, qVar3);
                            if (!z26) {
                            }
                            qVar3.p(true);
                            m1164SpineOverlayqYKer5k(eVar9222, gVar5, b1Var, qVar3, 0, 0);
                            qVar = qVar3;
                            if (aVar6 == null) {
                            }
                            qVar.p(z23);
                            z16 = z24;
                            z17 = z25;
                            str4 = str9;
                            str5 = str8;
                            aVar4 = aVar6;
                            gVar2 = gVar3;
                            z15 = z20;
                            tVar2 = tVar4;
                            z18 = z19;
                            aVar3 = aVar7;
                            j12 = j20222;
                            j13 = j1522;
                            f12 = f15222;
                        } else {
                            qVar = qVar3;
                            qVar.R();
                            tVar2 = tVar;
                            str4 = str2;
                            d11 = d10;
                            z15 = z12;
                            gVar2 = gVar;
                            f12 = f11;
                            z16 = z13;
                            z17 = z14;
                            j13 = j11;
                            aVar3 = aVar;
                            aVar4 = aVar2;
                            z18 = z11;
                            str5 = str3;
                        }
                        r10 = qVar.r();
                        if (r10 == null) {
                            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.components.explore.e
                                @Override // ho.p
                                public final Object invoke(Object obj, Object obj2) {
                                    z ExploreBookCover_B29P9lA$lambda$14;
                                    int intValue = ((Integer) obj2).intValue();
                                    ExploreBookCover_B29P9lA$lambda$14 = ExploreBookCoverKt.ExploreBookCover_B29P9lA$lambda$14(str, bookCoverSize, tVar2, f12, z16, z17, j13, j12, str4, aVar3, aVar4, z18, str5, d11, z15, gVar2, i10, i11, i12, (u2.m) obj, intValue);
                                    return ExploreBookCover_B29P9lA$lambda$14;
                                }
                            };
                            return;
                        }
                        return;
                    }
                }
                i33 = i12 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                if (i33 == 0) {
                }
                if (!qVar3.O(i13 & 1, (i13 & 306783379) == 306783378 || (i32 & 74899) != 74898)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            i21 = i20;
            i22 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i22 != 0) {
            }
            i25 = i12 & 2048;
            if (i25 != 0) {
            }
            int i412 = i24;
            i27 = i12 & 4096;
            if (i27 != 0) {
            }
            i29 = i12 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (i29 != 0) {
            }
            i31 = i12 & 16384;
            if (i31 != 0) {
            }
            i33 = i12 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
            if (i33 == 0) {
            }
            if (!qVar3.O(i13 & 1, (i13 & 306783379) == 306783378 || (i32 & 74899) != 74898)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        i14 = i10 & 3072;
        int i392 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i14 != 0) {
        }
        i15 = i12 & 16;
        int i402 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i15 == 0) {
        }
        i17 = i12 & 32;
        if (i17 == 0) {
        }
        if ((i10 & 1572864) != 0) {
        }
        if ((i10 & 12582912) != 0) {
        }
        i19 = i12 & RpcError.MAX_MESSAGE_BYTES;
        if (i19 == 0) {
        }
        i20 = i12 & 512;
        if (i20 == 0) {
        }
        i21 = i20;
        i22 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i22 != 0) {
        }
        i25 = i12 & 2048;
        if (i25 != 0) {
        }
        int i4122 = i24;
        i27 = i12 & 4096;
        if (i27 != 0) {
        }
        i29 = i12 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i29 != 0) {
        }
        i31 = i12 & 16384;
        if (i31 != 0) {
        }
        i33 = i12 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
        if (i33 == 0) {
        }
        if (!qVar3.O(i13 & 1, (i13 & 306783379) == 306783378 || (i32 & 74899) != 74898)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final o3.e ExploreBookCover_B29P9lA$lambda$1(z0 z0Var) {
        return (o3.e) z0Var.getValue();
    }

    public static final z ExploreBookCover_B29P9lA$lambda$13$0$0(qc.k kVar, i3.g gVar, b1 b1Var, h5.m mVar, h5.c cVar, String str, u2.m mVar2, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar2;
        if (qVar.O(i10 & 1, z6)) {
            l1.n.c(kVar, str, drawWithImageClip(p2.d(i3.q.f13017a, 1.0f), kVar, gVar, b1Var, mVar, cVar), gVar, f4.q.f8840c, u.P, null, qVar, 24576, 96);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ExploreBookCover_B29P9lA$lambda$14(String str, BookCoverSize bookCoverSize, t tVar, float f10, boolean z6, boolean z10, long j4, long j10, String str2, ho.a aVar, ho.a aVar2, boolean z11, String str3, Double d10, boolean z12, i3.g gVar, int i10, int i11, int i12, u2.m mVar, int i13) {
        m1163ExploreBookCoverB29P9lA(str, bookCoverSize, tVar, f10, z6, z10, j4, j10, str2, aVar, aVar2, z11, str3, d10, z12, gVar, mVar, r.M(i10 | 1), r.M(i11), i12);
        return z.f31622a;
    }

    public static final z ExploreBookCover_B29P9lA$lambda$5$0(z0 z0Var, qc.g gVar) {
        qc.f fVar;
        gVar.getClass();
        o3.e eVar = null;
        if (gVar instanceof qc.f) {
            fVar = (qc.f) gVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            eVar = new o3.e(fVar.f28209a.mo938getIntrinsicSizeNHjbRc());
        }
        z0Var.setValue(eVar);
        return z.f31622a;
    }

    private static final void LoadingPlaceholder(BookCoverSize bookCoverSize, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        y0 xsRegular500;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1376479619);
        if ((i10 & 6) == 0) {
            if (qVar.d(bookCoverSize.ordinal())) {
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
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i14 = iArr[bookCoverSize.ordinal()];
            if (i14 != 1 && i14 != 2 && i14 != 3) {
                if (i14 != 4) {
                    i12 = 28;
                } else {
                    i12 = 24;
                }
            } else {
                i12 = 20;
            }
            float f10 = i12;
            int i15 = iArr[bookCoverSize.ordinal()];
            if (i15 != 1 && i15 != 2 && i15 != 3) {
                if (i15 != 4) {
                    qVar.X(-52998095);
                    xsRegular500 = EchoTheme.INSTANCE.getTypography(qVar, EchoTheme.$stable).getBaseRegular500(qVar, EchoThemeTypography.$stable);
                    qVar.p(false);
                } else {
                    qVar.X(-52999697);
                    xsRegular500 = EchoTheme.INSTANCE.getTypography(qVar, EchoTheme.$stable).getSmRegular500(qVar, EchoThemeTypography.$stable);
                    qVar.p(false);
                }
            } else {
                qVar.X(-53001809);
                xsRegular500 = EchoTheme.INSTANCE.getTypography(qVar, EchoTheme.$stable).getXsRegular500(qVar, EchoThemeTypography.$stable);
                qVar.p(false);
            }
            y0 y0Var = xsRegular500;
            i3.q qVar2 = i3.q.f13017a;
            t d10 = p2.d(qVar2, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i16 = EchoTheme.$stable;
            t E = r1.d.E(d10, echoTheme.getSpacings(qVar, i16).getX3());
            r1.x a10 = w.a(r1.j.f29232e, i3.d.C0, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, a10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            u3.c M = kd.a.M(R.drawable.headphones, qVar, 0);
            EchoThemeColors.Text text = echoTheme.getColors(qVar, i16).getText();
            int i17 = EchoThemeColors.Text.$stable;
            y2.a(M, null, p2.o(qVar2, f10), text.getQuaternary(qVar, i17), qVar, u3.c.$stable | 48, 0);
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i16).getX2()), qVar);
            j7.d(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.common_loading_content), null, echoTheme.getColors(qVar, i16).getText().getQuaternary(qVar, i17), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, y0Var, qVar, 0, 0, 130042);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new em.a(bookCoverSize, i10, 2);
        }
    }

    public static final z LoadingPlaceholder$lambda$1(BookCoverSize bookCoverSize, int i10, u2.m mVar, int i11) {
        LoadingPlaceholder(bookCoverSize, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreBookCover_AllSizes(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1892768495);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreBookCoverKt.INSTANCE.getLambda$906911433$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 23);
        }
    }

    public static final z Preview_ExploreBookCover_AllSizes$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreBookCover_AllSizes(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreBookCover_BlurPlaceholder(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(253842066);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreBookCoverKt.INSTANCE.getLambda$1955276152$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 24);
        }
    }

    public static final z Preview_ExploreBookCover_BlurPlaceholder$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreBookCover_BlurPlaceholder(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreBookCover_PreviewPlaying(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-496184582);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreBookCoverKt.INSTANCE.m1115getLambda$995488940$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 26);
        }
    }

    public static final z Preview_ExploreBookCover_PreviewPlaying$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreBookCover_PreviewPlaying(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreBookCover_WithPreviewButton(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(442669162);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExploreBookCoverKt.INSTANCE.m1114getLambda$861713968$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 25);
        }
    }

    public static final z Preview_ExploreBookCover_WithPreviewButton$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreBookCover_WithPreviewButton(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0052  */
    /* renamed from: SpineOverlay-qYKer5k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m1164SpineOverlayqYKer5k(o3.e eVar, i3.g gVar, b1 b1Var, u2.m mVar, int i10, int i11) {
        o3.e eVar2;
        int i12;
        int i13;
        i3.g gVar2;
        int i14;
        int i15;
        b1 b1Var2;
        int i16;
        boolean z6;
        o3.e eVar3;
        i3.g gVar3;
        r1 r10;
        i3.g gVar4;
        boolean z10;
        boolean z11;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1095435759);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            if (qVar.f(eVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            gVar2 = gVar;
            if (qVar.f(gVar2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            i15 = i11 & 4;
            if (i15 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                b1Var2 = b1Var;
                if (qVar.f(b1Var2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i12 |= i16;
                boolean z12 = false;
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar.O(i12 & 1, z6)) {
                    if (i17 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar2;
                    }
                    if (i18 != 0) {
                        gVar4 = i3.d.Z;
                    } else {
                        gVar4 = gVar2;
                    }
                    if (i15 != 0) {
                        b1Var2 = h0.f26395b;
                    }
                    t d10 = p2.d(i3.q.f13017a, 1.0f);
                    if ((i12 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i12 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z13 = z10 | z11;
                    if ((i12 & 896) == 256) {
                        z12 = true;
                    }
                    boolean z14 = z13 | z12;
                    Object L = qVar.L();
                    if (z14 || L == u2.l.f33918a) {
                        L = new o0(eVar3, gVar4, b1Var2, 12);
                        qVar.h0(L);
                    }
                    r1.d.g(m3.h.f(d10, (ho.l) L), qVar);
                    gVar3 = gVar4;
                } else {
                    qVar.R();
                    eVar3 = eVar2;
                    gVar3 = gVar2;
                }
                b1 b1Var3 = b1Var2;
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new fm.f(eVar3, gVar3, b1Var3, i10, i11, 16);
                    return;
                }
                return;
            }
            b1Var2 = b1Var;
            boolean z122 = false;
            if ((i12 & 147) != 146) {
            }
            if (qVar.O(i12 & 1, z6)) {
            }
            b1 b1Var32 = b1Var2;
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        gVar2 = gVar;
        i15 = i11 & 4;
        if (i15 == 0) {
        }
        b1Var2 = b1Var;
        boolean z1222 = false;
        if ((i12 & 147) != 146) {
        }
        if (qVar.O(i12 & 1, z6)) {
        }
        b1 b1Var322 = b1Var2;
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final m3.i SpineOverlay_qYKer5k$lambda$0$0(o3.e eVar, i3.g gVar, b1 b1Var, m3.d dVar) {
        float f10;
        final o3.c cVar;
        dVar.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.f22842a.b() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.f22842a.b() & 4294967295L));
        if (intBitsToFloat2 > u.P) {
            f10 = intBitsToFloat / intBitsToFloat2;
        } else {
            f10 = 0.0f;
        }
        if (f10 >= 0.5f && f10 <= MAX_SPINE_ASPECT) {
            if (eVar != null) {
                long j4 = eVar.f24778a;
                if (!o3.e.e(j4)) {
                    int i10 = (int) (j4 >> 32);
                    int i11 = (int) (j4 & 4294967295L);
                    float min = Math.min(intBitsToFloat / Float.intBitsToFloat(i10), intBitsToFloat2 / Float.intBitsToFloat(i11));
                    float intBitsToFloat3 = Float.intBitsToFloat(i10) * min;
                    float intBitsToFloat4 = Float.intBitsToFloat(i11) * min;
                    long a10 = gVar.a((jo.a.y(intBitsToFloat3) << 32) | (jo.a.y(intBitsToFloat4) & 4294967295L), (jo.a.y(intBitsToFloat) << 32) | (jo.a.y(intBitsToFloat2) & 4294967295L), dVar.f22842a.getLayoutDirection());
                    float f11 = (int) (a10 >> 32);
                    float f12 = (int) (a10 & 4294967295L);
                    cVar = new o3.c(f11, f12, intBitsToFloat3 + f11, intBitsToFloat4 + f12);
                    final v0 buildImageClipPath = buildImageClipPath(b1Var, cVar, dVar.f22842a.getLayoutDirection(), dVar);
                    float f13 = intBitsToFloat / SPINE_REFERENCE_WIDTH_PX;
                    final float max = Math.max(1.0f, f13 * 2.0f);
                    final float max2 = Math.max(0.5f, f13 * 0.5f);
                    final float max3 = Math.max(2.0f, f13 * 3.0f);
                    s sVar = p3.t.Companion;
                    long j10 = x.f26427b;
                    final n0 a11 = s.a(sVar, ig.f.I(new x(x.b(0.3f, j10)), new x(x.b(0.15f, j10))), u.P, max, 8);
                    final long b10 = x.b(0.15f, x.f26431f);
                    float f14 = max + max2;
                    final n0 a12 = s.a(sVar, ig.f.I(new x(x.b(0.18f, j10)), new x(x.b(0.06f, j10)), new x(x.f26437l)), f14, f14 + max3, 8);
                    return dVar.a(new lq.u(new ho.l() { // from class: io.elevenlabs.readerapp.ui.components.explore.f
                        @Override // ho.l
                        public final Object invoke(Object obj) {
                            z SpineOverlay_qYKer5k$lambda$0$0$1;
                            SpineOverlay_qYKer5k$lambda$0$0$1 = ExploreBookCoverKt.SpineOverlay_qYKer5k$lambda$0$0$1(v0.this, a11, cVar, max, b10, max2, a12, max3, (r3.e) obj);
                            return SpineOverlay_qYKer5k$lambda$0$0$1;
                        }
                    }, 1));
                }
            }
            cVar = new o3.c(u.P, u.P, intBitsToFloat, intBitsToFloat2);
            final v0 buildImageClipPath2 = buildImageClipPath(b1Var, cVar, dVar.f22842a.getLayoutDirection(), dVar);
            float f132 = intBitsToFloat / SPINE_REFERENCE_WIDTH_PX;
            final float max4 = Math.max(1.0f, f132 * 2.0f);
            final float max22 = Math.max(0.5f, f132 * 0.5f);
            final float max32 = Math.max(2.0f, f132 * 3.0f);
            s sVar2 = p3.t.Companion;
            long j102 = x.f26427b;
            final n0 a112 = s.a(sVar2, ig.f.I(new x(x.b(0.3f, j102)), new x(x.b(0.15f, j102))), u.P, max4, 8);
            final long b102 = x.b(0.15f, x.f26431f);
            float f142 = max4 + max22;
            final n0 a122 = s.a(sVar2, ig.f.I(new x(x.b(0.18f, j102)), new x(x.b(0.06f, j102)), new x(x.f26437l)), f142, f142 + max32, 8);
            return dVar.a(new lq.u(new ho.l() { // from class: io.elevenlabs.readerapp.ui.components.explore.f
                @Override // ho.l
                public final Object invoke(Object obj) {
                    z SpineOverlay_qYKer5k$lambda$0$0$1;
                    SpineOverlay_qYKer5k$lambda$0$0$1 = ExploreBookCoverKt.SpineOverlay_qYKer5k$lambda$0$0$1(v0.this, a112, cVar, max4, b102, max22, a122, max32, (r3.e) obj);
                    return SpineOverlay_qYKer5k$lambda$0$0$1;
                }
            }, 1));
        }
        return dVar.a(new lq.u(new r0(18), 1));
    }

    public static final z SpineOverlay_qYKer5k$lambda$0$0$0(r3.e eVar) {
        eVar.getClass();
        return z.f31622a;
    }

    public static final z SpineOverlay_qYKer5k$lambda$0$0$1(v0 v0Var, p3.t tVar, o3.c cVar, float f10, long j4, float f11, p3.t tVar2, float f12, r3.e eVar) {
        eVar.getClass();
        c1 f02 = eVar.f0();
        long L = f02.L();
        f02.y().o();
        try {
            ((c1) ((j8.g) f02.f18786b).f18643a).y().k(v0Var, 1);
            float f13 = cVar.f24767b;
            float f14 = cVar.f24769d - f13;
            r3.e.m(eVar, tVar, (Float.floatToRawIntBits(u.P) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L), u.P, null, null, 0, 120);
            r3.e.q0(eVar, j4, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L), u.P, null, 0, 120);
            r3.e.m(eVar, tVar2, (Float.floatToRawIntBits(f10 + f11) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L), u.P, null, null, 0, 120);
            com.google.android.gms.internal.play_billing.b.v(f02, L);
            return z.f31622a;
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.b.v(f02, L);
            throw th;
        }
    }

    public static final z SpineOverlay_qYKer5k$lambda$1(o3.e eVar, i3.g gVar, b1 b1Var, int i10, int i11, u2.m mVar, int i12) {
        m1164SpineOverlayqYKer5k(eVar, gVar, b1Var, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final v0 buildImageClipPath(b1 b1Var, o3.c cVar, h5.m mVar, h5.c cVar2) {
        float f10 = cVar.f24768c;
        float f11 = cVar.f24766a;
        float f12 = cVar.f24769d;
        float f13 = cVar.f24767b;
        s0 mo1createOutlinePq9zytI = b1Var.mo1createOutlinePq9zytI((Float.floatToRawIntBits(f10 - f11) << 32) | (Float.floatToRawIntBits(f12 - f13) & 4294967295L), mVar, cVar2);
        p3.i a10 = p3.k.a();
        if (mo1createOutlinePq9zytI instanceof p3.r0) {
            o3.d dVar = ((p3.r0) mo1createOutlinePq9zytI).f26421a;
            v0.c(a10, n0.l.d(cVar, dVar.f24774e, dVar.f24775f, dVar.f24776g, dVar.f24777h));
            return a10;
        }
        if (mo1createOutlinePq9zytI instanceof p0) {
            a10.d(((p0) mo1createOutlinePq9zytI).f26415a, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
            return a10;
        }
        if (mo1createOutlinePq9zytI instanceof q0) {
            v0.b(a10, cVar);
            return a10;
        }
        c6.p();
        return null;
    }

    private static final t drawWithImageClip(t tVar, qc.k kVar, i3.g gVar, b1 b1Var, h5.m mVar, h5.c cVar) {
        return m3.h.g(tVar, new o2(kVar, gVar, mVar, b1Var, cVar, 2));
    }

    public static final z drawWithImageClip$lambda$0(qc.k kVar, i3.g gVar, h5.m mVar, b1 b1Var, h5.c cVar, r3.c cVar2) {
        o3.e eVar;
        cVar2.getClass();
        qc.g gVar2 = (qc.g) kVar.B0.getValue();
        if (gVar2 instanceof qc.f) {
            eVar = new o3.e(((qc.f) gVar2).f28209a.mo938getIntrinsicSizeNHjbRc());
        } else {
            eVar = null;
        }
        z zVar = z.f31622a;
        if (eVar != null) {
            long j4 = eVar.f24778a;
            if (!o3.e.a(j4, 9205357640488583168L) && !o3.e.e(j4)) {
                r3.b bVar = ((h4.k0) cVar2).f11967a;
                int i10 = (int) (j4 >> 32);
                int i11 = (int) (j4 & 4294967295L);
                float min = Math.min(Float.intBitsToFloat((int) (bVar.b() >> 32)) / Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (bVar.b() & 4294967295L)) / Float.intBitsToFloat(i11));
                float intBitsToFloat = Float.intBitsToFloat(i10) * min;
                float intBitsToFloat2 = Float.intBitsToFloat(i11) * min;
                long a10 = gVar.a((jo.a.y(intBitsToFloat) << 32) | (jo.a.y(intBitsToFloat2) & 4294967295L), (jo.a.y(Float.intBitsToFloat((int) (bVar.b() >> 32))) << 32) | (jo.a.y(Float.intBitsToFloat((int) (bVar.b() & 4294967295L))) & 4294967295L), mVar);
                s0 mo1createOutlinePq9zytI = b1Var.mo1createOutlinePq9zytI((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), mVar, cVar);
                float f10 = (int) (a10 >> 32);
                float f11 = (int) (a10 & 4294967295L);
                p3.i a11 = p3.k.a();
                if (mo1createOutlinePq9zytI instanceof p3.r0) {
                    o3.d dVar = ((p3.r0) mo1createOutlinePq9zytI).f26421a;
                    v0.c(a11, new o3.d(f10, f11, f10 + intBitsToFloat, f11 + intBitsToFloat2, dVar.f24774e, dVar.f24775f, dVar.f24776g, dVar.f24777h));
                } else if (mo1createOutlinePq9zytI instanceof p0) {
                    a11.d(((p0) mo1createOutlinePq9zytI).f26415a, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
                } else if (mo1createOutlinePq9zytI instanceof q0) {
                    v0.b(a11, new o3.c(f10, f11, intBitsToFloat + f10, intBitsToFloat2 + f11));
                } else {
                    c6.p();
                    return null;
                }
                c1 c1Var = bVar.f29421b;
                long L = c1Var.L();
                c1Var.y().o();
                try {
                    ((c1) ((j8.g) c1Var.f18786b).f18643a).y().k(a11, 1);
                    ((h4.k0) cVar2).a();
                    return zVar;
                } finally {
                    com.google.android.gms.internal.play_billing.b.v(c1Var, L);
                }
            }
        }
        ((h4.k0) cVar2).a();
        return zVar;
    }

    private static final long previewColor(String str) {
        List<x> list = PREVIEW_COLORS;
        return list.get((str.hashCode() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) % list.size()).f26440a;
    }
}
