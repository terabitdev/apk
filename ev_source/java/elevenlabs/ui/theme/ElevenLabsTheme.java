package io.elevenlabs.ui.theme;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/ui/theme/ElevenLabsTheme;", "", "<init>", "()V", "Lio/elevenlabs/ui/theme/ElevenLabsColors;", "getColors", "(Lu2/m;I)Lio/elevenlabs/ui/theme/ElevenLabsColors;", "colors", "Lio/elevenlabs/ui/theme/ColorScheme;", "getColor", "(Lu2/m;I)Lio/elevenlabs/ui/theme/ColorScheme;", "color", "Lio/elevenlabs/ui/theme/ElevenLabsTypography;", "getTypo", "(Lu2/m;I)Lio/elevenlabs/ui/theme/ElevenLabsTypography;", "typo", "Lio/elevenlabs/ui/theme/ElevenLabsShapes;", "getShapes", "(Lu2/m;I)Lio/elevenlabs/ui/theme/ElevenLabsShapes;", "shapes", "Lio/elevenlabs/ui/theme/ElevenLabsSpacings;", "getSpacings", "(Lu2/m;I)Lio/elevenlabs/ui/theme/ElevenLabsSpacings;", "spacings", "Lio/elevenlabs/ui/theme/ElevenLabsShadows;", "getShadows", "(Lu2/m;I)Lio/elevenlabs/ui/theme/ElevenLabsShadows;", "shadows", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ElevenLabsTheme {
    public static final int $stable = 0;
    public static final ElevenLabsTheme INSTANCE = new ElevenLabsTheme();

    private ElevenLabsTheme() {
    }

    public final ColorScheme getColor(m mVar, int i10) {
        return (ColorScheme) ((q) mVar).j(ElevenLabsThemeKt.getLocalColorScheme());
    }

    public final ElevenLabsColors getColors(m mVar, int i10) {
        return (ElevenLabsColors) ((q) mVar).j(ElevenLabsThemeKt.getLocalColors());
    }

    public final ElevenLabsShadows getShadows(m mVar, int i10) {
        return (ElevenLabsShadows) ((q) mVar).j(ElevenLabsThemeKt.getLocalShadows());
    }

    public final ElevenLabsShapes getShapes(m mVar, int i10) {
        return (ElevenLabsShapes) ((q) mVar).j(ElevenLabsThemeKt.getLocalShapes());
    }

    public final ElevenLabsSpacings getSpacings(m mVar, int i10) {
        return (ElevenLabsSpacings) ((q) mVar).j(ElevenLabsThemeKt.getLocalSpacings());
    }

    public final ElevenLabsTypography getTypo(m mVar, int i10) {
        return (ElevenLabsTypography) ((q) mVar).j(ElevenLabsThemeKt.getLocalTypography());
    }
}
