package io.elevenlabs.data.services;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.SoundscapeDownloader", f = "SoundscapeDownloader.kt", l = {197}, m = "copyStreamWithProgress", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SoundscapeDownloader$copyStreamWithProgress$1 extends yn.c {
    float F$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SoundscapeDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundscapeDownloader$copyStreamWithProgress$1(SoundscapeDownloader soundscapeDownloader, wn.c<? super SoundscapeDownloader$copyStreamWithProgress$1> cVar) {
        super(cVar);
        this.this$0 = soundscapeDownloader;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object copyStreamWithProgress;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        copyStreamWithProgress = this.this$0.copyStreamWithProgress(null, null, 0L, null, this);
        return copyStreamWithProgress;
    }
}
