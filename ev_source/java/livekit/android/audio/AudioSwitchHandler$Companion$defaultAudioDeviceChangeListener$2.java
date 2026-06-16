package io.livekit.android.audio;

import bl.g;
import ho.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "io/livekit/android/audio/AudioSwitchHandler$Companion$defaultAudioDeviceChangeListener$2$1", "invoke", "()Lio/livekit/android/audio/AudioSwitchHandler$Companion$defaultAudioDeviceChangeListener$2$1;"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AudioSwitchHandler$Companion$defaultAudioDeviceChangeListener$2 extends n implements ho.a {
    public static final AudioSwitchHandler$Companion$defaultAudioDeviceChangeListener$2 INSTANCE = new AudioSwitchHandler$Companion$defaultAudioDeviceChangeListener$2();

    public AudioSwitchHandler$Companion$defaultAudioDeviceChangeListener$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.livekit.android.audio.AudioSwitchHandler$Companion$defaultAudioDeviceChangeListener$2$1] */
    @Override // ho.a
    public final AnonymousClass1 invoke() {
        return new p() { // from class: io.livekit.android.audio.AudioSwitchHandler$Companion$defaultAudioDeviceChangeListener$2.1
            @Override // ho.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((List<? extends g>) obj, (g) obj2);
                return z.f31622a;
            }

            public void invoke(List<? extends g> audioDevices, g selectedAudioDevice) {
                audioDevices.getClass();
            }
        };
    }
}
