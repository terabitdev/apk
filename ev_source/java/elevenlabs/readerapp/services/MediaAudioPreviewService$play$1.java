package io.elevenlabs.readerapp.services;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.services.MediaAudioPreviewService", f = "MediaAudioPreviewService.kt", l = {35, 51, 114}, m = "play", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MediaAudioPreviewService$play$1 extends c {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MediaAudioPreviewService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaAudioPreviewService$play$1(MediaAudioPreviewService mediaAudioPreviewService, wn.c<? super MediaAudioPreviewService$play$1> cVar) {
        super(cVar);
        this.this$0 = mediaAudioPreviewService;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.play(null, this);
    }
}
