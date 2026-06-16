package io.elevenlabs.ui.theme;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p3.x;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u001a%\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lp3/x;", "originalColor", "", "blendFactor", "", "isDarkTheme", "blendColorWithThemeOverlay-ek8zF_U", "(JFZ)J", "blendColorWithThemeOverlay", "blendButtonBgColorWithThemeOverlay-DxMtmZc", "(JZ)J", "blendButtonBgColorWithThemeOverlay", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ColorMathKt {
    /* renamed from: blendButtonBgColorWithThemeOverlay-DxMtmZc, reason: not valid java name */
    public static final long m1986blendButtonBgColorWithThemeOverlayDxMtmZc(long j4, boolean z6) {
        return m1987blendColorWithThemeOverlayek8zF_U(j4, 0.7f, z6);
    }

    /* renamed from: blendColorWithThemeOverlay-ek8zF_U, reason: not valid java name */
    public static final long m1987blendColorWithThemeOverlayek8zF_U(long j4, float f10, boolean z6) {
        long j10;
        if (z6) {
            j10 = x.f26427b;
        } else {
            j10 = x.f26431f;
        }
        float f11 = 1.0f - f10;
        return h0.f((x.h(j10) * f10) + (x.h(j4) * f11), (x.g(j10) * f10) + (x.g(j4) * f11), (x.e(j10) * f10) + (x.e(j4) * f11), x.d(j4), 16);
    }
}
