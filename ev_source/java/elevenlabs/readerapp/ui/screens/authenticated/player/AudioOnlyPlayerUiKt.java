package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.provider.Settings;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.model.SizeableHeaderImage;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.SizeableHeaderImageKt;
import io.elevenlabs.readerapp.ui.previews.ExploreFactoryKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.ui.components.MarkdownTextKt;
import io.elevenlabs.ui.components.ReadAudioBackgroundImageKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.extensions.ScreenHeightBreakpoints;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import q2.j7;
import q2.v7;
import r1.p2;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\t\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u0012\u001a\u00020\b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001aE\u0010!\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010\"\u001a\u00020\bH\u0007¢\u0006\u0004\b\"\u0010#\u001a\u000f\u0010$\u001a\u00020\bH\u0007¢\u0006\u0004\b$\u0010#\u001a\u000f\u0010%\u001a\u00020\bH\u0007¢\u0006\u0004\b%\u0010#\u001a\u000f\u0010&\u001a\u00020\bH\u0007¢\u0006\u0004\b&\u0010#\u001a\u000f\u0010'\u001a\u00020\bH\u0007¢\u0006\u0004\b'\u0010#\u001a\u000f\u0010(\u001a\u00020\bH\u0007¢\u0006\u0004\b(\u0010#\"\u0014\u0010)\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*\"\u0014\u0010+\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010*\"\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-\"\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010-\"\u0014\u0010/\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010*\"\u0014\u00100\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010*\"\u0014\u00102\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u00103\"\u0014\u00104\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00103¨\u0006:²\u0006\f\u00105\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u00106\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00107\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00108\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00109\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "targetValue", "", Constants.ScionAnalytics.PARAM_LABEL, "animatedBackgroundFloat", "(FLjava/lang/String;Lu2/m;I)F", "imageUrl", "blurPlaceholder", "Lsn/z;", "AnimatedBlurredBackground", "(Ljava/lang/String;Ljava/lang/String;Lu2/m;I)V", "Lir/z1;", "Lio/elevenlabs/domain/model/ReadMeta;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lh5/f;", "bottomPadding", "AudioOnlyPlayerUi-rAjV9yQ", "(Lir/z1;FLu2/m;II)V", "AudioOnlyPlayerUi", "aspectRatio", "maxHeight", "Li3/t;", "modifier", "PlayerCoverArt-TN_CM5M", "(Ljava/lang/String;FFLi3/t;Ljava/lang/String;Lu2/m;II)V", "PlayerCoverArt", "coverAssetUrl", "", "coverAspectRatio", "", "isBookType", "PreviewAudioOnlyPlayer-hGBTI10", "(Ljava/lang/String;Ljava/lang/Double;ZFLjava/lang/String;Lu2/m;II)V", "PreviewAudioOnlyPlayer", "Preview_AudioOnlyPlayerUi_Loading", "(Lu2/m;I)V", "Preview_AudioOnlyPlayerUi_LargeBottomPadding", "Preview_AudioOnlyPlayerUi_WithBlurPlaceholder", "Preview_AudioOnlyPlayerUi_SmallDevice", "Preview_AudioOnlyPlayerUi_TallBookCover", "Preview_AudioOnlyPlayerUi_SquareArticleCover", "COVER_MAX_WIDTH_FRACTION", TokenNames.F, "COVER_MAX_WIDTH_DP", "PREVIEW_COVER_ASSET", "Ljava/lang/String;", "PREVIEW_SQUARE_COVER_ASSET", "BASE_SCALE", "BASE_BLUR_RADIUS", "", "ANIMATION_MIN_MS", TokenNames.I, "ANIMATION_MAX_MS", "animatedValue", "scale", "offsetX", "offsetY", "blurRadius", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AudioOnlyPlayerUiKt {
    private static final int ANIMATION_MAX_MS = 40000;
    private static final int ANIMATION_MIN_MS = 20000;
    private static final float BASE_BLUR_RADIUS = 130.0f;
    private static final float BASE_SCALE = 2.3f;
    private static final float COVER_MAX_WIDTH_DP = 300.0f;
    private static final float COVER_MAX_WIDTH_FRACTION = 0.6f;
    private static final String PREVIEW_COVER_ASSET = "file:///android_asset/read_cover_preview.jpg";
    private static final String PREVIEW_SQUARE_COVER_ASSET = "file:///android_asset/read_cover_preview_square.jpg";

    private static final void AnimatedBlurredBackground(String str, String str2, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-295870234);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str2)) {
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
            Context context = (Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b);
            androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) qVar.j(o7.e.f24864a);
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) > t2.u.P) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object L = qVar.L();
            Object obj = u2.l.f33918a;
            if (L == obj) {
                L = new u2.e1(BASE_SCALE);
                qVar.h0(L);
            }
            u2.w0 w0Var = (u2.w0) L;
            Object L2 = qVar.L();
            if (L2 == obj) {
                L2 = new u2.e1(t2.u.P);
                qVar.h0(L2);
            }
            u2.w0 w0Var2 = (u2.w0) L2;
            Object L3 = qVar.L();
            if (L3 == obj) {
                L3 = new u2.e1(t2.u.P);
                qVar.h0(L3);
            }
            u2.w0 w0Var3 = (u2.w0) L3;
            Object L4 = qVar.L();
            if (L4 == obj) {
                L4 = new u2.e1(BASE_BLUR_RADIUS);
                qVar.h0(L4);
            }
            u2.w0 w0Var4 = (u2.w0) L4;
            float animatedBackgroundFloat = animatedBackgroundFloat(AnimatedBlurredBackground$lambda$1(w0Var), "scale", qVar, 48);
            float animatedBackgroundFloat2 = animatedBackgroundFloat(AnimatedBlurredBackground$lambda$4(w0Var2), "offsetX", qVar, 48);
            float animatedBackgroundFloat3 = animatedBackgroundFloat(AnimatedBlurredBackground$lambda$7(w0Var3), "offsetY", qVar, 48);
            float animatedBackgroundFloat4 = animatedBackgroundFloat(AnimatedBlurredBackground$lambda$10(w0Var4), "blurRadius", qVar, 48);
            Boolean valueOf = Boolean.valueOf(z10);
            boolean g10 = qVar.g(z10) | qVar.h(b0Var);
            Object L5 = qVar.L();
            if (!g10 && L5 != obj) {
                z11 = z10;
            } else {
                z11 = z10;
                Object audioOnlyPlayerUiKt$AnimatedBlurredBackground$1$1 = new AudioOnlyPlayerUiKt$AnimatedBlurredBackground$1$1(z11, b0Var, w0Var, w0Var2, w0Var3, w0Var4, null);
                qVar.h0(audioOnlyPlayerUiKt$AnimatedBlurredBackground$1$1);
                L5 = audioOnlyPlayerUiKt$AnimatedBlurredBackground$1$1;
            }
            u2.r.g(b0Var, valueOf, (ho.p) L5, qVar);
            i3.q qVar2 = i3.q.f13017a;
            i3.t c5 = m3.h.c(p2.d(qVar2, 1.0f), p3.h0.f26395b);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c10 = i3.a.c(c5, qVar);
            h4.h.f11920i.getClass();
            ho.a aVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c10, qVar);
            ReadAudioBackgroundImageKt.ReadAudioBackgroundImage(str, z11, animatedBackgroundFloat, animatedBackgroundFloat2, animatedBackgroundFloat3, animatedBackgroundFloat4, BASE_SCALE, BASE_BLUR_RADIUS, p2.d(qVar2, 1.0f), str2, qVar, ((i11 << 24) & 1879048192) | (i11 & 14) | 114819072, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c(str, str2, i10, 0);
        }
    }

    private static final float AnimatedBlurredBackground$lambda$1(u2.w0 w0Var) {
        return ((u2.e1) w0Var).h();
    }

    private static final float AnimatedBlurredBackground$lambda$10(u2.w0 w0Var) {
        return ((u2.e1) w0Var).h();
    }

    public static final void AnimatedBlurredBackground$lambda$11(u2.w0 w0Var, float f10) {
        ((u2.e1) w0Var).i(f10);
    }

    public static final sn.z AnimatedBlurredBackground$lambda$14(String str, String str2, int i10, u2.m mVar, int i11) {
        AnimatedBlurredBackground(str, str2, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void AnimatedBlurredBackground$lambda$2(u2.w0 w0Var, float f10) {
        ((u2.e1) w0Var).i(f10);
    }

    private static final float AnimatedBlurredBackground$lambda$4(u2.w0 w0Var) {
        return ((u2.e1) w0Var).h();
    }

    public static final void AnimatedBlurredBackground$lambda$5(u2.w0 w0Var, float f10) {
        ((u2.e1) w0Var).i(f10);
    }

    private static final float AnimatedBlurredBackground$lambda$7(u2.w0 w0Var) {
        return ((u2.e1) w0Var).h();
    }

    public static final void AnimatedBlurredBackground$lambda$8(u2.w0 w0Var, float f10) {
        ((u2.e1) w0Var).i(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0045  */
    /* renamed from: AudioOnlyPlayerUi-rAjV9yQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1467AudioOnlyPlayerUirAjV9yQ(final ir.z1 z1Var, float f10, u2.m mVar, final int i10, final int i11) {
        int i12;
        float f11;
        int i13;
        boolean z6;
        final float f12;
        u2.r1 r10;
        ho.p pVar;
        float f13;
        int i14;
        h4.f fVar;
        i3.q qVar;
        ReadMeta readMeta;
        float f14;
        boolean z10;
        sn.z zVar;
        int i15;
        z1Var.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(456890585);
        if ((i10 & 6) == 0) {
            if (qVar2.h(z1Var)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i10 | i15;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            f11 = f10;
            if (qVar2.c(f11)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i12 & 19) == 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                if (i16 != 0) {
                    f13 = 240;
                } else {
                    f13 = f11;
                }
                Object L = qVar2.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = new i1(21);
                    qVar2.h0(L);
                }
                ReadMeta readMeta2 = (ReadMeta) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L, qVar2, (i12 & 14) | 48).getValue();
                if (readMeta2 == null) {
                    r10 = qVar2.r();
                    if (r10 != null) {
                        final int i17 = 0;
                        final float f15 = f13;
                        pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.d
                            @Override // ho.p
                            public final Object invoke(Object obj, Object obj2) {
                                sn.z AudioOnlyPlayerUi_rAjV9yQ$lambda$1;
                                sn.z AudioOnlyPlayerUi_rAjV9yQ$lambda$3;
                                switch (i17) {
                                    case 0:
                                        int intValue = ((Integer) obj2).intValue();
                                        AudioOnlyPlayerUi_rAjV9yQ$lambda$1 = AudioOnlyPlayerUiKt.AudioOnlyPlayerUi_rAjV9yQ$lambda$1(z1Var, f15, i10, i11, (u2.m) obj, intValue);
                                        return AudioOnlyPlayerUi_rAjV9yQ$lambda$1;
                                    default:
                                        int intValue2 = ((Integer) obj2).intValue();
                                        AudioOnlyPlayerUi_rAjV9yQ$lambda$3 = AudioOnlyPlayerUiKt.AudioOnlyPlayerUi_rAjV9yQ$lambda$3(z1Var, f15, i10, i11, (u2.m) obj, intValue2);
                                        return AudioOnlyPlayerUi_rAjV9yQ$lambda$3;
                                }
                            }
                        };
                        r10.f34012d = pVar;
                        return;
                    }
                    return;
                }
                i3.q qVar3 = i3.q.f13017a;
                i3.t d10 = p2.d(qVar3, 1.0f);
                f4.f1 d11 = r1.p.d(i3.d.f12997a, false);
                int hashCode = Long.hashCode(qVar2.T);
                c3.o l4 = qVar2.l();
                i3.t c5 = i3.a.c(d10, qVar2);
                h4.h.f11920i.getClass();
                h4.f fVar2 = h4.g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar2);
                } else {
                    qVar2.k0();
                }
                h4.e eVar2 = h4.g.f11907f;
                u2.r.J(eVar2, d11, qVar2);
                h4.e eVar3 = h4.g.f11906e;
                u2.r.J(eVar3, l4, qVar2);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar4 = h4.g.f11908g;
                u2.r.y(qVar2, valueOf, eVar4);
                h4.d dVar = h4.g.f11909h;
                u2.r.F(dVar, qVar2);
                h4.e eVar5 = h4.g.f11905d;
                u2.r.J(eVar5, c5, qVar2);
                CoverImageSize coverImageSize = CoverImageSize.Large;
                String coverImageUrl = ReadMetaKt.coverImageUrl(readMeta2, coverImageSize);
                if (coverImageUrl == null) {
                    qVar2.X(630424369);
                    qVar2.p(false);
                } else {
                    qVar2.X(630424370);
                    AnimatedBlurredBackground(coverImageUrl, readMeta2.getBlurPlaceholder(), qVar2, 0);
                    qVar2.p(false);
                }
                i3.t O = r1.d.O(p2.d(qVar3, 1.0f), new qm.a(4));
                float f16 = v7.f27815b;
                i3.t I = r1.d.I(r1.d.I(O, t2.u.P, f16, t2.u.P, t2.u.P, 13), t2.u.P, t2.u.P, t2.u.P, f13, 7);
                p3.s sVar = p3.t.Companion;
                Float valueOf2 = Float.valueOf(t2.u.P);
                long j4 = p3.x.f26437l;
                float f17 = f13;
                sn.k kVar = new sn.k(valueOf2, new p3.x(j4));
                sn.k kVar2 = new sn.k(Float.valueOf(0.2f), new p3.x(j4));
                Float valueOf3 = Float.valueOf(0.35f);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i18 = ElevenLabsTheme.$stable;
                r1.p.a(l1.n.g(I, p3.s.c(sVar, new sn.k[]{kVar, kVar2, new sn.k(valueOf3, new p3.x(p3.x.b(0.1f, elevenLabsTheme.getColor(qVar2, i18).getBackground().m2003getPrimary0d7_KjU()))), new sn.k(Float.valueOf(0.5f), new p3.x(p3.x.b(0.25f, elevenLabsTheme.getColor(qVar2, i18).getBackground().m2003getPrimary0d7_KjU()))), new sn.k(Float.valueOf(0.65f), new p3.x(p3.x.b(0.5f, elevenLabsTheme.getColor(qVar2, i18).getBackground().m2003getPrimary0d7_KjU()))), new sn.k(Float.valueOf(0.8f), new p3.x(p3.x.b(0.75f, elevenLabsTheme.getColor(qVar2, i18).getBackground().m2003getPrimary0d7_KjU()))), new sn.k(Float.valueOf(0.95f), new p3.x(p3.x.b(0.95f, elevenLabsTheme.getColor(qVar2, i18).getBackground().m2003getPrimary0d7_KjU()))), new sn.k(Float.valueOf(1.0f), new p3.x(ib.i.d(elevenLabsTheme, qVar2, i18)))}), null, 6), qVar2, 0);
                long rememberWindowContainerSize = ComposeExtensionsKt.rememberWindowContainerSize(qVar2, 0);
                boolean c10 = qVar2.c(h5.h.a(rememberWindowContainerSize));
                Object L2 = qVar2.L();
                if (c10 || L2 == eVar) {
                    float a10 = h5.h.a(rememberWindowContainerSize);
                    ScreenHeightBreakpoints screenHeightBreakpoints = ScreenHeightBreakpoints.INSTANCE;
                    if (h5.f.a(a10, screenHeightBreakpoints.m1983getCompactD9Ej5fM()) <= 0) {
                        i14 = 140;
                    } else if (h5.f.a(h5.h.a(rememberWindowContainerSize), screenHeightBreakpoints.m1984getMediumD9Ej5fM()) <= 0) {
                        i14 = 220;
                    } else {
                        i14 = 280;
                    }
                    L2 = new h5.f(i14);
                    qVar2.h0(L2);
                }
                float f18 = ((h5.f) L2).f12083a;
                i3.t G = r1.d.G(r1.d.I(r1.d.I(r1.d.O(p2.d(qVar3, 1.0f), new qm.a(4)), t2.u.P, f16, t2.u.P, t2.u.P, 13), t2.u.P, t2.u.P, t2.u.P, f17, 7), 20, t2.u.P, 2);
                i3.j jVar = i3.d.C0;
                r1.f fVar3 = r1.j.f29232e;
                r1.x a11 = r1.w.a(fVar3, jVar, qVar2, 54);
                int hashCode2 = Long.hashCode(qVar2.T);
                c3.o l7 = qVar2.l();
                i3.t c11 = i3.a.c(G, qVar2);
                qVar2.b0();
                if (qVar2.S) {
                    fVar = fVar2;
                    qVar2.k(fVar);
                } else {
                    fVar = fVar2;
                    qVar2.k0();
                }
                u2.r.J(eVar2, a11, qVar2);
                u2.r.J(eVar3, l7, qVar2);
                defpackage.f.u(hashCode2, qVar2, eVar4, qVar2, dVar);
                u2.r.J(eVar5, c11, qVar2);
                r1.x a12 = r1.w.a(fVar3, jVar, qVar2, 54);
                int hashCode3 = Long.hashCode(qVar2.T);
                c3.o l10 = qVar2.l();
                i3.t c12 = i3.a.c(qVar3, qVar2);
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                u2.r.J(eVar2, a12, qVar2);
                u2.r.J(eVar3, l10, qVar2);
                defpackage.f.u(hashCode3, qVar2, eVar4, qVar2, dVar);
                u2.r.J(eVar5, c12, qVar2);
                String coverImageUrl2 = ReadMetaKt.coverImageUrl(readMeta2, coverImageSize);
                if (coverImageUrl2 == null) {
                    qVar2.X(-1151686800);
                    z10 = false;
                    qVar2.p(false);
                    readMeta = readMeta2;
                    qVar = qVar3;
                    zVar = null;
                    f14 = t2.u.P;
                } else {
                    qVar2.X(-1151686799);
                    float resolvedCoverAspectRatio = ReadMetaKt.getResolvedCoverAspectRatio(readMeta2);
                    String blurPlaceholder = readMeta2.getBlurPlaceholder();
                    i3.t I2 = r1.d.I(qVar3, t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar2, i18).m2358getX6D9Ej5fM(), 7);
                    qVar = qVar3;
                    readMeta = readMeta2;
                    f14 = t2.u.P;
                    m1468PlayerCoverArtTN_CM5M(coverImageUrl2, resolvedCoverAspectRatio, f18, I2, blurPlaceholder, qVar2, 0, 0);
                    z10 = false;
                    qVar2.p(false);
                    zVar = sn.z.f31622a;
                }
                if (zVar == null) {
                    qVar2.X(101409418);
                    r1.d.g(p2.f(qVar, elevenLabsTheme.getSpacings(qVar2, i18).m2358getX6D9Ej5fM()), qVar2);
                } else {
                    qVar2.X(101394786);
                }
                qVar2.p(z10);
                i3.q qVar4 = qVar;
                j7.d(readMeta.getTitle(), r1.d.I(r1.d.G(qVar, elevenLabsTheme.getSpacings(qVar2, i18).m2357getX5D9Ej5fM(), f14, 2), t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar2, i18).m2350getX1D9Ej5fM(), 7), defpackage.f.b(elevenLabsTheme, qVar2, i18), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i18).getTitleMedium700(), qVar2, 0, 0, 130040);
                qVar2 = qVar2;
                String author = readMeta.getAuthor();
                if (author == null) {
                    qVar2.X(-1150717709);
                    qVar2.p(false);
                } else {
                    qVar2.X(-1150717708);
                    MarkdownTextKt.m1841MarkdownText6lElgYI(kj.c.Q(R.string.read_details_by_author, new Object[]{author}, qVar2), r1.d.G(m3.h.c(qVar4, z1.h.b(999)), elevenLabsTheme.getSpacings(qVar2, i18).m2357getX5D9Ej5fM(), t2.u.P, 2), defpackage.f.b(elevenLabsTheme, qVar2, i18), 3, elevenLabsTheme.getTypo(qVar2, i18).getBodySmall500(), null, null, null, 0, qVar2, 0, 480);
                    qVar2 = qVar2;
                    qVar2.p(false);
                }
                p.n.t(qVar2, true, true, true);
                f12 = f17;
            } else {
                qVar2.R();
                f12 = f11;
            }
            r10 = qVar2.r();
            if (r10 == null) {
                final int i19 = 1;
                pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.d
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        sn.z AudioOnlyPlayerUi_rAjV9yQ$lambda$1;
                        sn.z AudioOnlyPlayerUi_rAjV9yQ$lambda$3;
                        switch (i19) {
                            case 0:
                                int intValue = ((Integer) obj2).intValue();
                                AudioOnlyPlayerUi_rAjV9yQ$lambda$1 = AudioOnlyPlayerUiKt.AudioOnlyPlayerUi_rAjV9yQ$lambda$1(z1Var, f12, i10, i11, (u2.m) obj, intValue);
                                return AudioOnlyPlayerUi_rAjV9yQ$lambda$1;
                            default:
                                int intValue2 = ((Integer) obj2).intValue();
                                AudioOnlyPlayerUi_rAjV9yQ$lambda$3 = AudioOnlyPlayerUiKt.AudioOnlyPlayerUi_rAjV9yQ$lambda$3(z1Var, f12, i10, i11, (u2.m) obj, intValue2);
                                return AudioOnlyPlayerUi_rAjV9yQ$lambda$3;
                        }
                    }
                };
                r10.f34012d = pVar;
                return;
            }
            return;
        }
        f11 = f10;
        if ((i12 & 19) == 18) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar2.r();
        if (r10 == null) {
        }
    }

    public static final sn.z AudioOnlyPlayerUi_rAjV9yQ$lambda$1(ir.z1 z1Var, float f10, int i10, int i11, u2.m mVar, int i12) {
        m1467AudioOnlyPlayerUirAjV9yQ(z1Var, f10, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z AudioOnlyPlayerUi_rAjV9yQ$lambda$3(ir.z1 z1Var, float f10, int i10, int i11, u2.m mVar, int i12) {
        m1467AudioOnlyPlayerUirAjV9yQ(z1Var, f10, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0066  */
    /* renamed from: PlayerCoverArt-TN_CM5M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m1468PlayerCoverArtTN_CM5M(String str, float f10, float f11, i3.t tVar, String str2, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        String str3;
        int i15;
        boolean z6;
        String str4;
        u2.r1 r10;
        i3.t tVar3;
        String str5;
        int i16;
        int i17;
        int i18;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(503183597);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.c(f10)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar.c(f11)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        int i19 = i11 & 8;
        if (i19 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                str3 = str2;
                if (qVar.f(str3)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                if ((i12 & 9363) != 9362) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar.O(i12 & 1, z6)) {
                    if (i19 != 0) {
                        tVar3 = i3.q.f13017a;
                    } else {
                        tVar3 = tVar2;
                    }
                    if (i14 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    SizeableHeaderImageKt.m1093SizeableHeaderImagevtUHdqY(new SizeableHeaderImage(str, f10, 0.6f, COVER_MAX_WIDTH_DP, null, 16, null), tVar3, new h5.f(f11), f4.q.f8840c, ElevenLabsTheme.INSTANCE.getShapes(qVar, ElevenLabsTheme.$stable).getSm(), str5, qVar, ((i12 << 3) & 458752) | ((i12 >> 6) & 112) | 3072 | (i12 & 896), 0);
                    tVar2 = tVar3;
                    str4 = str5;
                } else {
                    qVar.R();
                    str4 = str3;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.ui.components.h(str, f10, f11, tVar2, str4, i10, i11);
                    return;
                }
                return;
            }
            str3 = str2;
            if ((i12 & 9363) != 9362) {
            }
            if (qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        str3 = str2;
        if ((i12 & 9363) != 9362) {
        }
        if (qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z PlayerCoverArt_TN_CM5M$lambda$0(String str, float f10, float f11, i3.t tVar, String str2, int i10, int i11, u2.m mVar, int i12) {
        m1468PlayerCoverArtTN_CM5M(str, f10, f11, tVar, str2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004e  */
    /* renamed from: PreviewAudioOnlyPlayer-hGBTI10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m1469PreviewAudioOnlyPlayerhGBTI10(String str, Double d10, boolean z6, float f10, String str2, u2.m mVar, final int i10, final int i11) {
        String str3;
        int i12;
        int i13;
        Double d11;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        float f11;
        int i18;
        int i19;
        String str4;
        int i20;
        boolean z11;
        final String str5;
        final Double d12;
        final boolean z12;
        final float f12;
        final String str6;
        u2.r1 r10;
        final String str7;
        final Double d13;
        final boolean z13;
        final float f13;
        final String str8;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(182008323);
        int i21 = i11 & 1;
        if (i21 != 0) {
            i12 = i10 | 6;
            str3 = str;
        } else if ((i10 & 6) == 0) {
            str3 = str;
            if (qVar.f(str3)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            str3 = str;
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            d11 = d10;
            if (qVar.f(d11)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            i15 = i11 & 4;
            if (i15 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                z10 = z6;
                if (qVar.g(z10)) {
                    i16 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i16 = 128;
                }
                i12 |= i16;
                i17 = i11 & 8;
                if (i17 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    f11 = f10;
                    if (qVar.c(f11)) {
                        i18 = 2048;
                    } else {
                        i18 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i18;
                    i19 = i11 & 16;
                    if (i19 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        str4 = str2;
                        if (qVar.f(str4)) {
                            i20 = 16384;
                        } else {
                            i20 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i12 |= i20;
                        if ((i12 & 9363) != 9362) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (qVar.O(i12 & 1, z11)) {
                            if (i21 != 0) {
                                str7 = PREVIEW_COVER_ASSET;
                            } else {
                                str7 = str3;
                            }
                            if (i22 != 0) {
                                d13 = null;
                            } else {
                                d13 = d11;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i17 != 0) {
                                f13 = 240;
                            } else {
                                f13 = f11;
                            }
                            if (i19 != 0) {
                                str8 = null;
                            } else {
                                str8 = str4;
                            }
                            ElevenLabsThemeKt.ElevenLabsTheme(false, c3.k.d(528160921, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.a
                                @Override // ho.p
                                public final Object invoke(Object obj, Object obj2) {
                                    sn.z PreviewAudioOnlyPlayer_hGBTI10$lambda$0;
                                    int intValue = ((Integer) obj2).intValue();
                                    PreviewAudioOnlyPlayer_hGBTI10$lambda$0 = AudioOnlyPlayerUiKt.PreviewAudioOnlyPlayer_hGBTI10$lambda$0(d13, str7, z13, str8, f13, (u2.m) obj, intValue);
                                    return PreviewAudioOnlyPlayer_hGBTI10$lambda$0;
                                }
                            }, qVar), qVar, 48, 1);
                            d12 = d13;
                            str5 = str7;
                            z12 = z13;
                            str6 = str8;
                            f12 = f13;
                        } else {
                            qVar.R();
                            str5 = str3;
                            d12 = d11;
                            z12 = z10;
                            f12 = f11;
                            str6 = str4;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.b
                                @Override // ho.p
                                public final Object invoke(Object obj, Object obj2) {
                                    sn.z PreviewAudioOnlyPlayer_hGBTI10$lambda$1;
                                    int intValue = ((Integer) obj2).intValue();
                                    PreviewAudioOnlyPlayer_hGBTI10$lambda$1 = AudioOnlyPlayerUiKt.PreviewAudioOnlyPlayer_hGBTI10$lambda$1(str5, d12, z12, f12, str6, i10, i11, (u2.m) obj, intValue);
                                    return PreviewAudioOnlyPlayer_hGBTI10$lambda$1;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    str4 = str2;
                    if ((i12 & 9363) != 9362) {
                    }
                    if (qVar.O(i12 & 1, z11)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                f11 = f10;
                i19 = i11 & 16;
                if (i19 == 0) {
                }
                str4 = str2;
                if ((i12 & 9363) != 9362) {
                }
                if (qVar.O(i12 & 1, z11)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            z10 = z6;
            i17 = i11 & 8;
            if (i17 != 0) {
            }
            f11 = f10;
            i19 = i11 & 16;
            if (i19 == 0) {
            }
            str4 = str2;
            if ((i12 & 9363) != 9362) {
            }
            if (qVar.O(i12 & 1, z11)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        d11 = d10;
        i15 = i11 & 4;
        if (i15 == 0) {
        }
        z10 = z6;
        i17 = i11 & 8;
        if (i17 != 0) {
        }
        f11 = f10;
        i19 = i11 & 16;
        if (i19 == 0) {
        }
        str4 = str2;
        if ((i12 & 9363) != 9362) {
        }
        if (qVar.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z PreviewAudioOnlyPlayer_hGBTI10$lambda$0(Double d10, String str, boolean z6, String str2, float f10, u2.m mVar, int i10) {
        boolean z10;
        ReadMeta copy;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            copy = r4.copy((r84 & 1) != 0 ? r4.articleImageUrl : str, (r84 & 2) != 0 ? r4.author : null, (r84 & 4) != 0 ? r4.chapters : null, (r84 & 8) != 0 ? r4.charCount : 0L, (r84 & 16) != 0 ? r4.createdAt : null, (r84 & 32) != 0 ? r4.updatedAt : null, (r84 & 64) != 0 ? r4.addedAt : null, (r84 & 128) != 0 ? r4.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r4.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r4.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r4.source : null, (r84 & 2048) != 0 ? r4.title : null, (r84 & 4096) != 0 ? r4.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r4.url : null, (r84 & 16384) != 0 ? r4.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r4.originalFileType : null, (r84 & 65536) != 0 ? r4.hasOriginalAudio : false, (r84 & 131072) != 0 ? r4.matureContent : false, (r84 & 262144) != 0 ? r4.origin : null, (r84 & 524288) != 0 ? r4.contentType : null, (r84 & 1048576) != 0 ? r4.genre : null, (r84 & 2097152) != 0 ? r4.isBookType : z6, (r84 & 4194304) != 0 ? r4.fromUserImport : false, (r84 & 8388608) != 0 ? r4.rating : null, (r84 & 16777216) != 0 ? r4.userRating : null, (r84 & 33554432) != 0 ? r4.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r4.creationStatus : null, (r84 & 134217728) != 0 ? r4.creationProgress : null, (r84 & 268435456) != 0 ? r4.isArchived : false, (r84 & 536870912) != 0 ? r4.markedAsUnread : false, (r84 & 1073741824) != 0 ? r4.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r4.publicationDate : null, (r85 & 1) != 0 ? r4.language : null, (r85 & 2) != 0 ? r4.publisherProfileId : null, (r85 & 4) != 0 ? r4.canDelete : false, (r85 & 8) != 0 ? r4.androidProductId : null, (r85 & 16) != 0 ? r4.isPaid : false, (r85 & 32) != 0 ? r4.offlineReadData : null, (r85 & 64) != 0 ? r4.previewAudio : null, (r85 & 128) != 0 ? r4.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r4.voiceSelectionConfig : null, (r85 & 512) != 0 ? r4.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r4.displayMode : null, (r85 & 2048) != 0 ? r4.inUserLibrary : false, (r85 & 4096) != 0 ? r4.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r4.audioType : null, (r85 & 16384) != 0 ? r4.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r4.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r4.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r4.audioDurationSeconds : null, (r85 & 262144) != 0 ? r4.audioTypes : null, (r85 & 524288) != 0 ? r4.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r4.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r4.coverImageUrls : null, (r85 & 4194304) != 0 ? r4.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta(d10).blurPlaceholder : str2);
            m1467AudioOnlyPlayerUirAjV9yQ(ir.r.c(copy), f10, qVar, 0, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PreviewAudioOnlyPlayer_hGBTI10$lambda$1(String str, Double d10, boolean z6, float f10, String str2, int i10, int i11, u2.m mVar, int i12) {
        m1469PreviewAudioOnlyPlayerhGBTI10(str, d10, z6, f10, str2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_AudioOnlyPlayerUi_LargeBottomPadding(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(693626785);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1469PreviewAudioOnlyPlayerhGBTI10(null, null, false, 400, null, qVar, 3072, 23);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 6);
        }
    }

    public static final sn.z Preview_AudioOnlyPlayerUi_LargeBottomPadding$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AudioOnlyPlayerUi_LargeBottomPadding(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AudioOnlyPlayerUi_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1036992568);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1469PreviewAudioOnlyPlayerhGBTI10(null, null, false, t2.u.P, null, qVar, 0, 31);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 4);
        }
    }

    public static final sn.z Preview_AudioOnlyPlayerUi_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AudioOnlyPlayerUi_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AudioOnlyPlayerUi_SmallDevice(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-792377287);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1469PreviewAudioOnlyPlayerhGBTI10(null, null, false, t2.u.P, null, qVar, 0, 31);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 5);
        }
    }

    public static final sn.z Preview_AudioOnlyPlayerUi_SmallDevice$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AudioOnlyPlayerUi_SmallDevice(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AudioOnlyPlayerUi_SquareArticleCover(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(657731412);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1469PreviewAudioOnlyPlayerhGBTI10(PREVIEW_SQUARE_COVER_ASSET, Double.valueOf(1.0d), false, t2.u.P, null, qVar, 438, 24);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 8);
        }
    }

    public static final sn.z Preview_AudioOnlyPlayerUi_SquareArticleCover$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AudioOnlyPlayerUi_SquareArticleCover(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AudioOnlyPlayerUi_TallBookCover(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1437772637);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1469PreviewAudioOnlyPlayerhGBTI10(null, Double.valueOf(0.5d), false, t2.u.P, null, qVar, 48, 29);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 7);
        }
    }

    public static final sn.z Preview_AudioOnlyPlayerUi_TallBookCover$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AudioOnlyPlayerUi_TallBookCover(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AudioOnlyPlayerUi_WithBlurPlaceholder(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-137731998);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1469PreviewAudioOnlyPlayerhGBTI10("file:///android_asset/__nonexistent__.jpg", null, false, t2.u.P, ExploreFactoryKt.SAMPLE_BLUR_PLACEHOLDER, qVar, 24582, 14);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 9);
        }
    }

    public static final sn.z Preview_AudioOnlyPlayerUi_WithBlurPlaceholder$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AudioOnlyPlayerUi_WithBlurPlaceholder(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final float animatedBackgroundFloat(float f10, String str, u2.m mVar, int i10) {
        return animatedBackgroundFloat$lambda$0(j1.f.b(f10, j1.e.p(j1.e.s(lo.d.f21965b.d(), 0, j1.y.f18447d, 2), j1.r0.f18351b, 0L, 4), str, mVar, (i10 & 14) | 64 | ((i10 << 6) & 7168), 20));
    }

    private static final float animatedBackgroundFloat$lambda$0(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final ReadMeta AudioOnlyPlayerUi_rAjV9yQ$lambda$0$0(ReadMeta readMeta) {
        return readMeta;
    }
}
