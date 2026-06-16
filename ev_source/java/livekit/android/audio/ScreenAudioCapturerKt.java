package io.livekit.android.audio;

import android.gov.nist.javax.sip.parser.TokenNames;
import ho.l;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005\"$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f*\"\u0010\r\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¨\u0006\u000e"}, d2 = {"", "BUFFER_SIZE_FACTOR", TokenNames.I, "", "MIN_GAIN_CHANGE", TokenNames.F, "DEFAULT_GAIN", "Lkotlin/Function1;", "Landroid/media/AudioPlaybackCaptureConfiguration$Builder;", "Lsn/z;", "Lio/livekit/android/audio/AudioPlaybackCaptureConfigurator;", "DEFAULT_CONFIGURATOR", "Lho/l;", "AudioPlaybackCaptureConfigurator", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ScreenAudioCapturerKt {
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final l DEFAULT_CONFIGURATOR = ScreenAudioCapturerKt$DEFAULT_CONFIGURATOR$1.INSTANCE;
    private static final float DEFAULT_GAIN = 1.0f;
    private static final float MIN_GAIN_CHANGE = 0.01f;
}
