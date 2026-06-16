package io.elevenlabs.audio;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.audio.LiveKitAudioManager", f = "LiveKitAudioManager.kt", l = {55}, m = "startRecording")
@Metadata(k = 3, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class LiveKitAudioManager$startRecording$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LiveKitAudioManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveKitAudioManager$startRecording$1(LiveKitAudioManager liveKitAudioManager, wn.c<? super LiveKitAudioManager$startRecording$1> cVar) {
        super(cVar);
        this.this$0 = liveKitAudioManager;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startRecording(this);
    }
}
