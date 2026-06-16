package io.elevenlabs.player.audio;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;
import xn.a;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.player.audio.LoopingAudioPlayer", f = "LoopingAudioPlayer.kt", l = {44}, m = "startLooping-BWLJW6A", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class LoopingAudioPlayer$startLooping$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoopingAudioPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoopingAudioPlayer$startLooping$1(LoopingAudioPlayer loopingAudioPlayer, wn.c<? super LoopingAudioPlayer$startLooping$1> cVar) {
        super(cVar);
        this.this$0 = loopingAudioPlayer;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m1003startLoopingBWLJW6A = this.this$0.m1003startLoopingBWLJW6A(null, null, null, this);
        if (m1003startLoopingBWLJW6A == a.f37986a) {
            return m1003startLoopingBWLJW6A;
        }
        return new m(m1003startLoopingBWLJW6A);
    }
}
