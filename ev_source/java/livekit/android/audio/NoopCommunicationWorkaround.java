package io.livekit.android.audio;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0003¨\u0006\n"}, d2 = {"Lio/livekit/android/audio/NoopCommunicationWorkaround;", "Lio/livekit/android/audio/CommunicationWorkaround;", "<init>", "()V", "Lsn/z;", "start", "stop", "onStartPlayout", "onStopPlayout", "dispose", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class NoopCommunicationWorkaround implements CommunicationWorkaround {
    @Override // io.livekit.android.audio.CommunicationWorkaround
    public void dispose() {
    }

    @Override // io.livekit.android.audio.CommunicationWorkaround
    public void onStartPlayout() {
    }

    @Override // io.livekit.android.audio.CommunicationWorkaround
    public void onStopPlayout() {
    }

    @Override // io.livekit.android.audio.CommunicationWorkaround
    public void start() {
    }

    @Override // io.livekit.android.audio.CommunicationWorkaround
    public void stop() {
    }
}
