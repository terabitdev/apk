package io.livekit.android.room.participant;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.participant.LocalParticipant", f = "LocalParticipant.kt", l = {725}, m = "publishTrackImpl$requestAddTrack")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LocalParticipant$publishTrackImpl$requestAddTrack$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public LocalParticipant$publishTrackImpl$requestAddTrack$1(wn.c<? super LocalParticipant$publishTrackImpl$requestAddTrack$1> cVar) {
        super(cVar);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object publishTrackImpl$requestAddTrack;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        publishTrackImpl$requestAddTrack = LocalParticipant.publishTrackImpl$requestAddTrack(null, null, null, null, null, null, this);
        return publishTrackImpl$requestAddTrack;
    }
}
