package io.livekit.android.audio;

import android.media.AudioPlaybackCaptureConfiguration;
import android.os.Build;
import ho.l;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/media/AudioPlaybackCaptureConfiguration$Builder;", "builder", "Lsn/z;", "invoke", "(Landroid/media/AudioPlaybackCaptureConfiguration$Builder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ScreenAudioCapturerKt$DEFAULT_CONFIGURATOR$1 extends n implements l {
    public static final ScreenAudioCapturerKt$DEFAULT_CONFIGURATOR$1 INSTANCE = new ScreenAudioCapturerKt$DEFAULT_CONFIGURATOR$1();

    public ScreenAudioCapturerKt$DEFAULT_CONFIGURATOR$1() {
        super(1);
    }

    public final void invoke(AudioPlaybackCaptureConfiguration.Builder builder) {
        builder.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            builder.addMatchingUsage(0);
            builder.addMatchingUsage(1);
            builder.addMatchingUsage(14);
        }
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(h6.a.c(obj));
        return z.f31622a;
    }
}
