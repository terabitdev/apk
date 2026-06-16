package io.livekit.android.room.participant;

import io.elevenlabs.audio.AudioPermissionManager;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;
import xn.a;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.participant.LocalParticipant", f = "LocalParticipant.kt", l = {AudioPermissionManager.AUDIO_PERMISSION_REQUEST_CODE}, m = "publishData-yxL6bBk")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LocalParticipant$publishData$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocalParticipant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalParticipant$publishData$1(LocalParticipant localParticipant, wn.c<? super LocalParticipant$publishData$1> cVar) {
        super(cVar);
        this.this$0 = localParticipant;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m2592publishDatayxL6bBk = this.this$0.m2592publishDatayxL6bBk(null, null, null, null, this);
        if (m2592publishDatayxL6bBk == a.f37986a) {
            return m2592publishDatayxL6bBk;
        }
        return new m(m2592publishDatayxL6bBk);
    }
}
