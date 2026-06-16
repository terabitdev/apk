package io.elevenlabs.data.services;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.SoundscapeDownloader", f = "SoundscapeDownloader.kt", l = {150}, m = "downloadSoundscape-yxL6bBk", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SoundscapeDownloader$downloadSoundscape$2 extends yn.c {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SoundscapeDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundscapeDownloader$downloadSoundscape$2(SoundscapeDownloader soundscapeDownloader, wn.c<? super SoundscapeDownloader$downloadSoundscape$2> cVar) {
        super(cVar);
        this.this$0 = soundscapeDownloader;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object m947downloadSoundscapeyxL6bBk;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m947downloadSoundscapeyxL6bBk = this.this$0.m947downloadSoundscapeyxL6bBk(null, null, null, null, this);
        if (m947downloadSoundscapeyxL6bBk == xn.a.f37986a) {
            return m947downloadSoundscapeyxL6bBk;
        }
        return new m(m947downloadSoundscapeyxL6bBk);
    }
}
